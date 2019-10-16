package ba.unsa.etf.rpr.tutorijal1;

//nema ugnjezdavanja klasa, 3 klase unutar jedne klase
//Main.java ne moze imat milion klasa
//Uraditi 4. zadatak na iducem tutorijalu ce biti vezano nesta za njega
public class Sat {
    int sati,minute,sekunde;
    public Sat(int sati, int minute, int sekunde) {
        postavi(sati,minute,sekunde);
    }
    public void postavi(int sati, int minute, int sekunde) {
        this.sati=sati;
        this.minute=minute;
        this.sekunde=sekunde;
    }
    public void sljedeci() {
        this.sekunde++;
        if (this.sekunde==60) { this.sekunde=0; this.minute++; }
        if (this.minute==60) { this.minute=0; this.sati++; }
        if (this.sati==24) this.sati=0;
    }
    public void prethodni() {
        this.sekunde--;
        if (this.sekunde==-1) { this.sekunde=59; this.minute--; }
        if (this.minute==-1) { this.minute=59; this.sati--; }
        if (this.sati==-1) this.sati=23;
    }
   public void pomjeriZa(int pomak) {
        int i = 0;
        if (pomak>0) for (i = 0; i<pomak; i++) sljedeci();
		else for (i = 0; i<-pomak; i++) prethodni();
    }
    final public int dajSate()   { return this.sati; } //final na pocetak, u C++ const iza konstruktora, final ispred klase, metode, atributa. Ispred atrpibuta samo se 1 moze inic, ispred klase ta klasa se ne moze naslijediti to je njen final oblik, ispred metoda to znaci da tu metodu ne mozemo overwrite(overideat metodu), ne moze se mijanjati prilikom nasljedjivanja
    final public int dajMinute() { return this.minute; }
    final public int dajSekunde()  { return this.sekunde; }
    final public void ispisi()  {
        System.out.println(this.sati + ":" + this.minute + ":" + this.sekunde); //Pogledati new, final, static znacenja, sve je veoma bitno
    }
    public static void main(String[] args) {
        Sat s = new Sat(15,30,45);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-48);
        s.ispisi();
        s.postavi(0,0,0);
        s.ispisi();


    }

}


