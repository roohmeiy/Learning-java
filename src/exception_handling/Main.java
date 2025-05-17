package exception_handling;

public class Main {
    public static void main(String[] args) throws UnderAgeException  {
        LearnThrows lt= new LearnThrows();
        try{
            lt.fun();
        }
        catch(NullPointerException | ArithmeticException e){
            System.out.println("exception occurred");
        }
        Voting voting= new Voting();
            voting.voting();
    }
}
