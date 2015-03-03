
package grastatkiuproszczona;

public class ProstyPortalGra {
    public static void main(String[] args) {
        String wynik = null;
        int iloscRuchow = 0;
        
        int sta = (int) (Math.random() * 5);
        int [] tab= {0,1,2};
        for (int i=0; i<tab.length; i++) {
            tab[i]=tab[i]+sta;
        }
        ProstyPortal prostyportal = new ProstyPortal();
        prostyportal.setPolaPolozenia(tab);
        
        
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
