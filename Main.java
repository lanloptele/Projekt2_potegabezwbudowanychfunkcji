import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Podaj podstawę potęgi, a następnie jej wykładnik:");
   double podstawa, wynik=1;
   int wykladnik=-1;
   Scanner wczytaj = new Scanner(System.in);
   podstawa = wczytaj.nextDouble();
   while(wykladnik<0)
     wykladnik = wczytaj.nextInt();
   for(int i=1; i<=wykladnik; i++)
      wynik*=podstawa;
  System.out.print(wynik);
   wczytaj.close();
  }
}