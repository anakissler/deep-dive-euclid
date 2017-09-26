package edu.cnm.deepdive.algorithms;

/** Implements the classic Euclid algorithm for finding the GCD of 2 integers.  When run as
 * a Java application, the input values are read from the command line arguments.
 *
 * @author Ana Kistner
 */
public class Euclid {
  /** format string used for display of input values and GCD. */
  public static final String DISPLAY_FORMAT = "GCD(%,d, %,d) = %,d%n";
  public static void main (String [] args) {
    int a = Integer.parseInt (args[0]);
    int b = Integer.parseInt (args[1]);
    int gcd = gcd(a, b);
    System.out.printf(DISPLAY_FORMAT, a, b, gcd);
  }

  /** THE A AND B IN THE METHODS ABOVE AND BELOW HAVE NOTHING TO DO WITH EACH OTHER.
   * computes and returns the GCD of 2 integers, using the modular division form of
   * Euclids algorithm.
   * @param a first input
   * @param b second input
   * @return GCD of <code>a</code> and <code>b</code>
   */

  public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    int c = Math.max(a, b);
    b = Math.min(a, b);
    a = c;
    while (b > 0) {
      c = a % b;
      a = b;
      b = c;
    }
    return a;

  }

}
