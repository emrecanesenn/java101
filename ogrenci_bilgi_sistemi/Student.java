public class Student {
    String name;
    String classes;
    int stuNo;
    Course matematik;
    Course biyoloji;
    Course turkce;
    double avarage;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course matematik, Course biyoloji, Course turkce) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.matematik = matematik;
        this.biyoloji = biyoloji;
        this.turkce = turkce;
        this.isPass = false;
    }

    public void addBulkExamNote(int matematikNote, int biyolojiNote, int turkceNote) {
        if (matematikNote >= 0 && matematikNote <=100) {
            this.matematik.note = matematikNote;
        }
        if(biyolojiNote >= 0 && biyolojiNote <=100) {
            this.biyoloji.note = biyolojiNote;
        }
        if(turkceNote >= 0 && turkceNote <=100) {
            this.turkce.note = turkceNote;
        }
    }

    public void addBulkVerbalNote(int matematikVerbalNote, int biyolojiVerbalNote, int turkceVerbalNote) {
        if (matematikVerbalNote >= 0 && matematikVerbalNote <=100) {
            this.matematik.verbalNote = matematikVerbalNote;
        }
        if(biyolojiVerbalNote >= 0 && biyolojiVerbalNote <=100) {
            this.biyoloji.verbalNote = biyolojiVerbalNote;
        }
        if(turkceVerbalNote >= 0 && turkceVerbalNote <=100) {
            this.turkce.verbalNote = turkceVerbalNote;
        }
    }

    public void calcAvarage() {
        this.matematik.ortalama = (this.matematik.note * (this.matematik.noteInfluenceRate / 100)) + (this.matematik.verbalNote * (this.matematik.verbalNoteInfluenceRate / 100));
        this.biyoloji.ortalama = (this.biyoloji.note * (this.biyoloji.noteInfluenceRate / 100)) + (this.biyoloji.verbalNote * (this.biyoloji.verbalNoteInfluenceRate / 100));
        this.turkce.ortalama = (this.turkce.note * (this.turkce.noteInfluenceRate / 100)) + (this.turkce.verbalNote * (this.turkce.verbalNoteInfluenceRate / 100));
        this.avarage = (this.matematik.ortalama + this.biyoloji.ortalama + this.turkce.ortalama) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage >= 55;
    }

    public void isPass() {
        isPass = isCheckPass();
        printNote();
        if(isPass) System.out.println("Durum \t: Sınıfı Geçti.");
        else System.out.println("Durum \t: Sınıfta Kaldı.");
    }

    public void printNote() {
        System.out.println("\nNotlar\n");
        System.out.println("Öğrencinin Adı \t: " + this.name + "\n");
        System.out.println("Öğrenci No \t: " + this.stuNo + "\n");
        System.out.println("Matematik \t: " + String.format("%.2f", this.matematik.ortalama) + "\n");
        System.out.println("Biyoloji \t: " + String.format("%.2f", this.biyoloji.ortalama) + "\n");
        System.out.println("Türkçe \t: " + String.format("%.2f", this.turkce.ortalama) + "\n");
        System.out.println("Ortalama \t: " + String.format("%.2f", this.avarage) + "\n");
    }

}
