package nesne_yonelimli_programlama;

public class MainAraba {

 public static void main(String[] args) {
araba araba1 = new araba();
araba araba2 =new araba();
  
araba1.marka= "Mustang";
araba2.marka= "Ford";

araba1.model="eleanor";
araba2.model="focus";

araba1.renk="black";
araba2.renk="Grey";


araba1.fiyat=150000;
araba2.fiyat=120000;

araba1.printAll();
araba2.printAll();

araba1.hiz = 200;
araba2.hiz = 130;

araba1.speedUp(50);
araba2.speedUp(30);
System.out.println(araba1.speedUp);
System.out.println(araba2.speedUp);

araba1.firenlemek(30);
araba1.firenlemek(50);

System.out.println(araba1.firenlemek);
System.out.println(araba2.firenlemek);

 }

 
}
