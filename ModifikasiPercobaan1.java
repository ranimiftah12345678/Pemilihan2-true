import java.util.Scanner;
public class ModifikasiPercobaan1 {
     public static void main(String[] args) {
        Scanner inputAbsen25 = new Scanner(System.in);
        System.out.println("Masukkan tahun");
        int tahun = inputAbsen25.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        inputAbsen25.close();
     }
}