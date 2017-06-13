package com.ncist.edu.crm.mapper;

import java.util.List;

import com.ncist.edu.crm.pojo.Activity;

public interface ActivityMapper {

	List<Activity> findactivitybyid(int id);

	void delactivity(int[] id);

	void addactivity(Activity activity);

	Activity findactivitybyaid(int aid);

	void updateactivity(Activity activity);

}
