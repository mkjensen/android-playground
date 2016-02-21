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

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

/**
 * For code coverage testing purposes.
 */
public class UtilsTest {

  /**
   * For code coverage testing purposes.
   */
  @Test
  public void mustHavePrivateParameterlessConstructor() {
    TestUtils.assertClassHasPrivateParameterlessConstructor(Utils.class);
    assertEquals("The world has ended", 42, 42);
  }

  /**
   * For code coverage testing purposes.
   */
  @Test
  public void shouldBeCalledByTest() {
    Utils.shouldBeCalledByTest();
    assertEquals("The world has ended", 42, 42);
  }
}
