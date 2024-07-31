import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingOptimized {
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double predictFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        double nextValue = currentValue * (1 + growthRate);
        double result = predictFutureValue(nextValue, growthRate, periods - 1);
        memo.put(periods, result);
        return result;
    }

    public static void main(String[] args) {
        double currentValue = 1000;
        double growthRate = 0.05;
        int periods = 10; 

        double predictedValue = predictFutureValue(currentValue, growthRate, periods);
        System.out.println("Predicted future value after " + periods + " periods: " + predictedValue);
    }
}
