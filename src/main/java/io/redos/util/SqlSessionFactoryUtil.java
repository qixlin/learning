package io.redos.util;

import io.redos.App;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/17 12:49
 * @copyright ©2018
 */
public class SqlSessionFactoryUtil {
    static Logger log = LoggerFactory.getLogger(SqlSessionFactoryUtil.class);
    private SqlSessionFactoryUtil(){}
    private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory getSqlSessionFactory() {

        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                String configFile = "mybatis-config.xml";
                InputStream in = null;
                try {
                    in = Resources.getResourceAsStream(configFile);
                } catch (IOException e) {
                    log.info("初始化sqlSessionFactory失败",e);
                }
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession(){
        if (null == sqlSessionFactory) {
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
