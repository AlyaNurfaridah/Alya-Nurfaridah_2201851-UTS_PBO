public class Main {
    public static void main(String[] args) {
        // Membuat objek limasSegiEmpat pertama
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        limas1.setLuasAlas(1);
        limas1.setLuasSelubungLimas(1);
        limas1.setTinggi(1);
        System.out.println("Limas segi empat dengan luas alas " + limas1.luasAlas + ", luas selubung limas: " + limas1.luasSelubungLimas + " dan tinggi: " + limas1.tinggi + ". Luasnya " + limas1.getLuas() + ", sedangkan volumenya " + limas1.getVolume());

        // Membuat objek limasSegiEmpat kedua
        LimasSegiEmpat limas2 = new LimasSegiEmpat();
        limas2.setLuasAlas(30);
        limas2.setLuasSelubungLimas(40);
        limas2.setTinggi(50);
        System.out.println("Limas segi empat dengan luas alas: " + limas2.luasAlas + ", luas selubung limas " + limas2.luasSelubungLimas + " dan tinggi: " + limas2.tinggi + ". Luasnya " + limas2.getLuas() + ", sedangkan volumenya: " + limas2.getVolume());

        // Membuat objek limasSegiEmpat ketiga
        LimasSegiEmpat limas3 = new LimasSegiEmpat();
        limas3.setLuasAlas(25);
        limas3.setLuasSelubungLimas(35);
        limas3.setTinggi(45);
        System.out.println("Limas segi empat dengan luas alas: " + limas3.luasAlas + ", luas selubung limas: " + limas3.luasSelubungLimas + " dan tinggi: " + limas3.tinggi + ". Luasnya " + limas3.getLuas() + ", sedangkan volumenya: " + limas3.getVolume());
    }
}
