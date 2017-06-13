package com.ncist.edu.crm.service;

import java.util.List;

import com.ncist.edu.crm.pojo.Plan;

public interface PlanService {

	List<Plan> findallplan(int cid);

	void addplan(Plan plan);
	
}
