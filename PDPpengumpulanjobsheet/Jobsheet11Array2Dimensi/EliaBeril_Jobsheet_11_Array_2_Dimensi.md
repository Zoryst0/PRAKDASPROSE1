<div align="center">

# 🎬 JOBSHEET 11 — ARRAY 2 DIMENSI

**Dasar Pemrograman 2026 · Politeknik Negeri Malang**

</div>

| | |
|---|---|
| 👤 **Nama** | Elia Beril |
| 🆔 **NIM** | 264107020027 |
| 🔢 **No. Absen** | 13 |
| 📚 **Mata Kuliah** | Dasar Pemrograman |
| ☕ **Bahasa** | Java (diuji dengan OpenJDK 21) |

> 📝 Dokumen ini memuat kode, hasil *run*, jawaban **Pertanyaan** dan **Pertanyaan Diskusi** Percobaan 1–4, **Tugas Mandiri**, dan **Refleksi**. Teori dan langkah praktikum tidak diulang. Semua hasil *run* berasal dari program yang benar-benar dijalankan.

---

## 🗂️ Struktur Folder

```text
jobsheet11/
├── experiment/
│   ├── Bioskop13exp.java                → Percobaan 1
│   ├── BioskopWithScanner13exp.java     → Percobaan 2
│   ├── Numbers13exp.java                → Percobaan 3
│   ├── NumbersSalinan13exp.java         → Percobaan 3 (Pertanyaan Diskusi)
│   ├── SIAKAD13exp.java                 → Percobaan 4
│   └── SIAKADDinamis13exp.java          → Percobaan 4, Pertanyaan 1
├── assignment/
│   └── TugasMandiriSurvei13assign.java  → Tugas Mandiri
└── EliaBeril_Jobsheet_11_Array_2_Dimensi.md (dokumen ini)
```

> 💡 Jobsheet menulis nama file `Bioskop<NoAbsen>.java`. Di sini `<NoAbsen>` diganti **13** dan diberi akhiran folder (`exp` / `assign`), sama seperti jobsheet sebelumnya. Nama `class` di dalam file sama persis dengan nama file. Tautan relatif hanya bekerja bila dokumen ini berada di folder `jobsheet11`.

## 📑 Daftar Isi

