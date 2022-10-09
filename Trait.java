import java.util.List;

public class Trait {
   String name;
   String description;
   // to be updated in the future with the bonus at each step
   List<Integer> upgrade_counts;

   public Trait(String name, List<Integer> upgrade_counts){
      this.name = name;
      this.upgrade_counts = upgrade_counts;
   }
}


