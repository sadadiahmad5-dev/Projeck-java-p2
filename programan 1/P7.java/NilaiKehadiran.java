import java.util.Scanner;

public class NilaiKehadiran {
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

        if (persen > 75) {
            System.out.println("Nilai: " + nilai);
            if (nilai >= 85) {
                System.out.println("Grade: A");
            } else if (nilai >= 75) {
                System.out.println("Grade: B");
            } else if (nilai >= 65) {
                System.out.println("Grade: C");
            } else if (nilai >= 56) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
        } else {
            System.out.println("Kehadiran kurang dari 75%, nilai tidak diproses.");
        }

        input.close();
    }
}
