portal_map = {
    "LKND": "LinkedIn",
    "GLNTS": "Glints",
    "JSTRT": "Jobstreet",
    "KMPAS": "Kompas Karir",
    "KTAKA": "KitaLulus"
}

# Contoh input data 
data_pelamar = input("Masukkan data pelamar (format: KODE[Nama | Pekerjaan | Jurusan | IPK]): ")
data_bersih = data_pelamar.strip()

kode_situs = data_bersih.split('[')[0].strip()

isi_data = data_bersih.split('[')[1].split(']')[0]

komponen = [item.strip() for item in isi_data.split('|')]

nama = komponen[0].title()
pekerjaan = komponen[1].title()
situs_lamaran = portal_map.get(kode_situs, "Tidak Diketahui")
jurusan = komponen[2].title()
ipk = komponen[3]

print(f"nama = {nama}")
print(f"Pekerjaan yang dilamar = {pekerjaan}")
print(f"situs lamaran = {situs_lamaran}")
print(f"jurusan = {jurusan}")
print(f"ipk = {ipk}")