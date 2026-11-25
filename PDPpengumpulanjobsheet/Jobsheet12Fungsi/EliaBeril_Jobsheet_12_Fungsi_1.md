<div align="center">

# ☕ JOBSHEET 12 — FUNGSI 1

**Dasar Pemrograman 2026 · Politeknik Negeri Malang**

</div>

| | |
|---|---|
| 👤 **Nama** | Elia Beril |
| 🆔 **NIM** | 264107020027 |
| 🔢 **No. Absen** | 13 (ganjil → varian *TabungKerucut* pada Tugas 1) |
| 📚 **Mata Kuliah** | Dasar Pemrograman |
| ☕ **Bahasa** | Java (diuji dengan OpenJDK 21) |

> 📝 Dokumen ini memuat kode, hasil *run*, jawaban semua **Pertanyaan** Percobaan 1–5, dan **Tugas** 1–3. Langkah praktikum tidak diulang. Semua hasil *run* berasal dari program yang benar-benar dijalankan.

---

## 🗂️ Struktur Folder

```text
jobsheet12/
├── experiment/
│   ├── Kafe13exp.java                    → Percobaan 1, 2, dan 3 (satu class yang berkembang)
│   ├── PengunjungCafe13exp.java          → Percobaan 4
│   ├── HitungBalokTanpaFungsi13exp.java  → Percobaan 5 (tanpa fungsi)
│   ├── HitungBalok13exp.java             → Percobaan 5 (dengan fungsi)
│   └── LacakFungsi13exp.java             → Percobaan 5, Pertanyaan 2
├── assignment/
│   ├── TabungKerucut13assign.java        → Tugas 1 (absen ganjil)
│   ├── BankSampah13assign.java           → Tugas 2
│   ├── RekapLaundry13assign.java         → Tugas 3a
│   └── RekapLaundryDinamis13assign.java  → Tugas 3b
└── EliaBeril_Jobsheet_12_Fungsi_1.md (dokumen ini)
```

> 💡 Jobsheet menulis `KafeNoAbsen.java`. Di sini `NoAbsen` diganti **13** dan diberi akhiran folder (`exp` / `assign`), sama seperti jobsheet sebelumnya. Nama fungsi `hitungTotalHargaNoAbsen` menjadi `hitungTotalHarga13`. Nama `class` di dalam file sama persis dengan nama file. Jobsheet menyebut *package* `Jobsheet12`. File di sini sengaja **tanpa** baris `package` supaya mudah dijalankan dari foldernya. Bila memakai package di VS Code, tambahkan `package Jobsheet12;` di baris paling atas tiap file.

## 🧾 Rencana Commit & Push

| Setelah | Commit message |
|---|---|
| Percobaan 1 (fungsi `Menu`) | `Percobaan 1: fungsi Menu tanpa parameter` |
| Percobaan 2 dan 3 (`Kafe13exp` final) | `Percobaan 2-3: Menu berparameter dan hitungTotalHarga13` |
| Percobaan 4 dan 5 | `Percobaan 4-5: varargs dan fungsi balok` |
| Tugas 1-3 | `Tugas Jobsheet 12: tabung kerucut, bank sampah, laundry` |

## 📑 Daftar Isi

