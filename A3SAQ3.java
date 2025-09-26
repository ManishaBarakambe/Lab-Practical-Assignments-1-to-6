package LabAssignments;


	import java.util.Scanner;

	class NumberIsZeroException extends Exception {
	    NumberIsZeroException(String message) {
	        super(message);
	    }
	}

	public class A3SAQ3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        try {
	            if (num == 0) {
	                throw new NumberIsZeroException("Number is 0");
	            }
	            boolean isPrime = isPrime(num);
	            System.out.println(num + " is " + (isPrime ? "prime" : "not prime"));
	        } catch (NumberIsZeroException e) {
	            System.out.println(e.getMessage());
	        }
	        scanner.close();
	    }

	    static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	}