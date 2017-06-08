class SortingAlgorithms {
    private static final int MAX_ARRAY_SIZE = 10;
    public static void main(String args[]) {

        int[] a = new int[MAX_ARRAY_SIZE];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100+1);
        }

        System.out.print("Array (Before): ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        BubbleSort bubble = new BubbleSort();
        a = bubble.sort(a);

        System.out.print("\nArray (After):  ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}