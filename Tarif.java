import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
        String platNomor;
        int jumlahJam;
        double harga;

        Scanner s = new Scanner(System.in);
        System.out.print("Masukan plat nomor: ");
        platNomor = s.nextLine();
        System.out.print("Jumlah jam: ");
        jumlahJam = s.nextInt();

        if (jumlahJam >0 && jumlahJam <=1){
            harga = 3500;
        }else if(jumlahJam >1 && jumlahJam <=4){
            harga = 7500;
        }else if(jumlahJam>4){
            harga = 10000;
        }else {
            harga = 0;
            System.out.println("System Error");
        }

        System.out.println("Plat nomor anda:"+platNomor);
        System.out.println("Tarif Anda: "+harga);
        s.close();
        

    }

    
}