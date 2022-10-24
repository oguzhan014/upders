package bolum_2;
import java.util.Scanner;

public class kosul {
 
public static void main(String[] args)
{

 int n,m,x,y;


 Scanner input = new Scanner(System.in);

 System.out.println("birinci sayiyi giriniz");
n=input.nextInt();
 System.out.println("ikinci sayiyi giriniz");
m=input.nextInt();
x=n+m;
y=n-m;
 //toplama4

 System.out.println("toplamlari: "+ x);
 //carpma
System.out.println("carpimlari: "+ n*m);
//bolme
System.out.println("bolumleri: "+ n/m);
//cıkarma
System.out.println("cikarmalari: "+ y);



 }


}





//Scanner input = new Scanner(System.in);

//n=input.nextInt();