1. [Percobaan 1 — Deklarasi dan Menampilkan Array 2 Dimensi](#1-percobaan-1--deklarasi-inisialisasi-dan-menampilkan-array-2-dimensi)
2. [Percobaan 2 — Scanner dan Perulangan](#2-percobaan-2--scanner-dan-perulangan)
3. [Percobaan 3 — Array dengan Panjang Baris Berbeda](#3-percobaan-3--array-dengan-panjang-baris-berbeda-jagged)
4. [Percobaan 4 — Studi Kasus SIAKAD](#4-percobaan-4--studi-kasus-siakad)
5. [Tugas Mandiri — Survei](#5-tugas-mandiri--survei)
6. [Refleksi](#6-refleksi)
7. [Catatan](#7-catatan)

---

# 1. Percobaan 1 — Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

📄 File: [`Bioskop13exp.java`](experiment/Bioskop13exp.java)

File ini sudah memuat langkah 1–4 beserta tambahan kode dari Pertanyaan 4, 6, 7, 8, 9, dan 10 (Kode 6 sampai Kode 11), dipisah dengan judul bagian pada keluarannya.

```java
// Bioskop13exp.java
public class Bioskop13exp {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Langkah 4: menampilkan seluruh elemen
        System.out.println("=== Daftar penonton ===");
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // Kode 6: panjang array dan panjang tiap baris
        System.out.println("\n=== Kode 6: length ===");
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        // Kode 7: panjang tiap baris dengan for
        System.out.println("\n=== Kode 7: for ===");
        System.out.println(penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }

        // Kode 8: panjang tiap baris dengan foreach
        System.out.println("\n=== Kode 8: foreach ===");
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // Kode 9: penonton baris ke-3 dengan for
        System.out.println("\n=== Kode 9: baris ke-3 (for) ===");
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // Kode 10: penonton baris ke-3 dengan foreach
        System.out.println("\n=== Kode 10: baris ke-3 (foreach) ===");
        System.out.println("Penonton pada baris ke-3: ");
        for (String i : penonton[2]) {
            System.out.println(i);
        }

        // Kode 11: setiap baris dengan String.join()
        System.out.println("\n=== Kode 11: String.join() ===");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
    }
}
```

**Hasil run:**
```text
=== Daftar penonton ===
Amin 	 Bena
Candra 	 Dela
Eka 	 Farhan
Gisel 	 Hana

=== Kode 6: length ===
4
2
2
2
2

=== Kode 7: for ===
4
Panjang baris ke-1: 2
Panjang baris ke-2: 2
Panjang baris ke-3: 2
Panjang baris ke-4: 2

=== Kode 8: foreach ===
4
Panjang baris: 2
Panjang baris: 2
Panjang baris: 2
Panjang baris: 2

=== Kode 9: baris ke-3 (for) ===
Penonton pada baris ke-3: 
Eka
Farhan

=== Kode 10: baris ke-3 (foreach) ===
Penonton pada baris ke-3: 
Eka
Farhan

=== Kode 11: String.join() ===
Penonton pada baris ke-1: Amin, Bena
Penonton pada baris ke-2: Candra, Dela
Penonton pada baris ke-3: Eka, Farhan
Penonton pada baris ke-4: Gisel, Hana
```

> ⚠️ **Catatan penting tentang `null`.** Kode 3 pada jobsheet memuat delapan pengisian, **termasuk** `penonton[3][1] = "Hana";`. Jika dijalankan apa adanya, tidak ada `null` (keluarannya seperti di atas). Contoh keluaran pada jobsheet (Kode 5) menampilkan `Gisel null`, yaitu hasil bila baris `Hana` **tidak ada**. Agar Pertanyaan 2 dan 3 bisa dijawab, saya jalankan juga versi **tanpa** baris `Hana`:
```text
Amin 	 Bena
Candra 	 Dela
Eka 	 Farhan
Gisel 	 null
```

### ❓ Pertanyaan 1
**Apakah pengisian elemen array harus berurutan mulai dari indeks ke-0?**

**Tidak harus.** Elemen array bisa diisi dalam urutan apa pun selama indeksnya berada dalam rentang yang valid. Setiap elemen sudah ada sejak array dibuat dengan `new`, sehingga mengisi `[3][1]` lebih dulu daripada `[0][0]` tidak masalah. Buktinya, pengisian dengan urutan acak (`[3][1]`, `[0][0]`, lalu `[2][1]`):

```text
[[Amin, null], [null, null], [null, Farhan], [null, Hana]]
```

Elemen yang belum diisi tetap bernilai `null`.

### ❓ Pertanyaan 2
**Mengapa terdapat `null`? Jelaskan dari sisi nilai default array.**

`new String[4][2]` menyiapkan **8 elemen** sekaligus (4 baris × 2 kolom). Saat dibuat, setiap elemen otomatis terisi **nilai default sesuai tipenya**. Karena `String` adalah tipe objek (referensi), nilai defaultnya adalah **`null`**, artinya "belum menunjuk ke objek apa pun". Elemen `penonton[3][1]` tidak pernah diisi, sehingga tetap `null`, dan `printf("%s", ...)` mencetak nilai `null` sebagai teks `null`.

| Tipe elemen array | Nilai default |
|---|:-:|
| `int`, `double` | `0` |
| `boolean` | `false` |
| `String` (objek/referensi) | `null` |

### ❓ Pertanyaan 3
**Lengkapi pengisian pada langkah 3 jika ada yang belum terisi, lalu jalankan ulang.**

Tambahkan baris yang hilang:

```java
penonton[3][1] = "Hana";
```
Hasil run-nya adalah keluaran lengkap tanpa `null` (lihat hasil run di awal bagian ini):
```text
Amin 	 Bena
Candra 	 Dela
Eka 	 Farhan
Gisel 	 Hana
```

### ❓ Pertanyaan 4
**Tambahkan Kode 6. Jelaskan fungsi `penonton.length` dan `penonton[0].length`.**

```text
4
2
2
2
2
```

| Ekspresi | Nilai | Arti |
|---|:-:|---|
| `penonton.length` | 4 | **jumlah baris**, yaitu panjang array lapisan luar |
| `penonton[0].length` | 2 | **jumlah kolom pada baris ke-1**, yaitu panjang array baris indeks 0 |

Array 2 dimensi adalah *array yang berisi array*, jadi `penonton` adalah array berisi 4 baris, dan tiap `penonton[i]` adalah array tersendiri yang punya `.length` sendiri.

### ❓ Pertanyaan 5
**Apakah `penonton[0..3].length` bernilai sama? Mengapa?**

**Ya, semuanya bernilai 2** (lihat keluaran Pertanyaan 4). Penyebabnya, array dibuat dengan `new String[4][2]`, sehingga **semua baris** otomatis dibuat dengan panjang 2 (array persegi). Pada array *jagged* (Percobaan 3), panjang tiap baris bisa berbeda.

### ❓ Pertanyaan 6
**Tampilkan panjang setiap baris dengan `for` (Kode 7).**

```java
System.out.println(penonton.length);

for (int i = 0; i < penonton.length; i++) {
    System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
}
```
```text
4
Panjang baris ke-1: 2
Panjang baris ke-2: 2
Panjang baris ke-3: 2
Panjang baris ke-4: 2
```

### ❓ Pertanyaan 7
**Tampilkan panjang setiap baris dengan `foreach` (Kode 8).**

```java
System.out.println(penonton.length);

for (String[] barisPenonton : penonton) {
    System.out.println("Panjang baris: " + barisPenonton.length);
}
```
```text
4
Panjang baris: 2
Panjang baris: 2
Panjang baris: 2
Panjang baris: 2
```

Variabel perulangan bertipe **`String[]`** (satu baris utuh), bukan `String`, karena elemen dari `penonton` adalah array baris.

### ❓ Pertanyaan 8
**Tampilkan penonton baris ke-3 (indeks 2) dengan `for` (Kode 9).**

```java
System.out.println("Penonton pada baris ke-3: ");

for (int i = 0; i < penonton[2].length; i++) {
    System.out.println(penonton[2][i]);
}
```
```text
Penonton pada baris ke-3: 
Eka
Farhan
```

Indeks baris dikunci di `2`, sedangkan indeks kolom `i` berjalan dari 0 sampai `penonton[2].length - 1`.

### ❓ Pertanyaan 9
**Ubah menjadi `foreach` (Kode 10).**

```java
System.out.println("Penonton pada baris ke-3: ");

for (String i : penonton[2]) {
    System.out.println(i);
}
```
```text
Penonton pada baris ke-3: 
Eka
Farhan
```

Hasilnya sama dengan versi `for`. Karena `penonton[2]` sudah berupa array `String` satu dimensi, variabel perulangannya cukup bertipe `String`.

### ❓ Pertanyaan 10
**Tampilkan penonton setiap baris dengan `String.join()` (Kode 11).**

```java
for (int i = 0; i < penonton.length; i++) {
    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
}
```
```text
Penonton pada baris ke-1: Amin, Bena
Penonton pada baris ke-2: Candra, Dela
Penonton pada baris ke-3: Eka, Farhan
Penonton pada baris ke-4: Gisel, Hana
```

Dua baris kode menggantikan perulangan dalam: seluruh isi satu baris digabung menjadi satu teks yang dipisah koma.

### ❓ Pertanyaan 11
**Apa kelebihan dan kekurangan `foreach` dibanding `for`?**

| | Kelebihan | Kekurangan |
|---|---|---|
| **`foreach`** | lebih ringkas dan mudah dibaca; tidak ada variabel indeks sehingga terhindar dari kesalahan indeks seperti `i <= length` | tidak tahu **indeks** elemen; hanya bisa **membaca** (variabel perulangan pada tipe primitif hanyalah salinan, sehingga tidak dapat mengubah isi array); tidak bisa menelusuri sebagian atau terbalik, atau membandingkan dengan elemen tetangga |
| **`for`** | fleksibel: indeks bisa dipakai untuk mengakses, mengubah, melompat, atau menelusuri sebagian/terbalik | lebih panjang dan rawan salah batas indeks |

Gunakan `foreach` bila hanya membaca seluruh elemen, dan `for` bila indeks atau pengubahan elemen diperlukan.

### ❓ Pertanyaan 12
**Berapa indeks baris maksimal? Dari mana nilainya diperoleh?**

**3.** Nilainya diperoleh dari `penonton.length - 1` = 4 − 1. Indeks dimulai dari 0, sehingga indeks baris yang valid adalah 0, 1, 2, 3.

### ❓ Pertanyaan 13
**Berapa indeks kolom maksimal? Apakah sama untuk setiap baris?**

**1**, yaitu `penonton[i].length - 1` = 2 − 1. Pada array ini nilainya **sama untuk setiap baris** karena semua baris panjangnya 2. Pada jagged array nilainya bisa berbeda tiap baris (misalnya pada Percobaan 3: baris 0 maksimal 4, baris 1 maksimal 2, baris 2 maksimal 0). Karena itu batas kolom sebaiknya selalu ditulis `penonton[baris].length`, bukan angka tetap.

### ❓ Pertanyaan 14
**Apa fungsi `String.join()`? Jelaskan parameternya.**

`String.join()` **menggabungkan beberapa teks menjadi satu `String`** dengan pemisah tertentu di antara tiap elemen. Bentuknya:

```java
String.join(CharSequence delimiter, CharSequence... elements)
String.join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
```
| Parameter | Arti | Pada `String.join(", ", penonton[i])` |
|---|---|---|
| `delimiter` | pemisah yang disisipkan **di antara** elemen | `", "` (koma dan spasi) |
| `elements` | elemen yang digabung: bisa array `String`, beberapa `String` terpisah, atau koleksi | `penonton[i]` (array `String` satu baris) |

Pemisah hanya disisipkan di antara elemen, bukan di akhir. Elemen yang bernilai `null` ditulis sebagai teks `null` (pada versi tanpa `Hana`: `Gisel, null`).

### 💬 Pertanyaan Diskusi
**`penonton[1] = null;` lalu `penonton[1].length`, dibandingkan dengan `penonton[1][0] = null;`. Apa perbedaan baris yang null dan elemen yang null?**

```text
p[1][0] = null  -> p[1].length = 2
p[1] = null  -> p[1].length melempar NullPointerException
```

| Kode | Yang menjadi `null` | Akibat |
|---|---|---|
| `penonton[1][0] = null;` | **satu elemen** (sel) di dalam baris | baris `penonton[1]` tetap ada, `length` tetap **2**; yang kosong hanya kursi `[1][0]` |
| `penonton[1] = null;` | **seluruh baris** (array baris dilepas) | `penonton[1].length` melempar **`NullPointerException`**, karena `null` bukan array sehingga tidak punya `length` |

**Apakah `penonton.length` bisa berubah?** **Tidak.** Ukuran array ditetapkan sekali saat dibuat dengan `new` dan tidak bisa diperbesar atau diperkecil. Bila ingin menambah baris, harus **membuat array baru yang lebih besar lalu menyalin isinya**, misalnya dengan `Arrays.copyOf`:

```text
q.length = 4, lebih.length = 5, lebih[4] = null
```

Array baru berukuran 5, dan baris barunya masih `null` sampai diisi. Array asal tetap berukuran 4. Batasan inilah alasan Java menyediakan `ArrayList` untuk data yang jumlahnya berubah-ubah.

---

# 2. Percobaan 2 — Scanner dan Perulangan

Versi dasar sesuai jobsheet (Kode 13), dijalankan dengan sesi contoh (Kode 14). Satu baris `Arrays.deepToString` saya tambahkan **hanya untuk pembuktian** posisi kursi:

```java
while (true) {
    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan baris: ");
    baris = sc.nextInt();
    System.out.print("Masukkan kolom: ");
    kolom = sc.nextInt();
    sc.nextLine();

    penonton[baris - 1][kolom - 1] = nama;

    System.out.print("Input penonton lainnya? (y/n): ");
    pilihan = sc.nextLine();

    if (pilihan.equalsIgnoreCase("n")) {
        break;
    }
}
```
```text
Masukkan nama: Agus
Masukkan baris: 1
Masukkan kolom: 2
Input penonton lainnya? (y/n): y
Masukkan nama: Indah
Masukkan baris: 2
Masukkan kolom: 1
Input penonton lainnya? (y/n): y
Masukkan nama: Sonya
Masukkan baris: 3
Masukkan kolom: 1
Input penonton lainnya? (y/n): y
Masukkan nama: Fuady
Masukkan baris: 3
Masukkan kolom: 2
Input penonton lainnya? (y/n): n
[[null, Agus], [Indah, null], [Sonya, Fuady], [null, null]]
```

Posisi kursi sesuai checkpoint: (1,2), (2,1), (3,1), dan (3,2); baris ke-3 penuh. Pertanyaan 2 sampai 5 dijawab dengan **satu file final**:

📄 File: [`BioskopWithScanner13exp.java`](experiment/BioskopWithScanner13exp.java)

```java
// BioskopWithScanner13exp.java
import java.util.Scanner;

public class BioskopWithScanner13exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        boolean jalan = true;
        while (jalan) {
            System.out.println();
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                // Menu 1: input data penonton
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    // Ulangi sampai kursi valid (dalam rentang) dan masih kosong
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length) {
                            System.out.println("Baris tidak tersedia. Pilih baris 1 sampai " + penonton.length + ".");
                        } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Kolom tidak tersedia. Pilih kolom 1 sampai " + penonton[baris - 1].length + ".");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi (" + baris + "," + kolom + ") sudah terisi oleh "
                                    + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();

                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                // Menu 2: tampilkan daftar penonton (kursi kosong = ***)
                System.out.println("--- Daftar Penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ":");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(" \t" + isi);
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih.");
                jalan = false;

            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }
}
```

**Contoh sesi (menu, nomor tidak valid, kursi terisi, dan tampilan `***`):**
```text
=== Menu Bioskop ===
1. Input data penonton
2. Tampilkan daftar penonton
3. Exit
Pilih menu: 2
--- Daftar Penonton ---
Baris 1: 	*** 	***
Baris 2: 	*** 	***
Baris 3: 	*** 	***
Baris 4: 	*** 	***

[tampil menu]
Pilih menu: 1
Masukkan nama: Agus
Masukkan baris: 1
Masukkan kolom: 2
Input penonton lainnya? (y/n): y
Masukkan nama: Indah
Masukkan baris: 7
Masukkan kolom: 1
Baris tidak tersedia. Pilih baris 1 sampai 4.
Masukkan baris: 0
Masukkan kolom: 1
Baris tidak tersedia. Pilih baris 1 sampai 4.
Masukkan baris: 2
Masukkan kolom: 1
Input penonton lainnya? (y/n): y
Masukkan nama: Sonya
Masukkan baris: 3
Masukkan kolom: 1
Input penonton lainnya? (y/n): y
Masukkan nama: Budi
Masukkan baris: 1
Masukkan kolom: 2
Kursi (1,2) sudah terisi oleh Agus. Pilih kursi lain.
Masukkan baris: 1
Masukkan kolom: 1
Input penonton lainnya? (y/n): n

[tampil menu]
Pilih menu: 2
--- Daftar Penonton ---
Baris 1: 	Budi 	Agus
Baris 2: 	Indah 	***
Baris 3: 	Sonya 	***
Baris 4: 	*** 	***

[tampil menu]
Pilih menu: 9
Menu tidak valid.

[tampil menu]
Pilih menu: 3
Terima kasih.
```

### ❓ Pertanyaan 1
**Apakah pengisian elemen dari Scanner harus berurutan mulai dari indeks ke-0?**

**Tidak.** Posisi ditentukan sendiri oleh pengguna lewat nomor baris dan kolom, sehingga urutannya bebas. Sesi contoh jobsheet sendiri membuktikannya: Agus diisi di kursi **(1,2)** lebih dulu, sementara kursi (1,1) dibiarkan kosong (`null`). Satu-satunya syarat adalah indeks berada dalam rentang yang valid. Nomor yang dimasukkan pengguna (mulai dari 1) dikurangi 1 agar menjadi indeks array (mulai dari 0).

### ❓ Pertanyaan 2
**Tambahkan menu: 1 Input data penonton, 2 Tampilkan daftar penonton, 3 Exit.**

Seluruh program dibungkus perulangan `while (jalan)`. Pilihan menu dibaca dengan `nextInt()` (diikuti `sc.nextLine()` untuk membuang sisa baris), lalu dicabangkan dengan `if / else if`. Menu **1** berisi perulangan input dari Kode 13, menu **2** menampilkan isi array, dan menu **3** mengubah `jalan` menjadi `false` sehingga perulangan berhenti. Pilihan lain menampilkan "Menu tidak valid."

### ❓ Pertanyaan 3
**Tangani nomor baris atau kolom yang tidak tersedia (mis. baris 7 atau kolom 0).**

Sebelum menulis ke array, nomor diperiksa terhadap **panjang array yang sebenarnya**, bukan angka tetap:

```java
if (baris < 1 || baris > penonton.length) {
    System.out.println("Baris tidak tersedia. Pilih baris 1 sampai " + penonton.length + ".");
} else if (kolom < 1 || kolom > penonton[baris - 1].length) {
    System.out.println("Kolom tidak tersedia. Pilih kolom 1 sampai " + penonton[baris - 1].length + ".");
}
```
Pada sesi contoh, baris **7** dan baris **0** ditolak dan program meminta input ulang. Tanpa pemeriksaan ini, program berhenti dengan `ArrayIndexOutOfBoundsException`. **Urutan pemeriksaan penting:** baris diperiksa lebih dulu, baru kolom, karena `penonton[baris - 1]` hanya aman diakses bila `baris` sudah dipastikan valid.

### ❓ Pertanyaan 4
**Beri peringatan jika kursi sudah terisi, lalu minta baris dan kolom kembali.**

```java
} else if (penonton[baris - 1][kolom - 1] != null) {
    System.out.println("Kursi (" + baris + "," + kolom + ") sudah terisi oleh "
            + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
} else {
    break;   // kursi valid dan kosong
}
```
Ketiga pemeriksaan berada di dalam `while (true)` tersendiri. Perulangan hanya keluar (`break`) saat kursi **valid dan kosong**, sehingga baris dan kolom diminta kembali selama kursi belum cocok. Pada sesi contoh, Budi memilih kursi (1,2) yang sudah ditempati Agus, lalu diminta memilih ulang dan akhirnya mendapat kursi (1,1).

### ❓ Pertanyaan 5
**Pada menu 2, tampilkan `***` untuk kursi kosong.**

```java
String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
System.out.print(" \t" + isi);
```
Operator ternary memeriksa apakah elemen `null`. Jika ya, yang dicetak adalah `***`. Dengan begitu `null` tidak pernah tampil ke pengguna (lihat keluaran awal sesi: semua kursi `***`).

### 💬 Pertanyaan Diskusi
**Bila pengguna mengetik huruf pada prompt baris, `nextInt()` melempar `InputMismatchException`. Bagaimana seharusnya ditangani?**

Mencoba memasukkan `abc` pada prompt baris membuat program **berhenti dengan `java.util.InputMismatchException`**, karena Scanner tidak bisa membaca `abc` sebagai bilangan bulat. Cara penanganan yang baik adalah memeriksa dulu dengan `hasNextInt()`, lalu membuang token yang salah dengan `sc.next()` agar tidak terbaca terus-menerus:

```java
System.out.print("Masukkan baris: ");
while (!sc.hasNextInt()) {
    System.out.println("Input harus berupa angka.");
    sc.next();   // buang token yang salah
    System.out.print("Masukkan baris: ");
}
baris = sc.nextInt();
```
```text
Masukkan baris: abc
Input harus berupa angka.
Masukkan baris: 2
baris = 2
```

Alternatifnya adalah blok `try-catch (InputMismatchException e)`. Pada keduanya, token yang salah **harus dibuang**, karena `nextInt()` yang gagal tidak mengonsumsi teksnya sehingga perulangan akan berputar tanpa henti bila dibiarkan.

**Jika jumlah baris dan kolom ditentukan pengguna saat program berjalan, bagian mana yang diubah?** Hanya deklarasi array, yang dipindah ke **setelah** ukuran dibaca:

```java
System.out.print("Jumlah baris: ");
int jumlahBaris = sc.nextInt();
System.out.print("Jumlah kolom: ");
int jumlahKolom = sc.nextInt();
sc.nextLine();

String[][] penonton = new String[jumlahBaris][jumlahKolom];
```
Bagian lain tidak perlu diubah selama semua pemeriksaan dan perulangan memakai `penonton.length` dan `penonton[i].length` (seperti pada program ini), bukan angka tetap 4 dan 2. **Mengapa ukurannya tidak bisa diubah setelah dibuat?** Saat `new` dijalankan, Java memesan satu blok memori yang berurutan sebesar ukuran itu. Blok tersebut tidak bisa diperbesar di tempat karena sebelah-sebelahnya bisa jadi sudah dipakai data lain. Menambah ukuran berarti membuat blok baru dan menyalin isinya.

---

# 3. Percobaan 3 — Array dengan Panjang Baris Berbeda (Jagged)

📄 File: [`Numbers13exp.java`](experiment/Numbers13exp.java)

File ini memuat Kode 15, 16, 17, `deepToString()` (Pertanyaan 3), dan penggantian baris (Pertanyaan 7).

```java
// Numbers13exp.java
import java.util.Arrays;

public class Numbers13exp {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Kode 16: Arrays.toString() pada tiap baris
        System.out.println("--- Arrays.toString() per baris ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Pertanyaan 3: Arrays.deepToString()
        System.out.println("--- Arrays.deepToString() ---");
        System.out.println(Arrays.deepToString(myNumbers));

        // Kode 17: panjang setiap baris
        System.out.println("--- Panjang setiap baris ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

        // Pertanyaan 7: mengganti baris pertama dengan array baru
        myNumbers[0] = new int[7];
        System.out.println("--- Setelah myNumbers[0] = new int[7] ---");
        System.out.println("myNumbers.length    : " + myNumbers.length);
        System.out.println("myNumbers[0].length : " + myNumbers[0].length);
    }
}
```

**Hasil run** (bagian pertama sama dengan checkpoint jobsheet):
```text
--- Arrays.toString() per baris ---
[0, 0, 0, 0, 0]
[0, 0, 0]
[0]
--- Arrays.deepToString() ---
[[0, 0, 0, 0, 0], [0, 0, 0], [0]]
--- Panjang setiap baris ---
Panjang baris ke-1: 5
Panjang baris ke-2: 3
Panjang baris ke-3: 1
--- Setelah myNumbers[0] = new int[7] ---
myNumbers.length    : 3
myNumbers[0].length : 7
```

### ❓ Pertanyaan 1
**Apa fungsi `Arrays.toString()`?**

Mengubah isi **array satu dimensi** menjadi satu `String` berformat `[elemen1, elemen2, ...]`, sehingga seluruh isi array bisa dicetak sekaligus tanpa perulangan. Method ini ada di kelas `java.util.Arrays`.

### ❓ Pertanyaan 2
**Ganti menjadi `Arrays.toString(myNumbers)`. Apa yang tampil?**

```text
[[I@21a947fe, [I@5606c0b, [I@80ec1f8]
```

Yang tampil **bukan angka**, melainkan teks seperti `[I@21a947fe` (kode setelah tanda `@` akan berbeda pada tiap komputer atau tiap kali dijalankan). Alasannya, `myNumbers` adalah array yang elemennya **adalah array** (`int[]`), dan `Arrays.toString()` hanya mengubah elemen lapisan pertama menjadi teks dengan cara sederhana. Elemen berupa array dicetak sebagai identitas objeknya: `[I` berarti *array bertipe int*, `@` diikuti kode hash alamat objek. Isi barisnya tidak ikut dibuka.

### ❓ Pertanyaan 3
**Jalankan `Arrays.deepToString(myNumbers)`. Bandingkan dengan Kode 16. Mengapa `deepToString()` diperlukan?**

```text
[[0, 0, 0, 0, 0], [0, 0, 0], [0]]
```

| | Kode 16 (`toString` + perulangan) | `deepToString` |
|---|---|---|
| Cara | dipanggil **per baris** dalam perulangan | **satu panggilan** untuk seluruh array |
| Hasil | tiga baris keluaran | satu baris bersarang `[[...], [...], [...]]` |

`deepToString()` diperlukan karena ia menelusuri array **secara rekursif**: bila sebuah elemen juga array, isinya ikut dicetak, tidak hanya alamatnya. Dengan array 2 dimensi, ini satu-satunya cara mencetak seluruh isi tanpa perulangan manual.

### ❓ Pertanyaan 4
**Apa nilai default elemen `int`?**

**`0`**. Itu sebabnya keluaran Kode 16 berisi `[0, 0, 0, 0, 0]`, `[0, 0, 0]`, dan `[0]`, padahal belum ada elemen yang diisi.

### ❓ Pertanyaan 5
**Tampilkan panjang setiap baris (Kode 17).**

```text
--- Panjang setiap baris ---
Panjang baris ke-1: 5
Panjang baris ke-2: 3
Panjang baris ke-3: 1
```

Panjang tiap baris **berbeda** (5, 3, 1) sesuai instansiasi `new int[5]`, `new int[3]`, `new int[1]`. Inilah ciri jagged array. Karena itu, perulangan dalam wajib memakai `myNumbers[i].length`, bukan satu angka tetap.

### ❓ Pertanyaan 6
**Apakah panjang array dapat dimodifikasi setelah diinstansiasi?**

**Tidak.** Panjang suatu array tetap selama array itu ada. Yang bisa berbeda hanyalah panjang **antar baris**, dan itu ditentukan **saat tiap baris dibuat**, bukan diubah kemudian. Jika butuh ukuran lain, yang dilakukan adalah membuat array baru (lihat Pertanyaan 7).

### ❓ Pertanyaan 7
**Jalankan `myNumbers[0] = new int[7];`, lalu cetak `myNumbers.length` dan `myNumbers[0].length`.**

```text
myNumbers.length    : 3
myNumbers[0].length : 7
```

| Ekspresi | Sebelum | Sesudah | Mengapa |
|---|:-:|:-:|---|
| `myNumbers.length` | 3 | **3** (tidak berubah) | array lapisan luar tetap berisi 3 baris |
| `myNumbers[0].length` | 5 | **7** (berubah) | baris ke-0 kini menunjuk ke array **baru** berukuran 7 |

Statement itu **tidak memperbesar** array lama. Ia hanya **mengganti referensi** pada `myNumbers[0]` agar menunjuk ke array baru (nilainya semua 0 lagi). Array lama berukuran 5 tidak lagi ditunjuk siapa pun dan dibuang otomatis oleh Java.

### 💬 Pertanyaan Diskusi
**`int[][] salinan = myNumbers; salinan[0][0] = 99;` lalu cetak `myNumbers[0][0]`. Mengapa ikut berubah? Bagaimana penyalinan yang benar? Apakah `clone()` cukup?**

📄 File: [`NumbersSalinan13exp.java`](experiment/NumbersSalinan13exp.java)

```java
// NumbersSalinan13exp.java
import java.util.Arrays;

public class NumbersSalinan13exp {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // 1. Menyalin referensi (bukan menyalin isi)
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println("1. Salinan referensi  -> myNumbers[0][0] = " + myNumbers[0][0]);
        myNumbers[0][0] = 0;

        // 2. clone() pada array 2 dimensi hanya menyalin lapisan luar (shallow copy)
        int[][] klon = myNumbers.clone();
        klon[0][0] = 55;
        System.out.println("2. clone(), ubah isi baris -> myNumbers[0][0] = " + myNumbers[0][0]);
        klon[1] = new int[]{7, 7, 7};
        System.out.println("   clone(), ganti baris    -> myNumbers[1] = " + Arrays.toString(myNumbers[1]));
        myNumbers[0][0] = 0;

        // 3. Salinan dalam (deep copy): setiap baris disalin sendiri
        int[][] salinanDalam = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            salinanDalam[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        salinanDalam[0][0] = 77;
        System.out.println("3. Deep copy           -> myNumbers[0][0] = " + myNumbers[0][0]);
        System.out.println("   salinanDalam        -> " + Arrays.deepToString(salinanDalam));
    }
}
```

```text
1. Salinan referensi  -> myNumbers[0][0] = 99
2. clone(), ubah isi baris -> myNumbers[0][0] = 55
   clone(), ganti baris    -> myNumbers[1] = [0, 0, 0]
3. Deep copy           -> myNumbers[0][0] = 0
   salinanDalam        -> [[77, 0, 0, 0, 0], [0, 0, 0], [0]]
```

| Cara | Hasil | Penjelasan |
|---|---|---|
| `salinan = myNumbers` | `myNumbers[0][0]` ikut jadi **99** | yang disalin hanya **referensi** (alamat). Kedua variabel menunjuk ke **satu array yang sama**, sehingga mengubah lewat salah satunya terlihat di yang lain |
| `myNumbers.clone()` | mengubah isi baris tetap **ikut berubah** (55); mengganti satu baris **tidak** memengaruhi aslinya | `clone()` pada array 2 dimensi hanyalah **salinan dangkal** (*shallow copy*): array lapisan luar disalin, tetapi **baris-barisnya tetap dibagi bersama**. Jadi `clone()` **belum cukup** |
| Salin tiap baris (`Arrays.copyOf`) | aslinya **tidak berubah** (0) | **salinan dalam** (*deep copy*): setiap baris dibuat sebagai array baru |

**Beda dengan menyalin nilai satu per satu dengan perulangan:** perulangan membuat **array baru** dan mengisinya elemen demi elemen, sehingga hasilnya benar-benar terpisah dari aslinya. Penyalinan 2 dimensi yang benar harus menyalin **setiap baris**, seperti pada percobaan nomor 3.

---

# 4. Percobaan 4 — Studi Kasus SIAKAD

📄 File: [`SIAKAD13exp.java`](experiment/SIAKAD13exp.java)

File ini memuat Langkah 3, 4, dan 5 (Kode 19, 20, dan 21) sekaligus.

```java
// SIAKAD13exp.java
import java.util.Scanner;

public class SIAKAD13exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        // Langkah 3 dan 4: input nilai + rata-rata setiap mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }

        // Langkah 5: rata-rata setiap mata kuliah
        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }
    }
}
```

**Hasil run (4 mahasiswa × 3 mata kuliah):**
```text
Input nilai mahasiswa ke-1
Nilai mata kuliah 1: 80
Nilai mata kuliah 2: 90
Nilai mata kuliah 3: 85
Nilai rata-rata: 85.0
Input nilai mahasiswa ke-2
Nilai mata kuliah 1: 70
Nilai mata kuliah 2: 75
Nilai mata kuliah 3: 60
Nilai rata-rata: 68.33333333333333
Input nilai mahasiswa ke-3
Nilai mata kuliah 1: 90
Nilai mata kuliah 2: 95
Nilai mata kuliah 3: 100
Nilai rata-rata: 95.0
Input nilai mahasiswa ke-4
Nilai mata kuliah 1: 60
Nilai mata kuliah 2: 65
Nilai mata kuliah 3: 70
Nilai rata-rata: 65.0

========================================
Rata-rata nilai setiap mata kuliah:
Mata kuliah 1: 75.0
Mata kuliah 2: 81.25
Mata kuliah 3: 78.75
```

✅ **Checkpoint (hitung manual):** rata-rata mata kuliah 1 = (80 + 70 + 90 + 60) / 4 = 300 / 4 = **75,0**, sama dengan keluaran program. Rata-rata mahasiswa ke-2 = (70 + 75 + 60) / 3 = **68,33**, juga sama.

### ❓ Pertanyaan 1
**Ubah agar jumlah mahasiswa dan mata kuliah ditentukan saat program berjalan.**

📄 File: [`SIAKADDinamis13exp.java`](experiment/SIAKADDinamis13exp.java)

Perubahan utamanya hanya satu: jumlah dibaca lebih dulu, lalu dipakai untuk membuat array.

```java
System.out.print("Jumlah mahasiswa: ");
int jumlahMahasiswa = sc.nextInt();
System.out.print("Jumlah mata kuliah: ");
int jumlahMataKuliah = sc.nextInt();

int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];
```
Seluruh perulangan setelahnya tetap memakai `nilai.length` (jumlah mahasiswa) dan `nilai[i].length` (jumlah mata kuliah), tanpa angka tetap, sehingga otomatis mengikuti ukuran array. Pembagi rata-rata pun selalu diambil dari panjang array.

```java
// SIAKADDinamis13exp.java
import java.util.Scanner;

public class SIAKADDinamis13exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        if (jumlahMahasiswa <= 0 || jumlahMataKuliah <= 0) {
            System.out.println("Jumlah mahasiswa dan mata kuliah harus lebih dari 0.");
            return;
        }

        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }
    }
}
```

**Contoh run (2 mahasiswa × 4 mata kuliah):**
```text
Jumlah mahasiswa: 2
Jumlah mata kuliah: 4
Input nilai mahasiswa ke-1
Nilai mata kuliah 1: 80
Nilai mata kuliah 2: 90
Nilai mata kuliah 3: 70
Nilai mata kuliah 4: 60
Nilai rata-rata: 75.0
Input nilai mahasiswa ke-2
Nilai mata kuliah 1: 75
Nilai mata kuliah 2: 85
Nilai mata kuliah 3: 95
Nilai mata kuliah 4: 65
Nilai rata-rata: 80.0

========================================
Rata-rata nilai setiap mata kuliah:
Mata kuliah 1: 77.5
Mata kuliah 2: 87.5
Mata kuliah 3: 82.5
Mata kuliah 4: 62.5
```

Rata-rata mata kuliah 1 = (80 + 75) / 2 = **77,5** ✔. Ukuran ≤ 0 ditolak agar tidak terjadi error (`nilai[0]` tidak ada pada array kosong):
```text
Jumlah mahasiswa: 0
Jumlah mata kuliah: 3
Jumlah mahasiswa dan mata kuliah harus lebih dari 0.
```

### 💬 Pertanyaan Diskusi
**Bagaimana jika `totalPerSiswa` dideklarasikan di luar loop?**

Variabel itu **tidak lagi di-reset ke 0** untuk tiap mahasiswa, sehingga totalnya **menumpuk dari mahasiswa sebelumnya**. Contoh dengan dua mahasiswa (mahasiswa 1: 80, 70, 90; mahasiswa 2: 60, 60, 60):

```text
Nilai rata-rata: 80.0
Nilai rata-rata: 140.0
```

| | Deklarasi **di dalam** loop (benar) | Deklarasi **di luar** loop (salah) |
|---|---|---|
| Mahasiswa 1 | 240 / 3 = **80,0** | 240 / 3 = 80,0 |
| Mahasiswa 2 | 180 / 3 = **60,0** | (240 + 180) / 3 = **140,0** ❌ |

Rata-rata 140 mustahil bila nilai maksimal 100, itulah tanda adanya kesalahan. Variabel akumulator yang dipakai per baris harus **dideklarasikan dan diberi nilai awal di dalam loop luar**, supaya mulai dari 0 pada setiap baris.

**Bagaimana jika ada nilai yang belum diisi (default 0)?** Nilai 0 ikut dihitung sehingga **menurunkan rata-rata secara keliru**. Misalnya mahasiswa baru terisi 80 dan 90 untuk tiga mata kuliah: rata-ratanya terhitung (80 + 90 + 0) / 3 = **56,67**, padahal nilai yang ada rata-ratanya **85**. Karena 0 bisa berarti "belum diisi" **atau** "nilainya benar-benar 0", program sebaiknya **membedakan keduanya**, misalnya dengan nilai penanda `-1` untuk "belum diisi", atau array `Integer[][]` yang `null` bila belum diisi. Lalu rata-rata dihitung hanya dari elemen yang sudah terisi:

```java
int[] nilai = {80, 90, -1};   // -1 = belum diisi
double total = 0;
int terisi = 0;

for (int n : nilai) {
    if (n != -1) {
        total += n;
        terisi++;
    }
}
System.out.println(terisi == 0 ? "Belum ada nilai" : "Rata-rata: " + total / terisi);
```
```text
Rata-rata: 85.0
```

---

# 5. Tugas Mandiri — Survei

📄 File: [`TugasMandiriSurvei13assign.java`](assignment/TugasMandiriSurvei13assign.java)

> ⚠️ **Flowchart latihan survei pada slide Dasar Pemrograman (Teori) tidak terlampir.** Program ini saya susun mengikuti **ketentuan tertulis pada jobsheet** (10 responden × 6 pertanyaan, jawaban 1–5, tiga jenis rata-rata). Detail di luar itu (misalnya pengulangan input bila jawaban di luar 1–5 dan bentuk tampilan) adalah rancangan saya. Cocokkan dengan flowchart milikmu.

**Pemetaan terhadap ketentuan soal:**

| Ketentuan | Implementasi |
|---|---|
| Simpan hasil survei di array 2 dimensi | `int[][] jawaban = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN]` (baris = responden, kolom = pertanyaan) |
| Rata-rata **setiap responden** | menjumlahkan **sepanjang baris** `jawaban[i][j]` untuk `j` = 0..5, dibagi `JUMLAH_PERTANYAAN` |
| Rata-rata **setiap pertanyaan** | menjumlahkan **sepanjang kolom** `jawaban[i][j]` untuk `i` = 0..9, dibagi `JUMLAH_RESPONDEN` |
| Rata-rata **keseluruhan** | total seluruh jawaban dibagi `JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN` |
| Konstanta batas (Catatan Konsep) | `final int JUMLAH_RESPONDEN = 10;` dan `final int JUMLAH_PERTANYAAN = 6;` dipakai di semua perulangan |

```java
// TugasMandiriSurvei13assign.java
import java.util.Locale;
import java.util.Scanner;

public class TugasMandiriSurvei13assign {
    public static void main(String[] args) {
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        Scanner sc = new Scanner(System.in);
        Locale id = Locale.forLanguageTag("id-ID");

        int[][] jawaban = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        // 1. Input hasil survei (jawaban 1 sampai 5)
        System.out.println("=== Survei: 10 responden x 6 pertanyaan ===");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Jawaban harus 1 sampai 5.");
                    }
                } while (nilai < 1 || nilai > 5);
                jawaban[i][j] = nilai;
            }
        }

        // 2. Tampilkan matriks jawaban
        System.out.println();
        System.out.println("=== Hasil Survei ===");
        System.out.print("Responden |");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            System.out.print(" P" + (j + 1));
        }
        System.out.println();
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.print(String.format("%9d |", (i + 1)));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                System.out.print("  " + jawaban[i][j]);
            }
            System.out.println();
        }

        // 3. Rata-rata setiap responden (sekaligus menjumlahkan total keseluruhan)
        double totalSemua = 0;
        System.out.println();
        System.out.println("--- Rata-rata setiap responden ---");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += jawaban[i][j];
            }
            totalSemua += totalResponden;
            System.out.println(String.format(id, "Responden ke-%d : %.2f", (i + 1), totalResponden / JUMLAH_PERTANYAAN));
        }

        // 4. Rata-rata setiap pertanyaan
        System.out.println();
        System.out.println("--- Rata-rata setiap pertanyaan ---");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += jawaban[i][j];
            }
            System.out.println(String.format(id, "Pertanyaan %d : %.2f", (j + 1), totalPertanyaan / JUMLAH_RESPONDEN));
        }

        // 5. Rata-rata keseluruhan
        System.out.println();
        System.out.println(String.format(id, "Rata-rata keseluruhan: %.2f",
                totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN)));
    }
}
```

**Hasil run (jawaban pertama sengaja diisi `7` untuk menguji validasi):**
```text
=== Survei: 10 responden x 6 pertanyaan ===
Responden ke-1
  Pertanyaan 1 (1-5): 7
  Jawaban harus 1 sampai 5.
  Pertanyaan 1 (1-5): 5
  Pertanyaan 2 (1-5): 4
  Pertanyaan 3 (1-5): 4
  Pertanyaan 4 (1-5): 5
  Pertanyaan 5 (1-5): 3
  ...(Responden ke-2 sampai ke-10 diisi dengan cara yang sama)...
```
```text
=== Hasil Survei ===
Responden | P1 P2 P3 P4 P5 P6
        1 |  5  4  4  5  3  4
        2 |  3  3  4  2  3  3
        3 |  4  5  5  4  4  5
        4 |  2  3  2  3  2  3
        5 |  5  5  4  5  5  4
        6 |  4  4  3  4  4  3
        7 |  3  4  3  3  4  3
        8 |  1  2  2  1  2  2
        9 |  4  4  5  4  5  4
       10 |  3  3  3  4  3  3

--- Rata-rata setiap responden ---
Responden ke-1 : 4,17
Responden ke-2 : 3,00
Responden ke-3 : 4,50
Responden ke-4 : 2,50
Responden ke-5 : 4,67
Responden ke-6 : 3,67
Responden ke-7 : 3,33
Responden ke-8 : 1,67
Responden ke-9 : 4,33
Responden ke-10 : 3,17

--- Rata-rata setiap pertanyaan ---
Pertanyaan 1 : 3,40
Pertanyaan 2 : 3,70
Pertanyaan 3 : 3,50
Pertanyaan 4 : 3,50
Pertanyaan 5 : 3,50
Pertanyaan 6 : 3,40

Rata-rata keseluruhan: 3,50
```

✅ **Checkpoint (hitung manual):** rata-rata pertanyaan 1 = (5+3+4+2+5+4+3+1+4+3) / 10 = 34 / 10 = **3,40** ✔. Rata-rata keseluruhan = 210 / 60 = **3,50** ✔. Program menampilkan 10 rata-rata responden, 6 rata-rata pertanyaan, dan satu rata-rata keseluruhan.

---

# 6. Refleksi

### 1. Dua situasi nyata yang cocok dimodelkan dengan array 2 dimensi

| Situasi | Baris | Kolom | Isi sel |
|---|---|---|---|
| **Rekap nilai (SIAKAD)** | mahasiswa | mata kuliah | nilai |
| **Denah kursi bioskop / ruang kelas** | baris kursi | nomor kursi pada baris | nama penghuni (atau kosong) |
| Jadwal kuliah (tambahan) | hari | jam pelajaran | mata kuliah |

### 2. Perbedaan array 2 dimensi persegi dan jagged array

| | Persegi (rectangular) | Jagged |
|---|---|---|
| Panjang tiap baris | **sama** | **bisa berbeda** |
| Cara membuat | `new int[4][3]` (ukuran baris langsung ditentukan) | `new int[3][]`, lalu tiap baris dibuat sendiri: `m[0] = new int[5];` |
| Contoh penggunaan | tabel nilai 4 mahasiswa × 3 mata kuliah, kursi bioskop dengan jumlah kursi sama tiap baris | jumlah mata kuliah per semester yang berbeda-beda, atau denah gedung dengan jumlah kursi tiap baris yang berbeda (`Numbers`: 5, 3, 1 kolom) |

### 3. Bagian yang paling sering menyebabkan kesalahan indeks dan cara mencegahnya

> 📝 Ini jawaban refleksi pribadi. Berikut **draf berdasarkan titik rawan pada jobsheet ini**. Silakan ubah sesuai pengalaman yang benar-benar kamu alami.

Kesalahan indeks paling rawan terjadi di tiga tempat:

1. **Konversi nomor ke indeks (Percobaan 2).** Pengguna mengetik baris/kolom mulai dari 1, sedangkan array mulai dari 0, sehingga harus `baris - 1` dan `kolom - 1`. Lupa mengurangi 1 membuat baris pertama tak terjangkau dan baris terakhir keluar batas.
2. **Batas perulangan (Percobaan 1, Pertanyaan 4 pada jobsheet sebelumnya).** Menulis `i <= length` padahal indeks terakhir adalah `length - 1`.
3. **Tertukar `[i][j]` saat menghitung rata-rata per kolom (Percobaan 4).** Untuk rata-rata kolom, perulangan **luar** harus kolom (`j`, batas `nilai[0].length`) dan perulangan **dalam** baris (`i`, batas `nilai.length`).

**Pencegahan:** (a) selalu pakai `.length` (`penonton[i].length`), bukan angka tetap; (b) validasi rentang input sebelum mengakses array, dengan urutan baris dulu baru kolom; (c) pakai nama `i` untuk baris dan `j` untuk kolom secara konsisten dan beri komentar bila perlu; (d) uji dengan nilai batas (indeks pertama, terakhir, dan satu di luar).

---

# 7. Catatan

- **Ketidaksesuaian pada jobsheet:** Kode 3 memuat `penonton[3][1] = "Hana"`, sedangkan contoh keluaran (Kode 5) menampilkan `null` pada posisi itu. Jawaban Percobaan 1 memakai kedua versi.
- **Flowchart latihan survei** (Tugas Mandiri) tidak terlampir pada PDF, jadi program mengikuti ketentuan tertulis. Sesuaikan bila flowchart-mu punya alur tambahan.
- Jawaban **Refleksi nomor 3** bersifat pribadi. Isi di atas hanya draf, jadi silakan sesuaikan.
- Kode `String.format` dan `while (true)` dengan `break` dipakai pada beberapa program. Kode ini mungkin belum dibahas di kelasmu, tetapi hanya untuk perataan tampilan dan pengulangan input.

<div align="center">

— *Elia Beril · 264107020027* —

</div>
