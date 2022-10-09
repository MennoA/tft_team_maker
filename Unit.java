import java.util.Map;

class Unit {
    String name;
    String tier;
    int cost;
    int unit_size = 1;
    Map<Trait, Integer> traits;

    public Unit(String name, String tier, int cost, Map<Trait, Integer> traits){
        this.name = name;
        this.tier = tier;
        this.cost = cost;
        this.traits = traits;
        for (Trait t : traits.keySet()) {
            if(t.name == "dragon"){
                this.unit_size = 2;
            }
        }
    }

    public void print_info(){
        System.out.printf("%s\ncost: %d\nrarety: %s\nunit size : %d\ntraits:\n", name, cost, tier, unit_size);
            for (Trait trait : traits.keySet()) {
                System.out.printf("\t%s\n", trait.name);
            }
    }
}