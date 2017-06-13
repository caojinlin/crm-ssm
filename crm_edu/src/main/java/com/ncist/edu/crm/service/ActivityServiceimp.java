package com.ncist.edu.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ncist.edu.crm.mapper.ActivityMapper;
import com.ncist.edu.crm.pojo.Activity;
import com.ncist.edu.crm.pojo.PageBean;

@Service
public class ActivityServiceimp implements ActivityService {
	@Resource
	private ActivityMapper activitymapper;

	@Override
	public PageBean<Activity> findactivitybyid(int id,int pgae) {
		PageHelper.startPage(pgae, 5);
		List<Activity> findactivitybyid = activitymapper.findactivitybyid(id);
		return new PageBean<Activity>(findactivitybyid);
	}

	@Override
	public void delactivity(int[] id) {
		activitymapper.delactivity(id);
	}

	@Override
	public void addactivity(Activity activity) {
		activitymapper.addactivity(activity);
	}

	@Override
	public Activity findactivitybyaid(int aid) {
		return activitymapper.findactivitybyaid(aid);
	}

	@Override
	public void updateactivity(Activity activity) {
		activitymapper.updateactivity(activity);
	}
	
}
