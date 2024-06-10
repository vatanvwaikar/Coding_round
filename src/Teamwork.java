
public class Teamwork {
    public static boolean possibleBonus(int yourTile, int friendsTile) {
        if (yourTile >= friendsTile) {
            return false;
        }
        int difference = friendsTile - yourTile;
        return difference >= 1 && difference <= 6;
    }
    public static void main(String[] args) {
        System.out.println(possibleBonus(3, 7));  
        System.out.println(possibleBonus(1, 9));  
        System.out.println(possibleBonus(5, 3));  
        System.out.println(possibleBonus(4, 10)); 
        System.out.println(possibleBonus(2, 2));  
    }
}
