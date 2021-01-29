
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   private Circle1 newCircle;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

// 
// Test an intersection of entier circles
//
@Test
public void testTotalIntersect()
{
   System.out.println("Running test testIntersect.");
   newCircle = new Circle1(1, 2, 3);
   Assert.assertTrue(circle1.intersects(newCircle));
}

// 
// Test scale up
//
@Test
public void testScaleUp()
{
   System.out.println("Running test testScaleUp.");
   double newFactor = circle1.scale(2);
   Assert.assertTrue(newFactor == 6);
}

// 
// Test scale down
//
@Test
public void testScaleDown()
{
   System.out.println("Running test testScaleDown.");
   double newFactor = circle1.scale(0.5);
   Assert.assertTrue(newFactor == 1.50000000000000000000);
}

// 
// Test an intersection at certain points
//
@Test
public void testIntersect()
{
   System.out.println("Running test testIntersect.");
   newCircle = new Circle1(3, 2, 3);
   Assert.assertTrue(circle1.intersects(newCircle));
}

// 
// Test circle inside another
//
@Test
public void testInnerCircle()
{
   System.out.println("Running test testInnerCircle.");
   newCircle = new Circle1(1, 2, 2);
   Assert.assertTrue(circle1.intersects(newCircle));
}

// 
// Test far seperate circles
//
@Test
public void testOuterCircles()
{
   System.out.println("Running test testOuterCircle.");
   newCircle = new Circle1(14, 14, 2);
   Assert.assertTrue(circle1.intersects(newCircle));
}


/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

