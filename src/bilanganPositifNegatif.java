import java.util.Scanner;
public class bilanganPositifNegatif {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ketikkan sebuah bilangan:");

        int a = scanner.nextInt();

        // kode program akan disisipkan di sini
        if(a<0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        scanner.close();
     }
}
