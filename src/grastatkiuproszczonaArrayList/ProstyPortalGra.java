
package grastatkiuproszczonaArrayList;

import java.util.ArrayList;

public class ProstyPortalGra {
    public static void main(String[] args) {
        String wynik = null;
        int iloscRuchow = 0;
        int sta = (int) (Math.random() * 5);
        int [] tab= {0,1,2};
        for (int i=0; i<tab.length; i++) {
            tab[i]=tab[i]+sta;
        }
        ArrayList<String> polozenia = new ArrayList<String>();
        polozenia.add(Integer.toString(tab[0]));
        polozenia.add(Integer.toString(tab[1]));
        polozenia.add(Integer.toString(tab[2]));
        
        ProstyPortal prostyportal = new ProstyPortal();
        prostyportal.setPolaPolozenia(polozenia);
        
        while (!"zatopiony".equals(wynik)){ 
            PomocnikGry pomocnikgry = new PomocnikGry();
            String wybranaLiczba = pomocnikgry.pobierzDaneWejsciowe("Podaj liczbę ");
            wynik = prostyportal.sprawdz(wybranaLiczba);
            System.out.println(wynik);
            iloscRuchow++;
        }
        System.out.println(iloscRuchow+" ruchów");
    }
}
