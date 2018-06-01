package de.ur.adp.sort;


public abstract class Sort {

  public abstract int[] sort(int[] unsorted);

  public final void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}
