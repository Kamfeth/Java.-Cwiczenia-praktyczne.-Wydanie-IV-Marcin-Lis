import java.util.Arrays;

class Rozwiazanie
{
  public static void main(String[] args)
  {
    int[] numeryPierwszychDziesieciuMiesiecy = new int[10];
    int i = 0;

    while (i < numeryPierwszychDziesieciuMiesiecy.length)
    {
      numeryPierwszychDziesieciuMiesiecy[i] = i + 1;
      i++;
    }

    System.out.print("Numery pierwszych dziesięciu miesięcy: " + Arrays.toString(numeryPierwszychDziesieciuMiesiecy));
  }
}
