/*
 * Created on Sep 16, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.error;

import static junit.framework.Assert.assertEquals;

import org.junit.*;

/**
 * Tests for <code>{@link ErrorWhenNotNullFactory#errorWhenNotNull(Object)}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class ErrorWhenNotNullFactory_errorWhenNotNull_Test {

  private static Object value;

  @BeforeClass public static void setUpOnce() {
    value = new Object();
  }

  @Test public void should_create_new_ErrorWhenNullFactory() {
    AssertionErrorFactory factory = ErrorWhenNotNullFactory.errorWhenNotNull(value);
    assertEquals(ErrorWhenNotNullFactory.class, factory.getClass());
  }

  @Test public void should_pass_actual_value() {
    ErrorWhenNotNullFactory factory =  (ErrorWhenNotNullFactory) ErrorWhenNotNullFactory.errorWhenNotNull(value);
    assertEquals(value, factory.value);
  }
}
