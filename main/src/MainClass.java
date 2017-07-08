/**
 * Created by bfica on 7/8/2017.
 */
public class MainClass
{
    public static void main(String[] args)
    {
        try
        {
            String switchString;
            switchString = args[0];

            if(args.length != 1)
            {
                System.out.println("Sorry, only one switch allowed");
            }
            else
            {
                switch(switchString)
                {
                    case "hi":
                        System.out.println("HELLO!");
                        break;
                    case "bye":
                        System.out.println("BYEEEEEEEEEEEE!");

                }
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("The array is empty. Must enter at /n least one /n/t value.");
            System.out.println(e.getMessage());
        }

    }
}

