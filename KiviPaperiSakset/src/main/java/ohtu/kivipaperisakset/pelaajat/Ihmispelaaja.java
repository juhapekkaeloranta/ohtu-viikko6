package ohtu.kivipaperisakset.pelaajat;

import ohtu.kivipaperisakset.io.IO;
import ohtu.kivipaperisakset.io.PeliIO;

/**
 *
 * @author juhapekm
 */
public class Ihmispelaaja implements Pelaaja{ 
    private IO io = new PeliIO();
    
    @Override
    public String annaSiirto() {
        return io.readLine("");
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
        //ei tehdä mitään
    }
    
    @Override
    public String getNimi() {
        return "Pelaaja";
    }

}
