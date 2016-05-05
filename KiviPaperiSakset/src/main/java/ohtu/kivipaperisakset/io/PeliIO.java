package ohtu.kivipaperisakset.io;

/**
 *
 * @author juhapekm
 */
public class PeliIO implements IO {
    private IO io = new ConsoleIO();
    
    @Override
    public void print(String toPrint) {
        io.print(toPrint);
    }

    @Override
    public String readLine(String prompt) {
        return io.readLine(prompt);
    }

}
