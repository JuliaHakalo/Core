package reflection;

public class Reflection {
	private String name;
	private int count;
	private boolean isRun;

	
	public Reflection() {

	}

	public Reflection(String name, int count, boolean isRun) {
		this.name = name;
		this.count = count;
		this.isRun = isRun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isRun() {
		return isRun;
	}

	public void setRun(boolean isRun) {
		this.isRun = isRun;
	}


}
