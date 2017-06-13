package com.ncist.edu.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncist.edu.crm.pojo.Lost;

public interface LostMapper {

	void addlostcus(Lost lost);

	List<Lost> findalllost();

	void updatereason(@Param("id")int id, @Param("reason")String reason);

}
