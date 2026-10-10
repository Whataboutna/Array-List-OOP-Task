import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount {
public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Bank> daftarAkun = new ArrayList<>();
        int pilihan = -1;
        daftarAkun.add(new Bank("Nathan", 100000));
        daftarAkun.add(new Bank("Aquarius", 200000));

        while (pilihan != 0) {
            System.out.println("\n===========================");
            System.out.println("   Welcome to Bank ABC");
            System.out.println("===========================");
            System.out.println("Daftar Akun:");
            
            for (int i = 0; i < daftarAkun.size(); i++) {
                System.out.println((i + 1) + ". " + daftarAkun.get(i).getNama());
            }
            System.out.println((daftarAkun.size() + 1) + ". + Tambah Akun Baru");
            System.out.println("0. Keluar Aplikasi");
            System.out.print("Pilih akun (masukkan nomor): ");

            try {
                pilihan = input.nextInt();
                input.nextLine();

                if (pilihan > 0 && pilihan <= daftarAkun.size()) {
                    // Mengambil akun terpilih dari ArrayList
                    Bank akunDipilih = daftarAkun.get(pilihan - 1);
                    dijalankannyaAkun(akunDipilih, input);
                } else if (pilihan == daftarAkun.size() + 1) {
                    // Fitur Tambah Akun Baru
                    System.out.print("\nMasukkan Nama Pemilik Akun: ");
                    String namaBaru = input.nextLine();
                    
                    System.out.print("Masukkan Saldo Awal: Rp");
                    int saldoAwal = Integer.parseInt(input.nextLine());

                    // Menambahkan objek Bank baru ke ArrayList
                    daftarAkun.add(new Bank(namaBaru, saldoAwal));
                    System.out.println("-> Akun atas nama '" + namaBaru + "' berhasil ditambahkan!");
                    System.out.println("---Tap enter to continue---");
                    input.nextLine();
                } else if (pilihan == 0) {
                    System.out.println("\nTerima kasih, program selesai.");
                } else {
                    System.out.println("\nPilihan tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nError: Input harus berupa angka!");
                input.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\nError: Input saldo harus berupa angka!");
        } 
    } input.close();
}
private static void dijalankannyaAkun(Bank akun, Scanner input) {
    int pilihan = -1;
        while (pilihan != 0) {
            System.out.println ("\n\nWelcome to Bank ABC");
            akun.menu();


            try {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print ("\nCurrent Balance Rp" +akun.getBalance());
                        System.out.print("\n---Tap enter to continue---");
                        input.nextLine();
                        break;
                    
                    case 2:
                        System.out.print("\nDeposit: Rp");
                        int jumlahDepo = Integer.parseInt(input.nextLine());
                        akun.deposit(jumlahDepo);
                        System.out.print ("Current Balance Rp" +akun.getBalance());
                        System.out.print("\n---Tap enter to continue---");
                        input.nextLine();
                        break;
                    
                    case 3:
                        System.out.print ("Current Balance Rp" +akun.getBalance());
                        System.out.print("\nWithdraw: Rp");
                        int jumlahTarik = Integer.parseInt(input.nextLine());
                        akun.withdraw(jumlahTarik);
                        System.out.print ("Current Balance Rp" +akun.getBalance());
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
                catch (NumberFormatException e) {
                System.out.println("\nError: Nominal harus berupa angka!");
                } 
            }input.close();
}
}