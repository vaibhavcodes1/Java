package Java;

import java.util.Scanner;
public class Check_vowels{
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str = sc.nextLine();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                char Lower = Character.toLowerCase(ch);
                if(Lower=='a' || Lower=='e' || Lower=='i' || Lower=='o' || Lower=='u'){
                    vowels++;}
                    else{
                        consonants++;
                }
            }
        }
        System.out.println("vowels count is:"+vowels);
        System.out.println("consonant count is:"+consonants);
        sc.close();
    }
}