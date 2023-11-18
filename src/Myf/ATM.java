package Myf;

public class ATM{
    private double balance;

    
   

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return balance; 
        } else {
        	
        
            System.out.println("Insufficient");
        }
        return balance;
    }
    
    	
    	
    
    
    public double checkBalance() {
    	
    	return balance;
    }
}

