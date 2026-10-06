<div align="center">

# 📘 JOBSHEET 4 — PEMILIHAN 1

**Dasar Pemrograman 2026 · Politeknik Negeri Malang**

</div>

| | |
|---|---|
| 👤 **Nama** | Elia Beril |
| 🆔 **NIM** | 264107020027 |
| 🔢 **No. Presensi** | 13 |
| 📚 **Mata Kuliah** | Dasar Pemrograman |
| ☕ **Bahasa** | Java (diuji dengan OpenJDK 21) |

> 📝 Dokumen ini hanya memuat **Pertanyaan** (Percobaan 1 & 2) dan **Tugas**. Langkah-langkah praktikum dan contoh tidak diulang. Semua hasil *run* pada dokumen ini berasal dari program yang benar-benar dijalankan.

---

## 📑 Daftar Isi

1. [Percobaan 1 — IF dan IF-ELSE](#1-percobaan-1--if-dan-if-else)
2. [Percobaan 2 — SWITCH-CASE](#2-percobaan-2--switch-case)
3. [Tugas](#3-tugas)
4. [Soal Tambahan](#4-soal-tambahan)
5. [Catatan Asumsi](#5-catatan-asumsi)

---

# 1. Percobaan 1 — IF dan IF-ELSE

📄 File: [Experiment1](minggu5/prakdaspro/PemilihanIf13.java) `PemilihanIf13.java`

### ❓ Pertanyaan 1
**Nilai apa yang harus dimasukkan agar kedua baris di dalam blok IF ikut tercetak? Jelaskan mengapa hanya nilai tersebut yang diterima!**

**Jawaban:** nilai **`true`**.

```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): true
Pembayaran UKT terverifikasi
Silakan cetak KRS dan minta tanda tangan DPA
```

Alasannya, blok `if (uktLunas) { ... }` hanya dieksekusi bila ekspresi di dalam kurung bernilai `true`. Variabel `uktLunas` bertipe `boolean`, sehingga hanya punya dua kemungkinan nilai: `true` (blok dijalankan) atau `false` (blok dilewati). Input lain seperti `ya` atau `1` bukan nilai boolean yang valid bagi `nextBoolean()` (lihat Pertanyaan 3).

### ❓ Pertanyaan 2
**Masukkan `false`. Baris mana yang tercetak dan mana yang tidak? Jelaskan alur eksekusinya!**

```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): false
```

| Status | Baris |
|:-:|---|
| ✅ Tercetak | `--- Cetak KRS SIAKAD ---` dan prompt `Apakah UKT sudah lunas? (true/false):` |
| ❌ Tidak tercetak | `Pembayaran UKT terverifikasi` dan `Silakan cetak KRS dan minta tanda tangan DPA` |

**Alur eksekusi:**
1. Program mencetak judul dan prompt.
2. `sc.nextBoolean()` membaca `false` lalu disimpan ke `uktLunas`.
3. Kondisi `if (uktLunas)` dievaluasi menjadi `false`.
4. Karena tidak ada `else`, program **melompati seluruh blok IF**.
5. Program mencapai akhir `main()` dan selesai tanpa pesan apa pun, sehingga pengguna tidak tahu apa yang terjadi.

### ❓ Pertanyaan 3
**Masukkan `TRUE` (huruf kapital) dan `ya`. Apa yang terjadi? Jika error, jelaskan penyebabnya!**

**Input `TRUE`** — ✅ diterima, hasilnya sama seperti `true`:
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): TRUE
Pembayaran UKT terverifikasi
Silakan cetak KRS dan minta tanda tangan DPA
```

**Input `ya`** — ❌ program berhenti dengan error:
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): ya
Exception in thread "main" java.util.InputMismatchException
```

**Penjelasan:**
- `Scanner.nextBoolean()` **tidak membedakan huruf besar/kecil**, jadi `TRUE`, `True`, dan `true` semuanya dibaca sebagai `true`.
- `ya` bukan token boolean yang dikenali. `nextBoolean()` hanya menerima kata `true` atau `false`. Karena tidak cocok, Scanner melempar **`InputMismatchException`**. Exception ini tidak ditangani (tidak ada `try-catch`), sehingga program berhenti tepat di baris `sc.nextBoolean()` dan struktur `if` tidak pernah dijalankan.

### ❓ Pertanyaan 4
**Tambahkan struktur ELSE agar input `false` menghasilkan "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu", lalu tunjukkan hasil run untuk `true` dan `false`!**

```java
// PemilihanIf13.java
import java.util.Scanner;

public class PemilihanIf13 {
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
        }
    }
}
```

**Hasil run — input `true`:**
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): true
Pembayaran UKT terverifikasi
Silakan cetak KRS dan minta tanda tangan DPA
```

**Hasil run — input `false`:**
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): false
Registrasi ditolak. Silakan lunasi UKT terlebih dahulu
```

---

# 2. Percobaan 2 — SWITCH-CASE

📄 File: `PemilihanSwitch13.java`

### ❓ Pertanyaan 1
**Hapus `break;` pada `case 5`, jalankan dengan masukan `5`, tuliskan keluarannya, dan jelaskan fungsi `break`!**

**Keluaran (tanpa `break` pada `case 5`):**
```text
--- Cetak KRS SIAKAD ---
Masukkan semester saat ini: 5
KRS Semester 5 ditampilkan
KRS Semester 6 ditampilkan
```

Sebagai pembanding, keluaran program asli (dengan `break`):
```text
--- Cetak KRS SIAKAD ---
Masukkan semester saat ini: 5
KRS Semester 5 ditampilkan
```

**Fungsi `break`:** menghentikan eksekusi `switch` dan keluar dari blok tersebut. Tanpa `break`, program mengalami ***fall-through***: setelah `case 5` cocok, eksekusi terus berlanjut ke statement `case 6` **tanpa memeriksa kondisinya lagi**, sampai bertemu `break` berikutnya (di `case 6`). Itulah sebabnya muncul dua baris keluaran. Kode sudah dikembalikan seperti semula setelah percobaan.

### ❓ Pertanyaan 2
**Jalankan dengan masukan `10`, lalu `0`. Apa keluarannya? Jelaskan peran `default` dan akibatnya jika dihapus!**

**Masukan `10`:**
```text
--- Cetak KRS SIAKAD ---
Masukkan semester saat ini: 10
Semester tidak valid
```

**Masukan `0`:**
```text
--- Cetak KRS SIAKAD ---
Masukkan semester saat ini: 0
Semester tidak valid
```

**Peran `default`:** menjadi jalur cadangan yang dieksekusi bila nilai `semester` tidak cocok dengan satu pun `case` (di sini selain 1–8). Dengan begitu input tidak valid tetap mendapat umpan balik.

**Jika `default` dihapus:** untuk input `10` atau `0` tidak ada `case` yang cocok, maka seluruh `switch` dilewati dan program selesai **tanpa keluaran apa pun** setelah prompt. Programnya tidak error, tetapi pengguna tidak diberi tahu bahwa inputnya salah.

### ❓ Pertanyaan 3
**Ganti tipe `semester` menjadi `double`, lalu compile. Apakah berhasil? Tuliskan pesan error, jelaskan penyebabnya, dan sebutkan tipe data yang boleh pada `switch`!**

Perubahan: `double semester = sc.nextDouble();`

**Hasil: ❌ gagal dicompile.**
```text
DoubleSw.java:11: error: selector type double is not allowed
        switch (semester) {
               ^
```

*(Pada JDK versi lebih lama, misalnya Java 8–17, pesannya berbentuk `incompatible types: possible lossy conversion from double to int`. Penyebabnya sama.)*

**Penyebab:** ekspresi `switch` tidak boleh bertipe `double`. Bilangan pecahan tidak presisi untuk dibandingkan dengan kesamaan (`0.1 + 0.2 != 0.3`), sehingga bahasa Java melarangnya.

**Tipe data yang boleh digunakan sebagai ekspresi `switch`:**

| Kategori | Tipe |
|---|---|
| Primitif | `byte`, `short`, `char`, `int` |
| Pembungkus (wrapper) | `Byte`, `Short`, `Character`, `Integer` |
| Objek | `String` |
| Lainnya | `enum` |

Tipe `long`, `float`, `double`, dan `boolean` **tidak boleh**.

### ❓ Pertanyaan 4
**Ubah ke bentuk IF - ELSE IF - ELSE dengan keluaran sama persis (termasuk input tidak valid). Mana yang lebih mudah dibaca?**

📄 File: `PemilihanIfElse13.java`

```java
// PemilihanIfElse13.java
import java.util.Scanner;

public class PemilihanIfElse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

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
    }
}
```

**Bukti keluaran sama dengan versi SWITCH-CASE:**

| Masukan | Keluaran |
|:-:|---|
| `1` | KRS Semester 1 ditampilkan |
| `5` | KRS Semester 5 ditampilkan |
| `8` | KRS Semester 8 ditampilkan |
| `10` | Semester tidak valid |
| `0` | Semester tidak valid |

**Yang lebih mudah dibaca: SWITCH-CASE.** Pada kasus ini satu variabel (`semester`) dibandingkan dengan nilai tetap yang diskret (1–8). `switch` menuliskan variabel itu **sekali saja** dan tiap `case` langsung menunjukkan nilainya, sedangkan IF-ELSE harus mengulang `semester == ...` pada setiap cabang sehingga lebih panjang dan lebih mudah salah ketik. (IF-ELSE justru unggul bila kondisinya berupa rentang atau gabungan kondisi, misalnya `nilai >= 80 && nilai < 90`.)

---

# 3. Tugas

### 📌 Tugas 1 — Ternary Operator

📄 File: `Tugas1Pemilihan13.java`

```java
// Tugas1Pemilihan13.java
import java.util.Scanner;

public class Tugas1Pemilihan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
                ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}
```

**Input `true`:**
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): true
Pembayaran UKT terverifikasi
Silakan cetak KRS dan minta tanda tangan DPA
```

**Input `false`:**
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): false
Registrasi ditolak. Silakan lunasi UKT terlebih dahulu
```

Keluaran identik dengan program IF-ELSE aslinya. Hasil keputusan ditampung di variabel `String pesan`, lalu dicetak dengan **satu** `System.out.println()`. Dua baris pada kasus `true` digabung dengan karakter `\n`.

**💬 Kapan Ternary Operator lebih baik dibanding IF-ELSE?**

| ✅ Lebih baik digunakan | ❌ Sebaiknya tidak digunakan |
|---|---|
| Memilih **satu nilai** dari dua kemungkinan, lalu menyimpannya ke variabel atau langsung dipakai (contoh: `String pesan = lulus ? "Lulus" : "Tidak lulus";`) | Setiap cabang perlu menjalankan **beberapa statement** atau aksi berbeda (cetak, ubah variabel, panggil method) |
| Kondisinya sederhana dan hasilnya pendek sehingga kode ringkas dan satu baris | Kondisinya **bertingkat** (ternary bersarang) karena sulit dibaca dan rawan salah |
| Dipakai di dalam ekspresi, misalnya argumen method atau penggabungan string | Logika cukup kompleks atau perlu diberi komentar di tiap cabang |

---

### 📌 Tugas 2 — Validasi SKS (Flowchart → IF-ELSE)

📄 File: `Tugas2Pemilihan13.java`

Flowchart: baca `jumlahSks`; jika `jumlahSks > 24` → cetak **"Melebihi batas"**, jika tidak → cetak **"KRS valid"**.

```java
// Tugas2Pemilihan13.java
import java.util.Scanner;

public class Tugas2Pemilihan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah SKS: ");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}
```

| Masukan | Keluaran |
|:-:|---|
| `20` | KRS valid |
| `24` | KRS valid |
| `25` | Melebihi batas |

> 💡 Nilai batas **24** masih dianggap valid karena kondisinya `> 24` (bukan `>= 24`), sesuai flowchart.

---

### 📌 Tugas 3 — Implementasi Latihan Slide (hlm. 33)

> ⚠️ Slide Latihan halaman 33 tidak ikut terlampir pada jobsheet, jadi aturan kedua soal di bawah adalah **asumsi saya**. Strukturnya (IF-ELSE untuk parkir, SWITCH-CASE + `default` untuk antrean) sudah sesuai ketentuan. Silakan sesuaikan isi tarif dan nama layanan dengan flowchart/pseudocode milik Anda.

#### a. Soal 1 — Sistem Parkir (IF-ELSE)

📄 File: `TugasParkir13.java`

*Asumsi aturan: Motor Rp2.000 untuk jam pertama + Rp1.000 per jam berikutnya; Mobil Rp5.000 untuk jam pertama + Rp3.000 per jam berikutnya.*

```java
// TugasParkir13.java
import java.util.Scanner;

public class TugasParkir13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Parkir ===");
        System.out.print("Jenis kendaraan (1=Motor, 2=Mobil): ");
        int jenis = sc.nextInt();
        System.out.print("Lama parkir (jam): ");
        int lama = sc.nextInt();

        if (jenis != 1 && jenis != 2) {
            System.out.println("Jenis kendaraan tidak valid");
        } else if (lama <= 0) {
            System.out.println("Lama parkir tidak valid");
        } else if (jenis == 1) {
            // Motor: Rp2.000 jam pertama + Rp1.000 per jam berikutnya
            int tarif = 2000 + (lama - 1) * 1000;
            System.out.println("Tarif parkir motor: Rp" + tarif);
        } else {
            // Mobil: Rp5.000 jam pertama + Rp3.000 per jam berikutnya
            int tarif = 5000 + (lama - 1) * 3000;
            System.out.println("Tarif parkir mobil: Rp" + tarif);
        }
    }
}
```

| Masukan (jenis, lama) | Keluaran |
|:-:|---|
| `1`, `1` | Tarif parkir motor: Rp2000 |
| `1`, `4` | Tarif parkir motor: Rp5000 |
| `2`, `3` | Tarif parkir mobil: Rp11000 |
| `3`, `2` | Jenis kendaraan tidak valid |
| `2`, `0` | Lama parkir tidak valid |

#### b. Soal 2 — Mesin Antrean Akademik (SWITCH-CASE)

📄 File: `TugasAntrean13.java`

*Asumsi layanan: 1 = Pengisian KRS, 2 = Legalisasi Ijazah & Transkrip, 3 = Pembayaran UKT, 4 = Surat Keterangan Mahasiswa Aktif.*

```java
// TugasAntrean13.java
import java.util.Scanner;

public class TugasAntrean13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mesin Antrean Akademik ===");
        System.out.println("1. Pengisian KRS");
        System.out.println("2. Legalisasi Ijazah & Transkrip");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Surat Keterangan Mahasiswa Aktif");
        System.out.print("Pilih kode layanan (1-4): ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Antrean layanan: Pengisian KRS");
                break;
            case 2:
                System.out.println("Antrean layanan: Legalisasi Ijazah & Transkrip");
                break;
            case 3:
                System.out.println("Antrean layanan: Pembayaran UKT");
                break;
            case 4:
                System.out.println("Antrean layanan: Surat Keterangan Mahasiswa Aktif");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}
```

**Contoh run — kode `1`:**
```text
=== Mesin Antrean Akademik ===
1. Pengisian KRS
2. Legalisasi Ijazah & Transkrip
3. Pembayaran UKT
4. Surat Keterangan Mahasiswa Aktif
Pilih kode layanan (1-4): 1
Antrean layanan: Pengisian KRS
```

**Contoh run — kode `7` (di luar 1–4, masuk `default`):**
```text
=== Mesin Antrean Akademik ===
1. Pengisian KRS
2. Legalisasi Ijazah & Transkrip
3. Pembayaran UKT
4. Surat Keterangan Mahasiswa Aktif
Pilih kode layanan (1-4): 7
Kode layanan tidak tersedia
```

---

# 4. Soal Tambahan

### 🏦 Soal 1 — Nusantara Pay: Sistem Keamanan Transaksi

📄 File: `NusantaraPay13.java`

**Pendekatan:** urutan prioritas pada soal diterjemahkan langsung menjadi rantai `if – else if – else`. Karena Java mengevaluasi dari atas ke bawah dan berhenti pada kondisi pertama yang benar, urutan penulisan **adalah** urutan prioritasnya. Status akhir ditampung di satu variabel `status`.

```java
// NusantaraPay13.java
import java.util.Scanner;

public class NusantaraPay13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double LIMIT_HARIAN = 10000;

        System.out.println("=== Nusantara Pay - Evaluasi Transaksi ===");
        System.out.print("Status akun (NORMAL/SUSPICIOUS/BLACK-LISTED): ");
        String statusAkun = sc.nextLine().trim().toUpperCase();
        System.out.print("Sisa saldo ($): ");
        double saldo = sc.nextDouble();
        System.out.print("Nominal transaksi ($): ");
        double nominal = sc.nextDouble();
        System.out.print("Transaksi luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();
        System.out.print("Jam transaksi (0-23): ");
        int jam = sc.nextInt();

        String status;

        if (statusAkun.equals("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > saldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > LIMIT_HARIAN) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if (jam >= 0 && jam < 4 && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equals("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }

        System.out.println("Status transaksi: " + status);
    }
}
```

**Contoh run (akun `SUSPICIOUS`, transaksi $600):**
```text
=== Nusantara Pay - Evaluasi Transaksi ===
Status akun (NORMAL/SUSPICIOUS/BLACK-LISTED): SUSPICIOUS
Sisa saldo ($): 5000
Nominal transaksi ($): 600
Transaksi luar negeri? (true/false): false
Jam transaksi (0-23): 14
Status transaksi: REQUIRE_OTP_SUSPICIOUS
```

**Hasil uji untuk tiap status:**

| # | Status akun | Saldo | Nominal | Luar negeri | Jam | Status akhir |
|:-:|---|--:|--:|:-:|:-:|---|
| 1 | `BLACK-LISTED` | $5000 | $100 | false | 12 | **`REJECTED_BLACKLIST`** |
| 2 | `NORMAL` | $500 | $600 | false | 12 | **`REJECTED_SALDO`** |
| 3 | `NORMAL` | $20000 | $12000 | false | 12 | **`REJECTED_LIMIT`** |
| 4 | `NORMAL` | $20000 | $3000 | true | 12 | **`FLAGGED_FRAUD`** |
| 5 | `NORMAL` | $20000 | $1500 | false | 2 | **`REQUIRE_OTP_NIGHT`** |
| 6 | `SUSPICIOUS` | $5000 | $600 | false | 14 | **`REQUIRE_OTP_SUSPICIOUS`** |
| 7 | `NORMAL` | $5000 | $300 | false | 14 | **`APPROVED`** |

> 💡 Syarat jam dibuat `jam >= 0 && jam < 4` karena jam diinput sebagai bilangan bulat; jam 4 berarti 04.00–04.59, yang sudah di luar rentang 00.00–04.00.

---

### 🏥 Soal 2 — UGD RS Harapan Kita: Alokasi Ruang Darurat

📄 File: `UgdHarapanKita13.java`

**Pendekatan:** kriteria diurutkan dari yang **paling gawat ke paling ringan**. Karena `ICU` dan `UGD_VENTILATOR_MOBIL` sudah menangani semua kasus SpO₂ < 85, kondisi berikutnya otomatis hanya berlaku untuk SpO₂ ≥ 85. Rentang SpO₂ dibuat tanpa celah memakai `>=` dan `<` (85–89 = `>= 85 && < 90`, 90–94 = `>= 90 && < 95`), sehingga nilai desimal seperti 89,5 tetap tertangani.

```java
// UgdHarapanKita13.java
import java.util.Scanner;

public class UgdHarapanKita13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== UGD RS Harapan Kita - Alokasi Ruang ===");
        System.out.print("SpO2 (%): ");
        double spo2 = sc.nextDouble();
        System.out.print("Sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();
        System.out.print("Tekanan darah sistolik (mmHg): ");
        int sistolik = sc.nextInt();
        System.out.print("Sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();
        System.out.print("Suhu tubuh (C): ");
        double suhu = sc.nextDouble();
        System.out.print("Punya riwayat komorbid? (true/false): ");
        boolean komorbid = sc.nextBoolean();
        System.out.print("Usia (tahun): ");
        int usia = sc.nextInt();
        System.out.print("Laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        boolean spo2_85_89 = spo2 >= 85 && spo2 < 90;
        boolean spo2_90_94 = spo2 >= 90 && spo2 < 95;
        boolean sistolikTidakNormal = sistolik < 90 || sistolik > 180;

        String lokasi;

        if (spo2 < 85 && sisaBedICU > 0) {
            lokasi = "ICU";
        } else if (spo2 < 85) {
            lokasi = "UGD_VENTILATOR_MOBIL";
        } else if (spo2_85_89 || sistolikTidakNormal || !sadarPenuh) {
            lokasi = "RESUSITASI_UGD";
        } else if ((spo2_90_94 || suhu > 39) && komorbid && usia >= 65) {
            lokasi = "HCU_ISOLASI";
        } else if (spo2_90_94 || lajuNapas > 24) {
            lokasi = "RAWAT_INAP_UMUM";
        } else {
            lokasi = "RAWAT_JALAN";
        }

        System.out.println("Lokasi perawatan: " + lokasi);
    }
}
```

**Contoh run:**
```text
=== UGD RS Harapan Kita - Alokasi Ruang ===
SpO2 (%): 92
Sisa bed ICU: 1
Tekanan darah sistolik (mmHg): 120
Sadar penuh? (true/false): true
Suhu tubuh (C): 38
Punya riwayat komorbid? (true/false): true
Usia (tahun): 70
Laju napas (x/menit): 20
Lokasi perawatan: HCU_ISOLASI
```

**Hasil uji:**

| # | SpO₂ | Bed ICU | Sistolik | Sadar | Suhu | Komorbid | Usia | Napas | Lokasi |
|:-:|--:|--:|--:|:-:|--:|:-:|--:|--:|---|
| 1 | 80 | 2 | 120 | true | 37 | false | 30 | 18 | **`ICU`** |
| 2 | 80 | 0 | 120 | true | 37 | false | 30 | 18 | **`UGD_VENTILATOR_MOBIL`** |
| 3 | 87 | 1 | 120 | true | 37 | false | 30 | 18 | **`RESUSITASI_UGD`** |
| 4 | 97 | 1 | 85 | true | 37 | false | 30 | 18 | **`RESUSITASI_UGD`** |
| 5 | 97 | 1 | 120 | false | 37 | false | 30 | 18 | **`RESUSITASI_UGD`** |
| 6 | 92 | 1 | 120 | true | 38 | true | 70 | 20 | **`HCU_ISOLASI`** |
| 7 | 92 | 1 | 120 | true | 38 | false | 40 | 20 | **`RAWAT_INAP_UMUM`** |
| 8 | 97 | 1 | 120 | true | 37 | false | 30 | 28 | **`RAWAT_INAP_UMUM`** |
| 9 | 98 | 1 | 120 | true | 37 | false | 30 | 18 | **`RAWAT_JALAN`** |

---

### 💰 Soal 3 — Konsultan Pajak: Kalkulator PPh 21 Progresif

📄 File: `Pph21Progresif13.java`

**Pendekatan:** pajak dihitung **bertingkat**, yaitu tiap lapisan hanya mengenai bagian PKP yang masuk ke lapisan itu. Akumulasi lapisan sebelumnya:

| Lapisan PKP | Tarif | Pajak maksimal lapisan | Akumulasi |
|---|:-:|--:|--:|
| ≤ Rp60 juta | 5% | Rp3.000.000 | Rp3.000.000 |
| > 60 juta s.d. 250 juta | 15% | 15% × 190 juta = Rp28.500.000 | Rp31.500.000 |
| > 250 juta s.d. 500 juta | 25% | 25% × 250 juta = Rp62.500.000 | Rp94.000.000 |
| > 500 juta | 30% | — | — |

```java
// Pph21Progresif13.java
import java.util.Locale;
import java.util.Scanner;

public class Pph21Progresif13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Kalkulator PPh 21 Progresif ===");
        System.out.print("Masukkan PKP tahunan (Rp): ");
        double pkp = sc.nextDouble();

        final double BATAS_1 = 60_000_000;
        final double BATAS_2 = 250_000_000;
        final double BATAS_3 = 500_000_000;

        double pajak;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= BATAS_1) {
            pajak = 0.05 * pkp;
        } else if (pkp <= BATAS_2) {
            pajak = (0.05 * BATAS_1) + 0.15 * (pkp - BATAS_1);
        } else if (pkp <= BATAS_3) {
            pajak = (0.05 * BATAS_1) + (0.15 * (BATAS_2 - BATAS_1))
                    + 0.25 * (pkp - BATAS_2);
        } else {
            pajak = (0.05 * BATAS_1) + (0.15 * (BATAS_2 - BATAS_1))
                    + (0.25 * (BATAS_3 - BATAS_2)) + 0.30 * (pkp - BATAS_3);
        }

        System.out.printf(Locale.forLanguageTag("id-ID"), "PPh 21 terutang: Rp%,.0f%n", pajak);
    }
}
```

**Contoh run:**
```text
=== Kalkulator PPh 21 Progresif ===
Masukkan PKP tahunan (Rp): 100000000
PPh 21 terutang: Rp9.000.000
```

**Hasil uji (batas lapisan ikut diuji):**

| PKP | PPh 21 |
|--:|--:|
| Rp-5.000.000 | **Rp0** |
| Rp0 | **Rp0** |
| Rp50.000.000 | **Rp2.500.000** |
| Rp60.000.000 | **Rp3.000.000** |
| Rp100.000.000 | **Rp9.000.000** |
| Rp250.000.000 | **Rp31.500.000** |
| Rp400.000.000 | **Rp69.000.000** |
| Rp500.000.000 | **Rp94.000.000** |
| Rp800.000.000 | **Rp184.000.000** |

---

# 5. Catatan Asumsi

- Nama file memakai **nomor presensi 13** menggantikan `NoPresensi` pada jobsheet (mis. `Tugas1Pemilihan13.java`). Jika nomor presensi berbeda, cukup ganti angka `13` pada nama file dan nama `class`.
- Aturan **Sistem Parkir** dan **Mesin Antrean Akademik** diasumsikan karena slide hlm. 33 tidak tersedia. Struktur kode tinggal disesuaikan dengan flowchart dan pseudocode Anda.
- Pada tiga **Soal Tambahan**, bahasa pemrogramannya diasumsikan **Java** mengikuti jobsheet, dan masukan dibaca lewat `Scanner`.
- Pesan error pada Percobaan 2 No. 3 bergantung versi JDK. Yang ditampilkan adalah dari **JDK 21**.

<div align="center">

— *Elia Beril · 264107020027* —

</div>
