import java.util.Map;

class Unit {
    String name;
    String tier;
    int cost;
    Map<Trait, Integer> traits;

    public Unit(String name, String tier, int cost, Map<Trait, Integer> traits){
        this.name = name;
        this.tier = tier;
        this.cost = cost;
        this.traits = traits;
    }

    public void print_info(){
        System.out.printf("%s\ncost: %d\nrarety: %s\ntraits:\n", name, cost, tier);
            for (Trait trait : traits.keySet()) {
                System.out.printf("\t%s\n", trait.name);
            }
    }
}