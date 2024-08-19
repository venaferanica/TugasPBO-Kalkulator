class JuringBola extends Bola {
    double t;
    
    JuringBola(double r, double t) {
        super(r);
        this.t = t;
    }
    
    double hitungVolume() {
        return (2.0 / 3.0) * Math.PI * r * r * t;
    }
    
    double hitungLuasPermukaan() {
        return 2.0 * Math.PI * r * t + Math.PI * r * t;
    }
}