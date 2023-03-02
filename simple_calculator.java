//simple calcultor 
import java.util.Scanner;
public class simple_calculator{
    public static void main(String[]args){
        
        //craete an object of scanner
        Scanner input=new Scanner (System.in);
        
        //declaring variable
        char operator;
        double number1,number2,result;
    
        //asking the user to input the oparator
        System.out.println("enter the oparator (+,-,*,/*)  :  ");
        operator=input.next().charAt(0);
        

        System.out.println("enter the first number  :  ");
        number1=input.nextDouble();

        System.out.println("enter the second number  :   ");
        number2=input.nextDouble();


        switch(operator){
            //performing addition
            case'+':{
            result=number1+number2;
            System.out.println("addition of"+number1+"and"+number2+"is  :"+result);
            break ;
            }
            
            //performing subtraction
            case '-':{
                result=number1-number2;
            System.out.println("subtraction of"+number1+"and"+number2+"is  :"+result);
            break ;
            }

            //performing multiplication
            case '*':{
                result=number1*number2;
            System.out.println("multiplication of"+number1+"and"+number2+"is  :"+result);
            break;
            }

            //performing devivion

            case '/':{
                result=number1/number2;
            System.out.println("addition of"+number1+"and"+number2+"is  :"+result);
            break ;
            }

            //default command
            default :{
                System.out.println("invalid input");

            }
            


            //performing addition
        }

    
    
    input.close();
    } 
}