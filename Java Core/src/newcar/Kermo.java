package newcar;

public class Kermo {


	private Buttons buttons;

	public Kermo(Buttons buttons){
		this.buttons = buttons;
	}

	public Buttons getButtons() {
		return buttons;
	}

	public void setButtons(Buttons buttons) {
		this.buttons = buttons;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buttons == null) ? 0 : buttons.hashCode());
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
		Kermo other = (Kermo) obj;
		if (buttons != other.buttons)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kermo [buttons=" + buttons + "]";
	}


}
