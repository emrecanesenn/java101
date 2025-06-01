public class Main {
public static void main(String[] args) {

    // Ders Ekleme
    Course biyoloji = new Course("Biyoloji", "BYO", "101");
    Course matematik = new Course("Matematik", "MAT", "102");
    Course turkce = new Course("Türkçe", "TURK", "103");

    // Öğretmen Ekleme
    Teacher mehmet = new Teacher("Mehmet", "90501 568 7465", "BYO");
    Teacher ayse = new Teacher("Ayşe", "90554 785 3248", "MAT");
    Teacher emre = new Teacher("Emre", "90544 124 9564", "TURK");

    // Derse Öğretmen Ekleme
    biyoloji.addTeacher(mehmet);
    matematik.addTeacher(ayse);
    turkce.addTeacher(emre);

    // Öğrenci Ekleme
    Student ogrenciZeynep = new Student("Zeynep", 256984, "101", matematik, biyoloji, turkce);
    Student ogrenciMelike = new Student("Melike", 645328, "102", matematik, biyoloji, turkce);
    Student ogrenciAlperen = new Student("Alperen", 413584, "103", matematik, biyoloji, turkce);

    // Öğrenci Notları Ekleme
    System.out.println("----------------------------------");

    ogrenciZeynep.addBulkExamNote(90, 80, 90);
    ogrenciZeynep.addBulkVerbalNote(90, 80, 90);
    ogrenciZeynep.isPass();
    System.out.println("----------------------------------");


    ogrenciMelike.addBulkExamNote(80, 90, 80);
    ogrenciMelike.addBulkVerbalNote(80, 90, 80);
    ogrenciMelike.isPass();
    System.out.println("----------------------------------");


    ogrenciAlperen.addBulkExamNote(55, 64, 48);
    ogrenciAlperen.addBulkVerbalNote(34, 48, 44);
    ogrenciAlperen.isPass();


    System.out.println("----------------------------------");

    System.out.println("\n--- Öğretmenler ---");
    biyoloji.printTeacher();
    matematik.printTeacher();
    turkce.printTeacher();
}
}
