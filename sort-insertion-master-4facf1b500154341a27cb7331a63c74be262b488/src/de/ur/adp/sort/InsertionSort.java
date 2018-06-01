package de.ur.adp.sort;


public class InsertionSort extends Sort {

  @Override
  public int[] sort(int[] unsorted) {
        int temp;

        for (int i = 1; i < unsorted.length; i++) {
          temp = unsorted[i];

          int j = i;

          while (j > 0 && unsorted[j - 1] > temp) {
            unsorted[j] = unsorted[j - 1];
            j--;
          }
          unsorted[j] = temp;
        }
        return unsorted;
      }


    }

