package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author juhapekm
 */
public class Summa extends Operaatio {

    public Summa(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        super(sovellus, tulos, syote);
    }

    @Override
    protected void laske(int uusiLuku) {
        super.sovellus.plus(uusiLuku);
    }
    
    


}
