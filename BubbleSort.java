class BubbleSort implements SortingAlgorithm {
    public int[] sort(int[] a) {

        boolean isSorted = false;
        int temp = 0;
        int sortedIndex = a.length-1;
        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    isSorted = false;
                }
            }
            sortedIndex--;
        }
        return a;
    }
}