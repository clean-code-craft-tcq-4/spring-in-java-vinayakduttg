/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package statisticker;

import java.util.Arrays;
import java.util.List;

public class StatsChecker {

  private IAlerter alerters[];
  private float maxThreshold;

  public StatsChecker(float maxThreshold, IAlerter[] alerters) {
    this.maxThreshold = maxThreshold;
    this.alerters = alerters;

  }

  /**
   * @param numbers
   */
  public void checkAndAlert(Float[] numbers) {
    List<Float> numberList = Arrays.asList(numbers);
    Statistics.Stats s = Statistics.getStatistics(numberList);
    if (s.max > maxThreshold) {
      for (int i = 0; i < alerters.length; i++) {
        alerters[i].alert();
      }
    }
  }

}
