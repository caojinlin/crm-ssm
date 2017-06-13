package com.ncist.edu.crm.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.ncist.edu.crm.mapper.ServiceMapper;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.PieStyle;
import com.ncist.edu.crm.pojo.Service;

@Component
public class ServiceServiceimp implements ServiceService {
	@Resource
	private ServiceMapper servicemapper;

	@Override
	public void addservice(Service service) {
		servicemapper.addservice(service);
	}

	@Override
	public PageBean<Service> findallservice(int page) {
		PageHelper.startPage(page, 5);
		List<Service> findallservice = servicemapper.findallservice();
		return new PageBean<Service>(findallservice);
	}

	@Override
	public Service findservicebyid(int idi) {
		return servicemapper.findservicebyid(idi);
	}

	@Override
	public void updatedue(int serviceid, String duename, Date date) {
		servicemapper.updatedue(serviceid,duename,date);
	}

	@Override
	public void updatedeal(int serviceid, String deal,Date date) {
		servicemapper.updatedeal(serviceid,deal,date);
	}

	@Override
	public void updateresult(int serviceid, String result, int satisfy) {
		servicemapper.updateresult(serviceid,result,satisfy);
	}

	@Override
	public PageBean<Service> findallfiling(int page) {
		PageHelper.startPage(page, 5);
		List<Service> findallfiling = servicemapper.findallfiling();
		return new PageBean<Service>(findallfiling);
	}

	@Override
	public PageBean<Service> findbysearch(int type, String cname,int page) {
		PageHelper.startPage(page, 5);
		List<Service> findbysearch = servicemapper.findbysearch(type,cname);
		return new PageBean<Service>(findbysearch);
	}

	@Override
	public List<Service> findservicebyname(String cname) {
		return servicemapper.findservicebyname(cname);
	}

	@Override
	public List<Service> findservicebyduename(String name) {
		return servicemapper.findservicebyduename(name);
	}

	@Override
	public List<PieStyle> finduserana() {
		return servicemapper.fnduserana();
	}
	
}