1. [Percobaan 1 — Fungsi tanpa parameter](#1-percobaan-1--fungsi-tanpa-parameter)
2. [Percobaan 2 — Fungsi dengan parameter](#2-percobaan-2--fungsi-dengan-parameter)
3. [Percobaan 3 — Fungsi dengan nilai kembalian](#3-percobaan-3--fungsi-dengan-nilai-kembalian)
4. [Percobaan 4 — Fungsi varargs](#4-percobaan-4--fungsi-varargs)
5. [Percobaan 5 — Dengan fungsi vs tanpa fungsi](#5-percobaan-5--dengan-fungsi-versus-tanpa-fungsi)
6. [Tugas](#6-tugas)
7. [Catatan](#7-catatan)

---

# 1. Percobaan 1 — Fungsi tanpa parameter

📄 File: [`Kafe13exp.java`](experiment/Kafe13exp.java)

Percobaan 1, 2, dan 3 memakai **satu class `Kafe`** yang berkembang tiap percobaan, sehingga file `Kafe13exp.java` berisi bentuk **akhirnya** (ditampilkan di bagian Percobaan 3). Di bawah ini kode dan hasil tiap tahap yang saya jalankan terpisah.

Tahap Percobaan 1 (fungsi `Menu()` tanpa parameter, lalu dipanggil dari `main`):

```java
public static void Menu() {
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
}

public static void main(String[] args) {
    Menu();
}
```
```text
===== MENU RESTO KAFE =====
1. Kopi Hitam - Rp 15,000
2. Cappuccino - Rp 20,000
3. Latte - Rp 22,000
4. Teh Tarik - Rp 12,000
5. Roti Bakar - Rp 10,000
6. Mie Goreng - Rp 18,000
===========================
Silakan pilih menu yang Anda inginkan.
```

### ❓ Pertanyaan 1
**Apakah fungsi tanpa parameter selalu harus `void`? Berikan satu contoh yang mengembalikan nilai.**

**Tidak harus.** Tipe kembalian (`void`, `int`, `String`, dst.) tidak ada hubungannya dengan ada atau tidaknya parameter. `void` hanya berarti fungsi **tidak mengembalikan nilai**. Fungsi tanpa parameter boleh mengembalikan nilai, selama ada `return` dengan tipe yang sesuai:

```java
public static int jumlahMenu() {
    return 6;
}

// pemanggilan
int n = jumlahMenu();
System.out.println("Jumlah menu: " + n);   // Jumlah menu: 6
```
Fungsi ini benar-benar dipakai pada program akhir (`Kafe13exp`): `jumlahMenu()` menjadi batas atas untuk menolak nomor menu di luar daftar.

### ❓ Pertanyaan 2
**Panggil `Menu()` tiga kali, lalu bandingkan dengan menulis langsung tiga kali di `main`. Berapa baris kode dan apa keuntungan fungsi?**

| | Dengan fungsi | Tanpa fungsi |
|---|:-:|:-:|
| Isi tampilan menu | ditulis **1 kali** di dalam `Menu()`: 11 baris (termasuk deklarasi dan kurung penutup) | ditulis **3 kali** langsung di `main`: 9 baris × 3 = **27 baris** |
| Pemanggilan | 3 baris `Menu();` | tidak ada |
| **Total** | **14 baris** | **27 baris** |

Keuntungan fungsi:
- **Tidak berulang (DRY):** kode ditulis sekali lalu dipakai berkali-kali.
- **Mudah diubah:** bila harga atau teks menu berubah, cukup ubah di satu tempat. Tanpa fungsi, ketiga salinan harus diubah satu per satu dan mudah ada yang terlewat.
- **Lebih mudah dibaca:** `main` hanya berisi `Menu();` yang menjelaskan *apa* yang dilakukan, tanpa detail *bagaimana*.
- **Dapat dipakai ulang** dari bagian program lain.

### ❓ Pertanyaan 3
**Hapus `static` pada `Menu()`. Pesan error apa yang muncul dan mengapa?**

```text
KafeNonStatic.java:14: error: non-static method Menu() cannot be referenced from a static context
error: compilation failed
```

**Penyebab:** `main` adalah method **static**, yaitu milik *class* dan bisa dijalankan tanpa membuat objek. `Menu()` tanpa `static` menjadi method **instance**, milik sebuah *objek*, sehingga hanya bisa dipanggil lewat objek. Dari konteks static (`main`) tidak ada objek yang aktif, jadi Java menolak panggilan langsung. Ada dua perbaikan: menambahkan kembali `static`, atau membuat objek terlebih dahulu (`new Kafe13exp().Menu();`). Pada tahap ini fungsi dibuat `static`.

### ❓ Pertanyaan 4
**Pindahkan `Menu()` ke bawah `main`. Apakah hasilnya berubah? Uraikan alur eksekusi dan jelaskan mengapa urutan penulisan tidak memengaruhi.**

Hasilnya **tidak berubah** (keluarannya sama persis dengan hasil sebelumnya):

```text
===== MENU RESTO KAFE =====
1. Kopi Hitam - Rp 15,000
2. Cappuccino - Rp 20,000
3. Latte - Rp 22,000
4. Teh Tarik - Rp 12,000
5. Roti Bakar - Rp 10,000
6. Mie Goreng - Rp 18,000
===========================
Silakan pilih menu yang Anda inginkan.
```

**Alur eksekusi:**
1. Program dijalankan, JVM mencari method `public static void main(String[] args)` dan **memulai dari sana**, di mana pun posisi penulisannya.
2. `main` mengeksekusi baris pertamanya, yaitu pemanggilan `Menu();`.
3. Kendali **berpindah** ke dalam `Menu()`. Sembilan perintah `println` dijalankan berurutan dari atas ke bawah, dan daftar menu tampil di layar.
4. Setelah baris terakhir `Menu()` selesai, kendali **kembali** ke `main` tepat setelah pemanggilan tadi. Tidak ada perintah lagi, sehingga `main` berakhir dan program selesai.

**Mengapa urutan penulisan tidak berpengaruh:** compiler membaca dan mendaftarkan **seluruh method di dalam class** (nama dan parameternya) sebelum program dijalankan. Karena itu `main` sudah "mengenal" `Menu()` walau ditulis di bawahnya. Urutan eksekusi ditentukan oleh **urutan pemanggilan** mulai dari `main`, bukan oleh urutan penulisan. (Ini berbeda dengan *variabel lokal*, yang harus dideklarasikan sebelum dipakai.)

---

# 2. Percobaan 2 — Fungsi dengan parameter

Tahap Percobaan 2: `Menu` diberi dua parameter (`String namaPelanggan`, `boolean isMember`):

```java
public static void Menu(String namaPelanggan, boolean isMember) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    System.out.println("===== MENU RESTO KAFE =====");
    // ... daftar menu 1-6 seperti sebelumnya ...
    System.out.println("Silakan pilih menu yang Anda inginkan.");
}

public static void main(String[] args) {
    Menu("Andi", true);
}
```
**Hasil `Menu("Andi", true)`:**
```text
Selamat datang, Andi!
Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!
[ ... daftar menu 1-6 ditampilkan ... ]
```
**Hasil `Menu("Budi", false)`:**
```text
Selamat datang, Budi!
[ ... daftar menu 1-6 ditampilkan ... ]
```

### ❓ Pertanyaan 1
**Apa kegunaan parameter? Bagaimana nilai dari `main` memengaruhi output? Bandingkan `Menu("Andi", true)` dan `Menu("Budi", false)`.**

Parameter adalah **"wadah" untuk menerima data dari luar fungsi**, sehingga satu fungsi bisa dipakai untuk data yang berbeda-beda tanpa ditulis ulang. Pada `Menu`:

| Parameter | Pengaruhnya pada output |
|---|---|
| `namaPelanggan` | mengisi sapaan: `Selamat datang, Andi!` atau `Selamat datang, Budi!` |
| `isMember` | menentukan percabangan `if`: bila `true`, baris *"Anda adalah member..."* ikut tampil. Bila `false`, baris itu dilewati |

| | `Menu("Andi", true)` | `Menu("Budi", false)` |
|---|---|---|
| Sapaan | Selamat datang, **Andi**! | Selamat datang, **Budi**! |
| Pesan member | ✅ tampil | ❌ tidak tampil |
| Daftar menu | sama | sama |

### ❓ Pertanyaan 2
**Jelaskan perbedaan parameter dan argumen.**

| | Parameter | Argumen |
|---|---|---|
| Letak | pada **deklarasi** fungsi | pada **pemanggilan** fungsi |
| Pada kode | `String namaPelanggan`, `boolean isMember` dalam `Menu(String namaPelanggan, boolean isMember)` | `"Andi"` dan `true` dalam `Menu("Andi", true)` |
| Sifat | variabel lokal (nama dan tipe) yang menunggu nilai | nilai nyata yang dikirim |

Saat pemanggilan terjadi, argumen dicocokkan **berdasarkan urutan**: `"Andi"` masuk ke `namaPelanggan` dan `true` masuk ke `isMember`.

### ❓ Pertanyaan 3
**Coba `Menu()` dan `Menu(true, "Andi")`. Tuliskan error dan aturan argumen.**

**`Menu()`:**
```text
KafeErr1.java:20: error: method Menu in class KafeErr1 cannot be applied to given types;
  required: String,boolean
  found:    no arguments
  reason: actual and formal argument lists differ in length
error: compilation failed
```
**`Menu(true, "Andi")`:**
```text
KafeErr2.java:20: error: method Menu in class KafeErr2 cannot be applied to given types;
  required: String,boolean
  found:    boolean,String
  reason: argument mismatch; boolean cannot be converted to String
error: compilation failed
```

**Aturan yang harus dipenuhi argumen:**
1. **Jumlah** argumen harus sama dengan jumlah parameter (error pertama: argumen kurang).
2. **Urutan** argumen harus sesuai urutan parameter.
3. **Tipe** setiap argumen harus cocok dengan tipe parameter pada posisinya (error kedua: `boolean` tidak bisa menjadi `String`).

### ❓ Pertanyaan 4
**Tambahkan parameter `jamKunjung`, pesan Happy Hour (14–16), baca input dengan Scanner, dan uji Budi (member, jam 15).**

Fungsi `Menu` pada bentuk akhirnya (lihat `Kafe13exp`):

```java
public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    if (jamKunjung >= 14 && jamKunjung <= 16) {
        System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
    }
    // ... daftar menu ...
}
```
Bagian `main` yang membaca data dari keyboard:

```java
Scanner sc = new Scanner(System.in);
System.out.print("Nama pelanggan: ");
String nama = sc.nextLine();
System.out.print("Member? (y/n): ");
boolean isMember = sc.nextLine().equalsIgnoreCase("y");
System.out.print("Jam kunjung (0-23): ");
int jam = sc.nextInt();

Menu(nama, isMember, jam);
```
**Uji Budi, member, datang pukul 15:**
```text
Nama pelanggan: Budi
Member? (y/n): y
Jam kunjung (0-23): 15
Selamat datang, Budi!
Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!
Happy Hour! Diskon 20% untuk semua minuman
===== MENU RESTO KAFE =====
[ ... daftar menu 1-6 ... ]
```
Pesan *Happy Hour* tampil karena `jamKunjung` = 15 berada pada rentang 14 sampai 16. Status `y/n` diubah menjadi `boolean` dengan `equalsIgnoreCase("y")`.

### ❓ Pertanyaan 5
**Tuliskan output potongan kode `ubahNama()`. Mengapa perubahan di dalam fungsi tidak memengaruhi `main`? Apakah parameter sama dengan variabel di `main`?**

```text
Di dalam fungsi: Tamu
Di main: Andi
```

Java memakai **pass by value**: saat `ubahNama(nama)` dipanggil, **nilai** dari variabel `nama` di `main` **disalin** ke parameter `nama` milik fungsi. Pernyataan `nama = "Tamu";` hanya mengubah salinan itu, sedangkan variabel di `main` tidak tersentuh. Jadi **parameter bukan variabel yang sama dengan variabel di `main`**. Keduanya hanya kebetulan bernama sama, tetapi merupakan dua variabel lokal terpisah yang hidup di fungsinya masing-masing (*scope* berbeda). Menamai keduanya berbeda tidak mengubah hasilnya.

> 💡 Untuk objek seperti array, yang disalin adalah *referensi*-nya. Mengubah **isi** array lewat parameter terlihat dari luar fungsi, tetapi menugaskan array baru ke parameter tetap tidak mengubah variabel di `main`.

---

# 3. Percobaan 3 — Fungsi dengan nilai kembalian

Tahap awal Percobaan 3 sesuai jobsheet:

```java
public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    return hargaTotal;
}
```
Dijalankan dengan menu **3** sebanyak **2** porsi (Latte Rp22.000 × 2):

```text
Masukkan nomor menu yang ingin Anda pesan: 3
Masukkan jumlah item yang ingin dipesan: 2
Total harga untuk pesanan Anda: Rp44000
```

### ❓ Pertanyaan 1
**Tipe kembalian dan parameter `hitungTotalHarga13`, arti masing-masing, perbandingan dengan `Menu()`, dan kapan perlu nilai kembalian.**

| Unsur | Tipe | Arti dalam program kafe |
|---|:-:|---|
| nilai kembalian | `int` | **total harga** pesanan (rupiah) |
| `pilihanMenu` | `int` | **nomor menu** yang dipesan (1–6), dipakai `pilihanMenu - 1` sebagai indeks array harga |
| `banyakItem` | `int` | **jumlah porsi** yang dipesan |

`Menu()` bertipe `void`: tugasnya hanya **menampilkan** sesuatu dan tidak ada hasil yang dibutuhkan pemanggilnya. `hitungTotalHarga13` bertipe `int`: tugasnya **menghitung**, dan hasilnya dibutuhkan `main` untuk disimpan (`totalBayar`), ditambahkan, atau dipakai menghitung diskon.

**Kapan perlu nilai kembalian?** Bila pemanggil membutuhkan hasil untuk diproses lebih lanjut (disimpan, dijumlahkan, dibandingkan, ditampilkan di tempat lain). **Kapan tidak?** Bila fungsi hanya menjalankan aksi, misalnya mencetak tampilan (`void`).

### ❓ Pertanyaan 2
**(a) Panggil tanpa menyimpan nilai kembalian. (b) Hapus `return hargaTotal;`. Mana yang error?**

**(a) Tidak error.** Program tetap berjalan, nilai kembaliannya hanya dibuang:
```text
Masukkan nomor menu yang ingin Anda pesan: 3
Masukkan jumlah item yang ingin dipesan: 2
Fungsi dipanggil, nilai kembalian tidak disimpan.
```
**(b) Error saat kompilasi:**
```text
NoReturn.java:6: error: missing return statement
error: compilation failed
```

**Kesimpulan:** fungsi bertipe non-`void` **wajib** mengembalikan nilai pada setiap jalur eksekusi (`return`), kalau tidak compiler menolak. Sebaliknya, **pemanggil tidak wajib** menyimpan nilai kembalian. Menyimpannya hanya perlu bila nilainya dipakai.

### ❓ Pertanyaan 3
**Masukkan nomor menu 7, lalu 0. Error apa? Lalu ubah agar bisa memesan beberapa menu dan menolak nomor di luar 1–6.**

**Nomor menu 7:**
```text
Masukkan nomor menu yang ingin Anda pesan: 7
Masukkan jumlah item yang ingin dipesan: 1

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
```
**Nomor menu 0:**
```text
Masukkan nomor menu yang ingin Anda pesan: 0
Masukkan jumlah item yang ingin dipesan: 1

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
```

**Penyebab:** array `hargaItems` hanya punya 6 elemen (indeks 0 sampai 5). Nomor menu dikurangi 1 sebelum dipakai sebagai indeks: nomor **7** menjadi indeks **6**, dan nomor **0** menjadi indeks **-1**. Keduanya di luar rentang sehingga terjadi `ArrayIndexOutOfBoundsException` saat program berjalan.

**Perbaikan** (ada pada `main` di `Kafe13exp`): pemesanan dibungkus perulangan, nomor menu divalidasi dengan `jumlahMenu()`, dan total semua pesanan dijumlahkan:

```java
int totalHarga = 0;

while (true) {
    System.out.print("\nMasukkan nomor menu (0 = selesai): ");
    int pilihanMenu = sc.nextInt();

    if (pilihanMenu == 0) {
        break;                       // selesai memesan
    }
    if (pilihanMenu < 1 || pilihanMenu > jumlahMenu()) {
        System.out.println("Menu tidak tersedia");
        continue;                    // tolak, minta lagi
    }

    System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = sc.nextInt();

    int totalBayar = hitungTotalHarga13(pilihanMenu, banyakItem);
    totalHarga += totalBayar;        // akumulasi seluruh pesanan
}
```

### ❓ Pertanyaan 4
**Buat `hitungDiskon(int total, String kodePromo, boolean isMember)`.**

```java
public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
    int persen = 0;

    if (kodePromo.equalsIgnoreCase("DISKON50")) {
        persen = 50;
    } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        persen = 30;
    } else if (!kodePromo.isEmpty()) {
        System.out.println("Kode promo invalid");
    }

    if (isMember) {
        persen += 10;   // tambahan diskon member
    }

    // Kalikan dulu baru bagi 100 agar hasil int tidak terpotong
    return total * persen / 100;
}
```

**Petunjuk soal (urutan perkalian dan pembagian pada `int`):** pembagian dua bilangan `int` membuang bagian pecahan. Bila dibagi dulu (`total / 100 * persen`), sisa bagi hilang sebelum dikalikan. Contoh total 1.550 dan diskon 30%:

```text
total * persen / 100 = 465
total / 100 * persen = 450
```
Karena itu rumusnya ditulis `total * persen / 100` (**kali dulu, baru bagi**).

> ⚠️ **Asumsi saya:** "tambahan diskon 10%" untuk member saya hitung **menjumlah persentase** dari total awal (misalnya `DISKON30` + member = 40%), bukan diskon bertingkat. Kode kosong dianggap "tidak memakai promo", sehingga pesan *Kode promo invalid* hanya muncul bila kode diisi tetapi tidak dikenal. Kode promo tidak membedakan huruf besar/kecil.

**Program akhir** (menggabungkan Percobaan 1 sampai 3):

```java
// Kafe13exp.java
import java.util.Locale;
import java.util.Scanner;

public class Kafe13exp {

    // Percobaan 1, Pertanyaan 1: fungsi tanpa parameter yang mengembalikan nilai
    public static int jumlahMenu() {
        return 6;
    }

    // Percobaan 1 dan 2: fungsi Menu dengan parameter (ditambah jamKunjung pada Pertanyaan 4)
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    // Percobaan 3: fungsi dengan nilai kembalian
    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    // Percobaan 3, Pertanyaan 4: mengembalikan nominal diskon
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persen = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            persen = 50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            persen = 30;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persen += 10;   // tambahan diskon member
        }

        // Kalikan dulu baru bagi 100 agar hasil int tidak terpotong
        return total * persen / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale id = Locale.forLanguageTag("id-ID");

        System.out.print("Nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Member? (y/n): ");
        boolean isMember = sc.nextLine().equalsIgnoreCase("y");
        System.out.print("Jam kunjung (0-23): ");
        int jam = sc.nextInt();
        sc.nextLine();

        Menu(nama, isMember, jam);

        int totalHarga = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu (0 = selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }
            if (pilihanMenu < 1 || pilihanMenu > jumlahMenu()) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            if (banyakItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0");
                continue;
            }

            int totalBayar = hitungTotalHarga13(pilihanMenu, banyakItem);
            System.out.println(String.format(id, "Subtotal menu %d: Rp%,d", pilihanMenu, totalBayar));
            totalHarga += totalBayar;
        }
        sc.nextLine();

        System.out.print("Kode promo (kosongkan bila tidak ada): ");
        String kodePromo = sc.nextLine().trim();

        int diskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalAkhir = totalHarga - diskon;

        System.out.println();
        System.out.println(String.format(id, "Total harga       : Rp%,d", totalHarga));
        System.out.println(String.format(id, "Diskon            : Rp%,d", diskon));
        System.out.println(String.format(id, "Total yang dibayar: Rp%,d", totalAkhir));
    }
}
```

**Contoh 1 — Budi (member, jam 15), memesan menu 1 × 2, menu 7 (ditolak), menu 3 × 1, kode `DISKON30`:**
```text
Nama pelanggan: Budi
Member? (y/n): y
Jam kunjung (0-23): 15
Selamat datang, Budi!
Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!
Happy Hour! Diskon 20% untuk semua minuman
[ ... daftar menu 1-6 ditampilkan ... ]

Masukkan nomor menu (0 = selesai): 1
Masukkan jumlah item yang ingin dipesan: 2
Subtotal menu 1: Rp30.000

Masukkan nomor menu (0 = selesai): 7
Menu tidak tersedia

Masukkan nomor menu (0 = selesai): 3
Masukkan jumlah item yang ingin dipesan: 1
Subtotal menu 3: Rp22.000

Masukkan nomor menu (0 = selesai): 0
Kode promo (kosongkan bila tidak ada): DISKON30

Total harga       : Rp52.000
Diskon            : Rp20.800
Total yang dibayar: Rp31.200
```
Cek manual: 30.000 + 22.000 = **52.000**. Diskon = (30% + 10% member) = 40% × 52.000 = **20.800**. Dibayar = **31.200** ✔.

**Contoh 2 — bukan member, kode promo salah (`ABC`):**
```text
Selamat datang, Sinta!
[ ... daftar menu 1-6 ditampilkan ... ]

Masukkan nomor menu (0 = selesai): 2
Masukkan jumlah item yang ingin dipesan: 1
Subtotal menu 2: Rp20.000

Masukkan nomor menu (0 = selesai): 0
Kode promo (kosongkan bila tidak ada): ABC
Kode promo invalid

Total harga       : Rp20.000
Diskon            : Rp0
Total yang dibayar: Rp20.000
```
**Contoh 3 — bukan member, `DISKON50`:**
```text
Selamat datang, Doni!
[ ... daftar menu 1-6 ditampilkan ... ]

Masukkan nomor menu (0 = selesai): 6
Masukkan jumlah item yang ingin dipesan: 2
Subtotal menu 6: Rp36.000

Masukkan nomor menu (0 = selesai): 0
Kode promo (kosongkan bila tidak ada): DISKON50

Total harga       : Rp36.000
Diskon            : Rp18.000
Total yang dibayar: Rp18.000
```
**Contoh 4 — tanpa kode promo (kosong):**
```text
Selamat datang, Rani!
[ ... daftar menu 1-6 ditampilkan ... ]

Masukkan nomor menu (0 = selesai): 4
Masukkan jumlah item yang ingin dipesan: 1
Subtotal menu 4: Rp12.000

Masukkan nomor menu (0 = selesai): 0
Kode promo (kosongkan bila tidak ada): 

Total harga       : Rp12.000
Diskon            : Rp0
Total yang dibayar: Rp12.000
```

---

# 4. Percobaan 4 — Fungsi varargs

📄 File: [`PengunjungCafe13exp.java`](experiment/PengunjungCafe13exp.java)

Fungsi dari jobsheet (menggunakan `for` berindeks) dengan tiga pemanggilan:

```java
static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (int i = 0; i < namaPengunjung.length; i++) {
        System.out.println("- " + namaPengunjung[i]);
    }
}

daftarPengunjung("Ali", "Budi", "Citra");
daftarPengunjung("Andi");
daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
```
```text
Daftar Nama Pengunjung:
- Ali
- Budi
- Citra
Daftar Nama Pengunjung:
- Andi
Daftar Nama Pengunjung:
- Doni
- Eti
- Fahmi
- Galih
```
Jumlah argumen yang berbeda-beda (3, 1, dan 4) diterima oleh **satu fungsi yang sama**, dan daftar yang tampil menyesuaikan jumlah argumen.

### ❓ Pertanyaan 1
**Arti `String... namaPengunjung`. Berapa argumen yang boleh? Buktikan dengan `daftarPengunjung()`.**

`String...` (tiga titik) adalah **varargs** (*variable-length arguments*): parameter yang boleh menerima **nol, satu, atau banyak** argumen bertipe `String`. Di dalam fungsi, semua argumen itu terkumpul dalam satu array `String[]`.

**Pembuktian `daftarPengunjung()` tanpa argumen:** **tidak error** saat kompilasi maupun saat dijalankan. Programnya tetap berjalan dan hanya mencetak judul, karena array-nya **kosong** (`length` = 0) sehingga perulangan tidak berjalan sama sekali. Pada keluaran lengkap program akhir:

```text
Daftar Nama Pengunjung:
```

### ❓ Pertanyaan 2
**Buktikan `namaPengunjung` diperlakukan sebagai array: (a) for-each, (b) pemanggilan dengan array.**

**(a) Versi `for-each`** (dipakai pada file akhir, hasilnya sama persis dengan versi `for` berindeks):

```java
static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
}
```
`for-each` hanya bisa dipakai pada array atau koleksi, dan di sini ia berhasil menelusuri `namaPengunjung`.

**(b) Memanggil dengan array:**

```java
String[] tamu = {"Ali", "Budi", "Citra"};
daftarPengunjung(tamu);
```
```text
Daftar Nama Pengunjung:
- Ali
- Budi
- Citra
```

**Kesimpulan:** parameter varargs **adalah array** di dalam fungsi. Ia memakai `.length` dan indeks, bisa ditelusuri dengan `for-each`, dan boleh langsung diberi **array** sebagai argumen (hasilnya sama dengan mengetik elemennya satu per satu). Bedanya hanya di sisi pemanggil: varargs memungkinkan menulis argumen terpisah dengan jumlah bebas.

### ❓ Pertanyaan 3
**Ubah menjadi `daftarPengunjung(int nomorMeja, String... namaPengunjung)`, lalu coba dua bentuk lain.**

```java
static void daftarPengunjungMeja(int nomorMeja, String... namaPengunjung) {
    System.out.println("Meja nomor " + nomorMeja + " - Daftar Nama Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
}

daftarPengunjungMeja(5, "Rina", "Sinta");
```
```text
Meja nomor 5 - Daftar Nama Pengunjung:
- Rina
- Sinta
```
**(a) `(String... namaPengunjung, int nomorMeja)`:**
```text
VarargsA.java:2: error: varargs parameter must be the last parameter
error: compilation failed
```
**(b) `(String... namaPengunjung, int... nomorMeja)`:**
```text
VarargsB.java:2: error: varargs parameter must be the last parameter
error: compilation failed
```

**Dua aturan penulisan varargs di Java:**
1. Parameter varargs **harus berada di posisi paling akhir** dalam daftar parameter.
2. Dalam satu fungsi hanya boleh ada **satu** parameter varargs (bentuk (b) gagal karena ada dua varargs, sehingga yang pertama tidak berada di posisi terakhir).

### ❓ Pertanyaan 4
**Buat `hitungTotalBelanja(int... harga)`, uji dengan 1, 3, dan 5 argumen.**

```java
static int hitungTotalBelanja(int... harga) {
    int total = 0;
    for (int h : harga) {
        total += h;
    }
    return total;
}

System.out.println("Total (1 argumen) : " + hitungTotalBelanja(15000));
System.out.println("Total (3 argumen) : " + hitungTotalBelanja(15000, 20000, 22000));
System.out.println("Total (5 argumen) : " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
```
```text
Total (1 argumen) : 15000
Total (3 argumen) : 57000
Total (5 argumen) : 79000
```
Cek manual: 15.000 + 20.000 + 22.000 = 57.000 ✔ dan ditambah 12.000 + 10.000 menjadi 79.000 ✔. Fungsi yang sama menangani 1, 3, maupun 5 argumen. Jika dipanggil tanpa argumen, hasilnya 0.

**Program lengkap Percobaan 4:**

```java
// PengunjungCafe13exp.java
public class PengunjungCafe13exp {

    // Varargs: namaPengunjung diperlakukan sebagai array String
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    // Varargs harus menjadi parameter terakhir
    static void daftarPengunjungMeja(int nomorMeja, String... namaPengunjung) {
        System.out.println("Meja nomor " + nomorMeja + " - Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        // Pertanyaan 1: tanpa argumen
        daftarPengunjung();

        // Pertanyaan 2b: argumen berupa array
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(tamu);

        // Pertanyaan 3: nomor meja + varargs
        daftarPengunjungMeja(5, "Rina", "Sinta");

        // Pertanyaan 4: hitungTotalBelanja dengan 1, 3, dan 5 argumen
        System.out.println("Total (1 argumen) : " + hitungTotalBelanja(15000));
        System.out.println("Total (3 argumen) : " + hitungTotalBelanja(15000, 20000, 22000));
        System.out.println("Total (5 argumen) : " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    }
}
```

---

# 5. Percobaan 5 — Dengan fungsi versus tanpa fungsi

📄 File: [`HitungBalokTanpaFungsi13exp.java`](experiment/HitungBalokTanpaFungsi13exp.java)

```java
// HitungBalokTanpaFungsi13exp.java
import java.util.Scanner;

public class HitungBalokTanpaFungsi13exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();

        System.out.println("Masukkan lebar");
        l = input.nextInt();

        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);
        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }
}
```

📄 File: [`HitungBalok13exp.java`](experiment/HitungBalok13exp.java)

Versi dengan fungsi (`hitungLuas`, `hitungVolume`, dan `main`) ditambah `hitungLuasPermukaanBalok` serta perhitungan tiga balok dari Pertanyaan 4:

```java
// HitungBalok13exp.java
import java.util.Scanner;

public class HitungBalok13exp {

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    // Percobaan 5, Pertanyaan 4: memanfaatkan hitungLuas
    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();

        System.out.println("Masukkan lebar");
        l = input.nextInt();

        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        System.out.println("Luas Permukaan Balok adalah " + hitungLuasPermukaanBalok(p, l, t));
        input.close();

        // Pertanyaan 4: tiga balok dengan ukuran berbeda (p, l, t)
        int[][] balok = {{4, 3, 5}, {10, 2, 6}, {7, 7, 7}};
        System.out.println();
        for (int i = 0; i < balok.length; i++) {
            int pp = balok[i][0], ll = balok[i][1], tt = balok[i][2];
            System.out.println("Balok ke-" + (i + 1) + " (" + pp + " x " + ll + " x " + tt + "): luas permukaan = "
                    + hitungLuasPermukaanBalok(pp, ll, tt) + ", volume = " + hitungVolume(tt, pp, ll));
        }
    }
}
```

**Validasi hasil, input panjang = 4, lebar = 3, tinggi = 5:**

*Tanpa fungsi:*
```text
Masukkan panjang
4
Masukkan lebar
3
Masukkan tinggi
5
Luas persegi panjang adalah 12
Volume balok adalah 60
```
*Dengan fungsi:*
```text
Masukkan panjang
4
Masukkan lebar
3
Masukkan tinggi
5
Luas Persegi Panjang adalah 12
Volume Balok adalah 60
Luas Permukaan Balok adalah 94

Balok ke-1 (4 x 3 x 5): luas permukaan = 94, volume = 60
Balok ke-2 (10 x 2 x 6): luas permukaan = 184, volume = 120
Balok ke-3 (7 x 7 x 7): luas permukaan = 294, volume = 343
```

### ❓ Pertanyaan 1
**Apakah output kedua versi sama? Uraikan urutan eksekusi versi dengan fungsi.**

**Nilainya sama** (luas 12, volume 60), dan itu sesuai hitungan manual: 4 × 3 = 12 dan 4 × 3 × 5 = 60. Satu-satunya perbedaan ada pada **teks**: versi dengan fungsi menulis `Luas Persegi Panjang` dan `Volume Balok` dengan huruf kapital di awal tiap kata, sedangkan versi tanpa fungsi menulis `Luas persegi panjang` dan `Volume balok`. Itu perbedaan penulisan teks pada kode jobsheet, bukan perbedaan perhitungan.

**Urutan eksekusi versi dengan fungsi:**
1. Program dimulai dari `main`. Tiga nilai dibaca: `p = 4`, `l = 3`, `t = 5`.
2. `L = hitungLuas(p, l)`: kendali pindah ke `hitungLuas(4, 3)`. Di sana `Luas = 4 * 3 = 12`, lalu `return 12` kembali ke `main`. `L` menjadi 12 dan "Luas Persegi Panjang adalah 12" dicetak.
3. `vol = hitungVolume(t, p, l)`: kendali pindah ke `hitungVolume(5, 4, 3)`, sehingga `tinggi = 5`, `a = 4`, `b = 3`.
4. Di dalam `hitungVolume`, ekspresi `hitungLuas(a, b) * tinggi` dievaluasi. **Fungsi `hitungLuas` dipanggil dari dalam `hitungVolume`**: kendali pindah lagi ke `hitungLuas(4, 3)`, yang mengembalikan 12.
5. Hasil 12 dikalikan `tinggi` (5) = 60, lalu `return 60` kembali ke `main`.
6. `vol` menjadi 60 dan "Volume Balok adalah 60" dicetak. `main` selesai.

Jadi pemanggilan **bertumpuk**: `main` memanggil `hitungVolume`, dan `hitungVolume` memanggil `hitungLuas`. Fungsi yang dipanggil paling dalam selesai lebih dulu, lalu hasilnya dikembalikan ke pemanggilnya.

### ❓ Pertanyaan 2
**Tuliskan output program `LacakFungsi`, lalu jalankan untuk memeriksa. Jelaskan pemanggilan pada baris 18 sampai 21.**

📄 File: [`LacakFungsi13exp.java`](experiment/LacakFungsi13exp.java)

**Jawaban dari penelusuran manual:**

| Baris | Perhitungan | Hasil |
|:-:|---|---|
| 18 | `a = kali2(3)` → 3 × 2 | `a = 6` |
| 19 | `b = tambah(a, kali2(1))` → `kali2(1)` = 2, lalu `tambah(6, 2)` | `b = 8` |
| 20 | `cetak(b)` → `cetak(8)`: `i` = 8, 6, 4, 2 (turun 2 sampai tidak lebih dari 0) | mencetak `8 6 4 2 ` |
| 21 | `cetak(tambah(b, -a) + 1)` → `tambah(8, -6)` = 2, ditambah 1 = 3 → `cetak(3)`: `i` = 3, 1 | mencetak `3 1 ` |

**Output hasil menjalankan program (sama dengan penelusuran manual):**
```text
8 6 4 2 
3 1 
```

**Urutan pemanggilan pada baris 18–21:** pada pemanggilan bersarang, **argumen dievaluasi lebih dulu dari dalam ke luar**, baru fungsi luarnya dipanggil. Pada baris 19, `kali2(1)` dijalankan lebih dulu, lalu hasilnya (2) menjadi argumen kedua `tambah`. Pada baris 21, urutannya `tambah(b, -a)` dijalankan lebih dulu, kemudian ditambah 1, dan terakhir hasilnya dikirim ke `cetak`. Fungsi `cetak` bertipe `void`, jadi hanya mencetak tanpa mengembalikan nilai.

### ❓ Pertanyaan 3
**Jika `hitungVolume(t, p, l)` diubah menjadi `hitungVolume(p, l, t)`, apakah hasilnya berbeda? Berikan contoh fungsi yang salah bila argumen tertukar. Apakah compiler mendeteksinya?**

```text
hitungVolume(t, p, l) = 60
hitungVolume(p, l, t) = 60
```

**Hasilnya tidak berbeda (tetap 60).** Dengan `hitungVolume(p, l, t)`, parameter menjadi `tinggi = p`, `a = l`, `b = t`, sehingga yang dihitung adalah `l × t × p`, dan **perkalian bersifat komutatif** (urutan faktor tidak memengaruhi hasil). Jadi secara kebetulan hasilnya sama. Penukaran ini baru berbahaya pada fungsi yang tidak komutatif, seperti pembagian atau pengurangan:

```java
static int kecepatan(int jarak, int waktu) {
    return jarak / waktu;
}
```
```text
kecepatan(100, 2) = 50   (jarak 100, waktu 2)
kecepatan(2, 100) = 0    (argumen tertukar)
```

Pada contoh itu `kecepatan(2, 100)` memberi **0**, padahal seharusnya jarak 100 dan waktu 2 (kecepatan 50).

**Apakah compiler mendeteksinya? Tidak.** Kedua argumen bertipe `int` sehingga tipenya cocok pada posisi mana pun. Programnya tetap dikompilasi dan dijalankan, tetapi hasilnya **salah secara diam-diam** (*logic error*). Pada `Menu(true, "Andi")` di Percobaan 2, yang tertukar adalah `boolean` dan `String` (tipe **berbeda**), sehingga compiler langsung menolak dengan *argument mismatch*. Jadi pemeriksaan tipe hanya melindungi bila tipe parameternya berbeda. Bila beberapa parameter bertipe sama, urutan argumen menjadi **tanggung jawab programmer**: beri nama parameter yang jelas dan periksa urutannya.

### ❓ Pertanyaan 4
**Tambahkan `hitungLuasPermukaanBalok(int p, int l, int t)` yang memanfaatkan `hitungLuas`, lalu hitung 3 balok. Bandingkan dengan versi tanpa fungsi.**

```java
static int hitungLuasPermukaanBalok(int p, int l, int t) {
    return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
}
```
**Hasil dengan fungsi** (tiga baris terakhir keluaran program di atas):
```text
Balok ke-1 (4 x 3 x 5): luas permukaan = 94, volume = 60
Balok ke-2 (10 x 2 x 6): luas permukaan = 184, volume = 120
Balok ke-3 (7 x 7 x 7): luas permukaan = 294, volume = 343
```
**Versi tanpa fungsi untuk tiga balok yang sama:**

```java
int p1 = 4, l1 = 3, t1 = 5;
int lp1 = 2 * (p1 * l1 + p1 * t1 + l1 * t1);
int v1 = p1 * l1 * t1;
// ... blok yang sama diulang untuk balok ke-2 dan ke-3 ...
```
```text
Balok ke-1 (4 x 3 x 5): luas permukaan = 94, volume = 60
Balok ke-2 (10 x 2 x 6): luas permukaan = 184, volume = 120
Balok ke-3 (7 x 7 x 7): luas permukaan = 294, volume = 343
```

Hasilnya sama persis, yaitu 94 dan 60, 184 dan 120, 294 dan 343.

| | Dengan fungsi | Tanpa fungsi |
|---|---|---|
| Rumus luas permukaan | ditulis **sekali** | ditulis **tiga kali** (salin-tempel) |
| Menambah balok ke-4 | cukup 1 pemanggilan | menyalin ulang seluruh blok |
| Jika rumus salah | **perbaiki di satu tempat**, semua balok ikut benar | harus memperbaiki **setiap salinan**; satu yang terlewat membuat hasil tidak konsisten |
| Keterbacaan | nama fungsi menjelaskan maksudnya | rumus panjang berulang di `main` |

**Versi dengan fungsi lebih ringkas dan lebih mudah diperbaiki.** Rumus berada di satu tempat, sehingga perbaikannya otomatis berlaku untuk semua pemanggilan. Pada versi tanpa fungsi, setiap salinan rumus bisa berbeda-beda saat diedit, dan kesalahan seperti ini sulit ditemukan.

---

# 6. Tugas

### 📌 Tugas 1 — Bangun Ruang (Absen Ganjil: `TabungKerucut`)

📄 File: [`TabungKerucut13assign.java`](assignment/TabungKerucut13assign.java)

Nomor absen **13 adalah ganjil**, sehingga yang dibuat adalah varian **`TabungKerucut`** (varian genap `KubusLimas` tidak dikerjakan).

| Fungsi | Rumus | Memanggil fungsi lain |
|---|---|:-:|
| `luasLingkaran(r)` | π × r² | — |
| `volumeTabung(r, t)` | `luasLingkaran(r)` × t | ✅ `luasLingkaran` |
| `luasPermukaanTabung(r, t)` | 2 × `luasLingkaran(r)` + 2πrt | ✅ `luasLingkaran` |
| `volumeKerucut(r, t)` | `volumeTabung(r, t)` / 3 | ✅ `volumeTabung` |

Fungsi `main` menampilkan menu secara berulang (`do-while`) dan berhenti saat pengguna memilih **0**.

```java
// TabungKerucut13assign.java
import java.util.Locale;
import java.util.Scanner;

public class TabungKerucut13assign {

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    static double volumeTabung(double r, double t) {
        return luasLingkaran(r) * t;
    }

    static double luasPermukaanTabung(double r, double t) {
        // 2 x luas alas + keliling alas x tinggi
        return 2 * luasLingkaran(r) + 2 * Math.PI * r * t;
    }

    static double volumeKerucut(double r, double t) {
        return volumeTabung(r, t) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);   // desimal memakai titik, mis. 7.5
        Locale id = Locale.forLanguageTag("id-ID");

        int pilihan;
        do {
            System.out.println();
            System.out.println("=== Menu Bangun Ruang ===");
            System.out.println("1. Luas lingkaran");
            System.out.println("2. Volume tabung");
            System.out.println("3. Luas permukaan tabung");
            System.out.println("4. Volume kerucut");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                double t = 0;
                if (pilihan != 1) {
                    System.out.print("Masukkan tinggi (t): ");
                    t = sc.nextDouble();
                }

                if (r <= 0 || (pilihan != 1 && t <= 0)) {
                    System.out.println("Ukuran harus lebih dari 0.");
                } else if (pilihan == 1) {
                    System.out.println(String.format(id, "Luas lingkaran = %.2f", luasLingkaran(r)));
                } else if (pilihan == 2) {
                    System.out.println(String.format(id, "Volume tabung = %.2f", volumeTabung(r, t)));
                } else if (pilihan == 3) {
                    System.out.println(String.format(id, "Luas permukaan tabung = %.2f", luasPermukaanTabung(r, t)));
                } else {
                    System.out.println(String.format(id, "Volume kerucut = %.2f", volumeKerucut(r, t)));
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        System.out.println("Program selesai.");
    }
}
```

**Hasil run (r = 7, t = 10):**
```text
=== Menu Bangun Ruang ===
1. Luas lingkaran
2. Volume tabung
3. Luas permukaan tabung
4. Volume kerucut
0. Keluar
Pilih: 1
Masukkan jari-jari (r): 7
Luas lingkaran = 153,94

[menu]
Pilih: 2
Masukkan jari-jari (r): 7
Masukkan tinggi (t): 10
Volume tabung = 1539,38

[menu]
Pilih: 3
Masukkan jari-jari (r): 7
Masukkan tinggi (t): 10
Luas permukaan tabung = 747,70

[menu]
Pilih: 4
Masukkan jari-jari (r): 7
Masukkan tinggi (t): 10
Volume kerucut = 513,13

[menu]
Pilih: 1
Masukkan jari-jari (r): -2
Ukuran harus lebih dari 0.

[menu]
Pilih: 9
Pilihan tidak valid.

[menu]
Pilih: 0
Program selesai.
```

✅ **Cek manual:** luas lingkaran = π × 49 = 153,94. Volume tabung = 153,94 × 10 = 1.539,38. Luas permukaan tabung = 2 × 153,94 + 2π × 7 × 10 = 307,88 + 439,82 = 747,70. Volume kerucut = 1.539,38 / 3 = 513,13. Semuanya sama dengan keluaran program.

---

### 📌 Tugas 2 — Bank Sampah

📄 File: [`BankSampah13assign.java`](assignment/BankSampah13assign.java)

| Fungsi | Parameter | Kembalian |
|---|---|:-:|
| `inputSetoran` | `int n` | `double[]` |
| `tampilSetoran` | `double[] setoran` | `void` |
| `totalSetoran` | `double[] setoran` | `double` |
| `hitungSaldo` | `double berat, double hargaPerKg` | `double` (Rp3.000 per kg) |
| `nasabahTerbanyak` | `double[] setoran` | `int` (indeks) |
| `main` | membaca N dan memanggil semua fungsi | — |

```java
// BankSampah13assign.java
import java.util.Locale;
import java.util.Scanner;

public class BankSampah13assign {

    static Scanner sc = new Scanner(System.in);
    static Locale id = Locale.forLanguageTag("id-ID");

    // Membaca berat setoran tiap nasabah dan mengembalikannya sebagai array
    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("--- Data Setoran ---");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println(String.format(id, "Nasabah ke-%d : %.2f kg", (i + 1), setoran[i]));
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (double berat : setoran) {
            total += berat;
        }
        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    // Mengembalikan indeks nasabah dengan setoran terbesar
    static int nasabahTerbanyak(double[] setoran) {
        int indeks = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeks]) {
                indeks = i;
            }
        }
        return indeks;
    }

    public static void main(String[] args) {
        sc.useLocale(Locale.US);   // desimal memakai titik, mis. 12.5
        final double HARGA_PER_KG = 3000;

        System.out.println("=== Bank Sampah ===");
        System.out.print("Jumlah nasabah (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
            return;
        }

        double[] setoran = inputSetoran(n);

        System.out.println();
        tampilSetoran(setoran);

        System.out.println();
        System.out.println("--- Saldo Setiap Nasabah (Rp3.000 per kg) ---");
        for (int i = 0; i < setoran.length; i++) {
            double saldo = hitungSaldo(setoran[i], HARGA_PER_KG);
            System.out.println(String.format(id, "Nasabah ke-%d : Rp%,.0f", (i + 1), saldo));
        }

        System.out.println();
        System.out.println(String.format(id, "Total setoran seluruh nasabah: %.2f kg", totalSetoran(setoran)));

        int terbanyak = nasabahTerbanyak(setoran);
        System.out.println(String.format(id, "Setoran terbanyak: nasabah ke-%d (%.2f kg)", (terbanyak + 1), setoran[terbanyak]));
    }
}
```

**Hasil run (5 nasabah):**
```text
=== Bank Sampah ===
Jumlah nasabah (N): 5
Berat setoran nasabah ke-1 (kg): 12.5
Berat setoran nasabah ke-2 (kg): 8
Berat setoran nasabah ke-3 (kg): 20.25
Berat setoran nasabah ke-4 (kg): 15
Berat setoran nasabah ke-5 (kg): 3.75

--- Data Setoran ---
Nasabah ke-1 : 12,50 kg
Nasabah ke-2 : 8,00 kg
Nasabah ke-3 : 20,25 kg
Nasabah ke-4 : 15,00 kg
Nasabah ke-5 : 3,75 kg

--- Saldo Setiap Nasabah (Rp3.000 per kg) ---
Nasabah ke-1 : Rp37.500
Nasabah ke-2 : Rp24.000
Nasabah ke-3 : Rp60.750
Nasabah ke-4 : Rp45.000
Nasabah ke-5 : Rp11.250

Total setoran seluruh nasabah: 59,50 kg
Setoran terbanyak: nasabah ke-3 (20,25 kg)
```

✅ **Cek manual:** total = 12,5 + 8 + 20,25 + 15 + 3,75 = **59,5 kg**. Saldo nasabah ke-1 = 12,5 × 3.000 = **Rp37.500**. Setoran terbesar adalah 20,25 kg milik nasabah ke-3, yaitu **indeks 2**, sehingga ditampilkan sebagai nasabah ke-3 (indeks ditambah 1).

**Jumlah nasabah tidak valid:**
```text
=== Bank Sampah ===
Jumlah nasabah (N): 0
Jumlah nasabah harus lebih dari 0.
```

---

### 📌 Tugas 3 — Rekap Laundry Pak Rudi

#### a. Data tetap dari soal

📄 File: [`RekapLaundry13assign.java`](assignment/RekapLaundry13assign.java)

Data disimpan di `int[][] data` (4 layanan × 6 hari), nama layanan di `String[]`, dan harga per kg di `int[]`. Semua fungsi menerima array sebagai parameter dan **tidak memakai angka tetap** untuk ukuran (selalu `length`), sehingga fungsi yang sama dipakai ulang pada bagian (b).

| Fungsi | Tugasnya |
|---|---|
| `inputData` | membaca berat tiap layanan untuk tiap hari |
| `tampilTabel` | menampilkan seluruh data dalam bentuk tabel |
| `totalPerLayanan(int[][] data, int idxLayanan)` | total berat satu layanan selama seluruh hari |
| `tampilLayananTertinggi` | menampilkan nama dan total layanan dengan cucian terbanyak |
| `hariTersibuk(int[][] data)` | mengembalikan **indeks** hari dengan total berat terbesar |
| `tampilPendapatan` | pendapatan tiap layanan dan total pendapatan |

```java
// RekapLaundry13assign.java
import java.util.Locale;
import java.util.Scanner;

public class RekapLaundry13assign {

    static Scanner sc = new Scanner(System.in);
    static Locale id = Locale.forLanguageTag("id-ID");

    static int[][] inputData(String[] layanan, String[] hari) {
        int[][] data = new int[layanan.length][hari.length];
        for (int i = 0; i < layanan.length; i++) {
            for (int j = 0; j < hari.length; j++) {
                System.out.print("Berat cucian " + layanan[i] + " | " + hari[j] + " (kg): ");
                data[i][j] = sc.nextInt();
            }
        }
        return data;
    }

    static void tampilTabel(String[] layanan, String[] hari, int[][] data) {
        System.out.println("--- Rekap Berat Cucian (kg) ---");
        System.out.print(String.format("%-14s", "Layanan"));
        for (String h : hari) {
            System.out.print(String.format("%10s", h));
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("%-14s", layanan[i]));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(String.format("%10d", data[i][j]));
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(String[] layanan, int[][] data) {
        int idxTertinggi = 0;
        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i) > totalPerLayanan(data, idxTertinggi)) {
                idxTertinggi = i;
            }
        }
        System.out.println("Layanan dengan cucian terbanyak: " + layanan[idxTertinggi]
                + " (" + totalPerLayanan(data, idxTertinggi) + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int idxTersibuk = 0;
        int totalTerbesar = -1;
        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (totalHari > totalTerbesar) {
                totalTerbesar = totalHari;
                idxTersibuk = j;
            }
        }
        return idxTersibuk;
    }

    static void tampilPendapatan(String[] layanan, int[] harga, int[][] data) {
        System.out.println("--- Pendapatan Setiap Layanan ---");
        long totalPendapatan = 0;
        for (int i = 0; i < data.length; i++) {
            int berat = totalPerLayanan(data, i);
            long pendapatan = (long) berat * harga[i];
            totalPendapatan += pendapatan;
            System.out.println(String.format(id, "%-14s: %d kg x Rp%,d = Rp%,d", layanan[i], berat, harga[i], pendapatan));
        }
        System.out.println(String.format(id, "Total pendapatan: Rp%,d", totalPendapatan));
    }

    public static void main(String[] args) {
        String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Express"};
        int[] harga = {6000, 8000, 5000, 12000};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        System.out.println("=== Rekap Laundry Pak Rudi ===");
        int[][] data = inputData(layanan, hari);

        System.out.println();
        tampilTabel(layanan, hari, data);

        System.out.println();
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("Total " + layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
        }

        System.out.println();
        tampilLayananTertinggi(layanan, data);

        int idxHari = hariTersibuk(data);
        int totalHari = 0;
        for (int i = 0; i < data.length; i++) {
            totalHari += data[i][idxHari];
        }
        System.out.println("Hari tersibuk: " + hari[idxHari] + " (" + totalHari + " kg)");

        System.out.println();
        tampilPendapatan(layanan, harga, data);
    }
}
```

**Hasil run (data dari soal):**
```text
=== Rekap Laundry Pak Rudi ===
Berat cucian Cuci Kering | Senin (kg): 12
Berat cucian Cuci Kering | Selasa (kg): 15
Berat cucian Cuci Kering | Rabu (kg): 10
  ...(24 nilai diisi per layanan per hari; contoh run memakai data dari soal)...
```
```text
--- Rekap Berat Cucian (kg) ---
Layanan            Senin    Selasa      Rabu     Kamis     Jumat     Sabtu
Cuci Kering           12        15        10        18        20        25
Cuci Setrika          20        18        22        15        30        35
Setrika Saja           8         5        10         7         6        12
Express                3         6         2         5         8        10

Total Cuci Kering: 100 kg
Total Cuci Setrika: 140 kg
Total Setrika Saja: 48 kg
Total Express: 34 kg

Layanan dengan cucian terbanyak: Cuci Setrika (140 kg)
Hari tersibuk: Sabtu (82 kg)

--- Pendapatan Setiap Layanan ---
Cuci Kering   : 100 kg x Rp6.000 = Rp600.000
Cuci Setrika  : 140 kg x Rp8.000 = Rp1.120.000
Setrika Saja  : 48 kg x Rp5.000 = Rp240.000
Express       : 34 kg x Rp12.000 = Rp408.000
Total pendapatan: Rp2.368.000
```

✅ **Cek manual:**

| Layanan | Total berat | Harga/kg | Pendapatan |
|---|--:|--:|--:|
| Cuci Kering | 12+15+10+18+20+25 = 100 kg | Rp6.000 | Rp600.000 |
| Cuci Setrika | 20+18+22+15+30+35 = 140 kg | Rp8.000 | Rp1.120.000 |
| Setrika Saja | 8+5+10+7+6+12 = 48 kg | Rp5.000 | Rp240.000 |
| Express | 3+6+2+5+8+10 = 34 kg | Rp12.000 | Rp408.000 |
| **Total** | | | **Rp2.368.000** |

Total per hari: Senin 43, Selasa 44, Rabu 44, Kamis 45, Jumat 64, **Sabtu 82 kg**, sehingga hari tersibuk adalah **Sabtu**, sama dengan keluaran program.

#### b. Jumlah layanan, hari, nama, dan harga dari input

📄 File: [`RekapLaundryDinamis13assign.java`](assignment/RekapLaundryDinamis13assign.java)

Perbedaannya hanya pada `main`: jumlah layanan dan jumlah hari dibaca lebih dulu, lalu `layanan`, `harga`, dan `hari` dibuat dengan ukuran tersebut. Nama hari diisi otomatis `Hari ke-1`, `Hari ke-2`, dan seterusnya. Seluruh fungsi (dan perhitungannya) **tidak diubah** karena sudah memakai `length`.

```java
// RekapLaundryDinamis13assign.java
import java.util.Locale;
import java.util.Scanner;

public class RekapLaundryDinamis13assign {

    static Scanner sc = new Scanner(System.in);
    static Locale id = Locale.forLanguageTag("id-ID");

    static int[][] inputData(String[] layanan, String[] hari) {
        int[][] data = new int[layanan.length][hari.length];
        for (int i = 0; i < layanan.length; i++) {
            for (int j = 0; j < hari.length; j++) {
                System.out.print("Berat cucian " + layanan[i] + " | " + hari[j] + " (kg): ");
                data[i][j] = sc.nextInt();
            }
        }
        return data;
    }

    static void tampilTabel(String[] layanan, String[] hari, int[][] data) {
        System.out.println("--- Rekap Berat Cucian (kg) ---");
        System.out.print(String.format("%-14s", "Layanan"));
        for (String h : hari) {
            System.out.print(String.format("%10s", h));
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("%-14s", layanan[i]));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(String.format("%10d", data[i][j]));
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(String[] layanan, int[][] data) {
        int idxTertinggi = 0;
        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i) > totalPerLayanan(data, idxTertinggi)) {
                idxTertinggi = i;
            }
        }
        System.out.println("Layanan dengan cucian terbanyak: " + layanan[idxTertinggi]
                + " (" + totalPerLayanan(data, idxTertinggi) + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int idxTersibuk = 0;
        int totalTerbesar = -1;
        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (totalHari > totalTerbesar) {
                totalTerbesar = totalHari;
                idxTersibuk = j;
            }
        }
        return idxTersibuk;
    }

    static void tampilPendapatan(String[] layanan, int[] harga, int[][] data) {
        System.out.println("--- Pendapatan Setiap Layanan ---");
        long totalPendapatan = 0;
        for (int i = 0; i < data.length; i++) {
            int berat = totalPerLayanan(data, i);
            long pendapatan = (long) berat * harga[i];
            totalPendapatan += pendapatan;
            System.out.println(String.format(id, "%-14s: %d kg x Rp%,d = Rp%,d", layanan[i], berat, harga[i], pendapatan));
        }
        System.out.println(String.format(id, "Total pendapatan: Rp%,d", totalPendapatan));
    }

    public static void main(String[] args) {
        System.out.println("=== Rekap Laundry (Dinamis) ===");
        System.out.print("Jumlah layanan: ");
        int jumlahLayanan = sc.nextInt();
        System.out.print("Jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        if (jumlahLayanan <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah layanan dan jumlah hari harus lebih dari 0.");
            return;
        }

        String[] layanan = new String[jumlahLayanan];
        int[] harga = new int[jumlahLayanan];
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = sc.nextLine();
            System.out.print("Harga per kg layanan ke-" + (i + 1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }

        String[] hari = new String[jumlahHari];
        for (int j = 0; j < jumlahHari; j++) {
            hari[j] = "Hari ke-" + (j + 1);
        }

        int[][] data = inputData(layanan, hari);

        System.out.println();
        tampilTabel(layanan, hari, data);

        System.out.println();
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("Total " + layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
        }

        System.out.println();
        tampilLayananTertinggi(layanan, data);

        int idxHari = hariTersibuk(data);
        int totalHari = 0;
        for (int i = 0; i < data.length; i++) {
            totalHari += data[i][idxHari];
        }
        System.out.println("Hari tersibuk: " + hari[idxHari] + " (" + totalHari + " kg)");

        System.out.println();
        tampilPendapatan(layanan, harga, data);
    }
}
```

**Hasil run (3 layanan × 4 hari):**
```text
=== Rekap Laundry (Dinamis) ===
Jumlah layanan: 3
Jumlah hari: 4
Nama layanan ke-1: Cuci Kering
Harga per kg layanan ke-1: 6000
Nama layanan ke-2: Cuci Setrika
Harga per kg layanan ke-2: 8000
Nama layanan ke-3: Express
Harga per kg layanan ke-3: 12000
Berat cucian Cuci Kering | Hari ke-1 (kg): 10
  ...(12 nilai berat cucian diisi)...
```
```text
--- Rekap Berat Cucian (kg) ---
Layanan        Hari ke-1 Hari ke-2 Hari ke-3 Hari ke-4
Cuci Kering           10        12         8        15
Cuci Setrika          20        18        22        25
Express                3         6         2         9

Total Cuci Kering: 45 kg
Total Cuci Setrika: 85 kg
Total Express: 20 kg

Layanan dengan cucian terbanyak: Cuci Setrika (85 kg)
Hari tersibuk: Hari ke-4 (49 kg)

--- Pendapatan Setiap Layanan ---
Cuci Kering   : 45 kg x Rp6.000 = Rp270.000
Cuci Setrika  : 85 kg x Rp8.000 = Rp680.000
Express       : 20 kg x Rp12.000 = Rp240.000
Total pendapatan: Rp1.190.000
```

✅ **Cek manual:** Cuci Setrika = 20 + 18 + 22 + 25 = 85 kg × Rp8.000 = Rp680.000. Total hari ke-4 = 15 + 25 + 9 = **49 kg**, dan itu yang terbesar (hari ke-1 = 33, ke-2 = 36, ke-3 = 32).

---

# 7. Catatan

- **Desimal memakai titik.** Program yang membaca bilangan pecahan (`TabungKerucut13assign` dan `BankSampah13assign`) memakai `sc.useLocale(Locale.US)`, sehingga input ditulis `12.5` (bukan `12,5`). Tanpa baris itu, `Scanner` mengikuti pengaturan bahasa komputer, dan pada Windows berbahasa Indonesia `nextDouble()` justru menolak titik. Tampilan hasil memakai format Indonesia (`153,94` dan `Rp37.500`).
- **Asumsi diskon** (Percobaan 3, Pertanyaan 4): diskon member **dijumlahkan** ke diskon promo (persen dari total awal). Bila dosenmu menginginkan diskon bertingkat, ubah rumus pada `hitungDiskon`.
- **Percobaan 1 sampai 3** memakai satu class yang berkembang, jadi `Kafe13exp.java` adalah bentuk akhirnya. Potongan kode dan hasil tiap tahap ada di bagian masing-masing.
- **Baris `package Jobsheet12;`** tidak dicantumkan agar file bisa dijalankan langsung dari foldernya (lihat catatan di bagian struktur folder).
- Jobsheet meminta *commit dan push ke git* pada Percobaan 1. Itu kamu lakukan sendiri. Saran pesan commit ada di bagian **Rencana Commit & Push**.
- Kode memakai `String.format` untuk perataan angka dan rupiah. Itu hanya untuk tampilan dan tidak memengaruhi logika.

<div align="center">

— *Elia Beril · 264107020027* —

</div>
