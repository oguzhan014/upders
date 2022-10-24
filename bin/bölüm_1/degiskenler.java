package bölüm_1;


public class degiskenler {

 /**
 * @param args
 */
public static void main(String[] args) {



  double hizlimiti=50;

// bilimsel hesep makinesi mantıgı,
hizlimiti=55e6;

// binary sayilar 0b ile baslar
//Java'da ikili 0b ile başlar, sekizli 0 ile ve onaltılık 0x ile başlar .
int binaryNumber = 0b100111;

// eger degişken aralıgımız -128 ile 127 arasındaysa byte kullan (8bit)
byte range;
range=127;

char letter = '\u0054';
    

System.out.println(letter);  // prints Q
System.out.println(hizlimiti);
System.out.println(binaryNumber);
System.out.println(range);
  
 } 
}
