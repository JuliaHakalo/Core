package newcar;



public class Koleso {
	 int diametrkolesa;
	private Typshyny typshyny;
	
	public Koleso(int diametrkolesa){
		this.diametrkolesa = diametrkolesa;
	}


	
	public Koleso(Typshyny typshyny) {
		this.typshyny = typshyny;
	}



	public Typshyny getTypshyny() {
		return typshyny;
	}



	public void setTypshyny(Typshyny typshyny) {
		this.typshyny = typshyny;
	}



	public int getDiametrkolesa() {
		return diametrkolesa;
	}



	public void setDiametrkolesa(int diametrkolesa) {
		this.diametrkolesa = diametrkolesa;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametrkolesa;
		result = prime * result + ((typshyny == null) ? 0 : typshyny.hashCode());
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
		Koleso other = (Koleso) obj;
		if (diametrkolesa != other.diametrkolesa)
			return false;
		if (typshyny != other.typshyny)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Koleso [diametrkolesa=" + diametrkolesa + ", typshyny=" + typshyny + "]";
	}





}
