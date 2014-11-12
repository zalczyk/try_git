public class TestWallet {
    public static void main (String[] args){
        Wallet wallet = new Wallet (100.0);
        exercise_6_mstachowski exercise_6_mstachowski = new exercise_6_mstachowski();
        wallet.deposit(50.0);
        wallet.withdraw(147.0);
        System.out.println("Final amount in wallet is " + wallet.countMoney());
        exercise_6_mstachowski.exercise_6_method();
    }
}