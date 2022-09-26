import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private Object palindromeTester;

    private String fileName;

    public NumberTester(String fileName){

    }
    public void setOddEvenTeseter(NumberTest oddTester){
        this.oddTester=oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester=primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester=palindromeTester;
    }
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
                        case 1:break;
                        case 2:break;
                        case 3:break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
