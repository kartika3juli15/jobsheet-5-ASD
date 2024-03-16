import java.util.Scanner;

public class MainFaktorial17{
    public static void main(String[] args) {
    Scanner sc17 = new Scanner (System.in);
    System.out.println("========================");
    System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
    int elemen = sc17.nextInt();

    Faktorial17[] fk = new Faktorial17[elemen];
    for (int i = 0; i < elemen; i++){
        fk[i] = new Faktorial17();
        System.out.print("masukkan nilai data ke-" + (i+1) + " : ");
        fk[i].nilai = sc17.nextInt();
    }
    System.out.println("===============================");
    System.out.println("Hasil Faktorial dengan Brute Force");
    for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
    }
    System.out.println("==============================");
    System.out.println("hasil faktorial dengan divide dan conquer");
    for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
    System.out.println("===============================");
    long awal = System.nanoTime();
    System.out.println("Waktu awal : " + String.valueOf(awal) + " detik");
    long akhir = System.nanoTime(); 
    System.out.println("waktu akhir : " + String.valueOf(akhir) + " detik ");
    long elapsTime = akhir - awal;
    System.out.println("interval waktu : " + String.valueOf(elapsTime)+ " detik");
}
}