package io.redos;

import io.redos.entity.Role;
import io.redos.entity.SexEnum;
import io.redos.entity.StudentBean;
import io.redos.mapper.RoleMapper;
import io.redos.mapper.StudentMapper;
import io.redos.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        log.info("测试");
        System.out.println( "Hello World!" );
        log.debug("测试");
    }
    @Test
    public void test(){
        String confidFile = "mybatis-config.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(confidFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        RoleMapper roleMapper = session.getMapper(RoleMapper.class);
        Role role = roleMapper.getRole(2);
        log.info(roleMapper.getRoleName(2));
        Role role1 = session.selectOne("io.redos.mapper.RoleMapper.getRole",1L);
        log.info(role1.toString());
        session.close();
    }
    @Test
    public void test2(){

        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        long key = 3L;
        role.setId(key);
        role.setRoleName("普通用户");
        role.setNotes("仅供测试");
        log.info(roleMapper.insertRole(role) + "");
        log.info(roleMapper.getRole(key).toString());
        log.info(roleMapper.getRoleName(key));
        log.info(roleMapper.deleteRole(2L) + "");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        roleMapper.deleteRole(2L);
        roleMapper.deleteRole(3L);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test4(){

        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        long key = 9L;
        role.setId(key);
        role.setRoleName("普通用户");
        role.setNotes("仅供测试");
        role.setSex(SexEnum.MALE);
        log.info(roleMapper.insertRole(role) + "");
        log.info(roleMapper.getRole(key).toString());
        log.info(roleMapper.getRoleName(key));
//        log.info(roleMapper.deleteRole(key) + "");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        StudentBean studentBean = studentMapper.selectStudentById(2017053001);
        log.info(studentBean.getStudentLectureList().toString());
//        log.debug(studentBean.toString());
//        log.info(studentBean.toString());
        sqlSession.close();
    }
}
