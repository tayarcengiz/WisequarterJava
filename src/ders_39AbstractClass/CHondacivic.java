package ders_39AbstractClass;

public class CHondacivic extends BHonda{
    @Override
    public void motor() {
        System.out.println("honda civic vteck tekn kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("honda civic  sedan veya hb kullanir");
    }

    @Override
    public void tekerlek() {
        System.out.println("honda civic 205*155 teker kullanir");
    }

    @Override
    public void yakit() {

    }

    @Override
    public void guvenlik() {

    }

    public static void main(String[] args) {


        CHondacivic civic1 = new CHondacivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelteknoloji();

    }
}
