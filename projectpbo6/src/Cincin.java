class Cincin extends Bola {
    double tinggi;

    Cincin(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 2 * Math.PI * r * tinggi;
    }

    double hitungVolume() {
        return (4.0/3.0 * Math.PI * Math.pow(r, 3)) - (1.0/3.0 * Math.PI * Math.pow(tinggi, 2) * (3*r - tinggi));
    }
}