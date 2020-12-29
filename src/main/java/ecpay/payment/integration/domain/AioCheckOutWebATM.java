package ecpay.payment.integration.domain;


public class AioCheckOutWebATM {
	
	
	private String MerchantID = "";
	
	
	private String MerchantTradeNo = "";
	
	
	private String MerchantTradeDate = "";
	
	
	private String PaymentType = "aio";
	
	
	private String TotalAmount = "";
	
	
	private String TradeDesc = "";
	
	
	private String ItemName = "";
	
	
	private String ReturnURL = "";
	
	
	private String ChoosePayment = "WebATM";
	
	
	private String ClientBackURL = "";
	
	
	private String ItemURL = "";
	
	
	private String Remark = "";
	
	
	private String ChooseSubPayment = "";
	
	
	private String OrderResultURL = "";
	
	
	private String NeedExtraPaidInfo = "";
	
	
	private String DeviceSource = "";
	
	
	private String IgnorePayment = "";
	
	
	private String PlatformID = "";
	
	
	private String InvoiceMark = "";
	
	
	private String EncryptType = "1";
	
	
	private String StoreID = "";
	
	
	private String CustomField1 = "";
	
	
	private String CustomField2 = "";
	
	
	private String CustomField3 = "";
	
	
	private String CustomField4 = "";
	
	
	
	
	public String getMerchantID() {
		return MerchantID;
	}
	
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	
	public String getPaymentType() {
		return PaymentType;
	}
	
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	
	public String getTotalAmount() {
		return TotalAmount;
	}
	
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	
	public String getTradeDesc() {
		return TradeDesc;
	}
	
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	
	public String getItemName() {
		return ItemName;
	}
	
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	
	public String getReturnURL() {
		return ReturnURL;
	}
	
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	
	public String getChoosePayment() {
		return ChoosePayment;
	}
	
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	
	public String getClientBackURL() {
		return ClientBackURL;
	}
	
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	
	public String getItemURL() {
		return ItemURL;
	}
	
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}
	
	public String getRemark() {
		return Remark;
	}
	
	public void setRemark(String remark) {
		Remark = remark;
	}
	
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	
	public void setChooseSubPayment(String chooseSubPayment) {
		ChooseSubPayment = chooseSubPayment;
	}
	
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	
	public String getDeviceSource() {
		return DeviceSource;
	}
	
	public void setDeviceSource(String deviceSource) {
		DeviceSource = deviceSource;
	}
	
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
	}
	
	public String getPlatformID() {
		return PlatformID;
	}
	
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	
	public String getInvoiceMark() {
		return InvoiceMark;
	}
	
	public void setInvoiceMark(String invoiceMark) {
		InvoiceMark = invoiceMark;
	}
	
	public String getEncryptType() {
		return EncryptType;
	}
	
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	
	public String getStoreID() {
		return StoreID;
	}
	
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	
	public String getCustomField1() {
		return CustomField1;
	}
	
	public void setCustomField1(String customField1) {
		CustomField1 = customField1;
	}
	
	public String getCustomField2() {
		return CustomField2;
	}
	
	public void setCustomField2(String customField2) {
		CustomField2 = customField2;
	}
	
	public String getCustomField3() {
		return CustomField3;
	}
	
	public void setCustomField3(String customField3) {
		CustomField3 = customField3;
	}
	
	public String getCustomField4() {
		return CustomField4;
	}
	
	public void setCustomField4(String customField4) {
		CustomField4 = customField4;
	}
	@Override
	public String toString() {
		return "AioCheckOutWebATM [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType + ", TotalAmount="
				+ TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName + ", ReturnURL=" + ReturnURL
				+ ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL + ", ItemURL=" + ItemURL
				+ ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment + ", OrderResultURL=" + OrderResultURL
				+ ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource=" + DeviceSource + ", IgnorePayment="
				+ IgnorePayment + ", PlatformID=" + PlatformID + ", InvoiceMark=" + InvoiceMark + ", EncryptType=" + EncryptType + ", StoreID=" + StoreID + ", CustomField1="
				+ CustomField1 + ", CustomField2=" + CustomField2 + ", CustomField3=" + CustomField3 + ", CustomField4="
				+ CustomField4 + "]";
	}
}
