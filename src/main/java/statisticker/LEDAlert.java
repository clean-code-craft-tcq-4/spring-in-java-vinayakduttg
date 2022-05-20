/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package statisticker;


public class LEDAlert implements IAlerter {

  public boolean ledGlows;

  /**
   * {@inheritDoc}
   */
  @Override
  public void alert() {
    ledGlows = true;
  }

}
