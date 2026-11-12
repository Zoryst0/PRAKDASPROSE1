<div align="center">

# 📙 JOBSHEET 9 — ARRAY 1 DIMENSI

**Dasar Pemrograman 2026 · Politeknik Negeri Malang**

</div>

| | |
|---|---|
| 👤 **Nama** | [Elia Beril](https://www.instagram.com/ellxzrst.22/) |
| 🆔 **NIM** | 264107020027 |
| 🔢 **No. Absen** | 13 |
| 📚 **Mata Kuliah** | Dasar Pemrograman |
| ☕ **Bahasa** | Java (using java jdk 21 as the compiler) |

> 📝 Dokumen ini memuat kode, hasil *run*, jawaban **Pertanyaan** Percobaan 1–4, dan **Tugas** 1–2. Teori dan langkah praktikum tidak diulang. Semua hasil *run* berasal dari program yang benar-benar dijalankan.

---

## 🗂️ Struktur Folder

```text
jobsheet9/
├── experiment/
│   ├── ArrayBilangan13exp.java            → Percobaan 1
│   ├── ArrayNilai13exp.java               → Percobaan 2
│   ├── ArrayRataNilai13exp.java           → Percobaan 3
│   ├── ArrayRataNilaiDinamis13exp.java    → Percobaan 3, Pertanyaan 1 & 2
│   ├── SearchNilai13exp.java              → Percobaan 4 Bagian A
│   ├── SearchNilaiInput13exp.java         → Percobaan 4, Pertanyaan 2 & 3
│   ├── SortNilai13exp.java                → Percobaan 4 Bagian B
│   └── SortNilaiDesc13exp.java            → Percobaan 4, Pertanyaan 5
├── assignment/
│   ├── Tugas1NilaiMahasiswa13assign.java  → Tugas 1
│   └── Tugas2KafeKampus13assign.java      → Tugas 2
└── EliaBeril_Jobsheet_9_Array_1_Dimensi.md (dokumen ini)
```

> 💡 Jobsheet menulis nama file `ArrayBilangan<NoAbsen>.java`. Di sini `<NoAbsen>` diganti **13** dan diberi akhiran folder (`exp` / `assign`), sama seperti jobsheet sebelumnya. Nama `class` di dalam file sama persis dengan nama file. Tautan relatif hanya bekerja bila dokumen ini berada di folder `jobsheet9`.

## 📑 Daftar Isi

1. [Percobaan 1 — Deklarasi dan Menampilkan Array](#1-percobaan-1--deklarasi-inisialisasi-dan-menampilkan-array)
2. [Percobaan 2 — SIAKAD: Nilai dan Status Kelulusan](#2-percobaan-2--siakad-nilai-dan-status-kelulusan)
3. [Percobaan 3 — Total, Rata-rata, Tertinggi, Terendah](#3-percobaan-3--total-rata-rata-tertinggi-terendah)
4. [Percobaan 4 — Searching dan Sorting](#4-percobaan-4--searching-dan-sorting)
5. [Tugas](#5-tugas)
6. [Catatan](#6-catatan)

---

# 1. Percobaan 1 — Deklarasi, Inisialisasi, dan Menampilkan Array

📄 File: [`ArrayBilangan13exp.java`](experiment/ArrayBilangan13exp.java)

```java
// ArrayBilangan13exp.java
import java.util.Arrays;

public class ArrayBilangan13exp {
    public static void main(String[] args) {
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // Menampilkan dengan perulangan for
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // Menampilkan dengan foreach
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // Menampilkan dengan Arrays.toString()
        System.out.println(Arrays.toString(bil));
    }
}
```

**Hasil run (sama dengan contoh acuan):**
```text
bil[0] = 5
bil[1] = 13
bil[2] = -7
bil[3] = 17
5
13
-7
17
[5, 13, -7, 17]
```

### ❓ Pertanyaan 1
**Jika isi elemen array `bil` diubah dengan angka 5.0, 12867, 7.5, 2000000, apa yang terjadi? Mengapa?**

Program **gagal dicompile** dengan dua error, yaitu pada `5.0` dan `7.5`:
```text
Lossy.java:2: error: incompatible types: possible lossy conversion from double to int
Lossy.java:2: error: incompatible types: possible lossy conversion from double to int
2 errors
```

| Nilai | Hasil | Alasan |
|--:|:-:|---|
| `5.0` | ❌ error | literal `5.0` bertipe **double**, tidak bisa masuk ke `int` |
| `12867` | ✅ | bilangan bulat dalam rentang `int` |
| `7.5` | ❌ error | bilangan pecahan bertipe **double** |
| `2000000` | ✅ | bilangan bulat, masih di bawah batas `int` (±2,1 miliar) |

**Alasannya:** array `int[]` hanya boleh menyimpan bilangan bulat. Java tidak mengubah `double` ke `int` secara otomatis karena bagian pecahannya akan hilang (*lossy conversion*). Perhatikan bahwa `5.0` pun ditolak walau nilainya bulat, karena tipe literalnya tetap `double`. Agar semua nilai bisa disimpan, ubah tipe arraynya menjadi `double[]`:

```java
double[] bil = new double[4];
bil[0] = 5.0;
bil[1] = 12867;
bil[2] = 7.5;
bil[3] = 2000000;
```
```text
bil[0] = 5.0
bil[1] = 12867.0
bil[2] = 7.5
bil[3] = 2000000.0
```

### ❓ Pertanyaan 2
**Inisialisasi elemen sekaligus saat deklarasi (tanpa `new int[4]` dan pengisian satu per satu).**

```java
int[] bil = {5, 13, -7, 17};
```

Panjang array otomatis mengikuti banyaknya nilai (4), jadi baris `new int[4]` dan keempat baris `bil[i] = ...` tidak diperlukan lagi. Hasil run-nya sama persis:
```text
bil[0] = 5
bil[1] = 13
bil[2] = -7
bil[3] = 17
[5, 13, -7, 17]
```

### ❓ Pertanyaan 3
**Ubah statement penampilan menjadi `... + ", double = " + (bil[i] * 2)`. Apa keluarannya dan apa maksudnya?**

```java
System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
```
```text
bil[0] = 5, double = 10
bil[1] = 13, double = 26
bil[2] = -7, double = -14
bil[3] = 17, double = 34
```

**Maksud statement:** kata `double` di dalam tanda kutip hanyalah **teks** yang berarti "dua kali lipat". Itu bukan tipe data `double`. Ekspresi `(bil[i] * 2)` mengambil nilai elemen ke-`i` lalu mengalikannya 2. Tanda kurung memastikan perkalian dihitung **lebih dulu** sebelum hasilnya digabung ke teks dengan `+` (bagian `+ i +` sebelumnya adalah penggabungan teks, bukan penjumlahan).

### ❓ Pertanyaan 4
**Jika kondisi for-loop diubah menjadi `i <= 4`, apa keluarannya? Mengapa?**

```text
bil[0] = 5
bil[1] = 13
bil[2] = -7
bil[3] = 17
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
```

Program mencetak `bil[0]` sampai `bil[3]` dengan normal, lalu **berhenti dengan error `ArrayIndexOutOfBoundsException`** saat `i = 4`. Array berkapasitas 4 hanya punya indeks **0 sampai 3** (indeks terakhir = `length - 1`). Indeks 4 berada di luar rentang. Error ini muncul saat program **dijalankan** (*runtime error*), bukan saat dicompile, sehingga kode tetap berhasil dicompile. Kondisi yang benar adalah `i < bil.length`.

### ❓ Pertanyaan 5
**Apa perbedaan menampilkan array dengan for loop, foreach loop, dan `Arrays.toString()`? Kapan masing-masing digunakan?**

| Cara | Hasil tampilan | Kelebihan | Kapan digunakan |
|---|---|---|---|
| `for` (indeks) | satu baris per elemen, bisa memakai indeks (`bil[0] = 5`) | paling fleksibel: bisa tahu indeks, mengubah isi elemen, membandingkan antar elemen, atau menelusuri sebagian/terbalik | bila **indeks dibutuhkan** atau isi array akan diubah |
| `foreach` | satu baris per elemen, hanya nilainya (`5`) | ringkas dan aman dari salah indeks | bila hanya **membaca** semua elemen berurutan |
| `Arrays.toString()` | semua elemen dalam satu baris: `[5, 13, -7, 17]` | tanpa perulangan, sangat singkat | untuk **pengecekan cepat** (debugging) atau menampilkan isi array sekilas |

---

# 2. Percobaan 2 — SIAKAD: Nilai dan Status Kelulusan

📄 File: [`ArrayNilai13exp.java`](experiment/ArrayNilai13exp.java)

```java
// ArrayNilai13exp.java
import java.util.Scanner;

public class ArrayNilai13exp {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
    }
}
```

**Hasil run dengan data contoh (85, 60, 72, 90, 45, 78, 66, 95, 50, 71):**
```text
Masukkan nilai mahasiswa ke-1: 85
Masukkan nilai mahasiswa ke-2: 60
Masukkan nilai mahasiswa ke-3: 72
Masukkan nilai mahasiswa ke-4: 90
Masukkan nilai mahasiswa ke-5: 45
Masukkan nilai mahasiswa ke-6: 78
Masukkan nilai mahasiswa ke-7: 66
Masukkan nilai mahasiswa ke-8: 95
Masukkan nilai mahasiswa ke-9: 50
Masukkan nilai mahasiswa ke-10: 71
Mahasiswa ke-1: 85 (LULUS)
Mahasiswa ke-2: 60 (TIDAK LULUS)
Mahasiswa ke-3: 72 (LULUS)
Mahasiswa ke-4: 90 (LULUS)
Mahasiswa ke-5: 45 (TIDAK LULUS)
Mahasiswa ke-6: 78 (LULUS)
Mahasiswa ke-7: 66 (TIDAK LULUS)
Mahasiswa ke-8: 95 (LULUS)
Mahasiswa ke-9: 50 (TIDAK LULUS)
Mahasiswa ke-10: 71 (LULUS)
```

### ❓ Pertanyaan 1
**Apa maksud kondisi `i < nilaiAkhir.length`?**

`nilaiAkhir.length` adalah **panjang (kapasitas) array**, yaitu 10. Kondisi ini membuat perulangan berjalan selama `i` masih **kurang dari 10**, yaitu untuk `i = 0, 1, ..., 9`, dan itu persis indeks valid array. Memakai `<` (bukan `<=`) penting karena indeks terakhir adalah `length - 1`. Memakai `.length` juga membuat kode tetap benar bila ukuran array diubah, tanpa harus mengganti angka 10 di setiap perulangan.

### ❓ Pertanyaan 2
**Modifikasi agar hanya menampilkan mahasiswa yang lulus (> 70). Jelaskan alurnya.**

```java
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
    }
}
```
```text
Mahasiswa ke-1: 85 (LULUS)
Mahasiswa ke-3: 72 (LULUS)
Mahasiswa ke-4: 90 (LULUS)
Mahasiswa ke-6: 78 (LULUS)
Mahasiswa ke-8: 95 (LULUS)
Mahasiswa ke-10: 71 (LULUS)
```

**Alur program:**
1. Perulangan menelusuri seluruh elemen, `i` dari 0 sampai 9.
2. Pada tiap putaran, `if (nilaiAkhir[i] > 70)` memeriksa nilai elemen ke-`i`.
3. Jika **benar**, baris mahasiswa dicetak. Jika **salah**, blok `if` dilewati sehingga tidak ada keluaran untuk mahasiswa itu.
4. Nomor mahasiswa memakai `i + 1`, sehingga nomor yang muncul tetap nomor aslinya (ke-1, ke-3, ke-4, dst.), bukan nomor urut baru.

### ❓ Pertanyaan 3
**Ubah perulangan langkah 4 dan 5 menjadi foreach. Apakah seluruhnya bisa? Bagian mana yang bisa dan tidak?**

**Langkah 5 (menampilkan) — bisa**, tetapi nomor mahasiswa harus dihitung dengan variabel pencacah sendiri karena foreach tidak menyediakan indeks:

```java
int no = 1;
for (int nilai : nilaiAkhir) {
    String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
    System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
    no++;
}
```
Keluarannya identik dengan versi `for` (sudah saya uji):
```text
Mahasiswa ke-1: 85 (LULUS)
Mahasiswa ke-2: 60 (TIDAK LULUS)
Mahasiswa ke-3: 72 (LULUS)
...
```

**Langkah 4 (mengisi dari input) — tidak bisa.** Pada foreach, variabel perulangan (`n`) hanyalah **salinan** dari nilai elemen untuk tipe primitif. Menugaskan sesuatu ke `n` tidak mengubah isi array. Buktinya, kode ini bisa dicompile dan dijalankan tanpa error, tetapi array tetap kosong:

```java
int[] nilaiAkhir = new int[3];
for (int n : nilaiAkhir) {
    System.out.print("Masukkan nilai: ");
    n = input.nextInt();   // hanya mengubah salinan
}
System.out.println("Isi array setelah input: " + Arrays.toString(nilaiAkhir));
```
```text
Masukkan nilai: 10
Masukkan nilai: 20
Masukkan nilai: 30
Isi array setelah input: [0, 0, 0]
```

| Bagian | Bisa foreach? | Alasan |
|---|:-:|---|
| Menampilkan nilai + status | ✅ (dengan pencacah manual) | hanya **membaca** elemen |
| Mengisi array dari input | ❌ | foreach tidak dapat **mengubah** isi array, dan tidak punya indeks untuk `nilaiAkhir[i] = ...` |

### ❓ Pertanyaan 4
**Hitung dan tampilkan jumlah mahasiswa yang lulus dan tidak lulus di akhir program.**

```java
int jumlahLulus = 0;
int jumlahTidakLulus = 0;

for (int i = 0; i < nilaiAkhir.length; i++) {
    String status;
    if (nilaiAkhir[i] > 70) {
        status = "LULUS";
        jumlahLulus++;
    } else {
        status = "TIDAK LULUS";
        jumlahTidakLulus++;
    }
    System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
}

System.out.println("Jumlah mahasiswa lulus      : " + jumlahLulus);
System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
```
```text
Jumlah mahasiswa lulus      : 6
Jumlah mahasiswa tidak lulus: 4
```

Dua variabel pencacah diberi nilai awal 0 sebelum perulangan, lalu ditambah 1 (`++`) sesuai status tiap mahasiswa. Jumlah keduanya selalu sama dengan `nilaiAkhir.length` (6 + 4 = 10).

---

# 3. Percobaan 3 — Total, Rata-rata, Tertinggi, Terendah

📄 File: [`ArrayRataNilai13exp.java`](experiment/ArrayRataNilai13exp.java)

```java
// ArrayRataNilai13exp.java
import java.util.Scanner;

public class ArrayRataNilai13exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat kelas: " + predikat);
    }
}
```

**Hasil run dengan data contoh yang sama:**
```text
Total nilai: 712
Rata-rata: 71.2
Nilai tertinggi: 95
Nilai terendah: 45
Predikat kelas: BAIK
```

> 💡 Program sudah memuat langkah 7 jobsheet (predikat kelas): rata-rata ≥ 85 → `SANGAT BAIK`, ≥ 70 → `BAIK`, selain itu `PERLU PENDAMPINGAN`. Rata-rata 71,2 masuk predikat `BAIK`, sama dengan contoh acuan.

### ❓ Pertanyaan 1
**Tampilkan banyaknya mahasiswa yang lulus (> 70).**

```java
int jumlahLulus = 0;
for (int i = 0; i < nilaiMhs.length; i++) {
    if (nilaiMhs[i] > 70) {
        jumlahLulus++;
    }
}
System.out.println("Jumlah mahasiswa lulus (> 70): " + jumlahLulus);
```
```text
Jumlah mahasiswa lulus (> 70): 6
```

(Dengan data contoh: 85, 72, 90, 78, 95, 71 = **6 mahasiswa**.) Penghitungan ini sudah digabung dalam file lengkap pada Pertanyaan 2.

### ❓ Pertanyaan 2
**Jumlah elemen array diterima dari input pengguna (tidak selalu 10).**

📄 File: [`ArrayRataNilaiDinamis13exp.java`](experiment/ArrayRataNilaiDinamis13exp.java)

```java
// ArrayRataNilaiDinamis13exp.java
import java.util.Scanner;

public class ArrayRataNilaiDinamis13exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            return;
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        double rata2 = (double) total / nilaiMhs.length;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus (> 70): " + jumlahLulus);
    }
}
```

**Contoh run (5 mahasiswa):**
```text
Masukkan jumlah mahasiswa: 5
Masukkan nilai mahasiswa ke-1: 80
Masukkan nilai mahasiswa ke-2: 90
Masukkan nilai mahasiswa ke-3: 65
Masukkan nilai mahasiswa ke-4: 72
Masukkan nilai mahasiswa ke-5: 50
Total nilai: 357
Rata-rata: 71.4
Nilai tertinggi: 90
Nilai terendah: 50
Jumlah mahasiswa lulus (> 70): 3
```

**Jika jumlah 0 (ditangani agar tidak error):**
```text
Masukkan jumlah mahasiswa: 0
Jumlah mahasiswa harus lebih dari 0.
```

Perubahan utamanya ada pada `new int[jumlah]`: ukuran array ditentukan **saat program berjalan** dari input, lalu semua perulangan memakai `nilaiMhs.length` (bukan angka 10) sehingga total, rata-rata, tertinggi, dan terendah tetap benar untuk ukuran berapa pun. Pengecekan `jumlah <= 0` diperlukan karena `nilaiMhs[0]` (nilai awal tertinggi/terendah) akan error bila array kosong.

### ❓ Pertanyaan 3
**Mengapa rata-rata memakai `(double) total / nilaiMhs.length`, bukan `total / nilaiMhs.length`?**

`total` dan `nilaiMhs.length` sama-sama **int**. Pembagian dua `int` di Java menghasilkan **`int` juga** (bagian pecahan dibuang), baru kemudian dikonversi ke `double`. Hasil percobaan dengan total 712 dan 10 elemen:

```text
tanpa cast : 71.0
dengan cast: 71.2
```

Dengan `(double) total`, nilai `total` diubah menjadi `double` **sebelum** pembagian, sehingga operasinya menjadi pembagian desimal dan hasilnya akurat (71,2). Tanpa cast, bagian `.2` hilang dan hasilnya salah (71,0).

> ⚠️ Cast harus diletakkan **pada operandnya**. Bentuk `(double) (total / nilaiMhs.length)` tetap salah karena pembagian bulat sudah terjadi di dalam kurung sebelum di-cast.

---

# 4. Percobaan 4 — Searching dan Sorting

## 🔍 Bagian A — Linear Search

📄 File: [`SearchNilai13exp.java`](experiment/SearchNilai13exp.java)

```java
// SearchNilai13exp.java
public class SearchNilai13exp {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
```

**Hasil run `key = 90` dan `key = 100` (sama dengan contoh acuan):**
```text
Nilai 90 ditemukan pada indeks ke-2

--- dicoba lagi dengan key = 100 ---
Nilai 100 tidak ditemukan.
```

## 🔢 Bagian B — Bubble Sort

📄 File: [`SortNilai13exp.java`](experiment/SortNilai13exp.java)

```java
// SortNilai13exp.java
import java.util.Arrays;

public class SortNilai13exp {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
```

**Hasil run:**
```text
[55, 65, 72, 78, 88, 90]
```

### ❓ Pertanyaan 1
**Jelaskan maksud `break;` pada kode Bagian A.**

`break;` **menghentikan perulangan seketika** setelah nilai yang dicari ditemukan. Begitu `nilai[i] == key` benar, tidak ada gunanya memeriksa sisa elemen, sehingga program lebih efisien dan hanya melaporkan **kemunculan pertama**. Bila `break` dihapus dan array memiliki nilai kembar, misalnya `{78, 65, 90, 55, 90, 72}` dengan `key = 90`, pencarian terus berjalan dan mencetak semua kemunculan:

```text
ditemukan pada indeks ke-2
ditemukan pada indeks ke-4
```

Dengan `break`, hanya baris pertama (`indeks ke-2`) yang tercetak.

### ❓ Pertanyaan 2 dan 3
**Program menerima banyaknya elemen, isi array, dan `key` dari pengguna, lalu mencetak indeksnya. Tampilkan pesan yang lebih informatif bila tidak ditemukan.**

📄 File: [`SearchNilaiInput13exp.java`](experiment/SearchNilaiInput13exp.java)

```java
// SearchNilaiInput13exp.java
import java.util.Scanner;

public class SearchNilaiInput13exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Banyaknya elemen harus lebih dari 0.");
            return;
        }

        int[] nilai = new int[n];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: " + key
                    + " tidak ada di dalam array yang berisi " + n + " elemen.");
        }
    }
}
```

**Contoh run — ditemukan:**
```text
Masukkan banyaknya elemen array: 6
Elemen ke-1: 78
Elemen ke-2: 65
Elemen ke-3: 90
Elemen ke-4: 55
Elemen ke-5: 88
Elemen ke-6: 72
Masukkan nilai yang dicari (key): 88
Nilai 88 ditemukan pada indeks ke-4
```

**Contoh run — tidak ditemukan (pesan informatif):**
```text
Masukkan banyaknya elemen array: 6
Elemen ke-1: 78
Elemen ke-2: 65
Elemen ke-3: 90
Elemen ke-4: 55
Elemen ke-5: 88
Elemen ke-6: 72
Masukkan nilai yang dicari (key): 100
Nilai yang dicari tidak ditemukan: 100 tidak ada di dalam array yang berisi 6 elemen.
```

Pesan tidak ditemukan sekarang menyebut **nilai yang dicari** dan **jumlah elemen** yang sudah diperiksa, tidak sekadar "tidak ditemukan".

### ❓ Pertanyaan 4
**Jelaskan langkah demi langkah cara kerja bubble sort pada data `{78, 65, 90, 55, 88, 72}`.**

**Ide dasarnya:** bandingkan dua elemen bersebelahan (`nilai[j]` dan `nilai[j + 1]`). Bila yang kiri lebih besar, **tukar posisinya**. Setelah satu putaran penuh, elemen terbesar "menggelembung" ke ujung kanan. Putaran diulang untuk sisa elemen. Perulangan dalam berjalan sampai `length - 1 - i` karena `i` elemen di ujung kanan sudah berada di posisi final, sehingga tidak perlu dibandingkan lagi.

Hasil pelacakan (dicetak langsung dari program, `tukar` = ada pertukaran, `tetap` = tidak):

```text
Awal: [78, 65, 90, 55, 88, 72]
Putaran 1:
  tukar [65, 78, 90, 55, 88, 72]
  tetap [65, 78, 90, 55, 88, 72]
  tukar [65, 78, 55, 90, 88, 72]
  tukar [65, 78, 55, 88, 90, 72]
  tukar [65, 78, 55, 88, 72, 90]
  hasil putaran 1: [65, 78, 55, 88, 72, 90]
Putaran 2:
  tetap [65, 78, 55, 88, 72, 90]
  tukar [65, 55, 78, 88, 72, 90]
  tetap [65, 55, 78, 88, 72, 90]
  tukar [65, 55, 78, 72, 88, 90]
  hasil putaran 2: [65, 55, 78, 72, 88, 90]
Putaran 3:
  tukar [55, 65, 78, 72, 88, 90]
  tetap [55, 65, 78, 72, 88, 90]
  tukar [55, 65, 72, 78, 88, 90]
  hasil putaran 3: [55, 65, 72, 78, 88, 90]
Putaran 4:
  tetap [55, 65, 72, 78, 88, 90]
  tetap [55, 65, 72, 78, 88, 90]
  hasil putaran 4: [55, 65, 72, 78, 88, 90]
Putaran 5:
  tetap [55, 65, 72, 78, 88, 90]
  hasil putaran 5: [55, 65, 72, 78, 88, 90]
```

| Putaran | Perbandingan | Hasil akhir putaran | Yang sudah final |
|:-:|:-:|---|---|
| 1 | 5 | `[65, 78, 55, 88, 72, 90]` | 90 |
| 2 | 4 | `[65, 55, 78, 72, 88, 90]` | 88, 90 |
| 3 | 3 | `[55, 65, 72, 78, 88, 90]` | 78, 88, 90 |
| 4 | 2 | `[55, 65, 72, 78, 88, 90]` | tidak ada tukar |
| 5 | 1 | `[55, 65, 72, 78, 88, 90]` | tidak ada tukar |

Hasil akhir `[55, 65, 72, 78, 88, 90]` sama dengan contoh acuan. Karena ada dua perulangan bersarang, jumlah perbandingannya tumbuh kuadratik, yaitu **O(n²)**.

### ❓ Pertanyaan 5
**Ubah bubble sort agar mengurutkan dari terbesar ke terkecil (descending).**

📄 File: [`SortNilaiDesc13exp.java`](experiment/SortNilaiDesc13exp.java)

Cukup ubah **satu operator** pada pembanding, dari `>` menjadi `<`:

```java
if (nilai[j] < nilai[j + 1]) {   // sebelumnya: nilai[j] > nilai[j + 1]
    int temp = nilai[j];
    nilai[j] = nilai[j + 1];
    nilai[j + 1] = temp;
}
```
```text
[90, 88, 78, 72, 65, 55]
```

Sekarang elemen yang **lebih kecil** berada di kiri dianggap salah posisi dan ditukar, sehingga elemen terkecil yang menggelembung ke ujung kanan dan hasil akhirnya menurun.

---

# 5. Tugas

### 📌 Tugas 1 — Pengelolaan Nilai Mahasiswa

📄 File: [`Tugas1NilaiMahasiswa13assign.java`](assignment/Tugas1NilaiMahasiswa13assign.java)

**Fitur yang dipenuhi:** input banyaknya nilai, input nilai satu per satu, rata-rata, nilai tertinggi dan terendah, serta daftar semua nilai beserta status kelulusan (LULUS bila nilai > 70). Jumlah nilai ≤ 0 ditolak.

```java
// Tugas1NilaiMahasiswa13assign.java
import java.util.Scanner;

public class Tugas1NilaiMahasiswa13assign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Pengelolaan Nilai Mahasiswa ===");
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Banyaknya nilai harus lebih dari 0.");
            return;
        }

        int[] nilai = new int[jumlah];
        int total = 0;

        // Input nilai satu per satu
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        // Rata-rata
        double rataRata = (double) total / nilai.length;

        // Nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        // Tampilkan semua nilai beserta status kelulusan
        System.out.println();
        System.out.println("--- Daftar Nilai ---");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.println("--- Ringkasan ---");
        System.out.println("Rata-rata      : " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}
```

**Hasil run (10 mahasiswa, data contoh):**
```text
=== Pengelolaan Nilai Mahasiswa ===
Masukkan banyaknya nilai mahasiswa: 10
Masukkan nilai mahasiswa ke-1: 85
Masukkan nilai mahasiswa ke-2: 60
Masukkan nilai mahasiswa ke-3: 72
Masukkan nilai mahasiswa ke-4: 90
Masukkan nilai mahasiswa ke-5: 45
Masukkan nilai mahasiswa ke-6: 78
Masukkan nilai mahasiswa ke-7: 66
Masukkan nilai mahasiswa ke-8: 95
Masukkan nilai mahasiswa ke-9: 50
Masukkan nilai mahasiswa ke-10: 71

--- Daftar Nilai ---
Mahasiswa ke-1: 85 (LULUS)
Mahasiswa ke-2: 60 (TIDAK LULUS)
Mahasiswa ke-3: 72 (LULUS)
Mahasiswa ke-4: 90 (LULUS)
Mahasiswa ke-5: 45 (TIDAK LULUS)
Mahasiswa ke-6: 78 (LULUS)
Mahasiswa ke-7: 66 (TIDAK LULUS)
Mahasiswa ke-8: 95 (LULUS)
Mahasiswa ke-9: 50 (TIDAK LULUS)
Mahasiswa ke-10: 71 (LULUS)

--- Ringkasan ---
Rata-rata      : 71.2
Nilai tertinggi: 95
Nilai terendah : 45
```

**Uji batas (nilai 70 → TIDAK LULUS, 71 → LULUS) dan input tidak valid:**
```text
=== Pengelolaan Nilai Mahasiswa ===
Masukkan banyaknya nilai mahasiswa: 3
Masukkan nilai mahasiswa ke-1: 70
Masukkan nilai mahasiswa ke-2: 71
Masukkan nilai mahasiswa ke-3: 100

--- Daftar Nilai ---
Mahasiswa ke-1: 70 (TIDAK LULUS)
Mahasiswa ke-2: 71 (LULUS)
Mahasiswa ke-3: 100 (LULUS)

--- Ringkasan ---
Rata-rata      : 80.33333333333333
Nilai tertinggi: 100
Nilai terendah : 70
```
```text
=== Pengelolaan Nilai Mahasiswa ===
Masukkan banyaknya nilai mahasiswa: 0
Banyaknya nilai harus lebih dari 0.
```

---

### 📌 Tugas 2 — Aplikasi Pemesanan Kafe Kampus

📄 File: [`Tugas2KafeKampus13assign.java`](assignment/Tugas2KafeKampus13assign.java)

**Pemetaan terhadap ketentuan soal:**

| Ketentuan | Implementasi |
|---|---|
| Array menu dan harga diinisialisasi saat deklarasi | `String[] menu = {...}` dan `int[] harga = {...}` |
| **Pencarian menu** dengan linear search | menu **2**: perulangan membandingkan nama dengan `equalsIgnoreCase`, menampilkan harga bila ketemu, atau "tidak tersedia" |
| **Pemesanan**: jumlah item, lalu tiap item memilih nama menu yang **tervalidasi** | menu **3**: `while (posisi == -1)` mengulang pertanyaan sampai nama menu ada di array menu |
| Nama pesanan disimpan di array terpisah dari array menu | `String[] pesanan` (dan `int[] hargaPesanan` untuk harganya) |
| Hitung dan tampilkan **total biaya** | variabel `total` diakumulasi saat pesanan valid |
| Tampilkan daftar pesanan rapi beserta total | struk berformat dengan `String.format` (kolom sejajar, pemisah ribuan) |

Nama menu tidak membedakan huruf besar/kecil dan spasi di awal/akhir dibuang (`trim()`), jadi `teh tarik` dan `Teh Tarik` sama-sama dikenali.

```java
// Tugas2KafeKampus13assign.java
import java.util.Locale;
import java.util.Scanner;

public class Tugas2KafeKampus13assign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale id = Locale.forLanguageTag("id-ID");

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        boolean jalan = true;
        while (jalan) {
            System.out.println();
            System.out.println("=== Kafe Kampus ===");
            System.out.println("1. Lihat daftar menu");
            System.out.println("2. Cari menu");
            System.out.println("3. Buat pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                // Daftar menu
                System.out.println("--- Daftar Menu ---");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println(String.format(id, "%d. %-16s Rp%,d", (i + 1), menu[i], harga[i]));
                }

            } else if (pilihan == 2) {
                // Pencarian menu (linear search)
                System.out.print("Masukkan nama menu yang dicari: ");
                String cari = input.nextLine().trim();

                int posisi = -1;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(cari)) {
                        posisi = i;
                        break;
                    }
                }

                if (posisi != -1) {
                    System.out.println(String.format(id, "Menu tersedia: %s, harga Rp%,d", menu[posisi], harga[posisi]));
                } else {
                    System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
                }

            } else if (pilihan == 3) {
                // Pemesanan
                System.out.print("Jumlah item yang dipesan: ");
                int jumlah = input.nextInt();
                input.nextLine();

                if (jumlah <= 0) {
                    System.out.println("Jumlah item harus lebih dari 0.");
                } else {
                    String[] pesanan = new String[jumlah];
                    int[] hargaPesanan = new int[jumlah];
                    int total = 0;

                    for (int i = 0; i < jumlah; i++) {
                        int posisi = -1;
                        while (posisi == -1) {
                            System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                            String nama = input.nextLine().trim();

                            for (int j = 0; j < menu.length; j++) {
                                if (menu[j].equalsIgnoreCase(nama)) {
                                    posisi = j;
                                    break;
                                }
                            }
                            if (posisi == -1) {
                                System.out.println("Menu tidak tersedia, silakan ulangi.");
                            }
                        }
                        pesanan[i] = menu[posisi];
                        hargaPesanan[i] = harga[posisi];
                        total += harga[posisi];
                    }

                    // Struk pesanan
                    System.out.println();
                    System.out.println("========== PESANAN ANDA ==========");
                    for (int i = 0; i < pesanan.length; i++) {
                        System.out.println(String.format(id, "%d. %-16s Rp%,10d", (i + 1), pesanan[i], hargaPesanan[i]));
                    }
                    System.out.println("----------------------------------");
                    System.out.println(String.format(id, "   %-16s Rp%,10d", "TOTAL", total));
                    System.out.println("==================================");
                }

            } else if (pilihan == 0) {
                System.out.println("Terima kasih telah berkunjung.");
                jalan = false;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
```

**Menu 1 — daftar menu:**
```text
Pilih: 1
--- Daftar Menu ---
1. Nasi Goreng      Rp15.000
2. Mie Goreng       Rp13.000
3. Roti Bakar       Rp10.000
4. Kentang Goreng   Rp12.000
5. Teh Tarik        Rp8.000
6. Cappucino        Rp18.000
7. Chocolate Ice    Rp20.000
```

**Menu 2 — pencarian (ditemukan dan tidak ditemukan):**
```text
[menu utama]
Pilih: 2
Masukkan nama menu yang dicari: teh tarik
Menu tersedia: Teh Tarik, harga Rp8.000

[menu utama]
Pilih: 2
Masukkan nama menu yang dicari: Sate Ayam
Maaf, menu "Sate Ayam" tidak tersedia.

[menu utama]
Pilih: 0
Terima kasih telah berkunjung.
```

**Menu 3 — pemesanan (dengan satu nama menu yang salah, "Sate"):**
```text
Pilih: 3
Jumlah item yang dipesan: 3
Pesanan ke-1 (nama menu): nasi goreng
Pesanan ke-2 (nama menu): Sate
Menu tidak tersedia, silakan ulangi.
Pesanan ke-2 (nama menu): Teh Tarik
Pesanan ke-3 (nama menu): Cappucino

========== PESANAN ANDA ==========
1. Nasi Goreng      Rp    15.000
2. Teh Tarik        Rp     8.000
3. Cappucino        Rp    18.000
----------------------------------
   TOTAL            Rp    41.000
==================================
```

**Input tidak valid (jumlah item 0 dan pilihan menu 9):**
```text
Pilih: 3
Jumlah item yang dipesan: 0
Jumlah item harus lebih dari 0.

[menu utama]
Pilih: 9
Pilihan tidak valid.
```

---

# 6. Catatan

- Semua contoh hasil acuan jobsheet (Percobaan 1, 2, 3, dan Bagian A/B Percobaan 4) sudah dicocokkan dengan hasil program, dan hasilnya sama.
- **Pengumpulan:** jobsheet meminta kode `.java` Tugas 1 dan 2 **beserta screenshot** hasil run. Screenshot harus diambil sendiri dari terminal VS Code-mu. Hasil run di dokumen ini bisa dipakai sebagai acuan tampilan.
- Tugas 2 memakai menu utama (lihat, cari, pesan, keluar) supaya fitur pencarian dan pemesanan bisa dipakai bergantian. Soal tidak mengatur bentuk menunya, jadi ini pilihan rancangan saya.
- Kode memakai `while` dan `String.format`, yang mungkin belum dibahas di kelasmu. Keduanya hanya dipakai untuk validasi ulang input dan perataan tampilan struk.

<div align="center">

— *Elia Beril · 264107020027* —

</div>
