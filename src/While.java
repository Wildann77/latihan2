import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("Masukan Angka = ");
        Scanner InputUser = new Scanner(System.in);
        int number = InputUser.nextInt();
        int batas_atas = 30;

        while (number <= batas_atas){
            System.out.println("Angka = "+ number);
            number++;

        }
    }
}
