import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        
        if (nilai < 0 || nilai > 95) {
            System.out.println("Nilai tidak valid!");
        } else {

            
            if (nilai >= 75) {
                System.out.println("Status: LULUS");
            } else {
                System.out.println("Status: TIDAK LULUS");
            }

            String grade;
            if (nilai >= 95) {
                grade = "A";
            } else if (nilai >= 75) {
                grade = "B";
            } else if (nilai >= 65) {
                grade = "C";
            } else if (nilai >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }

            
            System.out.println("Nama  : " + nama);
            System.out.println("Nilai : " + nilai);
            System.out.println("Grade : " + grade);
        }

        input.close();
    }
}