
import java.util.Scanner;

public class PilihanKondisi7 {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Faradila Rahmandasari");
        System.out.println("X RPL 6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");

        Scanner masukan = new Scanner(System.in);
        System.out.print("Silahkan pilih angka 1-3 : ");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1:
                System.out.println("Satu");
                System.out.println("Dua");
                System.out.println("Tiga");
                break;
            case 2:
                System.out.println("Satu");
                System.out.println("Dua");
                System.out.println("Tiga");
                break;
            case 3:
                System.out.println("Satu");
                System.out.println("Dua");
                System.out.println("Tiga");
        }

    }

}
