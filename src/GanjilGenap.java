import java.util.Scanner;
public class GanjilGenap {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.print("Ketikkan bilangan bulat:");

       int angka = scanner.nextInt();

       // kode program akan disisipkan di sini 
       if(angka%2==0){
        System.out.println("Genap");
       }else{
        System.out.println("Ganjil");
       }
       scanner.close();
    }
    

}
