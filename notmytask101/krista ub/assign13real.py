 # ===== Poin 1: Input koordinat =====
x = float(input("Masukkan koordinat x: "))
y = float(input("Masukkan koordinat y: "))

# ===== Poin 2: Validasi rentang -30 sampai 30 =====
if x < -30 or x > 30 or y < -30 or y > 30:
    print("Koordinat tidak valid! Nilai x dan y harus berada di antara -30 sampai 30.")
else:
    # ===== Poin 3: Menentukan posisi titik =====
    kuadran = None  # akan diisi 1-4 jika titik berada di kuadran

    if x == 0 and y == 0:
        posisi = "Titik pusat (O)"
    elif x == 0 and y != 0:
        posisi = "Sumbu Y"
    elif y == 0 and x != 0:
        posisi = "Sumbu X"
    else:
        if x > 0 and y > 0:
            kuadran = 1
            posisi = "Kuadran I"
        elif x < 0 and y > 0:
            kuadran = 2
            posisi = "Kuadran II"
        elif x < 0 and y < 0:
            kuadran = 3
            posisi = "Kuadran III"
        else:
            kuadran = 4
            posisi = "Kuadran IV"

    # ===== Poin 4: Pemeriksaan dan perhitungan =====
    keterangan = ""
    nilai_f = None

    if posisi == "Titik pusat (O)":
        keterangan = "Titik berada di titik pusat dan tidak termasuk kuadran mana pun."
    elif posisi == "Sumbu X":
        bagian = "positif" if x > 0 else "negatif"
        keterangan = f"Titik berada pada bagian {bagian} dari sumbu X."
    elif posisi == "Sumbu Y":
        bagian = "positif" if y > 0 else "negatif"
        keterangan = f"Titik berada pada bagian {bagian} dari sumbu Y."
    elif kuadran == 1:
        nilai_f = x**2 + y**2
    elif kuadran == 2:
        nilai_f = x**2 - y**2
    elif kuadran == 3:
        nilai_f = 2*x + 3*y
    elif kuadran == 4:
        nilai_f = x**2 + 2*y

    # ===== Poin 5 & 6: Tampilkan hasil (2 angka di belakang koma) =====
    print()
    print(f"Koordinat  : ({x}, {y})")
    print(f"Posisi     : {posisi}")
    if keterangan != "":
        print(f"Keterangan : {keterangan}")
    if nilai_f is not None:
        print(f"Nilai f(x, y) = {nilai_f:.2f}")