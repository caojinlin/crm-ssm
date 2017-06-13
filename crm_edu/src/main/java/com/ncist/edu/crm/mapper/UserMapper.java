package com.ncist.edu.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncist.edu.crm.pojo.UserInfo;

public interface UserMapper {
	public UserInfo finduserbyaccount(String account);

	public List<UserInfo> findalluser();

	public void deluser(int[] userid);

	public void adduser(UserInfo user);

	public UserInfo finduserbyid(int id);

	public void updateuser(UserInfo user);

	public void updatestatus(@Param("id")int id, @Param("status")int status);

	public void updatepwd(@Param("pwd")String pwdnew, @Param("id")int id);
}
