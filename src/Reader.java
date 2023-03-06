import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.*;

public class Reader {

    public static String[] readConsoleStringArgs(){
        Scanner _sc = new Scanner(System.in);
        String resultStr;
        resultStr = _sc.nextLine();
        String[] resultStrArr = resultStr.split(" ");

        return resultStrArr;
    }

    public static String[] readFileStringArgs(String inPath){
        String[] resultStrArr;
        try{
            BufferedReader br = new BufferedReader (new FileReader(inPath));

            String inStr;

            if((inStr = br.readLine()) != null){
                resultStrArr = inStr.split(" ");
                return resultStrArr;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        resultStrArr = new String[]{};
        return resultStrArr;
    }
}
