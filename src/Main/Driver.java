package Main;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Type your paragraph here:");
        Scanner sc=new Scanner(System.in);
        String userInput = sc.nextLine();
        sc.close();
        // trimming the user input
        userInput=userInput.trim();
        int count=0;
        if(userInput.length() == 0){
            count = 0;
        }else{
            // count the first word
            count++;
            // it must exist because the first character must not be a space
            for(int i=0;i<userInput.length();i++){
                if(userInput.charAt(i) == ' ' && userInput.charAt(i+1)!= ' '){
                    //' ?'
                    count++;

                }
            }


        }
        System.out.println("Word count: "+count);
    }
}
