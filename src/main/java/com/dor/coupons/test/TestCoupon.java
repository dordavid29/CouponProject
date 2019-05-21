package com.dor.coupons.test;

import java.util.Date;

import com.dor.coupons.beans.Category;
import com.dor.coupons.beans.Company;
import com.dor.coupons.beans.Coupon;
import com.dor.coupons.dao.CompaniesDao;
import com.dor.coupons.dao.CouponsDao;
import com.dor.coupons.logic.CouponsController;



public class TestCoupon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
//		Company maorLiveInMovie = new Company("maor","maor@gmail.com");
//		CompaniesDao companiesDao = new CompaniesDao();
//		companiesDao.createCompany(maorLiveInMovie);
//		CouponsDao couponsDao = new CouponsDao();
		Date currentDate = new Date();
		Date startDate = new Date();
		Date endDate = new Date();
		startDate.setYear(100);
		endDate.setYear(110);
//		System.out.println(currentDate);
//		System.out.println(startDate + ", " + endDate);
		
		
		Coupon couponTest = new Coupon(5, Category.HOTELS, "Dan","GOOD HOTEL", currentDate, endDate, 4, 1500,"www.dan.com");
		CouponsController couponsController = new CouponsController();
//		System.out.println(couponTest);
		couponsController.createCoupon(couponTest);
//		System.out.println(couponsController.getCompanyCoupons(5));
//		System.out.println(couponsController.getCoupon(14));
//		System.out.println(couponsController.getAllCoupons());
//		System.out.println(couponsController.getAllCouponsByCategory(Category.FOOTBALL_GAMES));
//		System.out.println(couponsController.getAllCouponsByMaxPrice(50));
//		System.out.println(couponsController.getAllCouponsByMaxPrice(49));
	}

}
