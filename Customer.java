package bankmanagement;

import java.util.InputMismatchException;

import java.util.Scanner;



class NotEligibleException extends Exception {
	

	public void voting(int age) throws NotEligibleException
	{
    if(age>=18)
    	{
        System.out.println("Eligible for Voting");
        }
        else{
  
        throw new NotEligibleException();
                                  
        }
     
	}

}

public class Customer{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {		
		Customer customer=new Customer();
		customer.arithmetic();
		
	}

	private void arithmetic() {
		// TODO Auto-generated method stub
		try {
		int divide=3/0;
		}
		catch(ArithmeticException e) {
			System.out.println("/0 please check and change it");
			e.printStackTrace();
		}
		inputmismatch();
	}

	private void inputmismatch() {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter two  number");
		int firstinput=sc.nextInt();
		int secondinput=sc.nextInt();
		int divide=firstinput/secondinput;
		System.out.println("divison result="+divide);
		}
		catch(InputMismatchException e) {
			System.out.println("please check ur inputs");
			e.printStackTrace();
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("0 is Not allowed in divison");
			e.printStackTrace();
			
		}
		arrayindex();
	}

	private void arrayindex() {
		// TODO Auto-generated method stub
		try {
		int numbers[]= {1,2,3,4,5};
		System.out.println(numbers[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("give valid index");
			e.printStackTrace();
		}
		
			nulls();
		}

	private void nulls() {
		// TODO Auto-generated method stu
		try {
			String words=null;
			System.out.println(words.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("String Value is null");
			e.printStackTrace();
		}
		word();
	}

	private void word() {
		// TODO Auto-generated method stub
		try {
		System.out.println("enter some Sentances");
		String word=sc.next();
		System.out.println(word.charAt(word.length()+1));
		}
		catch(StringIndexOutOfBoundsException e) {
			
			System.out.println("out of length!!!!");
			e.printStackTrace();
		}	
		userDefined();
		
	}

	private void userDefined()  {
		NotEligibleException notEligible=new NotEligibleException();
		System.out.println("enter your Age");
		try {
			notEligible.voting(sc.nextInt());
		} catch (NotEligibleException e) 
		{	
			e.printStackTrace();
		}
	}
		
		
	}
