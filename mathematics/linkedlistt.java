import java.util.*;
class linkedlistt
{
   public static void main(String  args[])
   {
    LinkedList<String> list =new LinkedList <>();
    list.add("Java");
    list.add("Python");
    list.add("C programing");
    list.add("C++");
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    for(String i:list)
    {
        System.out.println(i);
    }
   } 
}