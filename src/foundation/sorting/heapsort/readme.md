# HeapSort
> steps are :
> ![image](https://www.codesdope.com/staticroot/images/algorithm/heapsort2.gif)

 ```java
 class Solution {
    public int heapSize;

    public void maxHeapify(int[] arr, int i) {
        int left, right, max;
        //write this logic if index is starting from '0' index
        if (i == 0) {
            left = 1;
            right = 2;
        } else {
            //left child of i
            left = 2 * i + 1;

            //right child of i
            right = left + 1;
        }

        //compare b/w left child and root element
        // save index of maximum number inside max pointer
        if (left <= heapSize && arr[i] < arr[left])
            max = left;
        else
            max = i;

        //compare b/w right child and root element
        //save index of maximum number inside max pointer
        if (right <= heapSize && arr[max] < arr[right])
            max = right;

        //root is not greater than its children
        //exchange root to max value of child
        if (max != i) {
            exchange(i, max, arr);
            maxHeapify(arr, max);
        }

    }

    public void exchange(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void buildMaxHeap(int[] arr) {
        //initiate max heap
        heapSize = arr.length - 1;
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    public void heapSort(int[] arr) {
        buildMaxHeap(arr);
        //interchange value first index and last index of heap
        for (int i = arr.length - 1; i > 0; i--) {
            exchange(0, i, arr);
            heapSize = heapSize - 1;
            maxHeapify(arr, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 5};
        new Solution().heapSort(arr);
        for (int element : arr
        ) {
            System.out.println(element);
        }
    }
}
```