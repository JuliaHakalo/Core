package commodity;

public class Type {
	public Tovar tovar;

	
	
	public Type(Tovar tovar) {
		this.tovar = tovar;
	}

	public Tovar getTovar() {
		return tovar;
	}

	public void setTovar(Tovar tovar) {
		this.tovar = tovar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Type other = (Type) obj;
		if (tovar != other.tovar)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Type [tovar=" + tovar + "]";
	}
	
}
