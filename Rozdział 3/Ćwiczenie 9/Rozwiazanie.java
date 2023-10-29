import java.util.Arrays;

class Rozwiazanie
{
  public static void main(String[] args)
  {
    int[] numeryMieszkanWBloku = new int[20];

    for (int i = 0; i < numeryMieszkanWBloku.length; i++)
      numeryMieszkanWBloku[i] = numeryMieszkanWBloku.length - i;

    System.out.print("Numery mieszkań w bloku: " + Arrays.toString(numeryMieszkanWBloku));
  }
}
