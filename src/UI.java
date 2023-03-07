public class UI {

    private static void showMenu(){
        System.out.println("\n" +
                "1. Ввести массив чисел для расчета в консоль.\n" +
                "2. Ввести массив чисел из файла.\n" +
                "3. Завершить работу.\n"
        );
    }


    public static void appCycle(){
        Processor processor = new Processor();
        boolean run = true;
        String choose;
        while(run){
            showMenu();
            System.out.print("\nСделайте выбор:");
            choose = Reader.readConsoleString();
            switch(choose){
                case("1"):
                    String[] consoleInpStrArr = Reader.readConsoleStringArgs();
                    String filePath = Reader.readFilePath();
                    int[] resArr = processor.GetSumEvenOddNumbers(consoleInpStrArr);
                    String resMessage = Writer.resultToStringMessage(resArr);
                    Writer.writeFile(resMessage, filePath);
                    break;
                case("2"):
                    System.out.print("\nФайл для получения данных\n");
                    String inFilePath = Reader.readFilePath();
                    String[] fileInpStrArr = Reader.readFileStringArgs()

            }
        }
    }
}
