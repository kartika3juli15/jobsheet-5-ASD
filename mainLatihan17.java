import java.util.Scanner;
public class mainLatihan17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang ingin dihitung akarnya: ");
        int jumlahBilangan = sc17.nextInt();

        latihan17[] akar = new latihan17[jumlahBilangan];
        for (int i = 0; i < jumlahBilangan; i++) {
            akar[i] = new latihan17(); 
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            akar[i].nilai = sc17.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Brute Force");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarPangkatDuaBF(akar[i].nilai));
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Divide and Conquer");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarPangkatDuaDC(akar[i].nilai, 0, akar[i].nilai));
        }
        System.out.println("=======================================================");
    }
}