import java.io.*;
import java.util.*;

public class Writer {
    public static String resultToStringMessage(int[] resArr){
        String resultStr;
        if(resArr.length >= 2) {
            resultStr = "Сумма нечетных чисел: " + resArr[0] + "\n" +
                    "Сумма четных чисел: " + resArr[1];
        }
        else{
            resultStr = "В массиве не достаточно элементов";
        }
        return resultStr;
    }


    public static void writeFile(String message, String outPath){
        try{
            File file = new File(outPath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            try{
                bw.newLine();
                bw.write(message);
            }finally {
                bw.close();
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
