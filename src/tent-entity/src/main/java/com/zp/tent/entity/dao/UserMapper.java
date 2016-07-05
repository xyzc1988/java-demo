package com.zp.tent.entity.dao;

import java.util.List;

import com.zp.tent.entity.domain.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Jul 05 14:34:04 CST 2016
     */
    int deleteByPrimaryKey(String user_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Jul 05 14:34:04 CST 2016
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Jul 05 14:34:04 CST 2016
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Jul 05 14:34:04 CST 2016
     */
    User selectByPrimaryKey(String user_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Jul 05 14:34:04 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Tue Jul 05 14:34:04 CST 2016
     */
    int updateByPrimaryKey(User record);
    
    
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();
}