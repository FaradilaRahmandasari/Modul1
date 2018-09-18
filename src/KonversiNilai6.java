
import java.util.Scanner;

public class KonversiNilai6 {

    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan nilai WEB : ");
        int nilai = masukan.nextInt();
        
        if (nilai >= 90)
            System.out.println("Nilai A");
        else if (nilai >= 75)
            System.out.println("NIlai B");
        else if (nilai >= 50)
            System.out.println("NIlai C");
        else if (nilai >= 35)
            System.out.println("NIlai D");
        else
            System.out.println("Nilai E");
    }
}    

