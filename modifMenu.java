import java.util.Scanner;

public class modifMenu{
    public static void main(String[] args) {
    Scanner sc17 = new Scanner (System.in);

    pangkat17[]png = new pangkat17[5];
    png[0] = new pangkat17(5, 2);
    png[1] = new pangkat17(10, 2);
    png[2] = new pangkat17(15, 4);
    png[3] = new pangkat17(20, 2);
    png[4] = new pangkat17(25, 2);

    System.out.println("===========================================");
    System.out.println("                Menu Pangkat               ");
    System.out.println("========================================== ");
    System.out.println("1. Menggunakan Brute Force ");
    System.out.println("2. Menggunakan Devide Conquer ");
    System.out.println("3. exit ");
    System.out.print("Silahkan Pilih Metode Perhitungan : ");
    int pilih = sc17.nextInt();

    switch(pilih){
        case 1 :
        System.out.println("============================================");
        System.out.println("Hasil pangkat dengan Brute force ");     
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        break;
        case 2 :
        System.out.println("============================================");
        System.out.println("Hasil pangkat dengan Devide Conquer ");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        break;
        case 3 :
        System.out.println("------------Terima Kasih---------");
        break;
        default :
        System.out.println("------ input yang anda masukkan salah -------");
    }
}
}