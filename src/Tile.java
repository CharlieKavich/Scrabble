public class Tile {
    private char letter;
    private int value;

    public Tile(){

    }

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public boolean equals(Tile compare)
    {
        if(compare.letter == letter || compare.value == value)
            return true;
        else
            return false;
    }

    public static void printTile(Tile toRead)
    {
        System.out.print(toRead.toString());
    }

    public String toString()
    {
        return String.format("Letter: %1c (%d)", letter, value);
    }

    public char getLetter()
    {
        return letter;
    }

    public int getValue()
    {
        return value;
    }

    public void setLetter(char letter)
    {
        this.letter = letter;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}
