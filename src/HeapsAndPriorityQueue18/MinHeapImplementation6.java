// HomeWork -> Implement a MaxHeap using Array

package HeapsAndPriorityQueue18;

class MinHeap{
    int[] arr;
    private int size;

    MinHeap(int capacity){
        arr = new int[capacity];
        this.size = 0;
    }

    boolean isFull(){
        return size == arr.length;
    }
    boolean isEmpty(){
        return size == 0;
    }

    public void upHeapify(int child){
        if(child == 0) return;
        int parent = (child-1)/2;
        if(arr[child] < arr[parent]){
            swap(child, parent);
            upHeapify(parent);
        }
    }

    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getSize(){
        return size;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Heap is Empty !");
            return -1;
        }
        return arr[0];
    }

    public void add(int val) throws Exception{
        if(isFull()) throw new Exception("Heap is full !");
        arr[size++] = val;
        upHeapify(size-1);
    }

    public void downHeapify(int parent){
        if(parent >= size-1) return;

        int lc = 2*parent + 1; int rc = 2*parent + 2;
        int minIdx = parent;

        if(lc < size && arr[lc] < arr[minIdx]) minIdx = lc;
        if(rc < size && arr[rc] < arr[minIdx]) minIdx = rc;

        if(parent == minIdx) return;

        swap(parent, minIdx);
        downHeapify(minIdx);
    }

    public int remove() throws Exception{
        if(isEmpty()) throw new Exception("Heap is Empty !");
        int peek = arr[0];
        swap(0, size-1);
        size--;
        downHeapify(0);
        return peek;
    }
}
public class MinHeapImplementation6  {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
        pq.add(10);
        pq.add(1);
        pq.add(6);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());

    }
}
