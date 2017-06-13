package com.ncist.edu.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ncist.edu.crm.mapper.CustomerMapper;
import com.ncist.edu.crm.pojo.BarStyle;
import com.ncist.edu.crm.pojo.CountMap;
import com.ncist.edu.crm.pojo.Customer;
import com.ncist.edu.crm.pojo.PageBean;

@Service
public class CustomerServiceimp implements CustomerService {
	@Resource
	private CustomerMapper customermapper;
	
	@Override
	public PageBean<Customer> findallcustomer(int page) {
		PageHelper.startPage(page, 5);
		List<Customer> list = customermapper.findallcustomer();
		return new PageBean<Customer>(list);
	}

	@Override
	public List<String> findname() {
		return customermapper.findname();
	}

	@Override
	public void addcustomer(Customer customer) {
		customermapper.addallcustomer(customer);
	}

	@Override
	public void updatecusstatus(int cid, int status) {
		customermapper.updatecusstatus(cid,status);
	}

	@Override
	public Customer findcustomerbycid(int cid) {
		return customermapper.findcustomerbycid(cid);
	}

	@Override
	public void updatecustomer(Customer customer) {
		customermapper.updatecustomer(customer);
	}

	@Override
	public void updatesatisfy(double avgsa, String cname) {
		String avg = avgsa+"";
		customermapper.updatesatisfy(avg,cname);
	}

	@Override
	public Customer findcustomerbycname(String name) {
		return customermapper.findcustomerbyname(name);
	}

	@Override
	public BarStyle findcountcuslev() {
		List<CountMap> cm = customermapper.findcuslev();
		String[] asdate = new String[cm.size()];
		int[] serdate = new int[cm.size()];
		for (int i = 0; i < cm.size(); i++) {
			asdate[i]=cm.get(i).getName();
			serdate[i] = cm.get(i).getCount();
		}
		BarStyle bs = new BarStyle(asdate, serdate);
		return bs;
		
	}

	@Override
	public List<Customer> findallcustomer1() {
		return customermapper.findallcustomer();
	}

}
