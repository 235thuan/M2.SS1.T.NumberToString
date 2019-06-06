import java.util.Scanner;

public class NumberToStringCv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter convert number: ");
        double trialNumber = input.nextDouble();
        int number = (int) trialNumber;
        System.out.printf("%-18s%s", "Number", "String\n");
        String[] myStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        String[] myLstr;
        int size = myStr.length;
        myLstr = new String[size];
        for (int i = 0; i < 10; i++) {
            myLstr[i] = myStr[i];
        }
        myLstr[3] = "Thir";
        myLstr[2]= "Twen";
        myLstr[5]= "Fif";

        if (number >= 0) {
            if (number <= 12) {
                switch (number) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        System.out.printf("%-18s%s", number, myStr[number]);
                        break;
                    case 11:
                        System.out.printf("%-18s%s", number, "Eleven");
                        break;
                    case 12:
                        System.out.printf("%-18s%s", number, "Twelve");
                        break;
                    default:
                        System.out.println("Out of ability");
                }
            } else if (number < 20) {
                int unit = number - 10;
                System.out.printf("%-18s%s%s", number, myLstr[unit], "teen");
            } else if (number < 100) {
                int bnit = (int) Math.floor(number / 10);
                String b = myLstr[bnit] + "ty";
                int unit = number % 10;
                if (number == 20)
                    System.out.printf("%-18s%s%s", number," ", b);
                else
                    System.out.printf("%-18s%s%s%s", number, b," ", myStr[unit]);
            } else if (number < 1000) {

                int cnit =(int) Math.floor(number/100);
                String c = myStr[cnit] + " hundred and";

                int bnit = (int) Math.floor(number/10);
                int dnit = (int) Math.floor(bnit%10);
                String b = myLstr[dnit] + "ty";
                int enit = number % 100;
                int unit = enit % 10;
                if (number ==120)
                    System.out.printf("%-18s%s%s%s", number,c," ", b);
                else if (number==112) {
                    System.out.printf("%-18s%s%s%s", number, c, " ", "Twelve");
                }
                else if (dnit<2) {
                    System.out.printf("%-18s%s%s%s%s", number, c, " ", myLstr[unit],"teen");
                }
                else {
                    System.out.printf("%-18s%s%s%s%s%s", number, c, " ", b, " ", myStr[unit]);
                }
            }
        }
    }
}



