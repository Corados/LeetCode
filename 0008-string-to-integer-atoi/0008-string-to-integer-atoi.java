import static java.lang.Integer.parseInt;
import static java.lang.Math.*;

class Solution {
    public int myAtoi(String s) {
        String x = "";
        int i = 0;
        int pm = 0;
        long ans = 0;
        int digit = 0;

        if (s.length() == 0) return 0;

        char check = s.charAt(0);
        // check there is " " empty string
        while (i < s.length())
        {
            if(s.charAt(i) == ' ')
            {i++;}
            else break;
        }

        // if there is only empty string return 0
        if (i == s.length()) return 0;

        // check it is plus or minus
        if (s.charAt(i) == '+')
        {
            pm = +1;
            i++;
        }
        else if(s.charAt(i) == '-')
        {
            pm = -1;
            i++;
        }

        // Check string start with letter
        while(i < s.length()) {
            if (isInteger(String.valueOf(s.charAt(i)))) {

                digit = s.charAt(i) - '0';

                    if (ans > Long.MAX_VALUE / 10 || (ans == Long.MAX_VALUE / 10 && digit > 7)) {
                    break;
                }

                ans = ans * 10 + digit;
            }
            else if (!isInteger(String.valueOf(s.charAt(i)))) {
                break;
            }
            i++;
        }
        
        // bring it is plus or minus
        if(pm != 0) 
        {
            ans = ans * pm;
        }

         // if its number check its 32-bit signed integer.
        if(ans < pow(-2,31))
        {
            ans = (int) pow(-2,31);
            return (int)ans;
        }
        else if(ans > pow(2,31)-1)
        {
            ans = (int)pow(2,31);
            return (int)ans;
        }

        return (int)ans;
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}