import java.util.Scanner;
public class diskonKasir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ketikkan umur:");

        int umur = scanner.nextInt();

        // kode program akan disisipkan di sini 
        if(umur<=12||umur>=65){
            System.out.println("Mendapatkan diskon");
        }else{
            System.out.println("Tidak mendapatkan diskon");
        }
        scanner.close();
     }


}
