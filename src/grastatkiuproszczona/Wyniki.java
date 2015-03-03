package grastatkiuproszczona;

class Wyniki {
  public static void main(String[] args) {
    Wyniki w = new Wyniki();
    w.doDziela();
  }

  void doDziela() {
    String [] mojaTbl = new String[2];
    String a = "aaaaaaa";
    String b = "bbbbbbb";
    
    mojaTbl[0]=a;
    mojaTbl[1]=b;
    
    String x = "bbbbbbb";
    boolean czyJest = false;
    for (String moja:mojaTbl) {
        if (moja.equals(x)) {
            czyJest = true;
            break;
        }
    }
    System.out.println(czyJest);
  }
} 