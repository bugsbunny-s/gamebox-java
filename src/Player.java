public class Player {
    String name;
    int damage;
    int health;
    int weight;
    int dogde;

    Player(String name, int damage, int health, int weight, int dogde){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dogde =dogde;
    }

    int hit(Player foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if (foe.isDogde()){
        System.out.println(foe.name + (" gelen hasarı blokladı."));
        return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDogde(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dogde;
    }
}
