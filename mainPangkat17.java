import java.util.Scanner;

public class mainPangkat17{
    public static void main(String[] args) {
    Scanner sc17 = new Scanner (System.in);

    System.out.println("==============================");
    System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
    int elemen = sc17.nextInt();

    pangkat17[] png = new pangkat17[elemen];

    for (int i = 0; i < elemen; i++) {
       png[i] = new pangkat17();
       System.out.print("masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
       png[i].nilai = sc17.nextInt();
       System.out.print("masukkan nilai pemangkat ke-" + (i+1) + " : ");
       png[i].pangkat = sc17.nextInt();
    }

    System.out.println("===================================");
    System.out.println("hasil pangkat dengan Brute Force");
    for (int i = 0; i < elemen; i++) {
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : " +png[i].pangkatBF(png[i].nilai, png[i].pangkat)); 
    }
    System.out.println("===================================");
    System.out.println("hasil pangkat dengan Divide and Conquer");
    for (int i = 0; i < elemen; i++) {
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : " +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
    }
}
}