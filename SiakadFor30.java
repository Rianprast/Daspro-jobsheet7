import java.util.Scanner;

public class SiakadFor30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double tertinggi = 100;
        double terendah = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
         }
         
        System.out.println("\n=========== Hasil ========== ");
        System.out.println("Masukkan nilai tertinggi: " + tertinggi);
        System.out.println("Masukkan nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Masukkan Tidak lulus: " + tidakLulus);
            

     }
}