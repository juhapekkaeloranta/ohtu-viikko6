package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.pelit.KPS;
import java.util.Scanner;
import ohtu.kivipaperisakset.pelaajat.Tekoaly;
import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.io.IO;
import ohtu.kivipaperisakset.io.PeliIO;
import ohtu.kivipaperisakset.pelaajat.Ihmispelaaja;
import ohtu.kivipaperisakset.pelaajat.Pelaaja;

public class KPSTekoaly extends KPS{

    public KPSTekoaly() {
        super(new PeliIO(), new Ihmispelaaja(), new Tekoaly());
    }

    @Override
    public String annaEkanSiirto() {
        return super.annaSiirto(p1, "Ensimmäisen pelaajan siirto: ");
    }

    @Override
    public String annaTokanSiirto() {
        return super.annaSiirto(p2, "");
    }  
}