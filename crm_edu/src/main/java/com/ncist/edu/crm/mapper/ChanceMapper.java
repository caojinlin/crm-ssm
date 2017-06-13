package com.ncist.edu.crm.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.PieStyle;

public interface ChanceMapper {

	void addchance(Chance chance);

	List<Chance> findchancelist();

	void delchance(int[] ids);

	List<Chance> findchancesbyid(int[] chanceids);

	void updatadue(@Param("name")String name, @Param("id")int chanceid,@Param("date")Date date);

	Chance findchancebyid(int cid);

	void updatechance(Chance chance);

	void upstatus(@Param("status")int status, @Param("cid")int cid);

	List<String> findcusname();

	String findduename(String name);

	List<Chance> findchancebytitle(String name);

	List<Chance> findchancebyduename(String name);

	List<PieStyle> finduserana();

}
