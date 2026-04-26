import java.util.Scanner;

public class LatihanNilai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan = 18;

        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah kehadiran: ");
        float hadir = input.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        float nilaiTugas = input.nextInt();

        System.out.print("Masukkan nilai ujian: ");
        float nilaiUjian = input.nextInt();

        float nilaiAkhir = (nilaiTugas * 0.4f) + (nilaiUjian * 0.6f);
        double persen = (hadir * 100.0) / totalPertemuan;

        System.out.println("\n===== HASIL BELAJAR =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (persen > 75) {
            if (nilaiAkhir >= 85) {
                System.out.println("Grade: A - Sangat Baik");
            } else if (nilaiAkhir >= 75) {
                System.out.println("Grade: B - Baik");
            } else if (nilaiAkhir >= 65) {
                System.out.println("Grade: C - Cukup");
            } else if (nilaiAkhir >= 56) {
                System.out.println("Grade: D - Kurang");
            } else {
                System.out.println("Grade: E - Sangat Kurang");
            }
        } else {
            System.out.println("Grade: E - Kehadiran tidak memenuhi syarat (< 75%)");
        }

        input.close();
    }
}
