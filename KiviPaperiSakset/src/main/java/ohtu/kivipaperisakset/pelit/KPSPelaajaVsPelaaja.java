package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.pelit.KPS;
import java.util.Scanner;
import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.io.IO;
import ohtu.kivipaperisakset.io.PeliIO;
import ohtu.kivipaperisakset.pelaajat.Ihmispelaaja;
import ohtu.kivipaperisakset.pelaajat.Pelaaja;
import ohtu.kivipaperisakset.pelaajat.TekoalyParannettu;

public class KPSPelaajaVsPelaaja extends KPS{

    public KPSPelaajaVsPelaaja() {
        super(new PeliIO(), new Ihmispelaaja(), new Ihmispelaaja());
    }

    @Override
    public String annaEkanSiirto() {
        return super.annaSiirto(p1, "Ensimmäisen pelaajan siirto: ");
    }
    
    @Override
    public String annaTokanSiirto() {
        return super.annaSiirto(p2, "Toisen pelaajan siirto: ");
    }
    
}