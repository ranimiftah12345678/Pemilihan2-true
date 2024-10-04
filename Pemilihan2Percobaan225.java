import java.util.Scanner;
public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner absen25 = new Scanner(System.in);
        System.out.println("_________");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("_________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Buding (Ricebowl + Ice Tea)");
        System.out.println("____________");
        System.out.print("masukkan angka dari menu yang anda pilih = ");
        byte pilihan_menu = absen25.nextByte();
        absen25.nextLine();
        Double total_bayar;
        double harga;
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = absen25.nextLine();
        System.out.println("________________");
    

        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga budling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }


            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } 
        else if (member.equalsIgnoreCase("n")) {
           
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga budling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("________________");
    
    }
}