package de.ur.adp.sort;


public class SelectionSort extends Sort {

  @Override
  public int[] sort(int[] unsorted) {
    for (int i = 0; i < unsorted.length - 1; i++) {
      int small = i;
      for (int j = i + 1; j < unsorted.length; j++) {
        if (unsorted[j] < unsorted[small]) small = j;
      }

      swap(unsorted, small, i);
    }

    return unsorted;
  }
}
