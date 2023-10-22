class Rozwiazanie
{
  public static void main(String[] args)
  {
    int liczbaSpalonychKilogramow = 10;

    switch (liczbaSpalonychKilogramow)
    {
      case 1:
        System.out.print("Świetnie, widze, że zacząłeś się odchudzać!");
      case 10:
        System.out.print("Wspaniale! Jesteś przykładem, że ciężka praca naprawdę się opłaca!");
      default:
        System.out.print("Powiedz mi, jak idzie Ci odchudzanie się?");
    }
  }
}
