import java.util.Scanner;

public class NilaiKehadiranKurang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan = 21;
        float hadir;
        float nilai;

        System.out.print("Masukkan jumlah kehadiran: ");
        hadir = input.nextInt();

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        
        double persen = (hadir * 100.0) / totalPertemuan;

        
        if (persen < 75) {

            if (nilai > 55) {
                System.out.println("Nilai: 55");
                System.out.println("Grade: D");
            } else {
                System.out.println("Nilai Semester: E");
                System.out.println("Grade: E");
            }

        } else {
            System.out.println("Kehadiran memenuhi syarat (>75%)");
        }

        input.close();
    }
}
