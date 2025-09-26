package LabAssignments;


	class Employee {
	    int id;
	    String name;
	    double salary;

	    Employee() {}

	    void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	    }
	}

	class Manager extends Employee {
	    private double bonus;

	    void accept(int id, String name, double salary, double bonus) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.bonus = bonus;
	    }

	    void display() {
	        super.display();
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + (salary + bonus));
	    }

	    double getTotalSalary() {
	        return salary + bonus;
	    }
	}

	public class A2SAQ3 { 
	    public static void main(String[] args) {
	        int n = 2;
	        Manager[] managers = new Manager[n];
	        managers[0] = new Manager();
	        managers[0].accept(1, "John", 50000, 10000);
	        managers[1] = new Manager();
	        managers[1].accept(2, "Doe", 60000, 15000);

	        for (Manager manager : managers) {
	            manager.display();
	        }

	        double maxSalary = managers[0].getTotalSalary();
	        for (int i = 1; i < n; i++) {
	            if (managers[i].getTotalSalary() > maxSalary) {
	                maxSalary = managers[i].getTotalSalary();
	            }
	        }
	        System.out.println("Maximum Total Salary: " + maxSalary);
	    }
	}