public class Bank {
    private int balance;
  
    public Bank (int balance) {
        this.balance = balance;
    }
    
    public void deposit (int total) {
        this.balance += total;
    }

    public void withdraw (int total) {
        this.balance -= total;
    }

    public int getBalance () {
        return this.balance;
    }

    public void menu () {
        System.out.println("\n---Menu---");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");   
        System.out.println("3. Withdraw");
        System.out.println("0. Keluar"); 
        System.out.println("Pilihan (0-3): ");
    }
}