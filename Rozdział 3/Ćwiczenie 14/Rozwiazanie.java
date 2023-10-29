class Rozwiazanie
{
  public static void main(String[] args)
  {
    int[] liczbaPrzyjetychKaloriiWCiaguTygodnia = {1628, 1941, 1705, 1600, 2873, 1696, 1821};
    int i = 0;

    System.out.print("W ciągu tygodnia przyjęto kolejno następujące ilości kalorii: ");

    while (i < liczbaPrzyjetychKaloriiWCiaguTygodnia.length)
    {
      System.out.print(liczbaPrzyjetychKaloriiWCiaguTygodnia[i] + " ");
      i++;
    }
  }
}
