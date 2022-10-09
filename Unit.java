import java.util.List;

class Unit {
    String name;
    String tier;
    int cost;
    List<Trait> traits;

    public Unit(String name, String tier, int cost, List<Trait> traits){
        this.name = name;
        this.tier = tier;
        this.cost = cost;
        this.traits = traits;
    }

    public void print_info(){
        System.out.printf("%s\ncost: %d\nrarety: %s\ntraits:\n", name, cost, tier);
            for (Trait trait : traits) {
                System.out.printf("\t%s\n", trait.name);
            }
    }
}