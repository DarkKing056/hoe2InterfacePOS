public class Main{
    public static void main(String[] args) {
        NumberTester numberTester=new NumberTester("saveDatei.txt");


        numberTester.setOddEvenTester((n)->n%2==0);
        
    }


}