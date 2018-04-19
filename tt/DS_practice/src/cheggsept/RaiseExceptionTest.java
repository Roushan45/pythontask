package cheggsept;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Test cases for your classes defining important methods.
 *
 * @author Matthew Hertz
 */
public class RaiseExceptionTest {
  @Test
  public void testProbablyUnfixableExceptionClassDefinition() {
    try {
      RaiseException.simpleMethodRaisingException(2);
      fail("Should have thrown an exception when makeException(2) called!");
    } catch (Exception e) {
      assertTrue("When makeException(2) called, you should be throwing the exception that DOES NOT require being listed in a throws clause!",
                 e instanceof FixesNotExpectedException);
      assertTrue("When makeException(2) called, you should be throwing the exception that DOES NOT require being listed in a throws clause!",
                 e instanceof RuntimeException);
      assertEquals("Incorrect message set in ProbablyUnfixableException constructor",
                   "TIFU: This exception was raised.", e.getMessage());
    }
    try {
      int answer = RaiseException.simpleMethodRaisingException(0);
      assertEquals(42, answer);
    } catch (MightBeFixableException e) {
      fail("When makeException(0) called, your method should return 42!");
    }
  }
  @Test
  public void testprobablyUnfixableExceptionClassMembers() {
    Field[] hosedFields = FixesNotExpectedException.class.getDeclaredFields();
    assertEquals("ProbablyUnfixableException should not declare any fields!", 0, hosedFields.length);
    Method[] hosedMethods = FixesNotExpectedException.class.getDeclaredMethods();
    assertEquals("ProbablyUnfixableException should not define any methods.", 0, hosedMethods.length);
    Constructor<?>[] hosedConstructors = FixesNotExpectedException.class.getConstructors();
    assertEquals("ProbablyUnfixableException should only define exactly 1 constructor.", 1, hosedConstructors.length);
  }
  @Test
  public void testFixItExceptionClassDefinition() {
    try {
      RaiseException.simpleMethodRaisingException(-4982);
      fail("Should have thrown an exception when makeException(-4982) called!");
    } catch (Exception e) {
      assertTrue("When makeException(-4982) called, you should be throwing the exception that DOES require being listed in a throws clause!",
                 e instanceof MightBeFixableException);
      assertTrue("When makeException(-4982) called, you should be throwing the exception that DOES require being listed in a throws clause!",
                 e instanceof Exception);
      assertFalse("When makeException(-4982) called, you should be throwing the exception that DOES require being listed in a throws clause!",
                  e instanceof RuntimeException);
      assertEquals("Incorrect message set in FixItNowException constructor",
                   "I just learned this; Exception is checked; I will raise it; Fix bug, maybe?", e.getMessage());
    }
    try {
      int answer = RaiseException.simpleMethodRaisingException(0);
      assertEquals(42, answer);
    } catch (MightBeFixableException e) {
      fail("When makeException(0) called, your method should return 42!");
    }
  }
  @Test
  public void testFixItExceptionClassMembers() {
    Field[] fixItFields = MightBeFixableException.class.getDeclaredFields();
    assertEquals("FixItNowException should not declare any fields!", 0, fixItFields.length);
    Method[] fixItMethods = MightBeFixableException.class.getDeclaredMethods();
    assertEquals("FixItNowException should not define any methods.", 0, fixItMethods.length);
    Constructor<?>[] fixItConstructors = MightBeFixableException.class.getConstructors();
    assertEquals("FixItNowException should only define exactly 1 constructor.", 1, fixItConstructors.length);
  }
}