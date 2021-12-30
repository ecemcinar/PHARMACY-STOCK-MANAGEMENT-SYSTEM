/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ecems
 */

public class BabyMotherCare extends Product {
    public BabyMotherCare(String barcode, String productName, double price, int stockQ,String category) {
		super(barcode, productName, price, stockQ);
		this.category=category;
	}

	String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
