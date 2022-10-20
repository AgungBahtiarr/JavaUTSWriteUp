import java.util.Scanner;
public class lamaWaktuTidur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai A:");

        int a = scanner.nextInt();

        System.out.print("Nilai B:");

        int b = scanner.nextInt();


        System.out.print("Nilai T:");

        int t = scanner.nextInt();

        // kode program akan disisipkan di sini
        // T besar
        if(t<a){
            System.out.println("Kurang Tidur");
        }else if (t>b){
            System.out.println("Tidur berlebih");
        }else{
            System.out.println("Cukup");
        }
        scanner.close();
     }
}
