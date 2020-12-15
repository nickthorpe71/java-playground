public class Kata {
  public static int nthPower(int[] array, int n) {
    return (array.length < n) ? Math.pow(array[n], n) : -1;
  }
}
