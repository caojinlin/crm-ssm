package com.ncist.edu.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ncist.edu.crm.mapper.LostMapper;
import com.ncist.edu.crm.pojo.Lost;
import com.ncist.edu.crm.pojo.PageBean;
@Service
public class LostServiceimp implements LostService {
	@Resource
	private LostMapper lostmapper;
	
	@Override
	public void addlostcus(Lost lost) {
		lostmapper.addlostcus(lost);
	}

	@Override
	public PageBean<Lost> findalllost(int page) {
		PageHelper.startPage(page, 5);
		List<Lost> findalllost = lostmapper.findalllost();
		return new PageBean<Lost>(findalllost);
	}

	@Override
	public void updatereason(int id, String reason) {
		lostmapper.updatereason(id,reason);
	}

}
