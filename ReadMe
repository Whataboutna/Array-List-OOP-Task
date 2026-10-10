# Sistem Manajemen Akun Bank (Bank ABC)

Aplikasi berbasis konsol (*Command Line Interface*) sederhana dalam bahasa pemograman Java yang mensimulasikan pengelolaan banyak akun bank beserta transaksi seperti pengecekan saldo, deposit, dan penarikan tunai (*withdraw*).

---

## 📋 Daftar Isi
1. [Penjelasan Kode (Code Overview)](#-penjelasan-kode-code-overview)
2. [Penerapan ArrayList (ArrayList Usage)](#-penerapan-arraylist-arraylist-usage)
3. [Informasi Pustaka / Library](#-informasi-pustaka--library)
4. [Alur dan Fitur Aplikasi](#-alur-dan-fitur-aplikasi)
5. [Cara Menjalankan Program](#-cara-menjalankan-program)

---

## 💻 Penjelasan Kode (Code Overview)

Program ini terdiri dari dua kelas utama:

### 1. `Bank.java` (Model Data)
Kelas ini bertindak sebagai cetak biru (*blueprint*) untuk objek akun bank.
- **Atribut:**
  - `balance` (`int`): Menyimpan jumlah saldo milik akun (privat).
  - `banyakAkun` (`static int`): Menghitung total akun yang pernah dibuat secara terpusat.
  - `nama` (`String`): Menyimpan nama pemilik akun (privat).
- **Metode Utama:**
  - `Bank(String nama, int balance)`: Konstruktor untuk inisialisasi nama dan saldo awal akun.
  - `getNama()` & `getBalance()`: *Getter* untuk mengambil informasi nama dan saldo.
  - `deposit(int total)`: Menambahkan saldo jika jumlah nominal valid (> 0).
  - `withdraw(int total)`: Mengurangi saldo sesuai nominal penarikan.
  - `menu()`: Menampilkan opsi menu transaksi individual akun.

### 2. `BankAccount.java` (Program Utama / Driver)
Kelas ini memuat metode `main` dan logika interaksi pengguna.
- Menampilkan daftar akun yang ada.
- Memungkinkan penambahan akun baru secara dinamis.
- Mengarahkan transaksi pengguna ke akun tertentu melalui metode `dijalankannyaAkun()`.
- Dilengkapi penanganan galat (*exception handling*) untuk mencegah aplikasi *crash* jika terjadi kesalahan input.

---

## 📌 Penerapan ArrayList (ArrayList Usage)

Di dalam file **`BankAccount.java`**, terdapat penggunaan koleksi dinamis `ArrayList` untuk menyimpan kumpulan objek `Bank`.

```java
ArrayList<Bank> daftarAkun = new ArrayList<>();
```

### Mengapa ArrayList Digunakan di Sini?
1. **Ukuran Dinamis:** Berbeda dengan array biasa yang ukurannya tetap (*fixed size*), `ArrayList` memungkinkan penambahan akun baru kapan saja tanpa batas ukuran awal.
2. **Fleksibilitas Data:** Objek `Bank` dapat dibuat dan dimasukkan ke dalam daftar secara *real-time* saat program berjalan.

### Contoh Operasi ArrayList pada Kode:
* **Inisialisasi Data Awal:**
  ```java
  daftarAkun.add(new Bank("Nathan", 100000));
  daftarAkun.add(new Bank("Aquarius", 200000));
  ```
* **Menghitung Total Akun Terdaftar:**
  ```java
  daftarAkun.size()
  ```
* **Mengakses Objek berdasarkan Indeks:**
  ```java
  Bank akunDipilih = daftarAkun.get(pilihan - 1);
  ```
* **Menambahkan Akun Baru dari Input User:**
  ```java
  daftarAkun.add(new Bank(namaBaru, saldoAwal));
  ```

---

## 📚 Informasi Pustaka / Library

Program ini menggunakan beberapa pustaka standar bawaan Java (*Java Standard Class Library*) yang diimpor pada kelas `BankAccount.java`:

| Library Import | Fungsi / Peranan |
| :--- | :--- |
| `java.util.ArrayList` | Menyediakan struktur data *array* dinamis untuk menampung daftar objek `Bank`. |
| `java.util.Scanner` | Digunakan untuk membaca input (*text/number*) dari pengguna melalui *keyboard* (konsol). |
| `java.util.InputMismatchException` | Mencegah dan menangani galat (*exception*) apabila pengguna memasukkan tipe data yang salah (misalnya memasukkan teks saat angka diminta). |

---

## ⚙️ Alur dan Fitur Aplikasi

1. **Menu Utama:**
   - Menampilkan daftar akun yang terdaftar.
   - Pilihan untuk membuat akun baru.
   - Pilihan untuk keluar dari aplikasi.
2. **Menu Transaksi Akun (setelah akun dipilih):**
   - **Check Balance:** Melihat saldo akun saat ini.
   - **Deposit:** Menambah saldo akun.
   - **Withdraw:** Menarik saldo dari akun.
   - **Keluar:** Kembali ke menu utama.

---

## 🚀 Cara Menjalankan Program

1. Pastikan **Java Development Kit (JDK)** sudah terinstal di komputer Anda.
2. Simpan kedua file (`Bank.java` dan `BankAccount.java`) dalam satu direktori/folder yang sama.
3. Buka *Terminal* atau *Command Prompt*, lalu navigasikan ke folder tersebut.
4. Kompilasi kedua berkas Java:
   ```bash
   javac Bank.java BankAccount.java
   ```
5. Jalankan program utama:
   ```bash
   java BankAccount
   ```