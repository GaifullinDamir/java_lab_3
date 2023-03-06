import java.io.*;
import java.util.*;

public class Writer {
    public static void writeConsole(String message){
        System.out.println(message);
    }

    public static void writeFile(String message, String outPath){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(outPath));
            try{
                bw.write(message);
            }finally {
                bw.close();
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
