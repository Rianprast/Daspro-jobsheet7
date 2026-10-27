import java.util.Scanner;

public class Tugas1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tiket = 50000;
        double totalTiket = 0, jumlahTiket, totalPenjualan = 0, hargaTiket;
        int i = 1;

        while (true) {
            System.out.print("Masukkan jumlah tiket (Ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextDouble();

            if (jumlahTiket < 0) {
                System.out.print("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid");
                continue;
            }

            if (jumlahTiket == 0) {
                System.out.println("Transaksi selesai.");
                break;
            }

            System.out.println("Transaksi ke: " + i);

            hargaTiket = jumlahTiket * tiket;

            if (jumlahTiket > 10) {
                hargaTiket = hargaTiket - (hargaTiket * 0.15);
                System.out.println("Diskon yang anda dapatkan sebesar 15%");
            } else if (jumlahTiket > 4) {
                hargaTiket = hargaTiket - (hargaTiket * 0.10);
                System.out.println("Diskon yang anda dapatkan sebesar 10%");
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
            }

            System.out.println("total harga tiket yang harus anda bayarkan sebesar: Rp" + hargaTiket);

            totalTiket += jumlahTiket;
            totalPenjualan += hargaTiket;

            i++;
        }

        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total jumlah penjualan tiket sebesar: Rp" + totalPenjualan);
    }
}