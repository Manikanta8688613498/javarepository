import java.util.*;
class BasicAirthematicCalculations {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int secondNumber=sc.nextInt();
        System.out.print("Select the Operation:");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+':System.out.println("The addition of Given two numbers is: "+(firstNumber+secondNumber));
            break;
            case '-':System.out.println("The substraction of given two numbers are: "+(firstNumber-secondNumber));
            break;
            case '*':System.out.println("The multiplication of Given two numbers is: "+(firstNumber*secondNumber));
            break;
            case '/':System.out.println("The divison of given two numbers are: "+(firstNumber/secondNumber));
            break;
            case '%':System.out.println("The modulodivision of Given two numbers is: "+(firstNumber%secondNumber));
            break;
            default:System.out.println("Invalid choice");
        }
    }
}