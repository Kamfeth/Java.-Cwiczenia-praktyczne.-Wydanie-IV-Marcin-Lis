class Rozwiazanie
{
  public static void main(String[] args)
  {
    int[] numeryPierwszychDziesieciuMiesiecy = new int[10];

    for (int i = 0; i < numeryPierwszychDziesieciuMiesiecy.length; i++)
      numeryPierwszychDziesieciuMiesiecy[i] = i + 1;

    for (int i = 0; i < numeryPierwszychDziesieciuMiesiecy.length; i++)
      System.out.println("Indeks = " + i + " | Wartość = " + numeryPierwszychDziesieciuMiesiecy[i] + " ");
  }
}
