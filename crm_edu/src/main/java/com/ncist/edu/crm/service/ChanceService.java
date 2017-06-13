package com.ncist.edu.crm.service;

import java.util.List;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.PieStyle;

public interface ChanceService {

	void addchance(Chance chance);

	PageBean<Chance>  findchancelist(int page);

	void delchance(int[] ids);

	List<Chance> findchancesbyid(int[] cids);

	void updatadue(String name, int chanceid);

	void updatechance(Chance chance);

	Chance findchancebyid(int cid);

	void upstatus(int status, int cid);

	List<String> findcusname();

	String findduename(String name);

	List<Chance> findchancebytitle(String name);

	List<Chance> findchancebyduename(String name);
	void testpagehelper();

	List<PieStyle> finduserana();
}
