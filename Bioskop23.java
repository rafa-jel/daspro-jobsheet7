import java.util.Scanner;
public class Bioskop23 {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int totalTiket = 0, jmlTiket, hargaTiket = 50000;
    double totalTiket1Hari = 0, totalHarga;

    while (true) {
        System.out.print("Masukan jumlah tiket yang dibeli (0 untuk keluar) = ");
        jmlTiket = sc.nextInt();

        if (jmlTiket < 0) {
            System.out.println("INVALID, Masukan jumlah yang valid");
            continue;
        }
        if (jmlTiket == 0) {
            break;
        }

        totalHarga = jmlTiket * hargaTiket;

        if (jmlTiket > 10) {
            totalHarga *= 0.85;
        }
        else if (jmlTiket > 4) {
            totalHarga *= 0.90;
        }

        totalTiket1Hari += totalHarga;
        totalTiket += jmlTiket;

        System.out.println("Total harga untuk " + jmlTiket + " tiket = Rp " + totalHarga);
    }

    System.out.println("Tiket yang terjual hari ini = " + totalTiket);
    System.out.println("Total pendapatan hari ini = " + totalTiket1Hari);
}

}
