import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Scrabble.");
        ArrayList<Tile> tileList = new ArrayList<Tile>();
        tileGen(tileList);
        Random random = new Random();
        int ran = random.nextInt(0, 25);
        System.out.println(ran);
        System.out.println(tileList.get(ran).toString());
    }

    public static void tileGen(ArrayList<Tile> tileList)
    {
        tileList.add(new Tile('A', 1));
        tileList.add(new Tile('B', 3));
        tileList.add(new Tile('C', 3));
        tileList.add(new Tile('D', 2));
        tileList.add(new Tile('E', 1));
        tileList.add(new Tile('F', 4));
        tileList.add(new Tile('G', 2));
        tileList.add(new Tile('H', 4));
        tileList.add(new Tile('I', 1));
        tileList.add(new Tile('J', 8));
        tileList.add(new Tile('K', 5));
        tileList.add(new Tile('L', 1));
        tileList.add(new Tile('M', 3));
        tileList.add(new Tile('N', 1));
        tileList.add(new Tile('O', 1));
        tileList.add(new Tile('P', 3));
        tileList.add(new Tile('Q', 10));
        tileList.add(new Tile('R', 1));
        tileList.add(new Tile('S', 1));
        tileList.add(new Tile('T', 1));
        tileList.add(new Tile('U', 1));
        tileList.add(new Tile('V', 4));
        tileList.add(new Tile('W', 4));
        tileList.add(new Tile('X', 8));
        tileList.add(new Tile('Y', 4));
        tileList.add(new Tile('Z', 10));
    }
}
