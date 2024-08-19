/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class Tembereng extends Bola {
    double t;
    
    Tembereng(double r, double t) {
        super(r);
        this.t = t;
    }
    
    double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * t * t * (3 * r - t);
    }
    
    double hitungLuasPermukaan() {
        return 2.0 * Math.PI * t;
    }
}