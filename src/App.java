import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Iterator<Tile> it;
        System.out.println("Welcome to Scrabble.");
        ArrayList<Tile> tileList = new ArrayList<Tile>();
        tileGen(tileList);

        boolean cont = true;
        do {
            ArrayList<Tile> hand = new ArrayList<Tile>();
            deck(tileList, hand);

            System.out.print("Your tile hand: ");
            it = hand.iterator();
            while (it.hasNext()) {
                System.out.print(it.next().getLetter());
            }


            System.out.print("\nEnter a word: ");
            String yourWord = in.nextLine();
            if (check(hand, yourWord))
            {
                System.out.println("Yes, you can spell " + yourWord + ". It is worth " + score(tileList, yourWord) + " points.");
            }
            else
            {
                System.out.println("No, you cannot spell " + yourWord + ".");
            }
            cont = false;
            
        } while (cont);
        
    }

    public static boolean check(ArrayList<Tile> hand, String word)
    {
        Iterator<Tile> it;
        
        boolean valid = true;


        for (int i = 0; i < word.length(); i++) {
            it = hand.iterator();
            while (it.hasNext()) {
                if(it.next().getLetter() == word.toUpperCase().charAt(i))
                {
                    valid = true;
                    break;
                }
                else
                {
                    valid = false;
                }
            }
        }

        return valid;
    }

    public static int score(ArrayList<Tile> base,String word)
    {
        return 0;
    }

    public static void deck(ArrayList<Tile> base, ArrayList<Tile> hand)
    {
        Random random = new Random(); 
        for (int i = 0; i < 7; i++) {
            int ran = random.nextInt(0, 25);
            hand.add(base.get(ran));
        }
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
