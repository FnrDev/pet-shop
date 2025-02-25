public class Animal {
    private String type;
    private char gender;
    private int ageInMonths;
    private double price;

    // to keep tracks of info
    private static int totalSold = 0;
    private static int totalCatsSold = 0;
    private static double totalIncome = 0;

    public Animal(String type, char gender, int ageInMonths, double price) {
        this.type = type;
        this.gender = gender;
        this.ageInMonths = ageInMonths;
        this.price = price;

        totalSold++;
        totalIncome = totalIncome + price;
        if (type.equalsIgnoreCase("cat")) {
            totalCatsSold++;
        }
    }

    // accessors
    public String getType() {
        return type;
    }

    public char getGender() {
        return gender;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalSold() {
        return totalSold;
    }

    public static int getTotalCatsSold() {
        return totalCatsSold;
    }

    public static double getTotalIncome() {
        return totalIncome;
    }

    public static double getAverageSold() {
        return (totalSold == 0) ? 0 : totalIncome / totalSold;
    }

    // mutators
    public void setType(String type) {
        this.type = type;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal Sold: " + type + "\nGender: " + gender +
                "\nAge: " + ageInMonths + " months\nPrice: $" + price;
    }
}
