package ba.unsa.etf.rpr;

public class Supermarket {
  private int final maksUSupermarketu = 1000;
  private Artikl[] artikl = new Artikl[maksUSupermarketu];
  private int trenutnoUSupermarketu = 0;
  public Artikl[] getArtikli() {
    return artikl; 
  }
  void dodajArtikl(Artikl a) {
    if(trenutnoUSupermarketu < maksUSupermarketu) {
    artikl[trenutnoUSupermarketu++] = new Artikl(a);
    }
  }
  public Artikl izbaciArtiklSaKodom(String kodart) {  //istafunkcijakaoukorpi
    for(int i = 0; i < trenutnoUSupermarketu; i++) {
       if(artikl[i]!=null && artikl[i].getKod().equals(kodart)) {
        Artikl pomocni = artikl[i];
        for(int j=i; j<trenutnoUSupermarketu - 1; j++) {
          artikl[j] = artikl[j+1];
      }
        artikli[--trenutnoUSupermarketu] = null;
        return pomocni;
    }
  }
    return null;
  }
}
