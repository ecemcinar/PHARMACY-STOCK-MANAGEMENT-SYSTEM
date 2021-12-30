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

public class Medicament extends Product {
	private String activeChemical;
	private String prescriptionType;
	private String color;

	public Medicament(String barcode, String productName, String activeChemical, String prescriptionType, double price, String color, int stockQ) {
		super(barcode, productName, price, stockQ);
		this.activeChemical=activeChemical;
		this.prescriptionType=prescriptionType;
		this.color=color;
	}

	public String getActiveChemical() {
		return activeChemical;
	}

	public void setActiveChemical(String activeChemical) {
		this.activeChemical = activeChemical;
	}

	public String getPrescriptionType() {
		return prescriptionType;
	}

	public void setPrescriptionType(String prescriptionType) {
		this.prescriptionType = prescriptionType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
