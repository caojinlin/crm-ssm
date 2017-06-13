package com.ncist.edu.crm.mapper;

import java.util.List;

import com.ncist.edu.crm.pojo.Linkman;

public interface LinkmanMapper {

	List<Linkman> findlinkmanbyid(String cname);

	void addlinkman(Linkman linkman);

	Linkman findlinkmanbylid(int lid);

	void updatelinkman(Linkman linkman);

	void dellinkman(int[] linkmanid);

}
