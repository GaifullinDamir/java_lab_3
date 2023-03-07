public class UI {

    private Processor _processor;

    public UI(){
        _processor = new Processor();
    }
    private static void showMenu(){
        System.out.println("\n" +
                "1. Ввести массив чисел для расчета в консоль.\n" +
                "2. Ввести массив чисел из файла.\n" +
                "3. Завершить работу.\n"
        );
    }

    public void appCycle(){

        boolean run = true;
        String choose;
        while(run){
            showMenu();
            System.out.print("\nСделайте выбор:");
            choose = Reader.readConsoleString();
            switch(choose){
                case "1":
                    String[] consoleInpStrArr = Reader.readConsoleStringArgs();
                    String filePath = Reader.readFilePath();
                    int[] resArr1 = _processor.GetSumEvenOddNumbers(consoleInpStrArr);
                    String resMessage1 = Writer.resultToStringMessage(resArr1);
                    System.out.println(resMessage1);
                    Writer.writeFile(resMessage1, filePath);
                    break;
                case "2":
                    System.out.print("\nФайл для получения данных");
                    String inFilePath = Reader.readFilePath();
                    String[] fileInpStrArr = Reader.readFileStringArgs(inFilePath);
                    int[] resArr2 = _processor.GetSumEvenOddNumbers(fileInpStrArr);
                    String resMessage2 = Writer.resultToStringMessage(resArr2);
                    System.out.println("\nФайл для вывода данных");
                    String outFilePath = Reader.readFilePath();
                    System.out.println(resMessage2);
                    Writer.writeFile(resMessage2, outFilePath);
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Такого пункта нет.");
                    break;

            }
        }
    }
}
