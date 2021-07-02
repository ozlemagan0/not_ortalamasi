import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double matematik, kimya, fizik, biyoloji;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematik=input.nextDouble();

        System.out.print("Kimya notunu giriniz: ");
        kimya=input.nextDouble();

        System.out.print("Fizik notunu giriniz: ");
        fizik=input.nextDouble();

        System.out.print("Biyoloji notunu giriniz: ");
        biyoloji=input.nextDouble();

        double toplam= matematik+kimya+fizik+biyoloji;
        double ortalama= toplam/4;
        System.out.println("Not ortalaması:" + ortalama);
        boolean sonuc= (ortalama>=60);
        String str= sonuc ? ("Sınıfı geçti"):("Sınıfta kaldı");
        System.out.println(str);







    }
}
