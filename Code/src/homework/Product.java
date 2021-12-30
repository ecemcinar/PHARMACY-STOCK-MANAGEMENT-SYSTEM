package homework;

public class Product
{
	private String barcode;
	private String productName;
	private double price;
	private int stockQ;
	public Product(String barcode, String productName, double price, int stockQ) {
		super();
		this.barcode = barcode;
		this.productName = productName;
		this.price = price;
		this.stockQ = stockQ;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockQ() {
		return stockQ;
	}
	public void setStockQ(int stockQ) {
		this.stockQ = stockQ;
	}
	
	
	
	
	
	
}
