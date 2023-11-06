import java.util.Scanner;

public class TugasIndividu114 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // input jumlah baris dan kolom
        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        // outer loop baris
        for (int i = 1; i <= N; i++) {
            // inner loop untuk spasi, jika jumlahnya 5 maka akan dikurangi i disetiap baris
            for (int j = 1; j <= (N - i); j++) {
                System.out.print(" ");
            }
            // inner loop angka
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // new line
            System.out.println();
        }

        sc.close();
    }
}
