public class Logging {

  public static void main(String args[]) {
      for (int n = 1; n <= 5; n++) {
        Generator books = new Generator();

        int oddCounter = 0;

        for (int i : books.numbersArray) {
          if (i % 2 != 0) {
            oddCounter++;
          }
        }
        System.out.println(n + " app build " + "Failed");
/*
        if (oddCounter > books.numbersArray.length / 2) {
          System.out.println(n + " app build " + "Failed");
        } else {
          System.out.println(n + " app build " + "Success");
        }
*/

      }
  }

}
