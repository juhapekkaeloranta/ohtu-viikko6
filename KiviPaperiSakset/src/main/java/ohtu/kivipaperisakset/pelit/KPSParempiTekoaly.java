package ohtu.kivipaperisakset.pelit;

import java.util.Scanner;

import java.util.Scanner;
import ohtu.kivipaperisakset.pelaajat.TekoalyParannettu;
import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.io.IO;
import ohtu.kivipaperisakset.io.PeliIO;
import ohtu.kivipaperisakset.pelaajat.Ihmispelaaja;
import ohtu.kivipaperisakset.pelaajat.Pelaaja;
import ohtu.kivipaperisakset.pelaajat.Tekoaly;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {

    public KPSParempiTekoaly() {
        super(new PeliIO(), new Ihmispelaaja(), new TekoalyParannettu(20));
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
