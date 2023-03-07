
public class Main {
    private final static UI _ui = new UI();
    public static void main(String[] args) {

        try{
            _ui.appCycle();
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}