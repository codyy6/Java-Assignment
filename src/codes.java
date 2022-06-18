
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cody
 */
public abstract class codes {
    
    public static int countLines(File f) {
    int ln = 1;
        try {
            RandomAccessFile raf = new RandomAccessFile(f,"rw");
            for(int i = 0; raf.readLine() != null; i++){
                ln++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ln;
    }
    
    public static Integer calculate(String checkIn,String checkOut){
        int day = 0;
        SimpleDateFormat dcn = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date in = dcn.parse(checkIn);
            Date out = dcn.parse(checkOut);
            day = (int) ((out.getTime() - in.getTime())/86400000);
        } catch (ParseException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return day;
    }
}
