package com.xworkz.headphone.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.TypeAndWeight;

public class HeadPhoneDTO implements Serializable {

	private Brand brand;
	private String modelNo;
	private double price;
	private boolean bass;
	private Color color;
	private TypeAndWeight weight;
	private String customerName;
	private int invoiceNo;
	private LocalDate mgfDate;
	private int warrantyPeriod;

	public HeadPhoneDTO() {
		System.out.println("no-arg constructor");
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [brand=" + brand + ", modelNo=" + modelNo + ", price=" + price + ", bass=" + bass
				+ ", color=" + color + ", weight=" + weight + ", customerName=" + customerName + ", invoiceNo="
				+ invoiceNo + ", mgfDate=" + mgfDate + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

	public HeadPhoneDTO(Brand brand, String modelNo, double price, boolean bass, Color color, TypeAndWeight weight,
			String customerName, int invoiceNo, LocalDate mgfDate, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.color = color;
		this.weight = weight;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.mgfDate = mgfDate;
		this.warrantyPeriod = warrantyPeriod;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeAndWeight getWeight() {
		return weight;
	}

	public void setWeight(TypeAndWeight weight) {
		this.weight = weight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalDate getMgfDate() {
		return mgfDate;
	}

	public void setMgfDate(LocalDate mgfDate) {
		this.mgfDate = mgfDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bass ? 1231 : 1237);
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + invoiceNo;
		result = prime * result + ((mgfDate == null) ? 0 : mgfDate.hashCode());
		result = prime * result + ((modelNo == null) ? 0 : modelNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + warrantyPeriod;
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HeadPhoneDTO)) {
			return false;
		}
		HeadPhoneDTO other = (HeadPhoneDTO) obj;
		if (bass != other.bass) {
			return false;
		}
		if (brand != other.brand) {
			return false;
		}
		if (color != other.color) {
			return false;
		}
		if (customerName == null) {
			if (other.customerName != null) {
				return false;
			}
		} else if (!customerName.equals(other.customerName)) {
			return false;
		}
		if (invoiceNo != other.invoiceNo) {
			return false;
		}
		if (mgfDate == null) {
			if (other.mgfDate != null) {
				return false;
			}
		} else if (!mgfDate.equals(other.mgfDate)) {
			return false;
		}
		if (modelNo == null) {
			if (other.modelNo != null) {
				return false;
			}
		} else if (!modelNo.equals(other.modelNo)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (warrantyPeriod != other.warrantyPeriod) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}

}
