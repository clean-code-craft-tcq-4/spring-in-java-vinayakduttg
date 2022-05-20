package statisticker;

import java.util.List;

public class Statistics {

  public static Stats getStatistics(List<Float> numbers) {
    Statistics statistics = new Statistics();
    Stats stats = statistics.new Stats();
    Float min = (float) 0;
    Float max = (float) 0;
    Float total = (float) 0;
    Float average;

    for (Float currentNumber : numbers) {
      if (min == 0) {
        min = currentNumber;
      }
      if (currentNumber < min) {
        min = currentNumber;
      }
      if (currentNumber > max) {
        max = currentNumber;
      }
      total = total + currentNumber;
    }
    average = total / numbers.size();

    if (average != 0 && !average.isNaN()) {
      stats.average = average;
    }

    if (max != 0)
      stats.max = max;

    if (min != 0)
      stats.min = min;

    return stats;
  }

  public class Stats {

    public Float average = Float.NaN;
    public Float min = Float.NaN;;
    public Float max = Float.NaN;;

  }
}
