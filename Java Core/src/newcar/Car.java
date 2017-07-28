package newcar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Car {
	private String brand;
	private Kermo kermo;
	private Koleso koleso;
	private Kyzov kyzov;

	public Car(String brand, Kermo kermo, Koleso koleso,Kyzov kyzov) {
		this.brand = brand;
		this.kermo = kermo;
		this.koleso = koleso;
		this.kyzov = kyzov;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Kermo getKermo() {
		return kermo;
	}
	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}
	public Koleso getKoleso() {
		return koleso;
	}
	public void setKoleso(Koleso koleso) {
		this.koleso = koleso;
	}
	public Kyzov getKyzov() {
		return kyzov;
	}
	public void setKyzov(Kyzov kyzov) {
		this.kyzov = kyzov;
	}

	


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((kermo == null) ? 0 : kermo.hashCode());
		result = prime * result + ((koleso == null) ? 0 : koleso.hashCode());
		result = prime * result + ((kyzov == null) ? 0 : kyzov.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (kermo == null) {
			if (other.kermo != null)
				return false;
		} else if (!kermo.equals(other.kermo))
			return false;
		if (koleso == null) {
			if (other.koleso != null)
				return false;
		} else if (!koleso.equals(other.koleso))
			return false;
		if (kyzov == null) {
			if (other.kyzov != null)
				return false;
		} else if (!kyzov.equals(other.kyzov))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", kermo=" + kermo + ", koleso=" + koleso + ", kyzov=" + kyzov + "]";
	}





}
