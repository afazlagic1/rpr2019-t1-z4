package ba.unsa.etf.rpr;

public class Korpa {
  private int finale maksUKorpi = 50;
  private Artikl[] artikl = new Artikl[maksUKorpi];
  private int trenutnoUKorpi = 0;
  public Artikl[] getArtikli() {
    return artikl;
  }
  public boolean dodajArtikl(Artikl x) {
    if(trenutnoUKorpi < maksUKorpi) {
      artikl[trenutnoUKorpi++] = x;
      return true;
    }
    return false;
  }
  public Artikl izbaciArtiklSaKodom(String kodart) {
    for(int i = 0; i < trenutnoUKorpi; i++) {
      if(artikl[i]!=null && artikl[i].getKod().equals(kodart)) {
        Artikl pomocni = artikl[i];
        for(int j=i; j<trenutnoUKorpi - 1; j++) {
          artikl[j] = artikl[j+1];
      }
        artikli[--trenutnoUKorpi] = null;
        return pomocni;
    }
  }
    return null;
  }
  public int dajUkupnuCijenuArtikala() {
    int suma = 0;
    for(int i=0; i<trenutnoUKorpi; i++) {
      if(artikl[i] != null) {
        suma += artikl[i].getCijena();
      }
    }
    return suma;
  }
}
