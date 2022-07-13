# Decimal to any Base Conversion function
```java
public String decimaltoAnyBaseConv(int n, int base) {
        String res = "";
        while (n > 0) {
            int rem = n % base;
            res = rem + res;
            n = n / base;
        }
        return res;
    }
```