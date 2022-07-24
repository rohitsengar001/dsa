# Kadane's Algorithm

![image](https://user-images.githubusercontent.com/39033056/179962423-64867492-0e98-439e-89f6-23526cc0043e.png)

 
```java
public int kadanesAlgo(int[] a) {
        int csum = a[0];
        int osum = a[0];
        for (int i = 1; i < a.length; i++) {
            //if current sum is not negative then
            if (csum > 0)
                csum += a[i];
            else 
                csum = a[i];

            //challenge the current sum to overall sum
            if (csum > osum)
                    osum = csum;
          
        }
        return osum;
    }
```
