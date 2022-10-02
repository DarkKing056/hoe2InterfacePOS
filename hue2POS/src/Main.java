import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        NumberTester numberTester=new NumberTester("saveDatei.txt");




        numberTester.setOddEvenTester((n)->n%2==0);


        numberTester.setPrimeTester((n) -> {
            for (int i = 2; i <= 9; i++) {
                if(n % i==0 && n!=i){
                    return false;
                }
            }return true;
        });

        numberTester.setPalindromeTester((n)->{
            String str=String.valueOf(n);
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            String rev=sb.toString();
            if(str.equals(rev)){
                return true;
            }else{ return false;}
        });

        numberTester.testFile();
        Scanner scannZahl=new Scanner(System.in);
        int g=0;
        do{
            System.out.println("_____________________________");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("4 - Exit program");
            g= Integer.parseInt(scannZahl.nextLine());

            double xA=0;
            double xB=0;
            double yA=0;
            double yB=0;

            switch (g){
                case 1:
                    System.out.println("Enter number x a> ");xA= Double.parseDouble(scannZahl.nextLine());
                    System.out.println("Enter number x b> ");xB= Double.parseDouble(scannZahl.nextLine());
                    System.out.println("Enter number y a> ");yA= Double.parseDouble(scannZahl.nextLine());
                    System.out.println("Enter number y b> ");yB= Double.parseDouble(scannZahl.nextLine());

                    System.out.println("_____________________________");

                    System.out.println("Choose operation: ");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");
                    int secondChoose= Integer.parseInt(scannZahl.nextLine());

                    RationalCalculator rationalCalculator=new RationalCalculator();
                    Number a=new Number(xA,xB);
                    Number b=new Number(yA,yB);

                    switch (secondChoose){
                        case 1:
                            System.out.println("a = "+rationalCalculator.add(a,b).getA());
                            System.out.println("b = "+rationalCalculator.add(a,b).getB());
                            break;
                        case 2:
                            System.out.println("a = "+rationalCalculator.subtract(a,b).getA());
                            System.out.println("b = "+rationalCalculator.subtract(a,b).getB());
                            ;break;
                        case 3:
                            System.out.println("a = "+rationalCalculator.multiply(a,b).getA());
                            System.out.println("b = "+rationalCalculator.multiply(a,b).getB());
                            break;
                        case 4:
                            System.out.println("a = "+rationalCalculator.divide(a,b).getA());
                            System.out.println("b = "+rationalCalculator.divide(a,b).getB());
                            break;
                        case 5:
                            System.out.println("Enter number x a> ");xA= Double.parseDouble(scannZahl.nextLine());
                            System.out.println("Enter number x b> ");xB= Double.parseDouble(scannZahl.nextLine());
                            System.out.println("Enter number y a> ");yA= Double.parseDouble(scannZahl.nextLine());
                            System.out.println("Enter number y b> ");yB= Double.parseDouble(scannZahl.nextLine());break;
                    }


                ;break;
                case 2:
                    System.out.println("Enter number x a> ");xA= Double.parseDouble(scannZahl.nextLine());
                    System.out.println("Enter number x b> ");xB= Double.parseDouble(scannZahl.nextLine());
                    System.out.println("Enter number y a> ");yA= Double.parseDouble(scannZahl.nextLine());
                    System.out.println("Enter number y b> ");yB= Double.parseDouble(scannZahl.nextLine());

                    System.out.println("_____________________________");

                    System.out.println("Choose operation: ");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");

                    int secondChoose2= Integer.parseInt(scannZahl.nextLine());


                    VectorCalculator vectorCalculator=new VectorCalculator();
                    Number a2=new Number(xA,xB);
                    Number b2=new Number(yA,yB);
                    switch (secondChoose2){
                        case 1:
                            System.out.println("a = "+vectorCalculator.add(a2,b2).getA());
                            System.out.println("b = "+vectorCalculator.add(a2,b2).getB());
                            break;
                        case 2:
                            System.out.println("a = "+vectorCalculator.subtract(a2,b2).getA());
                            System.out.println("b = "+vectorCalculator.subtract(a2,b2).getB());
                            ;break;
                        case 3:
                            System.out.println("a = "+vectorCalculator.multiply(a2,b2).getA());
                            System.out.println("b = "+vectorCalculator.multiply(a2,b2).getB());
                            break;
                        case 4:
                            System.out.println("a = "+vectorCalculator.divide(a2,b2).getA());
                            System.out.println("b = "+vectorCalculator.divide(a2,b2).getB());
                            break;
                        case 5:
                            System.out.println("Enter number x a> ");xA= Double.parseDouble(scannZahl.nextLine());
                            System.out.println("Enter number x b> ");xB= Double.parseDouble(scannZahl.nextLine());
                            System.out.println("Enter number y a> ");yA= Double.parseDouble(scannZahl.nextLine());
                            System.out.println("Enter number y b> ");yB= Double.parseDouble(scannZahl.nextLine());break;
                    }
                    break;
                case 4:return;
            }
        }while (g!=4);
    }


}