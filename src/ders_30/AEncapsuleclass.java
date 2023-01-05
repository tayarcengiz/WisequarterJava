package ders_30;

public class AEncapsuleclass {

    private String hastaneismi="YILDIZ HASTANESI";//Hastane ismi gorulsun ama degistirilemesin
    public void setHastaucreti(int hastaucreti) {
        this.hastaucreti = hastaucreti;
    }
    public String getHastaneismi() {
        return hastaneismi;
    }
    // hastane ismi gorebilsin ama degistiremesin, getter methodu layim

    //hasta ucretleride giris zapabilsin ama ucreti sigortadan alinacagi icin
    //personel hasta ucretlerini goremesin  //  setter methodu lazim


    private int hastaucreti;// Hasta ucreti girilebilsin ama degistirilemesin-
    private String hemsireismi="Ayse hemsire";
    private String hemsireadresi;
    // bu bilgilere herkes ulasabilsin.akla ilk publi geliyor.
    // bu variableleri public yapma yerine private yapip getter ve setter yapmak
    // ayni oslevi goruru.daha anlamli olur.


    public String getHemsireadresi() {
        return hemsireadresi;
    }

    public void setHemsireadresi(String hemsireadresi) {
        this.hemsireadresi = hemsireadresi;
    }

    public String getHemsireismi() {
        return hemsireismi;
    }

    public void setHemsireismi(String hemsireismi) {
        this.hemsireismi = hemsireismi;
    }
}
