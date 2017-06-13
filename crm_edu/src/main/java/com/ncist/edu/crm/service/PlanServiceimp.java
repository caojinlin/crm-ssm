package com.ncist.edu.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ncist.edu.crm.mapper.PlanMapper;
import com.ncist.edu.crm.pojo.Plan;

@Service
public class PlanServiceimp implements PlanService {
	@Resource
	private PlanMapper planmapper;
	
	@Override
	public List<Plan> findallplan(int cid) {
		return planmapper.findallplan(cid);
	}

	@Override
	public void addplan(Plan plan) {
		planmapper.addplan(plan);
	}

}
