import java.util.Scanner;

public class modifMainSum17 {
    
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
    
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int elm = sc17.nextInt();
    
        modifClassSum17 sm[]= new modifClassSum17[elm];
        for(int i=0; i<elm; i++){
            sm[i] = new modifClassSum17();
            System.out.println("============================================================");
            System.out.println("Perusahaan ke -"+(i+1));
            System.out.print("Masukkan Jumlah Bulan : ");
            sm[i].elemen = sc17.nextInt();
        
            sm[i].keuntungan = new double[sm[i].elemen];
        
            System.out.println("============================================================");
            for(int j=0; j<sm[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke -"+(j+1)+" = ");
                sm[i].keuntungan[j] = sc17.nextDouble();
            }
        }
        System.out.println("============================================================");
        modifClassSum17 dat =new modifClassSum17();
        for(int i=0; i<sm.length; i++){
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.println("Jumlah Bulan : "+sm[i].elemen);
            System.out.println();
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungam perusahaan selama "+sm[i].elemen+" bulan adalah : %.2f ", dat.totalBF(sm[i].keuntungan));
            System.out.println();
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungam perusahaan selama "+sm[i].elemen+" bulan adalah : %.2f ", dat.totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            System.out.println("\n============================================================");
        }
    }
}