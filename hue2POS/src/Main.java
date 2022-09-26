public class Main{
    public static void main(String[] args) {
        NumberTester numberTester=new NumberTester("D:\\POS\\hue2\\hoe2InterfacePOS\\hue2POS\\src\\saveDatei.txt");




        numberTester.setOddEvenTester((n)->n%2==0);


        numberTester.setPrimeTester((n) -> {
            for (int i = 2; i <= 9; i++) {
                if(n % i==0 && n!=i){
                    return false;
                }
            }return true;
        });

        numberTester.setPalindromeTester((n)->{
            return true;
        });

        numberTester.testFile();
    }


}