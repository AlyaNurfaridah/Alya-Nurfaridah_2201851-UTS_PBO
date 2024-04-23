import java.util.Scanner;

public class jumlahDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputan user
        System.out.print("Masukkan bilangan bulat: ");
        long bilangan = scanner.nextLong();

        // Metode untuk menghitung jumlah digit
        int jumlahDigit = sumDigits(bilangan);

        // Menampilkan jumlah digit
        System.out.println("Jumlah digit dalam bilangan " + bilangan + " adalah: " + jumlahDigit);

        // Menampilkan hasil proses dari penjumlahan
        System.out.println(jumlahDigit + " merupakan hasil penjumlahan dari bilangan " + bilangan);

        scanner.close();
    }

    // Metode untuk menghitung jumlah digit dalam bilangan bulat
    public static int sumDigits(long n) {
        // Inisialisasi variabel jumlah digit
        int jumlah = 0;

        // Looping
        while (n != 0) {
            // Mengambil digit terakhir dengan menggunakan operator %
            int digit = (int) (n % 10);
            // Menambahkan digit ke jumlah
            jumlah += digit;
            // Menghapus digit terakhir dengan menggunakan operator /
            n /= 10;
        }

        // Mengembalikan jumlah digit
        return jumlah;
    }
}
