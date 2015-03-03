
package grastatkiuproszczona;

public class ProstyPortal {
    int [] polozeniaPola;
    int wybranePole;
    int trafienie = 0;
    String wynik;
    
    public void setPolaPolozenia(int [] polPol) {
        polozeniaPola = polPol;
    }
    
    String sprawdz(String wybPol){
        wybranePole = Integer.parseInt(wybPol);
        
        for (int pojPol:polozeniaPola){
            wynik = "pudło";
            if (pojPol == wybranePole){
                trafienie++;
                if (trafienie == 3) {wynik = "zatopiony";}
                else {wynik = "trafiony";}
                break;
            }
        }
        return wynik;
    }
}
