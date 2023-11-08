import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        boolean lapar = true;
        String tindakan = "";
        if(lapar){
            tindakan = "makan nasi goreng";
        }
        System.out.println(tindakan);


        System.out.println("Masukan angka = ");
        Scanner inputAngka = new Scanner(System.in);
        int angka = inputAngka.nextInt();
        String status ;
        if(angka % 2 == 0) {
            status = "Angka Genap";
        }else {
            status = "Angka Ganjil";
        }
        System.out.println(angka + " adalah " + status);
    }
}
