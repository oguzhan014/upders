package bölüm_1;

import java.util.Scanner;

public class kalpHizi1 {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

String isim  = input.nextLine();
String soyisim = input.nextLine(); ;
int dogumtarihi= input.nextInt(); ;

heartRate1 person = new heartRate1(isim, soyisim, dogumtarihi);
/* 
System.out.println("isim gir"); 
 isim= input.nextLine();
System.out.println("soy isim gir"); 
 isim= input.nextLine();
System.out.println("dogumtarihi  gir"); 
 dogumtarihi= input.nextInt();*/

System.out.println("Hos geldiniz: "+getName()+""+getName());
System.out.println("yasiniz: "+getdogumtarihi());
person.setName("");
person.setSurname("");
person.dogumtarihi("");











/*person.setName
person.setSurname("Akal");
System.out.println("Hos geldiniz"+ person.getName());
System.out.println("yasiniz: "+person.getYas());

heartRate1 person2 = new heartRate1("ali","veli",25);
System.out.println("Hos geldiniz"+ person2.getName());
System.out.println("yasiniz: "+person2.getYas());
*/

 }

private static String getdogumtarihi() {
 return null;
}

private static String getName() {
 return null;
}






}
 
}