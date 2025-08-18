import java.util.Scanner;

class User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println(number); 
        
        scanner.close();
    }
}
