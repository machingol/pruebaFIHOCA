package im.proyectoFihoca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Table(name="PRICES")
@Entity
public class Prices {
 

	@Id
	@Column(name = "PRICE_LIST")
	public int priceList;

	@Column(name = "START_DATE")
	public String startDate;	
	
	@Column(name = "END_DATE")
	public String endDate;	
	
	
	@Column(name = "PRODUCT_ID")
	public Long productId;
	
	@Column(name = "PRIORITY")
	public Integer priority;
	
	@Column(name = "PRICE")
	public Double price;
	
	@Column(name = "CURR")
	public String currency;
	
	@ManyToOne
	@JoinColumn(name = "BRAND_ID")
	private Cadena id;



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

	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

//	public Cadena getCadena() {
//		return Cadena;
//	}
//
//	public void setCadena(Cadena cadena) {
//		Cadena = cadena;
//	}









}
