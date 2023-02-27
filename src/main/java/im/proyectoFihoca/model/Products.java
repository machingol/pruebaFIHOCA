package im.proyectoFihoca.model;


public class Products {

	
	public long BRAND_ID;
	public long productId;
	public int priceList;
	public Double price;
	public String startDate;	
	public String endDate;
	

	public Products(Long brandId, Long productId, int priceList, Double price, String startDate , String endDate) {
		// TODO Auto-generated constructor stub
		this.BRAND_ID = brandId;
	    this.productId = productId;
	    this.priceList =  priceList;
	    this.price = price;
	    this.startDate = startDate;
	    this.endDate = endDate;
	    
	}
	public Products() {
		// TODO Auto-generated constructor stub
	}
	public long getBRAND_ID() {
		return BRAND_ID;
	}
	public void setBRAND_ID(long bRAND_ID) {
		BRAND_ID = bRAND_ID;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public int getPriceList() {
		return priceList;
	}
	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}	
}
