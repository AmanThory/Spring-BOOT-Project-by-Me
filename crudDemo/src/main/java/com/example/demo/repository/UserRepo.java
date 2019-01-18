package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.User;

public interface UserRepo extends CrudRepository<User,Integer> {

	@Query("from User u where u.uemail=?1 and u.upassword=?2")
	User login(String email,String password);
	
	@Query("from User u where u.uid=?1")
	User update(Integer id);
	
/*	@Query("update User u set u.uemail=?1 and u.upassword=?2 and u.uname=?3 and u.unumber=?4 where u.uid=?5")
	
	*/
	
	/*@Query("select count(u.id) from Product u ")
	List<Product> countData();
	
	@Query(value="select count(id) from Product",nativeQuery=true)
	List<Product> countData();
	
	@Query("select p from Product p where p.p_name=?1")
	List<Product> checkData(String name);
	
	@Modifying
	@Query("update Product p set p.p_name=?1 where p.id=?2")
	String update(String name,String id);
	*/
}

