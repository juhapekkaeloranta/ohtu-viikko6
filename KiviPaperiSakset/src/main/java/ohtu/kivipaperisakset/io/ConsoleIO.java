package ohtu.kivipaperisakset.io;

import java.util.Scanner;

/**
 *
 * @author juhapekm
 */
public class ConsoleIO implements IO {
    private Scanner scanner = new Scanner(System.in);

    public ConsoleIO() {
    }
    
    @Override
    public void print(String toPrint) {
        System.out.println(toPrint);
    }
    
    public void printf(String toPrint) {
        System.out.print(toPrint);
    }

    @Override
    public String readLine(String prompt) {
        printf(prompt);
        String nextLine;
        try {
            nextLine = scanner.nextLine();
        } catch (Exception ex) {
            nextLine = "";
        }
        return nextLine;
    }
    
}

