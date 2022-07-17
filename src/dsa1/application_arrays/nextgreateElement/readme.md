# Find Next Greatest Element 

> INPUT:
>>[4,1,2]  
>[1,3,4,2]
> 
> OUTPUT:
>>[-1,3,-1]   
>    
>

### CODE     

```java
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreatest = new HashMap<Integer, Integer>();
        //stores the index value of smaller element
        Stack<Integer> stack = new Stack<>();
        //traverse element of array
        for (int currentElement: nums2 ) {
            while(!stack.isEmpty() && stack.peek() < currentElement) {
                nextGreatest.put(stack.pop(),currentElement);
            }
            stack.push(currentElement);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreatest.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
```