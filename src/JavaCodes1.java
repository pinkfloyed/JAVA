public class JavaCodes1 {
    public static void main(String[] args)
    {
        int p=20,q=30;
        if(p<q){
            System.out.println("pinki akter");
            System.out.println("CSE Engineer");
        }
        else
            System.out.println("Pinki Akter");
        // ternary operator
        int x=10;
        int res= x%2==0 ? 1 : 0;
        System.out.println(res);
        
        // switch case statement
        int n=17;
        switch(n)
        {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter valid number");
                
                
        //another switch statement
        String day="Friday";
        switch(day)
        {
            case "Saturday","Sunday" : yield "7 am";
            case "Monday" : yield "8 am";
            case "Friday" : yield "10 am";
            default : yield "9 am";
        }
        }
    }
}
