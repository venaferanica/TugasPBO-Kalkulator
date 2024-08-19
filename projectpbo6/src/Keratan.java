class Keratan extends Bola {
    double tinggi;

    Keratan(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 2 * Math.PI * r * tinggi;
    }

    double hitungVolume() {
        return (1.0/2.0 * Math.PI * r * r) + (1.0/2.0 * Math.PI * r * r) + (1.0/6.0 * Math.PI * tinggi * tinggi * tinggi);
    }
}