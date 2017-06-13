package com.ncist.edu.crm.service;

import com.ncist.edu.crm.pojo.Lost;
import com.ncist.edu.crm.pojo.PageBean;

public interface LostService {

	void addlostcus(Lost lost);

	PageBean<Lost> findalllost(int page);

	void updatereason(int id, String reason);

}
