package com.github.mkjensen.androidplayground;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class UtilsAndroidTest {

  @Test
  public void shouldBeCalledByAndroidTest() {
    Utils.shouldBeCalledByAndroidTest();
    Assert.assertEquals(42, 42);
  }
}
