public class TestWallet {
    public static void main (String[] args){
        Wallet wallet = new Wallet (100.0);
        wallet.deposit(50.0);
        wallet.withdraw(147.0);
        System.out.println("Final amount in wallet is " + wallet.countMoney());
    }
}