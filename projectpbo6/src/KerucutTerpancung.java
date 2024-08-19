/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class KerucutTerpancung extends Kerucut {
    double t2;
    double s2;
    
    KerucutTerpancung(double r1, double t1, double s1, double r2) {
        super(r1, t1, s1);
        this.t2 = t2;
        this.s2 = s2;
        this.r = r2;
    }
    
    double hitungVolume() {
        double v1 = super.hitungVolume();
        double v2 = Math.PI * r * r * t2 / 3;
        return v1 - v2;
    }
    
    double hitungLuasPermukaan() {
        double lp1 = super.hitungLuasPermukaan();
        double lp2 = Math.PI * r * s2;
        return lp1 + lp2;
    }
}