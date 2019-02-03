package project3;

import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {

     
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("==================SECURITY SERVICES==================");
        String text;
        int enter2;
        int enter1 = 1;
        String records = "==================SECURITY SERVICES==================\n";
        while (enter1 != 0) {
            System.out.print("Services Menu\n1 - Ciphering Text\n2 - Deciphering Test\n3 - Records\n0 - Exit\n\nPlease enter the number of the service needed: ");
            enter1 = input.nextInt();
            switch (enter1) {                   //switch for Main Menu
                case 1:                        //This case for Chiphering
                     System.out.println("\n************************************************");
                    System.out.print("Techniques Menu\n1 - ATBASH\n2 - HEX\n3 - VIGENERE\n0 - Return to Main Menu\n\nPlease enter the number of the service neede: ");
                    enter2 = input.nextInt();
                    System.out.println("\n************************************************");

                    switch (enter2) {          //Switch for Sub Menu: Chiphering
                        case 1:                //This case for ciphering and Records in ATBASH 

                            System.out.print("Enter the text to be ciphered: ");
                            text = input1.nextLine();
                            System.out.println("\n" + text + " has been ciphered using ATBASH : " + cipherAndDecipheriATBASH(text));     
                            records = records + text + " has been ciphered using ATBASH : " + cipherAndDecipheriATBASH(text) + "\n" ;
                            break;
                        case 2:               //This case for ciphering and Records in HEXADECIMAL
                            System.out.print("Enter the text to be ciphered: ");
                            text = input1.nextLine();
                            System.out.println("\n" + text + " has been ciphered using HEX : " + cipherHexadecimal(text));     
                             records = records + text + " has been ciphered using HEX : " + cipherHexadecimal(text) + "\n";
                            break;
                        case 3:               //This case for chiphering and Records in VIGENERE
                            System.out.print("Enter the text to be ciphered: ");
                            text = input1.nextLine();
                            System.out.println("\n" + text + " has been ciphered using VIGENERE : " + cipherVigenere(text));     
                            records = records + text + " has been ciphered using VIGENERE : " + cipherVigenere(text) + "\n";
                            break;
                        case 0:              //This case for Return to Main Menu
                            break;
                        default:            // This case for Invalid Input
                            System.out.println("Invalid Input!");
                            records = records + "Invalid Input!" + "\n" ;
                    }
                    System.out.println("\n************************************************");
                    break;
                case 2:                               //This case for Deciphering
                     System.out.println("\n************************************************");
                    System.out.print("Techniques Menu\n1 - ATBASH\n2 - HEX\n3 - VIGENERE\n0 - Return to Main Menu\n\nPlease enter the number of the service neede: ");
                    enter2 = input.nextInt();
                    System.out.println("\n\n************************************************");

                    switch (enter2) {                 //Switch for Sub Menu: Deciphering
                        case 1:                       //This case for Deciphering and Records in ATBATSH

                            System.out.print("Enter the text to be deciphered: ");
                            text = input1.nextLine();
                            System.out.println("\n" + text + " has been ciphered using DEATBASH : " + cipherAndDecipheriATBASH(text));    
                             records = records + text + " has been ciphered using DEATBASH : " + cipherAndDecipheriATBASH(text) + "\n" ;
                            break;
                        case 2:                      //This case for Deciphering and Records in HEXADECIMAL
                            System.out.print("Enter the text to be deciphered: ");
                            text = input1.nextLine();
                            System.out.println("\n" + text + " has been deciphered using HEX : " + decipherHexadecimal(text));
                            records = records + text + " has been deciphered using HEX : " + decipherHexadecimal(text) + "\n";
                            break;
                        case 3:                     //This case for Deciphering and Records in VIGENERE
                            System.out.print("Enter the text to be deciphered: ");
                            text = input1.nextLine();
                            System.out.println("\n" + text + " has been deciphered using VIGENERE : " + decipherVigenere(text));
                            records = records + text + " has been deciphered using VIGENERE : " + decipherVigenere(text) + "\n" ;
                            break;
                        case 0:                    //This case for Return to Main Menu
                            break;
                        default:                   //This case for Inailed Input!
                            System.out.println("Invalid Input!");
                            records = records + "Invalid Input!" + "\n" ;
                    }
                    System.out.println("\n************************************************");
                    break;
                case 3:                     //This case for Show Records
                     System.out.println("\n************************************************");
                    System.out.println(records);
                    break;
                case 0:                    //This case for Exit
                    System.out.println("-----------------End of Services-----------------");
                    break;
                default:                   //This case for Invalid Input!
                    System.out.println("Invalid Input\n----------------------------------");

            }

        }
    }

    // method use to Ciphering and Deciphering in the same time text by useing ATBASH technique 
    public static String cipherAndDecipheriATBASH(String text) {
        text = text.toUpperCase();
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            int n = (int) (text.charAt(i) - 64);
            if (text.charAt(i) == ' ') {
                newText = newText + " ";
            } else {
                char t = (char) ((n * -1 + 26) + 'A');
                newText = newText + t;
            }

        }
        return newText;                 //edit

    }

    // method use to Ciphering text by useing Vigenere technique 
    public static String cipherVigenere(String text) {
        text = text.toUpperCase();
        String newText = "";
        String keyword = generateKeyWord(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                newText = newText + " ";
            } else {
                int n1 = (int) (text.charAt(i) - 64);
                int n2 = (int) (keyword.charAt(i) - 64);
                newText = newText + (char) (((n1 + n2) % 26) + 63);
            }

        }
        return newText;               //edit
    }

    // method use to Deciphering text by useing Vigenere technique 
    public static String decipherVigenere(String text) {
        text = text.toUpperCase();
        String newText = "";
        String keyword = generateKeyWord(text);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                newText = newText + " ";
            } else {
                int n1 = (int) (text.charAt(i) - 65);
                int n2 = (int) (keyword.charAt(i) - 65);
                if (n1 - n2 == 0) {
                    newText = newText + (char) (65);
                } else if (n1 - n2 > 0) {
                    newText = newText + (char) ((n1 - n2) + 65);
                } else {
                    newText = newText + (char) (((n1 - n2) + 26) + 65);
                }

            }

        }
        return newText;                            //edit

    }

    // هادي ميثود مساعدة للميثود الاولى عشان في الطريقة بنحتاج نعمل كلمة سرية بتساعدنا في التشفير فانا اعملتها  في ميثود لحالها 
    public static String generateKeyWord(String text) {
        String keyword = "SECRET";
        String newKeyword = "";
        for (int i = 0, j = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                newKeyword += " ";
            } else {
                char c = text.charAt(i);
                if (c < 'A' || c > 'Z') {
                    continue;
                }
                newKeyword += keyword.charAt(j);
                j = ++j % keyword.length();
            }

        }
        return newKeyword;

    }
    // method use to Ciphering text by useing Hexadecimal technique

    public static String cipherHexadecimal(String str) {

        str = str.toUpperCase();
        String s2, answer = "";
        int remainder, n;
        for (int i = 0; i < str.length(); i++) {
            n = str.charAt(i);
            s2 = "";
            while (n >= 16) {
                remainder = n % 16;
                if (remainder >= 10) {
                    s2 = Character.toUpperCase((char) (remainder - 10 + 65)) + s2;     //edit
                } else {
                    s2 = remainder + s2;
                }
                n = n / 16;
            }
            s2 = n + s2;
            answer = answer + " " + s2;
        }
        return answer.trim();
    }

    // method use to Deciphering text by useing Hexadecimal technique
    public static String decipherHexadecimal(String s) {

        Scanner input = new Scanner(s);
        String s1, s2 = "";
        int n, n1;
        while (input.hasNext()) {
            s1 = input.next();
            n1 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (Character.isDigit(s1.charAt(i))) {
                    n = Integer.parseInt(s1.substring(i, i + 1));
                } else {
                    n = (int) s1.toUpperCase().charAt(i) + 10 - 65;
                }
                n1 = (int) (Math.pow(16, s1.length() - 1 - i)) * n + n1;
            }
            s2 = s2 + (char) n1;
        }
        return s2;
    }

}
