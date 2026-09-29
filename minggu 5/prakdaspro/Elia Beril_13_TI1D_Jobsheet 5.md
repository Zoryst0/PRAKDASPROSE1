# JOBSHEET 5 PEMILIHAN 1 


**Identitas Mahasiswa :**
* **Nama               : [Elia Beril](https://www.instagram.com/ellxzrst.22/)**
* **NIM                : [264107020027]**
* **Kelas/No. Presensi : [TI-1D/13]**

---
## 1 Tujuan Praktikum
> 1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks
pemilihan sederhana
> 2. Mahasiswa mampu menerapkan sintaks pemilihan sederhana ke dalam program Java

---
## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS

#### 2.1.1 Kode Program Java

[Pemilihanif13.java](minggu 5/prakdaspro/PemilihanIf13.java)

```java
import java.util.Scanner;
// Contoh code program dalam percobaan 1
public class PemilihanIfNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        
         sc.close();
        }
    }
}
```
> 2.1.2 Hasil Running & SS Output
#### Output dari code diatas
<img width="385" height="66" alt="Screenshot 2026-09-23 155904" src="https://github.com/user-attachments/assets/890b3c41-99fd-40cd-84e0-81920d4f7830" />



---
