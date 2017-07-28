package newcar;

public class Kyzov {
	private Typkyzova typkyzova;
	private Color color;
	

	public Kyzov(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Kyzov(Typkyzova typkyzova) {
		this.typkyzova = typkyzova;
	}

	public Typkyzova getTypkyzova() {
		return typkyzova;
	}

	public void setTypkyzova(Typkyzova typkyzova) {
		this.typkyzova = typkyzova;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((typkyzova == null) ? 0 : typkyzova.hashCode());
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
		Kyzov other = (Kyzov) obj;
		if (color != other.color)
			return false;
		if (typkyzova != other.typkyzova)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kyzov [typkyzova=" + typkyzova + ", color=" + color + "]";
	}


	
	
}
