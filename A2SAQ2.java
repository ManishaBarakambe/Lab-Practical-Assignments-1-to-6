package LabAssignments;


	class Fibonacci {
	    public void printSeries(int n) {
	        int a = 0, b = 1;
	        System.out.print("Fibonacci Series: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int sum = a + b;
	            a = b;
	            b = sum;
	        }
	        System.out.println();
	    }
	}

	class Square {
	    public void printSeries(int n) {
	        System.out.print("Square Series: ");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i * i + " ");
	        }
	        System.out.println();
	    }
	}

	class Cube {
	    public void printSeries(int n) {
	        System.out.print("Cube Series: ");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i * i * i + " ");
	        }
	        System.out.println();
	    }
	}
	public class A2SAQ2 {
	 public static void main(String[] args) {
	        Fibonacci fib = new Fibonacci();
	        Square sq = new Square();
	        Cube cu = new Cube();
	        int n = 5;
	        fib.printSeries(n);
	        sq.printSeries(n);
	        cu.printSeries(n);
	    }
	}