import java.util.Scanner;

public class hiphipHorray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Awal:");

        int awal = scanner.nextInt();

        System.out.print("Akhir:");

        int akhir = scanner.nextInt();

        // kode program akan disisipkan di sini 

        for (var i = awal;i<=akhir;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Hip-hip Hooray");
            }else if(i%3==0){
                System.out.println("Hip-hip");
            }else if(i%5==0){
                System.out.println("Hooray");
            }else{
                System.out.println(i);
            }
        }
        scanner.close();
     }
}
