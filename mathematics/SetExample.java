import java.io.FilterInputStream;
import java.util.*;


 class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        Set<Integer> Num =new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("apple");
        Num.add(12);
        Num.add(13);
        System.out.println(fruits);
        System.out.println(Num);
        fruits.remove("Apple");   // Remove elements
        System.out.println(fruits);
        fruits.contains("Banana"); // Contains elements
        System.out.println(fruits);
        TreeSet<String> fruits1= new TreeSet<>();
        fruits1.add("Apple");
        fruits1.add("crax");
        fruits1.add("Shusi");
        fruits1.add("Dragan Fruit");
        System.out.println(fruits1);
        System.out.println("============================");
        Iterator<String> itr = fruits1.iterator();
       while (itr.hasNext()) {
      System.out.println(itr.next());
       }
    }
}
