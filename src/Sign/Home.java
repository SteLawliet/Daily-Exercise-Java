package Sign;


import java.util.Scanner;

import Sign.impl.SignIn;

/**
 * Created by Stelawliet on 17/9/23.
 * 1.加载menu
 * welcome
 * a.Sign up
 * a1.up();
 * a2.error
 * go b1.
 * <p>
 * b.Sign in
 * b1.in();
 * b2.showUsersInfo
 * show()
 * <p>
 * c.Sign out
 * out();
 * <p>
 * d.Admin
 * d1.lookUsers
 * d2.UpdataUsers
 * d3.removeUsers
 * <p>
 * <p>
 * 2.
 */
public class Home {
    public static void main(String[] args) {

        SignIn signIn = new SignIn();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter the choice");
            System.out.println("1: in , 2 : up , 3: Management ,4: out");
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    Users users = new Users();
                    System.out.println("Start sign in");
                    users.setuName(scanner.nextLine());
                    users.setuPassword(scanner.nextLine());
                    signIn.in(users);
                    break;

                case "2":
                    System.out.println("Start sign up");
                    Users users1 = new Users();
                    users1.setuName(scanner.nextLine());
                    users1.setuPassword(scanner.nextLine());
                    signIn.up(users1);
                    break;
                case "3":
                    System.out.println("Admin Management");
                    Management.Show();
                    break;
                case "4":
                    System.out.println("out");
                    System.exit(0);
            }
        }
    }
}
