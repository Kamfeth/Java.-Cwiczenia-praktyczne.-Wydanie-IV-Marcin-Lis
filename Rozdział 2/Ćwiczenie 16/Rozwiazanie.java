class Rozwiazanie
{
  public static void main(String[] args)
  {
    int A = 2;
    int B = 2;
    int C = -12;
    int delta = B * B - 4 * A * C;

    if (delta > 0)
    {
      System.out.println("Funkcja kwadratowa zawiera dwa miejsca zerowe:");
      System.out.println("x1 = " + (-B + Math.sqrt(delta)) / (2.0 * A));
      System.out.println("x2 = " + (-B - Math.sqrt(delta)) / (2.0 * A));
    }
    else
    {
      if (delta == 0)
      {
        System.out.println("Funkcja kwadratowa zawiera jedno miejsce zerowe:");
        System.out.println("x = " + -B / (2.0 * A));
      }
      else
        System.out.println("Funkcja kwadratowa nie ma miejsc zerowych");
    }
  }
}
