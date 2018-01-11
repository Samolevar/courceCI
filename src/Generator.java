class Generator {

  final int[] numbersArray;

  Generator() {
    numbersArray = new int[10];

    for (int n = 0; n < numbersArray.length; n++) {
      int rand = (int) (Math.random() * 10);
      numbersArray[n] = rand;
    }

  }

}
