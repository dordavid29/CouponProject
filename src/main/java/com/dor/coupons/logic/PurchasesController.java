package com.dor.coupons.logic;

import java.util.List;

import com.dor.coupons.beans.Purchase;
import com.dor.coupons.dao.PurchasesDao;
import com.dor.coupons.exception.ApplicationException;
import com.dor.coupons.exception.ErrorTypes;

public class PurchasesController {

	private PurchasesDao purchasesDao = new PurchasesDao();

	// ----- constructors ------

	public PurchasesController(PurchasesDao purchasesDao) {
		super();
		this.purchasesDao = purchasesDao;
	}

	public PurchasesController() {
	}

	// ----- function ------
	
	public long createPurchase(Purchase purchase) throws ApplicationException {
		if (purchase.getPurchaseAmount() < 1) {
			throw new ApplicationException(ErrorTypes.OUT_OF_STOCK, " There is no balance for this purchase");
		}
		return purchasesDao.createPurchase(purchase);
	}
	
	public Purchase getPurchase(long purchaseId) throws ApplicationException {
		return purchasesDao.getPurchase(purchaseId);
	}
	
	public List<Purchase> getAllPurchases() throws ApplicationException {
		return purchasesDao.getAllPurchases();
	}
	
	public void updatePurchase(Purchase purchase) throws ApplicationException {
		if (purchase.getPurchaseAmount() < 1) {
			throw new ApplicationException(ErrorTypes.OUT_OF_STOCK, " There is no balance for this purchase");
		}
		purchasesDao.updatePurchase(purchase);
	}
	
	public void deletePurchase(long purchaseId) throws ApplicationException {
		purchasesDao.deletePurchase(purchaseId);
	}
	
	public void deletePurchasesByCustomerId(long customerId) throws ApplicationException {
		purchasesDao.deletePurchasesByCustomerId(customerId);
	}
	
	public void deletePurchasesByCouponId(long couponId) throws ApplicationException {
		purchasesDao.deletePurchasesByCouponId(couponId);
	}
	
	public void deletePurchasesByCompanyId(long companyId) throws ApplicationException {
		purchasesDao.deletePurchasesByCompanyId(companyId);
	}
	
	public void deleteExpiredPurchases() throws ApplicationException {
		purchasesDao.deleteExpiredPurchases();
	}
	
}