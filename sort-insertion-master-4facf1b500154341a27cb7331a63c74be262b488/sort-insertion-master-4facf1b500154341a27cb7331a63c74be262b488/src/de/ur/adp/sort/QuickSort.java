package de.ur.adp.sort;


public class QuickSort extends Sort {

  @Override
  public int[] sort(int[] unsorted) {
    quicksort(unsorted, 0, unsorted.length - 1);
    return unsorted;
  }

  private void quicksort(int[] s, int l, int r) {
    if (r > l) {
      //int pivotIndex = IntStream.range(l, r).reduce((a,b)->s[a]<s[b]? b: a).getAsInt();
      int pivotIndex = (l + r) / 2;
      swap(s, l, pivotIndex);
      int p = l;

      for(int i = p + 1; i <= r; ++i) {
        if(s[i] < s[l]) {
          swap(s, ++p, i);
        }
      }

      swap(s, l, p);

      quicksort(s, l, p - 1);
      quicksort(s, p + 1, r);
    }
  }
}
