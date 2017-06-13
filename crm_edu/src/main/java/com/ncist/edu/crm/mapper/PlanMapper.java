package com.ncist.edu.crm.mapper;

import java.util.List;

import com.ncist.edu.crm.pojo.Plan;

public interface PlanMapper {

	List<Plan> findallplan(int cid);

	void addplan(Plan plan);
	
}
