package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.RolePermissionExample;
import com.dianrong.common.uniauth.server.data.entity.RolePermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int countByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int deleteByPrimaryKey(RolePermissionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insert(RolePermissionKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int insertSelective(RolePermissionKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    List<RolePermissionKey> selectByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExampleSelective(@Param("record") RolePermissionKey record, @Param("example") RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    int updateByExample(@Param("record") RolePermissionKey record, @Param("example") RolePermissionExample example);
}