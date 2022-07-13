# Any Base to Decimal Conversion Functions
```java
public int anybaseToDecimal(int num ,int base){
        int res=0;
        int i=0;
        while(num >0){
            //d:find last digit
            int digit = num % 10;
            //d*baseValue
            res+=digit * Math.pow(base,i) ;
            i++;
            //update the number
            num /= 10;
        }

        return res;
    }
```