
import java.util.Scanner;
import Multithreading.MultiThreading;

public class Main {
    public static void main(String[] args) {
        
        Lingkaran lingkaran = new Lingkaran(5.0);
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());

        Tabung tabung = new Tabung(5.0, 10.0);
        System.out.println("Volume tabung: " + tabung.hitungVolume());
        System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());

        Kerucut kerucut = new Kerucut(5.0, 10.0, 12.0);
        System.out.println("Volume kerucut: " + kerucut.hitungVolume());
        System.out.println("Luas permukaan kerucut: " + kerucut.hitungLuasPermukaan());

        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(5.0, 3.0, 10.0, 8.0);
        System.out.println("Volume kerucut terpancung: " + kerucutTerpancung.hitungVolume());
        System.out.println("Luas permukaan kerucut terpancung: " + kerucutTerpancung.hitungLuasPermukaan());

        Bola bola = new Bola(5.0);
        System.out.println("Volume bola: " + bola.hitungVolume());
        System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());

        JuringLingkaran juringLingkaran = new JuringLingkaran(5.0, 60.0);
        System.out.println("Luas juring lingkaran: " + juringLingkaran.hitungLuas());
        System.out.println("Keliling juring lingkaran: " + juringLingkaran.hitungKeliling());
        System.out.println("Panjang busur juring lingkaran: " + juringLingkaran.hitungPanjangBusur());
        System.out.println("Luas permukaan tabung juring lingkaran: " + juringLingkaran.hitungLuasPermukaanTabungJuring(10.0));

        JuringBola juringBola = new JuringBola(5.0, 10.0);
        System.out.println("Volume juring bola: " + juringBola.hitungVolume());
        System.out.println("Luas permukaan juring bola: " + juringBola.hitungLuasPermukaan());

        Tembereng tembereng = new Tembereng(5.0, 30.0);
        System.out.println("Luas tembereng: " + tembereng.hitungLuas());
        System.out.println("Volume tembereng: " + tembereng.hitungKeliling());
        
        Keratan keratan = new Keratan(5.0, 3.0);
        System.out.println("Luas Keratan: " + keratan.hitungLuas());
        System.out.println("Volume Keratan: " + keratan.hitungVolume());
        
        Cincin cincin = new Cincin(5.0, 3.0);
        System.out.println("Luas Cincin: " + cincin.hitungLuas());
        System.out.println("Volume Cincin: " + cincin.hitungVolume());
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jumlah Thread Genap Yang di inginkan : ");
        int threadGenap = input.nextInt();
        
        System.out.println("Masukan Jumlah Thread Genap Yang di inginkan : ");
        int threadGanjil = input.nextInt();
        InsertDatabase idb = new InsertDatabase();
        }
}
