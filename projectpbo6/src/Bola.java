class Bola extends Lingkaran {
    Bola(double r) {
        super(r);
    }
    
    double hitungVolume() {
        return 4 * super.hitungLuas() * r / 3;
    }
    
    double hitungLuasPermukaan() {
        return 4 * super.hitungLuas();
    }
}