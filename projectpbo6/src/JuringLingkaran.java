public class JuringLingkaran extends Lingkaran {
    double sudut;
    
    JuringLingkaran(double r, double sudut) {
        super(r);
        this.sudut = sudut;
    }
    
    double hitungLuasJuring() {
        return Math.PI * r * r * sudut / 360;
    }
    
    double hitungPanjangBusur() {
        return 2 * Math.PI * r * sudut / 360;
    }
    
    double hitungLuasPermukaanTabungJuring(double t) {
        return 2 * hitungLuasJuring() + hitungPanjangBusur() * t;
    }
}