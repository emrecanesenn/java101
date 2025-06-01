public class Course {
    String name;
    String prefix;
    String code;
    String teacher;
    double note;
    double verbalNote;
    double noteInfluenceRate;
    double verbalNoteInfluenceRate;
    double ortalama;

    Course(String name, String prefix, String code) {
        this.name = name;
        this.prefix = prefix;
        this.code = prefix + code;
        this.note = 0;
        this.noteInfluenceRate = 70;
        this.verbalNote = 0;
        this.verbalNoteInfluenceRate = 30;
        this.ortalama = 0;
    }

    public void addTeacher(Teacher teach) {
        if (this.prefix.equals(teach.branch)) this.teacher = teach.name;
        else System.out.println("UYARI: " + teach.name + " öğretmenin branşı " + this.name + " dersi değildir!");
    }

    public void printTeacher() {
        System.out.println("\nDersin Kodu \t: " + this.code);
        System.out.println("Ders \t: " + this.name);
        System.out.println("Dersin Öğretmeni \t: " + (this.teacher == null ? "Öğretmen bulunamadı." : this.teacher) + "\n");
    }
}
