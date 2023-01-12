package PROGRAM_ANTRIAN;
import java.util.Scanner;

public class antrianRS {
    public static void main(String[] args) {
        boolean ulang = true; // UNTUK PER-ULANGAN WHILE
        int urutan = 001; // UNTUK ANGKA ANTRIAN KELAS VVIP
        int b = 001; //UNTUK ANGKA ANTRIAN KELAS BPJS
        while (ulang) {
            Scanner inputUser = new Scanner(System.in);
            System.out.println("selamat datang di rumah sakit bayu");
            System.out.println("silahkan ambil antrian");
            System.out.println(" 1. untuk VVIP");
            System.out.println(" 2. untuk BPJS");
            System.out.println(" 3. untuk keluar");
            System.out.println("pencet angka untuk memilih : ");
            var input = inputUser.nextInt(); // UNTUK MENERIMA INPUT YANG BERSIFAT INT
           if (input == 1) {
            System.out.println("==== RSUD PASAR MINGGU ====");
            System.out.println("|| \tkelas VVIP   \t ||");
            System.out.println("||   NOMOR ANTRIAN ANDA  ||");
            System.out.println("-------------------");
            System.out.println("|   A " +  urutan + "   |");
            System.out.println("-------------------");
            urutan++; //INCREMENT
           }else if(input == 2){
            System.out.println("==== RSUD PASAR MINGGU ====");
            System.out.println("|| \tkelas BPJS   \t ||");
            System.out.println("||   NOMOR ANTRIAN ANDA  ||");
            System.out.println("-------------------");
            System.out.println("|   B " +  b + "   |");
            System.out.println("-------------------");
            b++; //INCREMENT
           }else if(input == 3){ //JIKA MEMILILH 3 MAKA AKAN KELUAR DARI PROGRAM
            break;
           }else{ //JIKA PILIHAN TIDAK DITEMUKAN
            System.out.println("pilihan tidak ditemukan silahkan memilih dengan benar");
           }
        }
    }
    private static void main(){
       
    }
    
    // protected static void vvip(){
    //     boolean input = true;
        
    //     while(input){
    //         int urutan = 1;
    //         System.out.println("RSUD PASAR MINGGU");
    //         System.out.println("kelas VVIP ");
    //         System.out.println("NOMOR ANTRIAN ANDA");
    //         System.out.println("-------------------");
    //         System.out.println("|   A " +  urutan + "   |");
    //         System.out.println("-------------------");
    //         urutan++;
    //         break;
    //     }
        
       
    // }
    // protected static void bpjs(){
       
    //     boolean input = true;
    //     while (input) {
    //         int b = 1;  
    //         System.out.println("RSUD PASAR MINGGU");
    //         System.out.println("kelas BPJS ");
    //         System.out.println("NOMOR ANTRIAN ANDA");
    //         System.out.println("-------------------");
    //         System.out.println("|   B " +  b + "   |");
    //         System.out.println("-------------------");
    //         b++;
    //         main();
    //     }
       
    // }
}
