import java.io.*;
import java.util.Scanner;

/**
 * Created by bfica on 7/8/2017.
 */
public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String switchString;

        while(true)
        {

            try
            {
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
                            break;
                        case "exit":
                            System.out.println("CYAAAAAAAA");
                            System.exit(0);
                            break;
                    }
                }
                args[0] = br.readLine();
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("The array is empty. Must enter at /n least one /n/t value.");
                System.out.println(e.getMessage());
            }
        }
    }
}

