
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MIG
 */
public class InsertDatabase {
    
    Connector Conn = new Connector();
        
        public void InsertDB(double jari, double tinggi, double luas, double keliling, double volumetabung, double permukaantabung, double volumekerucut, double permukaankerucut){
            try {
                String query = "INSERT INTO `hasil`(`Jari-jari`, `Tinggi`, `LuasLingkaran`, `KelilingLingkaran`, `VolumeTabung`, `PermukaanTabung`, `VolumeKerucut`, `PermukaanKerucut`) VALUES ('"+jari+"', '"+tinggi+"', '"+luas+"', '"+keliling+"', '"+volumetabung+"', '"+permukaantabung+"', '"+volumekerucut+"', '"+permukaankerucut+"')";
                Conn.statement = Conn.Conn.createStatement();
                Conn.statement.executeUpdate(query);
                Conn.statement.close();
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        
}
