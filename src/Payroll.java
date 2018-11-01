
public class Payroll {
	public String name;
	public String id;
	public int salary;
	public int sale;
	
	public Payroll(String id,String name,int salary) {
		this.id=id;
		this.name = name;
		this.salary=salary;
	}
	public String getName() {
		return this.name;
	}
	public String getID() {
		return this.id;
	}	
	public int getSalary() {
		return this.salary;
	}
	public int getSale() {
		return this.sale;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	public void setID(String id) {
		this.id = id;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
	public String toString() {
		return "Name : "+getName()+" \nSalary : "+calculate(salary,getSale());
	}
	public double calculate(int salary,int sale) {
		double x = 0;
		if(salary <15000 && sale > 100000){
			x = (salary +(sale*0.03)+3000);
		}
		else {
			if(sale>=1 && sale<=50000) {
				x = (salary +(sale*0.01));
			}
			else if(sale<=100000) {
				x = (salary +(sale*0.02));
			}
			else {
				x = (salary +(sale*0.03));
			}
		}
		return x;
	}

}
