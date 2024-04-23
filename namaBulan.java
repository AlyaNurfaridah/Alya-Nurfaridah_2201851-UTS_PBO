import java.util.Scanner;

public class namaBulan {
    public static void main(String[] args) {
        // Membuat objek dari kelas Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nomor bulan
        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();
        
        // Menutup scanner setelah selesai digunakan
        scanner.close();
        
        // Menampilkan nama bulan dalam bahasa Indonesia sesuai dengan nomor bulan yang dimasukkan pengguna
        switch (nomorBulan) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;
            default:
                System.out.println("Nomor bulan tidak valid.");
        }
    }
}
