import javax.xml.transform.Source;

public class Match {
    Player p1;
    Player p2;
    int minWeight;
    int maxWeight;

    Match(Player p1, Player p2, int minWeight, int maxWeight){
        this.p1 = p1;
        this.p2 = p2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            double randomNumber = Math.random()*100;
            if(randomNumber > 50){
                System.out.println(this.p1.name + " first hit!!");
                
                while (this.p1.health > 0 && this.p2.health > 0){
                this.p2.health = this.p1.hit(this.p2);
                if(isWin()){
                    break;
                }
                this.p1.health = this.p2.hit(this.p1);
                if(isWin()){
                    break;
                }
                System.out.println(this.p1.name + " Sağlık : " + this.p1.health);}
            }else{
                System.out.println(this.p2.name + " first hit!!");
                while (this.p1.health > 0 && this.p2.health > 0){
                    this.p2.health = this.p1.hit(this.p2);
                    if(isWin()){
                        break;
                    }
                    this.p1.health = this.p2.hit(this.p1);
                    if(isWin()){
                        break;
                    }

            }
                System.out.println(this.p2.name + " Sağlık : " + this.p2.health);
            }
        }else{
            System.out.println("Sikletler uyuşmamaktadır.");
        }
    }

    boolean isCheck(){
        return (this.p1.weight >= this.minWeight && this.p1.weight <= this.maxWeight) && (this.p2.weight >= this.minWeight && this.p2.weight <= this.maxWeight);
    }

    boolean isWin(){
        if(this.p1.health == 0){
            System.out.println(this.p2.name + " KAZANDI");
            return true;
        }
        if(this.p2.health == 0){
            System.out.println(this.p1.name + " KAZANDI");
            return true;
        }
        return false;
    }
}
