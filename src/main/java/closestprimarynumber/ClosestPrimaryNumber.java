package closestprimarynumber;

public class ClosestPrimaryNumber {
    public static int closestFirstNumberGenerator(int number){
        int firstPrime = 0;
        int secondPrime = 0;

        for (int i = 2;i<number;i++){
            if(isPrime(i)){
                firstPrime = i;
            }
        }
        int nextPrimaty = number+1;
        while (true){
           if(isPrime(nextPrimaty)){
               secondPrime = nextPrimaty;
               break;
           }
            nextPrimaty++;
        }
        if(Math.abs(number-firstPrime)>Math.abs(number-secondPrime)){
            return secondPrime;
        }
        if(Math.abs(number-firstPrime)<Math.abs(number-secondPrime)){
            return firstPrime;
        }
        if(Math.abs(number-firstPrime)==Math.abs(number-secondPrime)){
            if(firstPrime>secondPrime){
                return firstPrime;
            }
            else return secondPrime;
        }
        throw new RuntimeException();
    }

    public static  boolean isPrime(int number){
        boolean isPrime = true;
        for (int i=2;i<number;i++){
            if(number%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
