import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;



public class App {

    private static int deckChange = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Iterator<Tile> it;
        System.out.println("Welcome to Scrabble.");
        ArrayList<Tile> tileList = new ArrayList<Tile>();
        tileGen(tileList);
        ArrayList<Tile> hand = new ArrayList<Tile>();
        deck(tileList, hand, 7);
        boolean cont = true;
        do {
            deck(tileList, hand, deckChange);
            deckChange = 0;

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

            System.out.print("Would you like to play again? (Y/N): ");
            String answer = in.nextLine();
            if (answer.toUpperCase().equals("Y"))
            {
                cont = true;
            }
            else
            {
                cont = false;
                System.out.println("Good bye!");
            }
            
        } while (cont);
        
    }

    public static boolean check(ArrayList<Tile> hand, String word)
    {
        Iterator<Tile> it;
        boolean valid = true;
        ArrayList<Tile> handMemory = new ArrayList<Tile>();

        
        for (int i = 0; i < word.length(); i++) {
            it = hand.iterator();
            
            while (it.hasNext()) {
                if(it.next().getLetter() == word.toUpperCase().charAt(i))
                {
                    deckChange += 1;
                    valid = true;
                    it.remove();
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
        Iterator<Tile> it;
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            it = base.iterator();
            while (it.hasNext()) {
                if(it.next().getLetter() == word.toUpperCase().charAt(i))
                {
                    score += it.next().getValue();
                }
                
            }
        }
        return score;
    }

    public static void deck(ArrayList<Tile> base, ArrayList<Tile> hand, int handSize)
    {
        Random random = new Random(); 
        for (int i = 0; i < handSize; i++) {
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
