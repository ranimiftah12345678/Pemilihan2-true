import java.util.Scanner;

public class BilanganTerbesarLogika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = scanner.nextInt();

        int terbesar = 0;

        if ((bil1 >= bil2) && (bil1 >= bil3)) {
            terbesar = bil1;
        } else if ((bil2 >= bil1) && (bil2 >= bil3)) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
