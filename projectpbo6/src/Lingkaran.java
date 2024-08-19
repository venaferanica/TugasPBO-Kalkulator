/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.Math;

class Lingkaran {
    double r;
    
    Lingkaran(double r) {
        this.r = r;
    }
    
    double hitungLuas() {
        return Math.PI * r * r;
    }
    
    double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}

