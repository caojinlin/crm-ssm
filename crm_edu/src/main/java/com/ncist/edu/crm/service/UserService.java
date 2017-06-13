package com.ncist.edu.crm.service;

import java.util.List;

import com.ncist.edu.crm.pojo.UserInfo;

public interface UserService {

	UserInfo finduserbyaccount(String account);

	List<UserInfo> findalluser();

	void deluser(int[] userid);

	void adduser(UserInfo user);

	UserInfo finduserbyid(int id);

	void updateUser(UserInfo user);

	void updateStatus(int id, int status);

	void updatepwd(String pwdnew, int id);
	
}
