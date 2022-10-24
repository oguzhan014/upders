package bolum_2;
import java.util.Scanner;
public class FaizHesaplama {

 
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("vizeyi gir:"); double vize = input.nextDouble();
System.out.println("finali gir:"); double vize2 = input.nextDouble();
System.out.println("proje yi gir:"); double proje = input.nextDouble();
System.out.println("labs i gir"); double labs = input.nextDouble();

double toplam= (vize*30/100)+(vize2*20/100)+(proje*25/100)+(labs*25/100);
System.out.println(toplam);
int i;
 
switch(i){

case 1:
  if(toplam<100 && toplam>=90 )
  System.out.println("AA");

}


}



}
 

