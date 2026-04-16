package latconsole;

public class Mahasiswa {

    String nim, nama;
    double uts, uas, nilaiakhir;
    String grade;

    // Method hitung nilai akhir
    public double getNilaiAkhir() {
        nilaiakhir = (uts + uas) / 2;
        return nilaiakhir;
    }

    // Method menentukan grade
    public String getGrade() {
        if (nilaiakhir < 50)
            grade = "E";
        else if (nilaiakhir < 60)
            grade = "D";
        else if (nilaiakhir < 70)
            grade = "C";
        else if (nilaiakhir < 80)
            grade = "B";
        else
            grade = "A";

        return grade;
    }
}
