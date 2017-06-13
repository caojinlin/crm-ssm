package com.ncist.edu.crm.service;

import com.ncist.edu.crm.pojo.Linkman;
import com.ncist.edu.crm.pojo.PageBean;

public interface LinkmanService {

	PageBean<Linkman> findlinkmanbycid(String cname,int page);

	void addlinkman(Linkman linkman);

	Linkman findlinkmanbylid(int lid);

	void updatelinkman(Linkman linkman);

	void dellinkman(int[] linkmanid);

}
