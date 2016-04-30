package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author juhapekm
 */
public class Nollaa extends Operaatio {
    private boolean enabled;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        super(sovellus, tulos, syote);
    }
    

    @Override
    protected void laske(int uusiLuku) {
        super.sovellus.nollaa();
    }

}
