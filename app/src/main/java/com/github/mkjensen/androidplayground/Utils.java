package com.github.mkjensen.androidplayground;

public class Utils {

  private Utils() {
  }

  public static void shouldBeCalledByLocalUnitTest() {
    System.out.println("shouldBeCalledByLocalUnitTest");
  }

  public static void shouldBeCalledByAndroidTest() {
    System.out.println("shouldBeCalledByAndroidTest");
  }

  public static void shouldNotBeCalled() {
    System.out.println("shouldNotBeCalled");
  }
}
