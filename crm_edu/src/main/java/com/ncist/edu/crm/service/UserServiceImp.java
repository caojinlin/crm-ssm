package com.ncist.edu.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ncist.edu.crm.mapper.UserMapper;
import com.ncist.edu.crm.pojo.UserInfo;

@Service
public class UserServiceImp implements UserService {
	@Resource
	private UserMapper Usermapper;
	
	@Override
	public UserInfo finduserbyaccount(String account) {
		
		return Usermapper.finduserbyaccount(account);
	}

	@Override
	public List<UserInfo> findalluser() {
		
		return Usermapper.findalluser();
	}

	@Override
	public void deluser(int[] userid) {
		Usermapper.deluser(userid);
	}

	@Override
	public void adduser(UserInfo user) {
		Usermapper.adduser(user);
	}

	@Override
	public UserInfo finduserbyid(int id) {
		return Usermapper.finduserbyid(id);
	}

	@Override
	public void updateUser(UserInfo user) {
		Usermapper.updateuser(user);
	}

	@Override
	public void updateStatus(int id, int status) {
		Usermapper.updatestatus(id,status);
	}

	@Override
	public void updatepwd(String pwdnew, int id) {
		Usermapper.updatepwd(pwdnew,id);
	}
	
}
