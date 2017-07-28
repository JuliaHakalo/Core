package salary;

public class Worker2 implements Salary {
	int hour,money;
	 
    public Worker2(int hour,int money) { 
        this.hour = hour;
        this.money = money;
    }
 
    @Override
    public int getSalary() { 
        return hour*money;
}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
    
}