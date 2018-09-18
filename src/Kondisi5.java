
import java.util.Scanner;

public class Kondisi5 {

    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO : ");
        nilai = masukan.nextInt();
        if (nilai < 70) {
            System.out.println("Siswa tidak lulus");
        }
        if (nilai > 70) {
            System.out.println("Siswa lulus");
        }

    }
}
