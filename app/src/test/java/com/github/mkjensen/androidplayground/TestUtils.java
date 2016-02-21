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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * Various utilities for testing.
 */
public final class TestUtils {

  private TestUtils() {
  }

  /**
   * Asserts that the specified class has a private parameterless constructor. The constructor is
   * invoked via reflection for code coverage purposes.
   */
  public static void assertClassHasPrivateParameterlessConstructor(final Class<?> clazz) {
    Constructor<?> constructor = null;
    try {
      constructor = clazz.getDeclaredConstructor();
    } catch (NoSuchMethodException ex) {
      fail(String.format("Class %s does not have a parameterless constructor",
          clazz.getCanonicalName()));
    }
    assertTrue(String.format("Constructor %s is not private", constructor),
        Modifier.isPrivate(constructor.getModifiers()));
    satisfyCodeCoverage(constructor);
  }

  private static void satisfyCodeCoverage(final Constructor<?> constructor) {
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
    } catch (InvocationTargetException ex) {
      assertTrue("Only AssertionError may be thrown by invoked constructor",
          ex.getCause() instanceof AssertionError);
    } catch (ReflectiveOperationException ex) {
      fail("Could not invoke constructor: " + constructor);
    }
  }
}
