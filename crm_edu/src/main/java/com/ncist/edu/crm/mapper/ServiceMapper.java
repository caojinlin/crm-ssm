package com.ncist.edu.crm.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ncist.edu.crm.pojo.PieStyle;
import com.ncist.edu.crm.pojo.Service;

public interface ServiceMapper {

	void addservice(Service service);

	List<Service> findallservice();

	Service findservicebyid(int idi);

	void updatedue(@Param("id")int serviceid, @Param("duename")String duename,@Param("duetime") Date date);

	void updatedeal(@Param("id")int serviceid, @Param("deal")String deal,@Param("date") Date date);

	void updateresult(@Param("id")int serviceid,@Param("result") String result, @Param("satisfy")int satisfy);

	List<Service> findallfiling();

	List<Service> findbysearch(@Param("type")int type, @Param("cname")String cname);

	List<Service> findservicebyname(String cname);

	List<Service> findservicebyduename(String name);

	List<PieStyle> fnduserana();

}
