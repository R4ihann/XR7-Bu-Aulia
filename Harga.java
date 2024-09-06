import java.util.Scanner;

public class Harga {
    public static void main(String[] args) {
        double total, diskon, potHar;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukan total pembelian anda: ");
        total = s.nextDouble();

        if(total>150000){
            diskon = 0.1*total;
            potHar =
            total -= diskon;
        }else if (total >10000) {
            diskon =0;
            potHar = 5000; 
            total -= potHar;
        } else {
            diskon = 0;
            potHar = 0;
        }

        



        System.out.println("Diskon: " +diskon);
        System.out.println("Potongan Harga: " +potHar);
        System.out.println("Total yang harus di bayarkan: "+total);
        s.close();
        
    }
    
}
