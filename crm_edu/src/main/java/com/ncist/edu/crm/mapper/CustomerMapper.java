package com.ncist.edu.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncist.edu.crm.pojo.CountMap;
import com.ncist.edu.crm.pojo.Customer;

public interface CustomerMapper {

	List<Customer> findallcustomer();

	void addcustomer(String title);

	List<String> findname();

	void addallcustomer(Customer customer);

	void updatecusstatus(@Param("cid")int cid,@Param("status") int status);

	Customer findcustomerbycid(int cid);

	void updatecustomer(Customer customer);

	void updatesatisfy(@Param("avg")String avgsa, @Param("name")String cname);

	Customer findcustomerbyname(String name);

	List<CountMap> findcuslev();
	
}
