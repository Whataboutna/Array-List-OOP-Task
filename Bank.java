public class Bank {
    private int balance;
    public static int banyakAkun = 0;
    private String nama;
  
    public Bank (String nama, int balance) {
        this.balance = balance;
        this.nama = nama;
        banyakAkun ++;
    }
    
    public String getNama(){
        return this.nama;
    }

    public void deposit (int total) {
        if (total > 0) {
            this.balance += total;
        } else {
            System.out.println("Jumlah Deposit Tidak Valid");
        }

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