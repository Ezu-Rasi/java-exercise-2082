import java.util.Scanner;

 class Guessnum {
    static int hiddenNumber = 48;
    static int userInput;
    static Scanner sc = new Scanner(System.in);

    Guessnum(int hidNum, int userInput){
        hiddenNumber = hidNum;
        this.userInput = userInput;
    }
    
    static void getNumber(){
        System.out.print("Enter the number you are guessing : ");
        userInput = sc.nextInt();
     }

     public static void main(String [] args) {
        boolean running = true;

        System.out.println(" Welcome to The Number Guessing Game. ");
        
        System.out.println("Guess a Number between 1 to 100");

        getNumber();

        while(running){
            if(hiddenNumber < userInput){
                System.out.println("Your Guessed number is high");
                getNumber();

            } else if(hiddenNumber > userInput){
                System.out.println("Your Guessed number is Low");
                getNumber();

            } else if(hiddenNumber == userInput){
                System.out.println("Your Guessed number is correct");
                running = false;
        
            }
            else {
                System.out.println("Invalid Input");
                getNumber();
            }
            
        }
    }
 }