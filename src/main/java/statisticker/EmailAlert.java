/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package statisticker;


public class EmailAlert implements IAlerter {

  public boolean emailSent;

  /**
   * {@inheritDoc}
   */
  @Override
  public void alert() {
    emailSent = true;
  }


}
