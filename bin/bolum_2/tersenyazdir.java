package bolum_2;
import java.util.Scanner;
public class tersenyazdir {
 
 public static void main(String[] args){


  int n;

try (Scanner input = new Scanner(System.in)) {
 System.out.println("birinci sayiyi giriniz");
 
 n=input.nextInt();
}
//546 =>645
while(n>0){
System.out.println(n %10);
(n)/=10;

}


 }


}
