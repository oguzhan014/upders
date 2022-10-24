package bolum_2;

public class AccountTest {
 public static void main(String[] args){
String isim = "oguz";
String soyisim = "Atay";
int yas =21;

Account person = new Account(soyisim, soyisim, yas);

System.out.println("Hos geldiniz: "+ person.getName()+""+person.getSurname());
System.out.println("yasiniz: "+person.getYas());;


//person.setName
person.setSurname("Akal");
System.out.println("Hos geldiniz"+ person.getName());
System.out.println("yasiniz: "+person.getYas());

Account person2 = new Account("ali","veli",25);
System.out.println("Hos geldiniz"+ person2.getName());
System.out.println("yasiniz: "+person2.getYas());

 }
 
}
