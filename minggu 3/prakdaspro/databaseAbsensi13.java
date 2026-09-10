import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class databaseAbsensi13 {
    private static final Path FILE_PATH = Paths.get("dataAbsensi13.txt");
    private static final ArrayList<String> NAMA = new ArrayList<>();

    static {
        loadData();
    }

    private static void loadData() {
        try {
            if (Files.notExists(FILE_PATH)) {
                ArrayList<String> defaultData = new ArrayList<>();
                defaultData.add("Ahmad Wijaya");
                defaultData.add("Budi Santoso");
                defaultData.add("Cici Rahma");
                defaultData.add("Dina Putri");
                defaultData.add("Eko Prasetyo");
                defaultData.add("Fajar Nugroho");
                defaultData.add("Gita Lestari");
                defaultData.add("Hendra Saputra");
                defaultData.add("Indah Permata");
                defaultData.add("Joko Susilo");
                defaultData.add("Kiki Pratama");
                defaultData.add("Lina Marlina");
                defaultData.add("Maya Sari");
                defaultData.add("Nina Kurnia");
                defaultData.add("Oki Setiawan");
                NAMA.addAll(defaultData);
                saveData();
            } else {
                for (String line : Files.readAllLines(FILE_PATH)) {
                    String nama = line.trim();
                    if (!nama.isEmpty()) {
                        NAMA.add(nama);
                    }
                }
            }

            sortByName();
        } catch (IOException e) {
            System.out.println("Gagal membaca data absensi: " + e.getMessage());
        }
    }

    private static void saveData() {
        try {
            ArrayList<String> data = new ArrayList<>(NAMA);
            sortByName();
            Files.write(FILE_PATH, data);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data absensi: " + e.getMessage());
        }
    }

    private static void sortByName() {
        Collections.sort(NAMA, String.CASE_INSENSITIVE_ORDER);
    }

    public static void addStudent(String nama) {
        if (nama == null) {
            return;
        }

        String namaBaru = nama.trim();
        if (namaBaru.isEmpty()) {
            return;
        }

        for (String namaSiswa : NAMA) {
            if (namaSiswa.equalsIgnoreCase(namaBaru)) {
                return;
            }
        }

        NAMA.add(namaBaru);
        sortByName();
        saveData();
    }

    public static int getAbsenNumber(String nama) {
        if (nama == null) {
            return -1;
        }

        String namaInput = nama.trim();
        for (int i = 0; i < NAMA.size(); i++) {
            if (NAMA.get(i).equalsIgnoreCase(namaInput)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static boolean isStudentInClass(String nama) {
        return getAbsenNumber(nama) != -1;
    }
}

