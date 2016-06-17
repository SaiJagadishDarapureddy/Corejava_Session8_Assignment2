
import java.util.*;

public class HashSetDemo {
   public static void main(String args[]) {
   // create hash set
   HashSet <String> newset = new HashSet <String>();
                  
   // populate hash set
   newset.add("Learning"); 
   newset.add("Easy");
   newset.add("Simply");  
      
   // create an iterator
   Iterator<String> iterator = newset.iterator(); 
      
   // check values
   while (iterator.hasNext()){
   System.out.println("Value: "+iterator.next() + " ");  
   }
   }    
}
