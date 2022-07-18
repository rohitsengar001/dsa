# Stock Span Problem Based On Stack

![image](https://media.geeksforgeeks.org/wp-content/uploads/stock.png)
> Input :price[] = { 10, 4, 5, 90, 120, 80 }   
> Output : 1 1 2 4 5 1

![image](https://media.geeksforgeeks.org/wp-content/uploads/Stock_span.png)
>
> 
> 
> 
> 
### USING STACK : COMPLEXITY (O(n))
```java
 public int[] findSpan(int[] price){
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<>();
        //iteration price list elements 
        for (int i = 0; i < price.length; i++) {
            //pop element if stack is not empty and current price is greater and equal to previous price which is on top of stack
            while(!stack.empty() && price[i]>=price[stack.peek()]){
                stack.pop();
            }
            //update span value : while current price is not greater and equal to previous price
            span[i] = stack.empty() ? i+1 : i- stack.peek();
            
            //otherwise push indexes into the stack
            stack.push(i);
        }
        return span;
    }```