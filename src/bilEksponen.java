import java.util.Scanner;
public class bilEksponen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan dasar:");

        int dasar = scanner.nextInt();

        System.out.print("Bilangan eksponen:");

        int eksponen = scanner.nextInt();

        int akumulator=1;
        //akumulator= akumulator*dasar;
        
        // kode program akan disisipkan di sini 

        for(int i=akumulator; i <= eksponen; i++){
            akumulator= akumulator*dasar;
        }
        System.out.println(akumulator);
        scanner.close();
     }

    
}
