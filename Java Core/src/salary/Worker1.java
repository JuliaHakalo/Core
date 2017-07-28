package salary;

public class Worker1 implements Salary {
	int month,money;
	 
    public Worker1(int month,int money) { 
    	   this.month = month;
           this.money = money;
    }
 
    @Override
    public int getSalary() { 
        return month*money;
    }

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
 
   
}
