import java.util.Scanner;
public class Parkiran23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kendaraan, durasi;
        double totalPembayaran = 0, biaya = 0;
        
        System.out.println("Jenis kendaraan (1 = mobil, 2 motor, 0 = keluar)");
        
        while (true) {
            System.out.print("Masukan jenis kendaraan = ");
            kendaraan = sc.nextInt();

            if (kendaraan == 0) {
                break;
            }
            System.out.print("Durasi parkir = ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid");
                continue;
            }
            if (durasi > 5) {
                biaya = 12500;
            }
            else {
                if (kendaraan == 1) {
                    biaya = 3000 * durasi;
                }
                else if (kendaraan == 2) {
                    biaya = 2000 * durasi;
                }
                else {
                    System.out.println("Jenis kendaraan tidak valid");
                }
            }
            totalPembayaran += biaya;
            System.out.println("Biaya parkir = Rp " + biaya);
            
        }
        System.out.println("Total akumulasi pembayaran parkir = " + totalPembayaran);
    }
}
