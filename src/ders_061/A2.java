package ders_061;
import java.util.Arrays;
public class A2 {
    public static void main(String[] args) {
        String name="Semra";//kelimeninharfleriarrayi:[S, e, m, r, a]
        kelimeninharfleriarrayi(name);
        kelimeninharfleriarrayi("Star");//kelimeninharfleriarrayi:[S, t, a, r]
    }
    public static void kelimeninharfleriarrayi(String input){
        char[] output =new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
                output[i]=input.charAt(i);
        }
        System.out.println("kelimeninharfleriarrayi:"+ Arrays.toString(output));
    }
}
