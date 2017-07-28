package commodity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import less11.Person;

public class Commodity {
	private Color color;
	private Price price;
	private Size size;
	private Type type;
	
	
	public Commodity( Type type, Color color, Price price, Size size) {
		this.type = type;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}




	List<Commodity> commodities = new LinkedList<>();
	
	Scanner sc = new Scanner(System.in);

	 public static void add(List<Commodity> commodities ) {
			Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть тип товару");
		String typ = sc.next();
		Tovar tovar = Tovar.valueOf(typ.toUpperCase());
		Type type = new Type(tovar);
		System.out.println("¬вед≥ть кол≥р");
		String color1 = sc.next();
		Color color = new Color(color1);
		System.out.println("¬вед≥ть розм≥р");
		int size1 = sc.nextInt();
		Size size = new Size(size1);
		System.out.println("¬вед≥ть ц≥ну");
		double price1 = sc.nextDouble();
		Price price = new Price(price1);
		Commodity commodity = new Commodity(type, color, price, size);
		commodities.add(commodity);
	}

	public static void remove(List<Commodity> commodities) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть тип товару");
		String typ = sc.next();
		Tovar tovar = Tovar.valueOf(typ.toUpperCase());
		Iterator<Commodity> iter = commodities.iterator();
		while (iter.hasNext()) {
			Commodity tmp = iter.next();
			if (tmp.getType().getTovar() == tovar) {
				iter.remove();
			}
		}
	}

	public static void set(List<Commodity> commodities) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть тип товару");
		String typ = sc.next();
		Tovar tovar = Tovar.valueOf(typ.toUpperCase());
		Type type = new Type(tovar);
		System.out.println("¬вед≥ть кол≥р");
		String color1 = sc.next();
		Color color = new Color(color1);
		System.out.println("¬вед≥ть розм≥р");
		int size1 = sc.nextInt();
		Size size = new Size(size1);
		System.out.println("¬вед≥ть ц≥ну");
		int price1 = sc.nextInt();
		Price price = new Price(price1);
		Iterator<Commodity> iter = commodities.iterator();
		while (iter.hasNext()) {
			Commodity tmp = iter.next();
			if ((tmp.getType() == type) && (tmp.getColor() == color) && (tmp.getPrice() == price)
					&& (tmp.getSize() == size)) {
				System.out.println("¬вед≥ть тип товару");
				String typ1 = sc.next();
				Tovar tovar1 = Tovar.valueOf(typ1.toUpperCase());
				tmp.getType().setTovar(tovar1);
				System.out.println("¬вед≥ть кол≥р");
				String color2 = sc.next();
				tmp.getColor().setColor(color2);
				System.out.println("¬вед≥ть розм≥р");
				int size2 = sc.nextInt();
				tmp.getSize().setSize(size2);
				System.out.println("¬вед≥ть ц≥ну");
				int price2 = sc.nextInt();
				tmp.getPrice().setPrice(price2);
			}


		}
	}
//	public static void sort(List<Commodity> commodities){
//		commodities.sort((o1,o2)->Integer.compare(o1.getSize(), o2.getSize()));
//		for (Commodity commodity : commodities) {
//			
//		}
//	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commodity [color=" + color + ", price=" + price + ", size=" + size + ", type=" + type + "]";
	}
	
	
}
