import java.util.*;

class MapExample
{
  public static void  main(String args[])
  {
    HashMap <String,Integer>map=new HashMap<>();
    map.put("Amit ",12);
    map.put("Ajay ",13);
    map.put("Amer ",14);
    map.put("Amresh ",15);
    map.put("Aman ",16);
    System.out.println(map);

    TreeMap <String,Integer> map1= new TreeMap<>();
   map1.put("Amit ",12);
    map1.put("Ajay ",13);
    map1.put("Amer ",14);
    map1.put("Amresh ",15);
    map1.put("Aman ",16);
    System.out.println(map1);

  }
}