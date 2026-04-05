import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hari = 7;

        double[] absen = new double[hari];
        double[] uts = new double[hari];
        double[] uas = new double[hari];

        double totalAbsen = 0, totalUTS = 0, totalUAS = 0;

       
        for (int i = 0; i < hari; i++) {
            System.out.println("Hari ke-" + (i + 1));

            System.out.print("Nilai Absen: ");
            absen[i] = input.nextDouble();
            totalAbsen += absen[i];

            System.out.print("Nilai UTS: ");
            uts[i] = input.nextDouble();
            totalUTS += uts[i];

            System.out.print("Nilai UAS: ");
            uas[i] = input.nextDouble();
            totalUAS += uas[i];

            System.out.println();
        }

        
        double rataAbsen = totalAbsen / hari;
        double rataUTS = totalUTS / hari;
        double rataUAS = totalUAS / hari;

        
        double nilaiAkhir = (rataAbsen * 0.2) + (rataUTS * 0.4) + (rataUAS * 0.4);

        
        System.out.println("===== HASIL =====");
        System.out.println("Total Absen: " + totalAbsen);
        System.out.println("Total UTS: " + totalUTS);
        System.out.println("Total UAS: " + totalUAS);

        System.out.println("Rata-rata Absen: " + rataAbsen);
        System.out.println("Rata-rata UTS: " + rataUTS);
        System.out.println("Rata-rata UAS: " + rataUAS);

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        input.close();
    }
}
