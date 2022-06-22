public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear + 1;
        while (currentYear < targetYear) {
            int yearsPassed = currentYear - startingYear;
            if (yearsPassed == 1) {
                System.out.println((yearsPassed) + " year has passed");
            }
            else {
                System.out.println((yearsPassed) + " years have passed");
            }
            
            currentYear++;
        }
    }
}
