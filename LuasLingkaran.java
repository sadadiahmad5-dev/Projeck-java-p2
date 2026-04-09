package p2.p2 ;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan jari-jari: ");
        double r = in.nextDouble();

        double luas = Math.PI * r * r;

        System.out.println("Luas Lingkaran: " + luas);
        in.close();
    }
}