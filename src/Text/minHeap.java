package Text;

public class minHeap {

    private final int maxSize;
    private final int[] heap;
    private int currentSize;

    public minHeap(int maxSize) {

        this.heap = new int[maxSize];
        this.currentSize = -1;
        this.maxSize = maxSize;
    }

    // returns the index of the parent node
    public int parent(int i) {
        return (i - 1) / 2;
    }

    // return the index of the left child 
    public int leftChild(int i) {
        return 2 * i + 1;
    }

    // return the index of the right child 
    public int rightChild(int i) {
        return 2 * i + 2;
    }

    // insert the item at the appropriate position
    public void insert(int data) {
        if (currentSize == maxSize - 1) {
            System.out.println("The heap is full. Cannot insert");
            return;
        }

        // first insert the time at the last position of the array 
        // and move it up
        currentSize++;
        this.heap[currentSize] = data;
        int temp;

        // move up until the heap property satisfies
        int currentIndex = currentSize;

        while (this.heap[this.parent(currentIndex)] > this.heap[currentIndex]) {
            temp = heap[currentIndex];
            heap[currentIndex] = heap[parent(currentIndex)];
            heap[parent(currentIndex)] = temp;
            currentIndex = this.parent(currentIndex);
        }
    }

    // moves the item at position i of array a
    // into its appropriate position
    public void minHeapify(int i) {
        // find left child node
        int left = this.leftChild(i);

        // find right child node
        int right = this.rightChild(i);

        // find the smallest among 3 nodes
        int smallest = i;

        // check if the left node is smaller than the current node
        if (left <= currentSize && heap[left] < heap[smallest]) {
            smallest = left;
        }

        // check if the right node is bigger than the current node 
        // or left node
        if (right <= currentSize && heap[right] < heap[smallest]) {
            smallest = right;
        }

        // swap the biggest node with the current node 
        // and repeat this process until the current node is bigger than 
        // the right and the left node
        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            minHeapify(smallest);
        }

    }

    // returns the  maximum item of the heap
    public int getMax() {
        return heap[0];
    }

    // deletes the max item and return
    public int extractMin() {
        int minItem = this.heap[0];

        // replace the first item with the last item
        this.heap[0] = this.heap[currentSize];
        currentSize = currentSize - 1;

        // maintain the heap property by heapifying the 
        // first item
        minHeapify(0);
        return minItem;
    }

    // prints the heap
    public void printHeap() {
        for (int i = 0; i <= currentSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

}
