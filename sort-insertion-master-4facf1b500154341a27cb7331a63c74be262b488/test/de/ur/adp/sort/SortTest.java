package de.ur.adp.sort;


import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortTest {

  private final int[] arrayUnsorted = {4, 9, 2, 5, 7, 3, 1, 0, 8, 6};
  private final int[] arraySorted = IntStream.range(0, 10).sorted().toArray();

  @Test
  public void sortTest() throws Exception {

    assertEquals(arrayUnsorted.length, arraySorted.length);

    System.out.println("Unsorted: " + Arrays.toString(arrayUnsorted));
    System.out.println("Sorted: " + Arrays.toString(arraySorted));


    System.out.println("Unsorted: " + Arrays.toString(arrayUnsorted));
    int[] arraySortedSelection = Sorts.selection.sort(arrayUnsorted.clone());
    assertArrayEquals(arraySorted, arraySortedSelection);
    System.out.println("Selection: " + Arrays.toString(arraySortedSelection));


    System.out.println("Unsorted: " + Arrays.toString(arrayUnsorted));
    int[] arraySortedBubble = Sorts.bubble.sort(arrayUnsorted.clone());
    assertArrayEquals(arraySorted, arraySortedBubble);
    System.out.println("Bubble: " + Arrays.toString(arraySortedBubble));


    System.out.println("Unsorted: " + Arrays.toString(arrayUnsorted));
    int[] arraySortedQuick = Sorts.quick.sort(arrayUnsorted.clone());
    assertArrayEquals(arraySorted, arraySortedQuick);
    System.out.println("Quicksort: " + Arrays.toString(arraySortedQuick));


    System.out.println("Unsorted: " + Arrays.toString(arrayUnsorted));
    int[] arraySortedInsertion = Sorts.insertion.sort(arrayUnsorted.clone());
    assertArrayEquals(arraySorted, arraySortedInsertion);
    System.out.println("Insertion: " + Arrays.toString(arraySortedInsertion));

  }

}