package com.ncist.edu.crm.service;

import java.util.List;

import com.ncist.edu.crm.pojo.BarStyle;
import com.ncist.edu.crm.pojo.Customer;
import com.ncist.edu.crm.pojo.PageBean;

public interface CustomerService {

	PageBean<Customer> findallcustomer(int page);

	List<String> findname();

	void addcustomer(Customer customer);

	void updatecusstatus(int cid, int status);

	Customer findcustomerbycid(int cid);

	void updatecustomer(Customer customer);

	void updatesatisfy(double avgsa, String cname);

	Customer findcustomerbycname(String name);

	BarStyle findcountcuslev();

	List<Customer> findallcustomer1();

}
