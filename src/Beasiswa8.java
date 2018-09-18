
import java.util.Scanner;

public class Beasiswa8 {
    
    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();
        
        if((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat Beasiswa");
    }
    
}

