package primeNum;

class FortySeventhPrimeNum{
    int count =1;
    int num=2;
    void fortySeventhPrimeNum(){
        while(count<=47){
               if(isPrime(num))
                   count++;
               num++;
        }
        System.out.println("47th prime num: " + (num-1));
    }
    boolean isPrime(int num){
        for( int i=2; i < num;i++ ){
            if ( num < 2  || num%i==0)
                return false;
        }
        return true;
    }
}