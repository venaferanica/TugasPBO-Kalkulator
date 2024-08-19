public class Tabung extends Geometri {
    private double radius;
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}
