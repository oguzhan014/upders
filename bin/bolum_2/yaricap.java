package bolum_2;
import java.util.Scanner;
public class yaricap {

 /**
  * @param args
  */
 public static void main(String[] args){
Scanner input = new Scanner(System.in);

double pi;
pi=3.14159;
double r;
//double k;

System.out.println("yaricap giriniz");
r=input.nextDouble();




//k=(pi)*(yaricap)*(yaricap);

System.out.println("dairenin alani: "+ (pi)*(r)*(r));
System.out.println("dairenin cevresi: "+ 2*pi*r);

 }
 
}
