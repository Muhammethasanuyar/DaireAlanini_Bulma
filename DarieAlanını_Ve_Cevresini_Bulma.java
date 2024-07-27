import java.util.Scanner;

public class DarieAlanını_Bulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen daire yarıçapını giriniz : ");
        int r;
        r = scanner.nextInt();

        double pi = 3.14;
        double alan = Math.pow(r, 2) * pi;
        double cevre = 2 * pi * r;
       
        System.out.print("Dairenin alanı : " + (int)alan);
        System.out.print("\nDairenin çevresi : " + (int)cevre);
    }
}
