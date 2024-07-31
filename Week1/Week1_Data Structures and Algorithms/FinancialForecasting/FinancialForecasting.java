public class FinancialForecasting {
    public static double predictFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate);
        return predictFutureValue(nextValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000;
        double growthRate = 0.05;
        int periods = 10;

        double predictedValue = predictFutureValue(currentValue, growthRate, periods);
        System.out.println("Predicted future value after " + periods + " periods: " + predictedValue);
    }
}
