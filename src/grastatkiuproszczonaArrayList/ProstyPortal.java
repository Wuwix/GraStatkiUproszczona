
package grastatkiuproszczonaArrayList;

import java.util.ArrayList;

public class ProstyPortal {
    private ArrayList<String> polozeniaPola = new ArrayList<String>();
    
    public void setPolaPolozenia(ArrayList<String> polPol) {
        polozeniaPola = polPol;
//        System.out.println("polozeniaPola: "+polozeniaPola.get(0));
    }
    
    String sprawdz(String wybPol){
        String wynik = "pudlo";
        String ruch = wybPol;
        
        int index = polozeniaPola.indexOf(ruch);
//        System.out.println("polozeniaPola: "+polozeniaPola.get(1)+" ruch: "+ruch+" index: "+index);
        if (index >= 0){
            polozeniaPola.remove(index);
            if (polozeniaPola.isEmpty()){
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            } 
            
        }
        return wynik;
    }
}
