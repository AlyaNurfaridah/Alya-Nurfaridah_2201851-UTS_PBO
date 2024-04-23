class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Constructor tanpa parameter
    public LimasSegiEmpat() {
        this.luasAlas = 1;
        this.luasSelubungLimas = 1;
        this.tinggi = 1;
    }

    // Constructor dengan parameter
    public LimasSegiEmpat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }

    // Method menghitung luas 
    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Method menghitung volume 
    public double getVolume() {
        return (luasAlas * tinggi) / 3;
    }

    // Setter untuk luas alas
    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }

    // Setter untuk luas selubung limas
    public void setLuasSelubungLimas(double luasSelubungLimas) {
        this.luasSelubungLimas = luasSelubungLimas;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
