import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    private String fileName;

    public NumberTester(String fileName){
    this.fileName=fileName;
    }
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester=oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester=primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){this.palindromeTester=palindromeTester;}
    public void testFile(){
        try {
            Scanner scanner=new Scanner(new File(fileName));
            while(scanner.hasNextLine()){
                String[] zeile=scanner.nextLine().split(" ");
                int[] numbers=new int[zeile.length];

                for (int i = 0; i < zeile.length; i++) {
                    numbers[i]=Integer.parseInt(zeile[i]);
                }
                if (numbers.length == 2) {
                    switch (numbers[0]){
                        case 1:if(oddTester.testNumber(numbers[1])){
                            System.out.println("Die Zahl "+numbers[1]+" ist Gerade!");
                        }else {
                            System.out.println("Die Zahl "+numbers[1]+" ist nicht Gerade!");
                        }break;
                        case 2:if(primeTester.testNumber(numbers[1])){
                            System.out.println("Die Zahl "+numbers[1]+" ist eine Primzahl!");
                        }else {
                            System.out.println("Die Zahl "+numbers[1]+" ist keine Primzahl!");
                        };break;
                        case 3:if(palindromeTester.testNumber(numbers[1]))
                            {
                                System.out.println("Die Zahl "+numbers[1]+" ist eine Palindrome!");
                            }else {
                                System.out.println("Die Zahl "+numbers[1]+" ist keine Palindrome!");

                        }break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
