import java.util.Scanner;
public class rataRataUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ketikkan nilai pertama:");
        int nilai_a = scanner.nextInt();
        System.out.print("Ketikkan nilai kedua:");
        int nilai_b = scanner.nextInt();
        
        // kode program akan disisipkan di sini 
        int rataRata = (nilai_a+nilai_b)/2;
        if(nilai_a>=60){
            System.out.println("Lulus");
        }else if(rataRata>=70){
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }
        scanner.close();
     }
}
