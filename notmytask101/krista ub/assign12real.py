# Kredensial Budi yang sudah ditentukan
USERNAME_BENAR = "Saya Budi@Pyton"
PASSWORD_BENAR = "Budi123"

# Mengambil input dari user
username_input = input("Masukkan username: ")
sandi_input = input("Masukkan sandi: ")

# 1. Periksa apakah username dan sandi sudah benar (Kriteria 1)
if username_input == USERNAME_BENAR and sandi_input == PASSWORD_BENAR:
    print("Login Berhasil!")

# 2. Periksa apakah salah karena huruf kapital (Kriteria 2)
elif username_input.lower() == USERNAME_BENAR.lower() and sandi_input.lower() == PASSWORD_BENAR.lower():
    print("ada penulisan huruf kapital yang salah.")

# 3. Kriteria kesalahan lainnya (Kriteria 3)
else:
    print("User gagal masuk.")