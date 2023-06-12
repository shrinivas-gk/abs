package javabasicprogram.com;

public class Account2 {
   
	int accNo;
	float amount;
	String name;
	
	public void insert(int a,float amt,String n) {
		accNo=a;
		amount=amt;
		name=n;
	}
	public void deposite( float amt) {
		amount=amt+amount;
		System.out.println("your amount is" +amt);
	}
	public void withdraw(float amt) {
		if(amount<amt)
		{
			System.out.println("Insufficient balance");
		}
		else {
			amount=amt-amount;
			System.out.println("withdraw successfull:"+amt);
		}
		
			
		}
	public void checkbalance() {
	System.out.println("balance is:"+amount);
	}
	public static void main(String[] args) {
		Account2 a= new Account2();
		a.insert(188823, 17000, "shrinivas");
		a.deposite(15000);
		a.withdraw(16000);
		a.checkbalance();
	}
}
