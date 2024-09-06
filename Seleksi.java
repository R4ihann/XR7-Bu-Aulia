import java.util.Scanner;

public class Seleksi {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Nama Anda: ");
        nama = s.nextLine();
        System.out.print("Masukan Kelas Anda: ");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.println("Perilaku Siswa: (Baik/Kurang)");
            perilaku = s.next();
            if (perilaku.equalsIgnoreCase("baik")) {
                System.out.println("Nilai Siswa: ");
                nilai = s.nextInt();
                if(nilai >=85){
                    System.out.println("Selamat, Ananda "+nama+" dinyatakan lulus!");
                }else{
                    System.out.println("Anda Dinyatakan Tidak Lulus Karena di bawah KKM");
                } 
                
            }else{
                System.out.println("Perilaku Anda Kurang Baik, Anda Dinyatakan Tidak Lulus");
            }
        }else{
            System.out.println("Anda Tidak Dapat Mengikuti Karena Belum Kelas XII");
        }
    }
    
}
