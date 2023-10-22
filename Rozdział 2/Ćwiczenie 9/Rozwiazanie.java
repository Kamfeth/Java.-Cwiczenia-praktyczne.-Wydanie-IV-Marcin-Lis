class Rozwiazanie
{
  public static void main(String[] args)
  {
    /*1*/ int x = 1, y;
    /*2*/ System.out.println (++x);
    /*3*/ System.out.println (x++);
    /*4*/ System.out.println (x);
    /*5*/ y = x++;
    /*6*/ System.out.println (y);
    /*7*/ y = ++x;
    /*8*/ System.out.println (++y);

    // Po analizie kodu okazało się, że wynik programu był zgodny z moimi przewidywaniami.
  }
}
