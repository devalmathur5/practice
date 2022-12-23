package lambda;

public class LambdaFunc {

    public static void main(String[] args) {
        Demo isOdd = (n) -> (n % 2) != 0;
        Demo isPrime = (n) -> {
            boolean isP = false;
            for(int i=2; i<n; i++){
                if(n%i==0){
                    isP = false;
                }
            }
            return isP;
        };
        Demo isPal = (n) -> {
            boolean isP = true;
            String str = n+"";
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) != str.charAt(str.length() -i -1)){
                    isP = false;
                }
            }
            return isP;
        };
    }
}

interface Demo{
    boolean isWhat(int i);
}
