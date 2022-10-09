import java.util.List;

public class Trait {
   String name;
   String description;
   // to be updated in the future with the bonus at each step
   List<Integer> upgrade_counts;
   Integer unit_size;

   public Trait(String name){
      this.name = name;
      this.unit_size = 1;
   }
}


