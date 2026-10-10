import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0) {
            Bank pemilik = new Bank (100000);
            System.out.println ("\n\nWelcome to Bank ABC");
            pemilik.menu();

            try {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print ("\nCurrent Balance Rp" +pemilik.getBalance());
                        System.out.print("\n---Tap enter to continue---");
                        input.nextLine();
                        break;
                    
                    case 2:
                        System.out.print("\nDeposit: Rp");
                        int jumlahDepo = Integer.parseInt(input.nextLine());
                        pemilik.deposit(jumlahDepo);
                        System.out.print ("Current Balance Rp" +pemilik.getBalance());
                        System.out.print("\n---Tap enter to continue---");
                        input.nextLine();
                        break;
                    
                    case 3:
                        System.out.print("\nWithdraw: Rp");
                        int jumlahTarik = Integer.parseInt(input.nextLine());
                        pemilik.withdraw(jumlahTarik);
                        System.out.print ("Current Balance Rp" +pemilik.getBalance());
                        System.out.print("\n---Tap enter to continue---");
                        input.nextLine();
                        break;
                    
                    case 0:
                        System.out.println("\nTerima kasih, program selesai.");
                        break;

                    default:
                        System.out.println("\nPilihan tidak valid! Silakan masukkan angka 0-3.");
                        System.out.print("\n---Tap enter to continue---");
                        input.nextLine();
                        break;
                }
            }
                catch (InputMismatchException e) {
                System.out.println("\nError: Input harus berupa angka!");
                input.nextLine();
                pilihan = -1;
                }
                }
                input.close();
        }
}