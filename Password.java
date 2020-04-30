import java.util.Scanner;

/*
Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Expected Output:
1. A password must have at least eight characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits                                        
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
Password is valid: abcd1234 
*/
public class Password {
    public static void main(String[] args) {
        String pswd;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. A password must have at least eight characters.\n2. A password consists of only letters and digits.\n3. A password must contain at least two digits\nInput a password (You are agreeing to the above Terms and Conditions.");
        pswd = sc.next();
        checkPswd(pswd);
    }
    public static void checkPswd(String pswd) {
        if(pswd.length()>=8 && pswd.matches("[a-zA-Z0-9]+") && countnum(pswd)>=2)
        {
            System.out.println("Password is valid: "+pswd);
        }
        else 
        {
            System.out.println("Password is not a valid: "+pswd);
        }
    }
    public static int countnum(String pswd) {
        int charCount=0;
        for (int i = 0; i < pswd.length(); i++) {
            char ch = pswd.charAt(i);
            if (is_Numeric(ch)) charCount++;
        }
        return charCount;
    }
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
}