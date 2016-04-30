package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author juhapekm
 */
public abstract class Operaatio implements Komento {
    protected Sovelluslogiikka sovellus;
    protected JTextField syote;
    protected JTextField tulos;
    protected int edellinenTulos;

    public Operaatio(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus = sovellus;
        this.tulos = tulos;
        this.syote = syote;
    }

    @Override
    public void execute() {
        int arvo = getSyote();
        edellinenTulos = sovellus.tulos();
        laske(arvo);
        asetaTulosRuudulle();
    }
    
    private int getSyote() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syote.getText());
        } catch (Exception e) {
        }
        return arvo;
    }
    
    private void asetaTulosRuudulle() {
        int laskunTulos = sovellus.tulos();
        syote.setText("");
        tulos.setText("" + laskunTulos);
    }
    
    protected abstract void laske(int uusiLuku);

    @Override
    public void peru() {
        sovellus.asetaTulos(edellinenTulos);
        asetaTulosRuudulle();
    }

}
