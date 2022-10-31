package bolum_4;
import java.util.Arrays;
public class ArrayManipulation {
 
 private static Object value;
 private static int[] array;
 private static Object description;

 public static void main(String[] args){

int[] intArray = {1,2,3,4,5,6};
int[] intArrayCopy = new int[intArray.length];
System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
displayArray(intArray,"intArray");
displayArray(intArrayCopy,"intarraycopy");

 }

 private static void displayArray(int[] intArray, String string) {

  System.out.printf("%n%s :",description);
  
  for(int vaıue : array) {
   System.out.printf("%d",value);
  }
 }

}
