import java.util.Scanner;
public class pembagi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Awal:");

        int awal = scanner.nextInt();

        System.out.print("Akhir:");

        int akhir = scanner.nextInt();


       System.out.print("Pembagi:");

       int pembagi = scanner.nextInt();

        int jumlah = 0;

        // kode program akan disisipkan di sini 
        for(int i=awal;i<=akhir;i++){
            if(i%pembagi==0){
                jumlah++;
            }
        }
        System.out.println(jumlah);

        scanner.close();

        System.out.println(-10 * (3 + 4) / 2);
     }
}
