package com.walmart.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "WALMART")
public class Products {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT")
	public String Products;
	
	@Column(name="PURCHASE_DATE")
	public String Purchase_date;
	
	@Column(name="SELLING_DATE")
	public String Selling_date;
	
	@Transient
	public long days;
	
	public String getProducts() {
		return Products;
	}

	public long getDays() throws ParseException {
		Date purchase = new SimpleDateFormat("yyyy-MM-dd").parse(this.Purchase_date); 
		Date expiry = new SimpleDateFormat("yyyy-MM-dd").parse(this.Selling_date);
		days = expiry.getTime() - purchase.getTime();
		days = (days / (1000 * 60 * 60 * 24)) % 365; 
		return days; 
	}
	public String getPurchase_date() {
		return Purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		Purchase_date = purchase_date;
	}

	public String getSelling_date() {
		return Selling_date;
	}

	public void setSelling_date(String selling_date) {
		Selling_date = selling_date;
	}

	public void setProducts(String products) {
		Products = products;
	}
	
}
