
public class Main {
    private final static Processor _processor = new Processor();
    public static void main(String[] args) {
//        String[] inpStr = Reader.readConsoleStringArgs();
        String[] inpStr = Reader.readFileStringArgs("in.txt");
        int[] resultArr;

        try{
            resultArr = _processor.GetSumEvenOddNumbers(inpStr);

            Writer.writeFile(resultStr, "log.txt");
            _processor.PrintOddAndEvenNums(resultArr);
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}