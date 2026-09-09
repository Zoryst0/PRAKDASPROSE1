public class cthvar13 {
    String hobby = "Main Komputer";
    boolean isPandai = true;
    char jenisKelamin = 'L';
    byte _umur = 18; 
    double $ipk = 3.99, tb = 1.79;

    public static void main(String[] args) {
        cthvar13 elia = new cthvar13();
        System.out.println("Hobby saya adalah: " + elia.hobby);
        System.out.println("Apakah pandai? " + elia.isPandai);
        System.out.println("Jenis kelamin: " + elia.jenisKelamin);
        System.out.println("Umurku saat ini: " + elia._umur);
        System.out.println(String.format("Saya berIPK %s, dengan tinggi badan %s", elia.$ipk, elia.tb));
    }
}
