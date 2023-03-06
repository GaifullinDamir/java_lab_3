
public class Main {
    private final static Processor _processor = new Processor();
    public static void main(String[] args) {
//        String[] inpStr = Reader.readConsoleStringArgs();
        String[] inpStr = Reader.readFileStringArgs("in.txt");
        int[] resultArr;

        try{
            resultArr = _processor.GetSumEvenOddNumbers(inpStr);
            String resultStr = "Сумма нечетных чисел: " + resultArr[0] + "\n" +
                    "Сумма четных чисел: " + resultArr[1];
            Writer.writeFile(resultStr, "out.txt");
            _processor.PrintOddAndEvenNums(resultArr);
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}