package bolum_2;
import java.util.Scanner;

public class basamakayirma {
 public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sayi,a,b,c,d,e;

System.out.println("bes basmaklı sayi giriniz");
sayi=input.nextInt();

a=(sayi)%10;
b=(sayi)%(100)/10;
c=(sayi)%(1000)/100;
d=(sayi)%(10000)/1000;
e=(sayi)%(100000)/10000;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
 }



 
}
