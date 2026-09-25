# JOBSHEET 4 PEMILIHAN 1 


### Identitas Mahasiswa :
* Nama               : [Elia Beril](https://www.instagram.com/ellxzrst.22/)
* NIM                : [264107020027]
* Kelas/No. Presensi : [TI-1D/13]
---
## 1 Tujuan Praktikum
Berikut adalah tujuan pelaksanaan praktikum pada materi "**Pemilihan**"
> 1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks
pemilihan sederhana
> 2. Mahasiswa mampu menerapkan sintaks pemilihan sederhana ke dalam program Java

## 2. Hasil Percobaan & Analisis
> 2.1 Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS
Waktu Percobaan: 40 menit
#### Pada awal setiap semester, mahasiswa wajib mencetak KRS untuk ditanda tangani oleh Dosen Pembina Akademik. SIAKAD akan memeriksa status pembayaran UKT mahasiswa. Jika mahasiswa sudah melunasi UKT, maka sistem menampilkan KRS untuk dicetak. Berdasarkan kasus tersebut, program Java dibuat dengan langkah-langkah berikut.

> 2.1.1 Kode Program Sesuai Langkah"
```java
import java.util.Scanner;

public class PemilihanIfElseNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        // Struktur pemilihan IF - ELSE IF - ELSE
        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }

        sc.close();
    }
}
```
> 2.1.2 Hasil Running & SS Output
! [ ](minggu 5/images/pdp/Screenshot 2026-09-23 153904.png)
2.1.2 Hasil Running & SS Output ! ![Gambar Hasil](minggu%205/images/pdp/Screenshot%202026-09-23%20153904.png)


---
