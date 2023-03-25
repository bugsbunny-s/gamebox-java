public class Main {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player("A", 10, 100, 70,50);
        Player p2 = new Player("B", 7, 100, 65,70);

        Match match = new Match(p1, p2, 60, 70);
        match.run();
    }
}
