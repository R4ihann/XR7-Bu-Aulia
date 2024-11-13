import java.util.Scanner;

public class Function {
    static void jumlah(double a, double b){
        double jumlah;
        jumlah= a+b;
        System.out.println("Hasil: "+jumlah);
    };
    static void kurang(double a, double b){
        double kurang;
        kurang= a-b;
        System.out.println("Hasil: "+kurang);
    };
    static void kali(double a, double b){
        double kali;
        kali= a*b;
        System.out.println("Hasil: "+kali);
    };
    static void bagi(double a, double b){
        double bagi;
        bagi= a+b;
        System.out.println("Hasil: "+bagi);
    };

    public static void main(String[] args) {
        jumlah(5, 8);
        kurang(5, 8);
        jumlah(5, 8);
        jumlah(5, 8);
    }
   


    // static void panggilNama(String nama) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Hello " + nama + "!");
    // }

    // public static void main(String[] args) {
    //     panggilNama("Raihan");
    //     panggilNama("Varo");
    //     panggilNama("Naufal");
    //     panggilNama("Rafly");

    // }
}