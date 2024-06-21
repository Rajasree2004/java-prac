//without recursion 

class Factorial{
    public static void main(String args[]){
        int i, fact = 1;
        int number = 5;
        for(i = 1; i<=number; i++){
            fact += i;
        }
        System.out.println(number+"! = "+ fact);
    }
}

//with recursion

class FactRec{
    static int fact(int n){
        if(n == 0)
            return 1;
        else
            return n * fact(n-1);
    }

    public static void main(String args[]){
        int i, fact = 1;
        int number = 4;
        fact = fact(number);
        System.out.println(number+"! = "+ fact);
    }
}
