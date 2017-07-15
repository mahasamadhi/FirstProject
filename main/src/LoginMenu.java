/**
 * Created by bfica on 7/9/2017.
 */

import java.io.*;

public class LoginMenu {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String switchString = null;

        System.out.println("Enter: New User, Returning User, Exit");

        try {
            switch (switchString)
            {
                case "New User":
                    System.out.println("Enter the following details in order: username, password, email, age");
                    Users.setEmail(br.readLine());
                    Users.
                    break;
                case "Returning User":
                    System.out.println("Enter Username and Password: username, password"); //accesses list of usernames and passwords
            }

        } catch (IOException e) {
            System.out.println("IO exception caught" + e.getMessage());
        }
        }
    }


