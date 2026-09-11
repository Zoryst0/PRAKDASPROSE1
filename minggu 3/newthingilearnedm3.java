public class newthingilearnedm3 {
    //import java.io.IOException; is for handling input/output exceptions that may occur when reading from or writing to files.
    //import java.nio.file.Files; is for working with files and directories, allowing you to read from and write to files.
    //import java.nio.file.Path; is for representing file and directory paths in a platform-independent manner.
    //import java.nio.file.Paths; is for creating Path objects from string representations of file paths.
    //import java.util.ArrayList; is for using the ArrayList class, which is a resizable array implementation of the List interface.
    //import java.util.Collections; is for using utility methods for collections, such as sorting and searching.

    //private static final Path FILE_PATH = Paths.get("filename.txt"); is for defining a constant variable that represents the path to a file named "filename.txt" in the current working directory.
    //private static final ArrayList<String> var = new ArrayList<>(); is for defining a constant variable that represents an empty ArrayList of strings, which can be used to store a list of string values.


    //static { is for defining a static initialization block, which is executed when the class is loaded into memory. It can be used to perform any necessary setup or initialization for the class.
    //loadData(); is for calling a method named loadData() within the static initialization block. This method is likely responsible for loading data from a file or other source into the class's variables or data structures when the class is first loaded.

    //try { is for starting a try block, which is used to handle exceptions that may occur during the execution of the code within the block. If an exception occurs, it will be caught and handled in the corresponding catch block.
    //if (Files.notExists(FILE_PATH)) { is for checking if the file specified by FILE_PATH does not exist. If the file does not exist, the code within the if block will be executed.
    //ArrayList<String> defaultData = new ArrayList<>(); is for creating a new ArrayList of strings named defaultData, which will be used to store default data values that can be written to the file if it does not exist.

            //list.addAll(defaultData); is for adding all the elements from the defaultData ArrayList to another list named list. This is likely done to initialize the list with default values if the file does not exist.
            //saveData();  is for calling a method named saveData(), which is likely responsible for saving the current state of the class's data to a file or other storage medium. This is done after adding the default data to the list to ensure that the data is persisted.
        //for (String line : Files.readAllLines(FILE_PATH)) { is for iterating over each line of text read from the file specified by FILE_PATH. The Files.readAllLines() method reads all lines from the file and returns them as a List of strings, which can then be processed in the for-each loop.
            //String var = line.trim(); is to remove any leading or trailing whitespace from the current line of text being processed in the loop. The trim() method is called on the line string to create a new string named var that contains the trimmed version of the line.
            //if (!var.isEmpty()) { is for checking if the trimmed line (var) is not empty. If the line contains any non-whitespace characters, the code within the if block will be executed, allowing the program to process only non-empty lines from the file.



    // from line written to file, the program reads each line, trims whitespace, and adds non-empty lines to a list. If the file doesn't exist, it initializes the list with default data and saves it.


    //11/09/26 things to learn:


// Fisika
    //Besaran Scalar dan Vektor
    //Besaran Scalar adalah besaran yang hanya memiliki besar (magnitude) saja, tanpa arah. Contohnya adalah massa, suhu, dan waktu.
    //Besaran Vektor adalah besaran yang memiliki besar (magnitude) dan arah.

    //Alat Ukur
    //Alat ukur adalah perangkat yang digunakan untuk mengukur besaran fisika. Contohnya adalah penggaris, timbangan, dan stopwatch.
    //Alat ukur memiliki ketelitian dan akurasi yang berbeda-beda, tergantung pada jenis dan kualitas alat tersebut.
    
    //Ada Banyak satuan ukur standard yang tidak digunakan secara universal seperti Kelvin yang adalah satuan standar untuk suhu, tetapi yang lebih umum digunakan dalam kehidupan sehari-hari adalah Celcius. 
    //Selain itu, ada juga satuan ukur yang digunakan secara khusus dalam bidang tertentu, seperti satuan ukur untuk panjang dalam astronomi (parsec) atau satuan ukur untuk energi dalam fisika nuklir (electronvolt).

    //Gerak adalah perubahan posisi suatu benda terhadap waktu. Gerak dapat dibedakan menjadi beberapa jenis, antara lain: gerak lurus, gerak melingkar, dan gerak osilasi. Gerak lurus adalah gerak suatu benda dalam lintasan lurus, sedangkan gerak melingkar adalah gerak suatu benda dalam lintasan melingkar. Gerak osilasi adalah gerak suatu benda yang berulang-ulang melalui titik keseimbangan.
    //Gerak lurus sendiri terbagi menjadi dua jenis, yaitu GLB (Gerak Lurus Beraturan) dan GLBB (Gerak Lurus Berubah Beraturan).
    
    //GLB atau Gerak Lurus Beraturan adalah gerak suatu benda dalam lintasan lurus dengan kecepatan tetap. Dalam GLB, percepatan benda adalah nol, sehingga kecepatan benda tidak berubah seiring waktu.
    //GLB dapat dijelaskan dengan rumus: v = s / t, di mana v adalah kecepatan, s adalah jarak yang ditempuh, dan t adalah waktu yang dibutuhkan untuk menempuh jarak tersebut.
    //GLB dapat digambarkan dengan grafik kecepatan terhadap waktu yang berupa garis lurus horizontal, karena kecepatan tetap konstan sepanjang waktu.
    
    //GLBB atau Gerak Lurus Berubah Beraturan adalah gerak suatu benda dalam lintasan lurus dengan percepatan tetap. Dalam GLBB, kecepatan benda berubah seiring waktu karena adanya percepatan.
    //GLBB dapat dijelaskan dengan rumus: v = v0 + a * t, di mana v adalah kecepatan akhir, v0 adalah kecepatan awal, a adalah percepatan, dan t adalah waktu yang dibutuhkan untuk mencapai kecepatan akhir.
    //GLBB dapat digambarkan dengan grafik kecepatan terhadap waktu yang berupa garis lurus miring, karena kecepatan berubah secara linear seiring waktu.
    
    //Selain Gerak Lurus, ada juga Gerak Melingkar yang merupakan gerak suatu benda dalam lintasan melingkar. Gerak Melingkar dapat dibedakan menjadi dua jenis, yaitu Gerak Melingkar Beraturan (GMB) dan Gerak Melingkar Tidak Beraturan (GMTB).
    
    //GMB atau Gerak Melingkar Beraturan adalah gerak suatu benda dalam lintasan melingkar dengan kecepatan sudut tetap. Dalam GMB, percepatan sentripetal bekerja pada benda yang mengarah ke pusat lingkaran.
    //GMB dapat dijelaskan dengan rumus: v = r * ω, di mana v adalah kecepatan linear, r adalah jari-jari lintasan melingkar, dan ω adalah kecepatan sudut.
    //GMB dapat digambarkan dengan grafik kecepatan linear terhadap waktu yang berupa garis lurus horizontal, karena kecepatan linear tetap konstan sepanjang waktu.
    
    //GMTB atau Gerak Melingkar Tidak Beraturan adalah gerak suatu benda dalam lintasan melingkar dengan kecepatan sudut yang berubah-ubah. Dalam GMTB, percepatan sentripetal dan percepatan tangensial bekerja pada benda.
    //GMTB dapat dijelaskan dengan rumus: v = r * ω, di mana v adalah kecepatan linear, r adalah jari-jari lintasan melingkar, dan ω adalah kecepatan sudut yang berubah-ubah.
    //GMTB dapat digambarkan dengan grafik kecepatan linear terhadap waktu yang berupa garis lurus miring, karena kecepatan linear berubah secara linear seiring waktu.
    
    //Selain itu, ada juga Gerak Osilasi yang merupakan gerak suatu benda yang berulang-ulang melalui titik keseimbangan. Gerak Osilasi dapat dibedakan menjadi dua jenis, yaitu Gerak Harmonik Sederhana (GHS) dan Gerak Harmonik Tidak Sederhana (GHTS).
    //GHS atau Gerak Harmonik Sederhana adalah gerak suatu benda yang berulang-ulang melalui titik keseimbangan dengan periode dan amplitudo tetap. Dalam GHS, percepatan benda sebanding dengan simpangan dari titik keseimbangan.
    //GHS dapat dijelaskan dengan rumus: x = A * sin(ω * t + φ), di mana x adalah simpangan, A adalah amplitudo, ω adalah frekuensi sudut, t adalah waktu, dan φ adalah fase awal.
    //GHS dapat digambarkan dengan grafik simpangan terhadap waktu yang berupa gelombang sinusoidal, karena simpangan berubah secara periodik seiring waktu.

    //GHTS atau Gerak Harmonik Tidak Sederhana adalah gerak suatu benda yang berulang-ulang melalui titik keseimbangan dengan periode dan amplitudo yang berubah-ubah. Dalam GHTS, percepatan benda tidak sebanding dengan simpangan dari titik keseimbangan.
    //GHTS dapat dijelaskan dengan rumus yang lebih kompleks, tergantung pada sistem yang diamati, dan biasanya memerlukan analisis numerik untuk memprediksi perilaku gerak.
    //GHTS dapat digambarkan dengan grafik simpangan terhadap waktu yang tidak berbentuk gelombang sinusoidal, karena simpangan berubah secara tidak periodik seiring waktu.

    //Selain itu, ada juga konsep energi dalam fisika, yang merupakan kemampuan suatu benda untuk melakukan kerja. Energi dapat dibedakan menjadi beberapa jenis, antara lain: energi kinetik, energi potensial, energi mekanik, energi panas, dan energi listrik.
    //Energi kinetik adalah energi yang dimiliki oleh suatu benda karena geraknya. Energi kinetik dapat dijelaskan dengan rumus: Ek = 1/2 * m * v^2, di mana Ek adalah energi kinetik, m adalah massa benda, dan v adalah kecepatan benda.
    //Energi potensial adalah energi yang dimiliki oleh suatu benda karena posisinya dalam medan gaya. Energi potensial dapat dijelaskan dengan rumus: Ep = m * g * h, di mana Ep adalah energi potensial, m adalah massa benda, g adalah percepatan gravitasi, dan h adalah ketinggian benda dari titik referensi.
    //Energi mekanik adalah jumlah energi kinetik dan energi potensial yang dimiliki oleh suatu benda. Energi mekanik dapat dijelaskan dengan rumus: Em = Ek + Ep, di mana Em adalah energi mekanik, Ek adalah energi kinetik, dan Ep adalah energi potensial.
    //Energi panas adalah energi yang dimiliki oleh suatu benda karena gerakan partikel-partikelnya. Energi panas dapat dijelaskan dengan rumus: Q = m * c * ΔT, di mana Q adalah energi panas, m adalah massa benda, c adalah kapasitas panas jenis benda, dan ΔT adalah perubahan suhu benda.
    //Energi listrik adalah energi yang dimiliki oleh suatu benda karena adanya muatan listrik. Energi listrik dapat dijelaskan dengan rumus: E = V * I * t, di mana E adalah energi listrik, V adalah tegangan listrik, I adalah arus listrik, dan t adalah waktu.
    
    //Selain itu, ada juga konsep momentum dalam fisika, yang merupakan ukuran dari jumlah gerak suatu benda. Momentum dapat dijelaskan dengan rumus: p = m * v, di mana p adalah momentum, m adalah massa benda, dan v adalah kecepatan benda. Momentum dapat berubah jika ada gaya eksternal yang bekerja pada benda tersebut.
    //Contoh pengaplikasiannya adalah pada tabrakan antara dua benda, di mana momentum total sebelum tabrakan sama dengan momentum total setelah tabrakan, sesuai dengan hukum kekekalan momentum.
    
    //Tugas Efektifitas Cooling Pad dalam menjaga suhu laptop, membuat perbandingan stress test dengan cooling pad dan tanpa cooling pad, serta menganalisis hasil perbedaan suhunya.    

    //untuk materi hari ini cukup sekian.

    //12/09/26 things to learn:

    //13/09/26 things to learn:

    //14/09/26 things to learn:
    
    //15/09/26 things to learn:

    //16/09/26 things to learn:
//Prakdaspro
    //M4 16/09/26








}
