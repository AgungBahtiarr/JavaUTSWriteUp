import java.util.Scanner;
public class tambahTambah {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Awal:");

        int awal = scanner.nextInt();

        System.out.print("Akhir:");

        int akhir = scanner.nextInt();

        int akumulator = 0;

        // kode program akan disisipkan di sini 
        for(int i=awal;i<=akhir;i++){
            akumulator = akumulator+i;
        }
        System.out.println(akumulator);

        scanner.close();
     }
}
