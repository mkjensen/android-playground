package com.github.mkjensen.androidplayground;

import junit.framework.Assert;

import org.junit.Test;

public class LocalUtilsTest {

  @Test
  public void test_shouldBeCalledByLocalUnitTest() {
    Utils.shouldBeCalledByLocalUnitTest();
    Assert.assertEquals(42, 42);
  }
}
