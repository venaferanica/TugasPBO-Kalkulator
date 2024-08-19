
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MIG
 */
public class FileStream {
    
    public void InsertFile(double jari, double volumebola, double permukaanbola){
    try {
            RandomAccessFile filestream = new RandomAccessFile("datastream.txt", "rw");
            
            filestream.seek(filestream.length());
            filestream.writeChars("Jari - Jari \t\t\t\t= "+jari);
            filestream.writeChars("\n\n\n\nVolume Bola \t\t\t\t= "+volumebola);
            filestream.writeChars("\n\n\n\nLuas Permukaan Bola \t\t= "+permukaanbola);
            filestream.writeChars("\n\n\n\n\n\n");
            filestream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
