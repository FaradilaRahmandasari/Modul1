
import java.util.Scanner;

public class Counter10 {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");

        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i = 1; i <= batas; i++) {
            hasil += i;
        }
        System.out.println("Total jumlahnya adalah : " + hasil);
    }
}
