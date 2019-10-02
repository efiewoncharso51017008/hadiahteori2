import java.util.Scanner;
public class nilaimhs {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String nama ;
        char grade ; 
        double   n_tugas1 , n_tugas2 , n_tugas3, nmid , nfinal  ;
        double n_akhir;
        double  nratatugas    ;
        
        
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Nilai tugas 1 : ");
        n_tugas1 = input.nextInt();
        System.out.print("Nilai tugas 2 : ");
        n_tugas2 = input.nextInt();
        System.out.print("Nilai tugas 3 : ");
        n_tugas3 = input.nextInt();
        System.out.print("Nilai MID : ");
        nmid = input.nextInt();
        System.out.print("Nilai Final : ");
        nfinal = input.nextInt();
        System.out.println();
        
        nratatugas = (n_tugas1 + n_tugas2 + n_tugas3)/3;

       	n_akhir = (nratatugas * 0.3 + nmid * 0.3 + nfinal * 0.4);
      
       	
        if (n_akhir >= 80 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 60 && n_akhir < 79){
            grade = 'B';
        }
        else if (n_akhir > 50 && n_akhir < 59){
            grade = 'C';
        }
        else if (n_akhir > 40 && n_akhir < 49){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        
        System.out.println(nama+" dengan Grade "+grade+" memiliki nilai akhir "+n_akhir);
        
     
        }
    }
   
   