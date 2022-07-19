## Next Smaller Element
>
> Input  : {1, 3, 4, 2}   
> Output : {-1,2,2,-1}    
> Time Complexity : O(n)
```java
public int[] nextSmaller(int[] a) {
        int[] res = new int[a.length];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> nextSmaller = new HashMap<Integer, Integer>();
        int currentIndex = 0;
        for (int currentElement : a) {
            while (!stack.empty() && currentElement < a[stack.peek()]) {
                //pushing elements into HashMap (element => nextGreatest/smallest)
                nextSmaller.put(a[stack.pop()], currentElement);
            }
            stack.push(currentIndex++);
        }

        //get element from HashMap
        for (int i = 0; i < a.length; i++) {
            res[i] = nextSmaller.getOrDefault(a[i], -1);
        }
        return res;
    }
```

## Previous smaller Element(nearest Smaller)
> Input  : {1, 3, 4, 2}    
> Output : {-1,1,3,1}   
> Time Complexity : O(n)   
> 
```java
public int[] prevSmaller(int[] array) {
        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<array.length; i++){
            while(!stack.empty() && array[stack.peek()] >= array[i]){
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : array[stack.peek()];
            stack.push(i);
        }
        return res;
    }
```
