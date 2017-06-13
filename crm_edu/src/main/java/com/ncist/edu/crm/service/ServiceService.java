package com.ncist.edu.crm.service;

import java.util.Date;
import java.util.List;

import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.PieStyle;
import com.ncist.edu.crm.pojo.Service;

public interface ServiceService {

	void addservice(Service service);

	PageBean<Service> findallservice(int page);

	Service findservicebyid(int idi);

	void updatedue(int serviceid, String duename, Date date);

	void updatedeal(int serviceid, String deal,Date date);

	void updateresult(int serviceid, String result, int satisfy);

	PageBean<Service> findallfiling(int page);

	PageBean<Service> findbysearch(int type, String cname,int page);

	List<Service> findservicebyname(String cname);

	List<Service> findservicebyduename(String name);

	List<PieStyle> finduserana();

}
