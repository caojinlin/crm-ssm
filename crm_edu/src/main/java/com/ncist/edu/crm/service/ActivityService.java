package com.ncist.edu.crm.service;

import com.ncist.edu.crm.pojo.Activity;
import com.ncist.edu.crm.pojo.PageBean;

public interface ActivityService {

	PageBean<Activity> findactivitybyid(int id,int page);

	void delactivity(int[] id);

	void addactivity(Activity activity);

	Activity findactivitybyaid(int aid);

	void updateactivity(Activity activity);

}
