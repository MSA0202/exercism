public class SalaryCalculator {

    private double multiplier = 1.0;
    private static final int BASE_PRICE_PER_SOLD_PRODUCT = 10;
    private static final int MULTIPLIER_PRICE_PER_SOLD_PRODUCT_20_OR_MORE = 13;
    private static final int BASE_SALARY = 1000;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? multiplier - 0.15 : multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? MULTIPLIER_PRICE_PER_SOLD_PRODUCT_20_OR_MORE : BASE_PRICE_PER_SOLD_PRODUCT;
    }

    public double bonusForProductsSold(int productsSold) {
        return this.bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (BASE_SALARY * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return salary > 2000 ? 2000 : salary;
    } 
}
