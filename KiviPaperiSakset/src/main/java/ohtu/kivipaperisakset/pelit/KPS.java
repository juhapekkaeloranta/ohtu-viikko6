package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.io.ConsoleIO;
import java.util.Scanner;
import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.pelaajat.Tekoaly;
import ohtu.kivipaperisakset.io.IO;
import ohtu.kivipaperisakset.pelaajat.Pelaaja;

/**
 *
 * @author juhapekm
 */
public abstract class KPS {
    protected IO io;  
    protected Pelaaja p1;
    protected Pelaaja p2;

    public KPS(IO io, Pelaaja p1, Pelaaja p2) {
        this.io = io;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public abstract String annaEkanSiirto();
    public abstract String annaTokanSiirto();
    
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = annaEkanSiirto();
        String tokanSiirto = annaTokanSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            tulostaTilanne(tuomari.toString());

            ekanSiirto = annaEkanSiirto();
            tokanSiirto = annaTokanSiirto();
        }

        lopetusViesti(tuomari.toString());
    }
    
    protected String annaSiirto(Pelaaja p, String viesti) {
        io.print(viesti);
        String siirto = p.annaSiirto();
        io.print(p.getNimi() + " valitsi: " + siirto);
        io.print("");
        return siirto;
    }
    
//    protected String annaIhmisenSiirto(String viesti) {
//        return io.readLine(viesti + "\n");
//    }
//    
//    protected String annaTekoalynSiirto(Pelaaja aly) {
//        String siirto = aly.annaSiirto();
//        io.print("Tietokone valitsi: " + siirto);
//        return siirto;
//    }
    
    protected void tulostaTilanne(String tilanne) {
        io.print(tilanne);
        io.print("");
    }
    
    protected void lopetusViesti(String tilanne) {
        io.print("");
        io.print("Kiitos!");
        io.print(tilanne);
    }

    protected boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
