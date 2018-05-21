package io.redos.util;

import io.redos.entity.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/21 15:59
 * @copyright ©2018
 */
public class SexTypeHandler implements TypeHandler<SexEnum> {
    @Override
    public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.getId());
    }

    @Override
    public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return SexEnum.getInstance(rs.getInt(columnName));
    }

    @Override
    public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return SexEnum.getInstance(rs.getInt(columnIndex));
    }

    @Override
    public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return SexEnum.getInstance(cs.getInt(columnIndex));
    }
}
