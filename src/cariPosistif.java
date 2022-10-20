import java.util.Scanner;
public class cariPosistif {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai A:");

        int a = scanner.nextInt();

        System.out.print("Nilai B:");

        int b = scanner.nextInt();


        System.out.print("Nilai C:");

        int c = scanner.nextInt();

        // kode program akan disisipkan di sini
        
        int cek[] = {a,b,c};
        int test = 0;

        //buat for each
        for (int i : cek) {
            if(i>0){
                test++;
            }
        }
        if(test==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scanner.close();
     }
}
