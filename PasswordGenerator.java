// this program creates random passwords
// tells you the password strength depending on the length

import java.util.Scanner;

public class PasswordGenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many passwords do you want?");
        int total = sc.nextInt();
        System.out.print("What length do you want for your password?");
        int length = sc.nextInt();
        //array for storing passwords
        sc.close();
        String[] randomPasswords = new String[total];
        //loop through total passwords
        for(int i = 0;i<total;i++){
            String randomPassword ="";
            for(int j = 0;j<length;j++){
                //generate random character
                randomPassword+=randomCharacter();
            }
            //add your random password to the array
            randomPasswords[i] = randomPassword;
        }
        //print the array
        printPasswords(randomPasswords);
        //print password strength
        System.out.println(getPasswordStrength(length));
    }
    public static String getPasswordStrength(int length){
        if (length < 5) {
            return "Weak!we suggest a strong password";
            
        }else if(length <8){
            return "Average!we suggest a stronger password";
        }else if (length <12){
            return "Strong!you can make it stronger if you wish";
        }else{
            return "Very Strong";
        }
    }
    public static void printPasswords(String[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //i have used ascii characters
    // 0-9 => 48-57 in ASCII
    // A-Z => 65- 90 in ASCII
    // a-z => 97-122 in ASCII
    public static char randomCharacter(){
        int rand = (int)(Math.random()*62);//62 is the possible number of characters,both uppercase and lowercase.
        //rand is between 0-61 inclusive
        // if rand = 0-9=>number
        // if rand = 10-35 => uppercase
        // if rand = 36-61 => lowercase
        if(rand<=9){
            int ascii = rand + 48;//48-0 = 48
            return(char)(ascii);
        }else if (rand<=35) {
            int ascii = rand + 55;//65-10 = 55
            return(char)(ascii);    
        }else{
            int ascii = rand + 61;//97-36 = 61
            return(char)(ascii);
        }
    }

}