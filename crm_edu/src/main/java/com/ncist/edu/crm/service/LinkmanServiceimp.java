package com.ncist.edu.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ncist.edu.crm.mapper.LinkmanMapper;
import com.ncist.edu.crm.pojo.Linkman;
import com.ncist.edu.crm.pojo.PageBean;

@Service
public class LinkmanServiceimp implements LinkmanService{
	@Resource
	private LinkmanMapper linkmanmapper;
	
	@Override
	public PageBean<Linkman> findlinkmanbycid(String cname,int page) {
		PageHelper.startPage(page, 5);
		List<Linkman> findlinkmanbyid = linkmanmapper.findlinkmanbyid(cname);
		return new PageBean<Linkman>(findlinkmanbyid);
	}

	@Override
	public void addlinkman(Linkman linkman) {
		linkmanmapper.addlinkman(linkman);
	}

	@Override
	public Linkman findlinkmanbylid(int lid) {
		return linkmanmapper.findlinkmanbylid(lid);
	}

	@Override
	public void updatelinkman(Linkman linkman) {
		linkmanmapper.updatelinkman(linkman);
	}

	@Override
	public void dellinkman(int[] linkmanid) {
		linkmanmapper.dellinkman(linkmanid);
	}

}
