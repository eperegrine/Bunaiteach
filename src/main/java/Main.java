import Language.Parser;

/**
 * Created by emilyperegrine on 27/08/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Parser parser = new Parser("print hello\nprint bye");
        parser.RunApp();
    }
}
