import java.util.Scanner;
public class mengukurTinggi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai A:");

        int a = scanner.nextInt();

        System.out.print("Nilai B:");

        int b = scanner.nextInt();


        System.out.print("Nilai C:");

        int c = scanner.nextInt();

        // kode program akan disisipkan di sini
        if(a>b && b>c){
            System.out.println(true);
        }else if (c>b && b>a){
            System.out.println(true);
        }else if(a==b || b==c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scanner.close();
     }


}
