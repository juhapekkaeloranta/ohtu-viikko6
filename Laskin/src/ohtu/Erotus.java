package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author juhapekm
 */
public class Erotus extends Operaatio {

    public Erotus(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        super(sovellus, tulos, syote);
    }


    @Override
    protected void laske(int uusiLuku) {
        super.sovellus.miinus(uusiLuku);
    }

}
