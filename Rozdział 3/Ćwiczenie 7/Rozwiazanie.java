import java.util.Arrays;

class Rozwiazanie
{
  public static void main(String[] args)
  {
    int[] numeryPierwszychDziesieciuMiesiecy = new int[10];

    for (int i = 0; i < numeryPierwszychDziesieciuMiesiecy.length; i++)
      numeryPierwszychDziesieciuMiesiecy[i] = i + 1;

    System.out.print("Numery pierwszych dziesięciu miesięcy: " + Arrays.toString(numeryPierwszychDziesieciuMiesiecy));
  }
}
