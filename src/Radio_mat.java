public class Radio_mat {
	public static double calculateRemainingMass(double initialMass, int halfLives) {
        double remainingMass = initialMass;
        for (int i = 0; i < halfLives; i++) {
            remainingMass *= 0.5;
        }
        return remainingMass;
    }
    public static int calculateTotalYears(int halfLifeYears, int halfLives) {
        return halfLifeYears * halfLives;
    }
    public static void main(String[] args) {
        double initialMass = 100.0;  
        int halfLifeYears = 5730;    
        int halfLives = 3;          
        double remainingMass = calculateRemainingMass(initialMass, halfLives);
        int totalYears = calculateTotalYears(halfLifeYears, halfLives);
       System.out.println("Remaining mass after " + halfLives + " half lives: " + remainingMass);
        System.out.println("Total number of years: " + totalYears);
    }
}
