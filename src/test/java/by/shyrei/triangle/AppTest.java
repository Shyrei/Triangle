package by.shyrei.triangle;

import org.junit.Test;
/**
 * Project Triangle
 * Created on 29.05.2017.
 * author Uladzimir
 */
public class AppTest {

    private App app = new App();
    private static final String path = "files//line.txt";

    @Test
    public void runApp() throws Exception {
        app.runApp(path);
        //System.out.println(Storage.map.entrySet());
        //TODO Уточнить у Игоря Николаевича
    }
}