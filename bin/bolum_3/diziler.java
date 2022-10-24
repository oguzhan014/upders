package bolum_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class diziler {
 
 public static void main(String[] args){


  //DİZİLER
  String[] myStringArray = new String[3];

myStringArray[0] = "oguz";
myStringArray[1] = "akal";
myStringArray[2] = "sarvar";

System.out.println(myStringArray[0]);
System.out.println(myStringArray[1]);
System.out.println(myStringArray[2]);

int[] myIntArray = new int[3];

myIntArray[0] = 21;
myIntArray[1] = 23;
myIntArray[2] = 56;

System.out.println(myIntArray[0]);
System.out.println(myIntArray[1]);
System.out.println(myIntArray[2]);

int[] myNumberArray ={1,2,3,4,5,6,7,8};

System.out.println(myNumberArray[3]);

//LİSTELER

ArrayList<String> myMusicians =new ArrayList<String>();

myMusicians.add("Nirvana");
myMusicians.add("Manga");
myMusicians.add(1,"Adele");
myMusicians.add("AKON");

System.out.println(myMusicians.get(0));
System.out.println(myMusicians.get(1));
System.out.println(myMusicians.get(2));
System.out.println(myMusicians.size());


//HASSET 

HashSet<String> mySet = new HashSet<>();

mySet.add("oguz");
mySet.add("oguz1");

System.out.println(mySet.size());

//HASHMAP

HashMap<String, String> myHashMap= new HashMap<>();

myHashMap.put("name","oguz");
myHashMap.put("enstrumanlar","gitar");

System.out.println(myHashMap.get("name"));

System.out.println(myHashMap.get("enstrumanlar"));

HashMap<String, Integer> myHashMap2 = new HashMap<>();

myHashMap2.put("Adana",01);
myHashMap2.put("Sivas",58);

System.out.println(myHashMap2.get("Adana"));
System.out.println(myHashMap2.get("Sivas"));

 }
}
