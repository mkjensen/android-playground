/*
 * Copyright 2016 Martin Kamp Jensen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.mkjensen.androidplayground;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * For code coverage testing purposes.
 */
final class Utils {

  /**
   * The number of times public methods of this class have been called.
   */
  private static final AtomicInteger NUMBER_OF_CALLS = new AtomicInteger();

  private Utils() {
  }

  /**
   * For code coverage testing purposes.
   */
  public static void shouldBeCalledByLocalUnitTest() {
    updateCalls();
  }

  /**
   * For code coverage testing purposes.
   */
  public static void shouldBeCalledByAndroidTest() {
    updateCalls();
  }

  /**
   * For code coverage testing purposes.
   */
  public static void shouldNotBeCalled() {
    updateCalls();
  }

  private static void updateCalls() {
    NUMBER_OF_CALLS.addAndGet(1);
  }
}
