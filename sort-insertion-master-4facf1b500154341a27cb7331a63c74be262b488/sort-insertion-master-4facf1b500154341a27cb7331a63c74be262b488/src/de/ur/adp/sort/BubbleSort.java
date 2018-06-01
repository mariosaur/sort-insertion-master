package de.ur.adp.sort;


public class BubbleSort extends Sort {

  @Override
  public int[] sort(int[] unsorted) {
    for (int i = 1; i < unsorted.length; i++) {
      for (int j = 0; j < unsorted.length - i; j++) {
        if (unsorted[j] > unsorted[j + 1]) {
          swap(unsorted, j, j + 1);
        }
      }
    }

    return unsorted;
  }
}
