package com.gao.jin.mapper;

import com.gao.jin.po.TUser;
import org.apache.ibatis.jdbc.SQL;

public class TUserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    public String insertSelective(TUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUser_name() != null) {
            sql.VALUES("user_name", "#{user_name,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("`password`", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getUser_type() != null) {
            sql.VALUES("user_type", "#{user_type,jdbcType=TINYINT}");
        }
        
        if (record.getLocked() != null) {
            sql.VALUES("locked", "#{locked,jdbcType=TINYINT}");
        }
        
        if (record.getCredit() != null) {
            sql.VALUES("credit", "#{credit,jdbcType=INTEGER}");
        }
        
        if (record.getLast_visit() != null) {
            sql.VALUES("last_visit", "#{last_visit,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLast_ip() != null) {
            sql.VALUES("last_ip", "#{last_ip,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TUser record) {
        SQL sql = new SQL();
        sql.UPDATE("t_user");
        
        if (record.getUser_name() != null) {
            sql.SET("user_name = #{user_name,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("`password` = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getUser_type() != null) {
            sql.SET("user_type = #{user_type,jdbcType=TINYINT}");
        }
        
        if (record.getLocked() != null) {
            sql.SET("locked = #{locked,jdbcType=TINYINT}");
        }
        
        if (record.getCredit() != null) {
            sql.SET("credit = #{credit,jdbcType=INTEGER}");
        }
        
        if (record.getLast_visit() != null) {
            sql.SET("last_visit = #{last_visit,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLast_ip() != null) {
            sql.SET("last_ip = #{last_ip,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}