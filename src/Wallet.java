public class Wallet{
    private double amount;

    public Wallet(double initialAmount){
        amount=initialAmount;
    }
    public double countMoney(){
        return amount;
    }
    public void deposit(double amt){
        amount+=amt;
    }
    public void withdraw(double amt){
        amount-=amt;
    }
    public void erase(){
        amount = 0.0; 
    }
}
