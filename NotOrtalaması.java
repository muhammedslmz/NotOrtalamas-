import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya,turkce,tarih,muzik;

        Scanner giris = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat= giris.nextInt();

        System.out.print("Fizik not unuzu giriniz:");
        fizik= giris.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya= giris.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce= giris.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih= giris.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik= giris.nextInt();

        int toplam= mat+fizik+kimya+tarih+turkce+muzik;
        double sonuc= toplam/6;
        System.out.println("Ortalamanız:"+sonuc);



        String b = (sonuc>=60)? "Tebrikler geçtiniz.":"Kaldınız.";
        System.out.println(b);
    }
}
