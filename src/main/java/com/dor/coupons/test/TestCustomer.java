package com.dor.coupons.test;

import com.dor.coupons.beans.Customer;
import com.dor.coupons.beans.User;
import com.dor.coupons.beans.UserLoginDetails;
import com.dor.coupons.dao.CustomersDao;
import com.dor.coupons.dao.UsersDao;
import com.dor.coupons.logic.ClientType;
import com.dor.coupons.logic.CustomersController;

public class TestCustomer {

	public static void main(String[] args) throws Exception {
		CustomersDao cusdao = new CustomersDao();
		User userTest1 = new User(null, new UserLoginDetails("123", "offdgdgicfe@test4.com", ClientType.CUSTOMER));
//		UsersDao userDao1 = new UsersDao();
		CustomersController customersController = new CustomersController();
//		userDao1.createUser(userTest1);
//		System.out.println(userTest1);
		Customer cus = new Customer(userTest1, "Ben", "Ben");
//		Customer cus2 = new Customer(userTest1.setUserId(1), "Nil", "Golan");
//		cusdao.createCustomer(cus);
//		System.out.println(cusdao.getAllCustomers());
//		cusdao.updateCustomer(cus);
//		cusdao.deleteCustomer(25);
		customersController.createCustomer(cus);
	}

}
