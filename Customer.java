package bankmanagement;

import java.util.InputMismatchException;

import java.util.Scanner;



class NotEligibleException extends Exception {
	

	public void voting(int a) throws NotEligibleException
	{
    if(a>=18)
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
		Customer c=new Customer();
		c.arithmetic();
		
	}

	private void arithmetic() {
		// TODO Auto-generated method stub
		try {
		int a=3/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("/0 please check and change it");
			ae.printStackTrace();
		}
		inputmismatch();
	}

	private void inputmismatch() {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter two  number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("divison result="+c);
		}
		catch(InputMismatchException ex) {
			System.out.println("please check ur inputs");
			ex.printStackTrace();
			
			
		}
		catch(ArithmeticException ex) {
			System.out.println("0 is Not allowed in divison");
			ex.printStackTrace();
			
		}
		arrayindex();
	}

	private void arrayindex() {
		// TODO Auto-generated method stub
		try {
			
		
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("give valid index");
			ai.printStackTrace();
		}
		
			nulls();
		}

	private void nulls() {
		// TODO Auto-generated method stu
		try {
			String s=null;
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException n) {
			System.out.println("String Value is null");
			n.printStackTrace();
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
		catch(StringIndexOutOfBoundsException se) {
			
			System.out.println("out of length!!!!");
			se.printStackTrace();
		}	
		userDefined();
		
	}

	private void userDefined()  {
		NotEligibleException ne=new NotEligibleException();
		System.out.println("enter your Age");
		try {
			ne.voting(sc.nextInt());
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	}
