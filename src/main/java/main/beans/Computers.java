package main.beans;

/**
 *Larry J Maxwell - ljmaxwell1@dmacc.edu
 *CIS175 - Spring 2022
 *Mar 11, 2022
 **/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
// not used import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computers {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private int purchaseMonth;
	private int purchaseDay;
	private int purchaseYear;
	@Autowired
	private Specs specs;
	
	public Computers() {
		super();
	}
	

	public Computers(long id, String brand, String model, int purchaseMonth, int purchaseDay, int purchaseYear) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.purchaseMonth = purchaseMonth;
		this.purchaseDay = purchaseDay;
		this.purchaseYear = purchaseYear;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPurchaseMonth() {
		return purchaseMonth;
	}
	public void setPurchaseMonth(int purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}
	public int getPurchaseDay() {
		return purchaseDay;
	}
	public void setPurchaseDay(int purchaseDay) {
		this.purchaseDay = purchaseDay;
	}
	public int getPurchaseYear() {
		return purchaseYear;
	}
	public void setPurchaseYear(int purchaseYear) {
		this.purchaseYear = purchaseYear;
	}
	
	public Specs getSpecs() {
		return specs;
		
	}
	public void setSpecs(Specs specs) {
		this.specs = specs;
	}
	@Override
	public String toString() {
		return "Computers [id=" + id + ", brand=" + brand + ", model=" + model + ", purchaseMonth=" + purchaseMonth
				+ ", purchaseDay=" + purchaseDay + ", purchaseYear=" + purchaseYear + ", specs=" + specs + "]";
	}
	}



