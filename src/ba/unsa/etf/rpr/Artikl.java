package ba.unsa.etf.rpr;

public class Artikl {
  private String imeart;
  private int cijenaart;
  private String kodart;
  Artikl(String imeart, int cijenaart, String kodart) {
    this.imeart = imeart; this.cijenaart = cijenaart; this.kodart = kodart;
}
  public Artikl(Artikl a) {
      imeart = a.imeart; cijenaart = a.cijenaart; kodart = a.kodart;
    }
  public String getNaziv() {
    return imeart;
  }
  public int getCijena() {
    return cijenaart; 
  }
  public String getKod() {
    return this.kodart;
  }
}
