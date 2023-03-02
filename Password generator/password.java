

import java.util.Random;
import java.util.Scanner;
public class password{
    
      public static void main(String[] args) {
        Random r = new Random();
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the length of password you want to generate: ");
        int length = ob.nextInt();
        String digit = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = lowerCase + upperCase;
        String special_character = "!@#$%^&*()_";
        String character = digit + alphabet + special_character;
        String password = "";

        password += digit.charAt(r.nextInt(digit.length()));
        password += lowerCase.charAt(r.nextInt(lowerCase.length()));
        password += upperCase.charAt(r.nextInt(upperCase.length()));
        password += special_character.charAt(r.nextInt(special_character.length()));

        for(int i = 1; i<= length-4; i++){
            password += character.charAt(r.nextInt(character.length()));

        }
        System.out.println("The strong password of length"+ length + " is :"+ password);
        ob.close();
    }
}

