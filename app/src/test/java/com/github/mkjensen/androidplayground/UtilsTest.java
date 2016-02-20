package com.github.mkjensen.androidplayground;

import junit.framework.Assert;

import org.junit.Test;

public class UtilsTest {

  @Test
  public void shouldBeCalledByLocalUnitTest() {
    Utils.shouldBeCalledByLocalUnitTest();
    Assert.assertEquals(42, 42);
  }
}
