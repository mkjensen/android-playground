package com.github.mkjensen.androidplayground;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class AndroidUtilsTest {

  @Test
  public void test_shouldBeCalledByAndroidTest() {
    Utils.shouldBeCalledByAndroidTest();
  }
}
