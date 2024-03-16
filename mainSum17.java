import java.util.Scanner;

public class mainSum17{
    public static void main(String[] args) {
    Scanner sc17 = new Scanner (System.in);

    System.out.println("==============================");
    System.out.println("program menghitung keuntungan total (satuan juta. misal 5.9)");
    System.out.print("Masukkan jumlah bulan : ");
    int elm = sc17.nextInt();

    sum17 sm = new sum17 (elm);

    System.out.println("==================================");
    for (int i = 0; i < sm.elemen; i++) {
        System.out.print("masukan untung bulan ke-"+(i+1)+" = ");
        sm.keuntungan[i] = sc17.nextDouble();
    }
    System.out.println("========================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
    System.out.println("========================================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
 }
}
