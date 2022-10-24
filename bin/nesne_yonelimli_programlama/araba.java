package nesne_yonelimli_programlama;

public class araba {
 
 public String marka;
 public String renk;
 public String model;
 public int hiz;
 public int fiyat;
 public char[] speedUp;
 public char[] firenlemek;

public void printAll(){
 System.out.println("renk:" + this.renk  +"model:"  +  this.model  +  "marka:"  + this.marka  +  "fiyat:"  + this.fiyat);
}

 public void speedUp(int artis){
  this.hiz=this.hiz + artis;
 }
public void firenlemek(int azalma){
 this.hiz=this.hiz-azalma;

}



}
