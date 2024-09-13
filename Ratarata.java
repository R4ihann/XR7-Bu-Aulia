import java.util.Scanner;
public class Ratarata {
    public static void main(String[] args) {
        double RataRata, nilai, totalNilai=0;
        int totalSiswa;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukan jumlah siswa: ");
        totalSiswa = s.nextInt();

        for (int i = 1; i <= totalSiswa; i++) {
            System.out.println("Masukan Nilai Siswa "+i+":");
            nilai=s.nextInt();
            totalNilai= totalNilai+ nilai;
        }
        RataRata=totalNilai/totalSiswa;
        System.out.println("total nilai: "+totalNilai);
        System.out.println("Rata-rata: "+RataRata);

    }
    
}
