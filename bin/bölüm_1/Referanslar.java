package bölüm_1;

public class Referanslar {

 public static void main(String[] args) {

  int [] numbers = {10,15,20,25,30};
  int[] numbers2 = new int [numbers.length]; // number in uzunlugu kadar olsun
  for(int i =0;i<numbers.length;i++){

   numbers2[i] = numbers[i]; //deep copy

  }
  for (int i=0;i<numbers.length;i++){
   System.out.println(numbers2[i]);

  }
  

 }

 
}
