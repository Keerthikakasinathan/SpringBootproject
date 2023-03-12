package com.example.Springboot.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Boutique {
	@Id
	private int shopno;
	private String shopname;
	private double stgprice ;

	public String toString() {
		return "Boutique [shopno=" + shopno + ", shopname=" +shopname + ", startingprice=" + stgprice + "]";
	}
	public int getShopno() {
		return shopno;
	}
	public void setShopno(int shopno) {
		this.shopno = shopno;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public double getStgprice() {
		return stgprice;
	}
	public void setBalance(double stgprice) {
		this.stgprice = stgprice;
	}
}
