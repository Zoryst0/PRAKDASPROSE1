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
    //


    //GLB atau Gerak Lurus Beraturan adalah gerak suatu benda dalam lintasan lurus dengan kecepatan tetap. Dalam GLB, percepatan benda adalah nol, sehingga kecepatan benda tidak berubah seiring waktu.
    //GLBB atau Gerak Lurus Berubah Beraturan adalah gerak suatu benda dalam lintasan lurus dengan percepatan tetap. Dalam GLBB, kecepatan benda berubah seiring waktu karena adanya percepatan.








}
