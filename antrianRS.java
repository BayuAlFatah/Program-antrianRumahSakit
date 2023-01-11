package PROGRAM_ANTRIAN;
import java.util.Scanner;

public class antrianRS {
    public static void main(String[] args) {
       main();
        
    }
    private static void main(){
        boolean ulang = true;
        while (ulang) {
            Scanner inputUser = new Scanner(System.in);
            System.out.println("selamat datang di rumah sakit bayu");
            System.out.println("silahkan ambil antrian");
            System.out.println(" 1. untuk VVIP");
            System.out.println(" 2. untuk BPJS");
            System.out.println(" 3. untuk keluar");
            System.out.println("pencet angka untuk memilih : ");
            var input = inputUser.nextInt();
           if (input == 1) {
            vvip();
           }else if(input == 2){
            bpjs();
           }else if(input == 3){
            break;
           }else{
            System.out.println("pilihan tidak ditemukan silahkan memilih dengan benar");
           }
        }
    }
    
    protected static void vvip(){
        boolean input = true;
        
        while(input){
            int urutan = 1;
            System.out.println("RSUD PASAR MINGGU");
            System.out.println("kelas VVIP ");
            System.out.println("NOMOR ANTRIAN ANDA");
            System.out.println("-------------------");
            System.out.println("|   A " +  urutan + "   |");
            System.out.println("-------------------");
            urutan++;
            break;
        }
        
       
    }
    protected static void bpjs(){
       
        boolean input = true;
        while (input) {
            int b = 1;  
            System.out.println("RSUD PASAR MINGGU");
            System.out.println("kelas BPJS ");
            System.out.println("NOMOR ANTRIAN ANDA");
            System.out.println("-------------------");
            System.out.println("|   B " +  b + "   |");
            System.out.println("-------------------");
            b++;
            main();
        }
       
    }
}
