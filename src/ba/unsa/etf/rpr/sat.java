package ba.unsa.etf.rpr;

public class sat {
private  int sati,minute,sekunde;

  sat(int sat, int min, int sek){
    sati=sat; minute=min; sekunde=sek;

  }
 public void Postavi(int sat, int min,int sek){
    this.sati=sat;
    this.minute=min;
    this.sekunde=sek;
 }

 public void Sljedeci(){
   sekunde++;
   if (sekunde==60) { sekunde=0; minute++; }
   if (minute==60) { minute=0; sati++; }
   if (sati==24) sati=0;

 }
 public void Prethodni() {
   sekunde--;
   if (sekunde==-1) { sekunde=59; minute--; }
   if (minute==-1) { minute=59; sati--; }
   if (sati==-1) sati=23;
 }

 public void PomjeriZa(int pomak) {
   if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<-pomak; i++) Prethodni();
 }

  public int DajSate()  { return sati; }
  public int DajMinute()  { return minute; }
  public int DajSekunde()  { return sekunde; }

  public void Ispisi(){
    System.out.println(sati+":"+minute+":"+sekunde);
  }

}
