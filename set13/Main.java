

public class Main {
    public static int yearRange(int[] artifacts) {
        int minYear = artifacts[0];
        int maxYear = artifacts[0];

        for (int year : artifacts) {
            if (year < minYear) minYear = year;
            if (year > maxYear) maxYear = year;  // ✅ FIXED: used '>' instead of '<'
        }

        return maxYear - minYear;
    }

    public static void main(String[] args) {
        System.out.println(yearRange(new int[]{1990, 2000, 1985, 1950}));  // ✅ FIXED: added 'new'
    }
}
