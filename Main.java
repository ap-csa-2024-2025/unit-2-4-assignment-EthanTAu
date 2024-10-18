import java.util.Scanner;

public class LastFirstN {
    public static String lastFirstN(String s1, String s2, int n) {
      String lastNFromS1 = s1.substring(s1.length() - n);
      String lastNFromS2 = s2.substring(0, n);
      return lastNFromS1 + lastNFromS2;
}
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out,print("Enter the first string: ");
      String s1 = scanner.nextLine();
      System.out.print("Enter the second string: ");
      String s2 = scanner.nextLine();
      System.out.print("Enter an integer: ");
      int n = system.nextLine();

      String result = lastFirstN(s1, s1, n);
      System.out.print("Result: " + result);
    }
      scanner.close
}

public class StringManip {
  public static void manipulate(String s1, String s2) {
    String upperS1 = s1.toUpperCase();
    System.out.println("First string in uppercase: " + upperS1);
    String capS2 = s2.substring(0,1),toUpperCase() + s2.substring(1).toLowerCase();
    System.out.println("Second string with first letter capitalized: " + capS2);
  }

public static void main(String[] args) {
  Scanner scanner = new scanner(System.in);
  System.out.print("Enter the first string: ");
  String s1 = scanner.nextLine();
  System.out.print("Enter the second string: ");
  String s2 = scanner.nextLine();

  manipulate(s1, s2);

  scanner.close();
}
}

