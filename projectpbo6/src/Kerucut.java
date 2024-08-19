/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Kerucut extends Lingkaran {
    double t;
    double s;
    
    Kerucut(double r, double t, double s) {
        super(r);
        this.t = t;
        this.s = s;
    }
    
    double hitungVolume() {
        return super.hitungLuas() * t / 3;
    }
    
    double hitungLuasPermukaan() {
        return Math.PI * r * (r + s);
    }
}