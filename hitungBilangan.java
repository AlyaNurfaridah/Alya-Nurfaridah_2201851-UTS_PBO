import java.util.Scanner;

public class hitungBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inisialisasi variabel
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int jumlahBilangan = 0;
        
        // Inputan user
        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");
        
        // Membaca input dari user untuk perhitungan
        int bilangan = scanner.nextInt();
        while (bilangan != 0) {
            if (bilangan > 0) {
                jumlahPositif++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
            }
            
            // Menambahkan nilai bilangan ke total jika bukan nol
            if (bilangan != 0) {
                total += bilangan;
                jumlahBilangan++;
            }
            
            // Membaca input berikutnya dari pengguna
            bilangan = scanner.nextInt();
        }
        
        // Menampilkan output
        System.out.println("jumlah bilangan positif = " + jumlahPositif);
        System.out.println("jumlah bilangan negatif = " + jumlahNegatif);
        System.out.println("nilai total = " + total);
        
        // Menghitung dan menampilkan output (tidak termasuk nol)
        double rataRata = (jumlahBilangan > 0) ? total / jumlahBilangan : 0;
        System.out.println("rata-rata nilai = " + rataRata);
        
        scanner.close();
    }
}
