package commodity1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import commodity.Tovar;

public class Commodity {
	String color;
	double price;
	int size;
	public Tovar tovar;

	public Commodity(String color, double price, int size, Tovar tovar) {
		super();
		this.color = color;
		this.price = price;
		this.size = size;
		this.tovar = tovar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Tovar getTovar() {
		return tovar;
	}

	public void setTovar(Tovar tovar) {
		this.tovar = tovar;
	}

	List<Commodity> commodities = new LinkedList<>();

	Scanner sc = new Scanner(System.in);

	public static void add(Set<Commodity> commodities) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть тип товару");
		String typ = sc.next();
		Tovar tovar = Tovar.valueOf(typ.toUpperCase());
		System.out.println("¬вед≥ть кол≥р");
		String color = sc.next();
		System.out.println("¬вед≥ть розм≥р");
		int size = sc.nextInt();
		System.out.println("¬вед≥ть ц≥ну");
		double price = sc.nextDouble();
		Commodity commodity = new Commodity(color, price, size, tovar);
		commodities.add(commodity);
	}

	public static void remove(Set<Commodity> commodities) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть тип товару");
		String typ = sc.next();
		Tovar tovar = Tovar.valueOf(typ.toUpperCase());
		Iterator<Commodity> iter = commodities.iterator();
		while (iter.hasNext()) {
			Commodity tmp = iter.next();
			if (tmp.getTovar() == tovar) {
				iter.remove();
			}
		}
	}

	public static void set(Set<Commodity> commodities) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть тип товару");
		String typ = sc.next();
		Tovar tovar = Tovar.valueOf(typ.toUpperCase());
		System.out.println("¬вед≥ть кол≥р");
		String color = sc.next();
		System.out.println("¬вед≥ть розм≥р");
		int size = sc.nextInt();
		System.out.println("¬вед≥ть ц≥ну");
		int price = sc.nextInt();
		Iterator<Commodity> iter = commodities.iterator();
		while (iter.hasNext()) {
			Commodity tmp = iter.next();
			if ((tmp.getTovar() == tovar) && (tmp.getColor() == color) && (tmp.getPrice() == price)
					&& (tmp.getSize() == size)) {
				System.out.println("¬вед≥ть тип товару");
				String typ1 = sc.next();
				Tovar tovar1 = Tovar.valueOf(typ1.toUpperCase());
				tmp.setTovar(tovar1);
				System.out.println("¬вед≥ть кол≥р");
				String color1 = sc.next();
				tmp.setColor(color1);
				System.out.println("¬вед≥ть розм≥р");
				int size1 = sc.nextInt();
				tmp.setSize(size1);
				System.out.println("¬вед≥ть ц≥ну");
				int price1 = sc.nextInt();
				tmp.setPrice(price1);
			}

		}
	}

	public static void sortSizeUP(List<Commodity> commodities) {
		commodities.sort((o1, o2) -> Integer.compare(o1.getSize(), o2.getSize()));
		for (Commodity commodity : commodities) {
			System.out.println(commodity);
		}
	}
	public static void sortSizeDOWN(List<Commodity> commodities) {
		commodities.sort((o1, o2) -> Integer.compare(o2.getSize(), o1.getSize()));
		for (Commodity commodity : commodities) {
			System.out.println(commodity);
		}
	}
	public static void sortPriceUP(List<Commodity> commodities) {
		commodities.sort((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
		for (Commodity commodity : commodities) {
			System.out.println(commodity);
		}
	}
	public static void sortPriceDOWN(List<Commodity> commodities) {
		commodities.sort((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
		for (Commodity commodity : commodities) {
			System.out.println(commodity);
		}
	}
//	public static void sortColorUP(List<Commodity> commodities) {
//		commodities.sort((o1, o2) -> String.compare(o1.getColor(), o2.getColor()));
//		for (Commodity commodity : commodities) {
//			System.out.println(commodity);
//		}
//	}
//	public static void sortColorDOWN(List<Commodity> commodities) {
//		commodities.sort((o1, o2) -> String.compare(o2.getColor(), o1.getColor()));
//		for (Commodity commodity : commodities) {
//			System.out.println(commodity);
//		}
//	}
//	public static void sortTypeUP(List<Commodity> commodities) {
//		commodities.sort((o1, o2) -> String.compare(o1.getTovar(), o2.getTovar()));
//		for (Commodity commodity : commodities) {
//			System.out.println(commodity);
//		}
//	}
//	public static void sortTypeDOWN(List<Commodity> commodities) {
//		commodities.sort((o1, o2) -> String.compare(o2.getTovar(), o1.getTovar()));
//		for (Commodity commodity : commodities) {
//			System.out.println(commodity);
//		}
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + size;
		result = prime * result + ((tovar == null) ? 0 : tovar.hashCode());
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
		Commodity other = (Commodity) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (size != other.size)
			return false;
		if (tovar != other.tovar)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commodity [color=" + color + ", price=" + price + ", size=" + size + ", tovar=" + tovar + "]";
	}

}
