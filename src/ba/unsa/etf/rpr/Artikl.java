package ba.unsa.etf.rpr;

public class Artikl {
  private String imeart;
  private int cijenaart;
  private String kodart;
  Artikal(String i, c, k) {
    imeart = i; cijenaart = c; kodart = k;
}
  public Artikal(Artikal a) {
      imeart = a.imeart; cijenaart = a.cijenaart; kodart = a.kodart;
    }
  public String getNaziv() {
    return imeart;  
  }
  public int getCijena() {
    return cijenaart; 
  }
  public String getKod() {
    return kodart; 
  }
}
