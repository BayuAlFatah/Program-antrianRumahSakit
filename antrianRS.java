package PROGRAM_ANTRIAN;

import java.util.Scanner;

public class antrianRS {
    
    protected static void vvip(){
        int a = 1;
        boolean input = true;
        while(input){
            System.out.println("NOMOR ANTRIAN ANDA");
            System.out.println("kelas VVP");
        break;
        }
       
    }
    protected static void bpjs(){
        int b = 1;
        System.out.println("NOMOR ANTRIAN ANDA");
        System.out.println("kelas BPJS ");
    }

    public static void main(String[] args) {
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
           switch(input){
            case 1 -> vvip();
            case 2 -> bpjs();
           } 
        }
        
    }
}
