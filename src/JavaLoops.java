public class JavaLoops {
    public static void main(String[] args)
    {
        //while loop
        int i=1;
        while(i<=10)
        {
            System.out.println("Pinki Akter"+i);
            i++;
        }
        System.out.println("CSE Engineer"+i);
        
        
        
        int x=1;
        while(x<=5)
        {
            System.out.println("Pinki Akter"+x);
            int j=1;
            while(j<=3)
            {
                System.out.println("CSE Engineer"+j);
                j++;
            }
            x++;
        }
        //do while loop
        int t=1;
        do
        {
            System.out.println("Bye"+t);
            t++;
        }while(t<=9);
        // for loop
        for(int m=0;m<5;m++)
        {
            System.out.println("who are you?"+m);
        }
    }
}
