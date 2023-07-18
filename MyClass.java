import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      int mat,fiz, kimya, turkce, tarih, muzik;
      Scanner s=new Scanner(System.in);
      mat= s.nextInt();
      fiz= s.nextInt();
      kimya= s.nextInt();
      turkce= s.nextInt();
      tarih= s.nextInt();
      muzik= s.nextInt();
      double ortalama =(mat+fiz+kimya+turkce+tarih+muzik)/6.0;
      while(ortalama >= 60){
          System.out.print("Sınıfı Geçti");
          break;
      }
      while(ortalama < 60){
          System.out.print("Sınıfta Kaldı");
          break;
      }
    }
}