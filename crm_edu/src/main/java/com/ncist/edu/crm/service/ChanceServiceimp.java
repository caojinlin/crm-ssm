package com.ncist.edu.crm.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ncist.edu.crm.mapper.ChanceMapper;
import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.PieStyle;

@Service
public class ChanceServiceimp implements ChanceService {
	@Resource
	private ChanceMapper chancemapper;
	
	@Override
	public void addchance(Chance chance) {
		chancemapper.addchance(chance);
	}

	@Override
	public PageBean<Chance> findchancelist(int page) {
		PageHelper.startPage(page, 5, true);
		List<Chance> chancelist = chancemapper.findchancelist();
		return new PageBean<Chance>(chancelist);
	}

	@Override
	public void delchance(int[] ids) {
		chancemapper.delchance(ids);
	}

	@Override
	public List<Chance> findchancesbyid(int[] chanceids) {
		return chancemapper.findchancesbyid(chanceids);
	}

	@Override
	public void updatadue(String name, int chanceid) {
		Date date = new Date(System.currentTimeMillis());
		chancemapper.updatadue(name,chanceid,date);
	}

	@Override
	public void updatechance(Chance chance) {
		chancemapper.updatechance(chance);
	}

	@Override
	public Chance findchancebyid(int cid) {
		Chance chance = chancemapper.findchancebyid(cid);
		return chance;
	}

	@Override
	public void upstatus(int status, int cid) {
		chancemapper.upstatus(status,cid);
	}

	@Override
	public List<String> findcusname() {
		return chancemapper.findcusname();
	}

	@Override
	public String findduename(String name) {
		return chancemapper.findduename(name);
	}

	@Override
	public List<Chance> findchancebytitle(String name) {
		return chancemapper.findchancebytitle(name);
	}

	@Override
	public List<Chance> findchancebyduename(String name) {
		return chancemapper.findchancebyduename(name);
	}

	@Override
	public void testpagehelper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PieStyle> finduserana() {
		return chancemapper.finduserana();
	}
}
