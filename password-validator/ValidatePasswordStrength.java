import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;

import java.util.ArrayList;
import java.util.List;

class ValidatePasswordStrength
{
    public static void main(String[] args)
    {
        Zxcvbn zxcvbn = new Zxcvbn();

        List<String> commonPasswords = new ArrayList<>();
        commonPasswords.add("password12");
        commonPasswords.add("password@1");
        commonPasswords.add("password@12");
        commonPasswords.add("password@123");

        Strength strength = zxcvbn.measure(args[0], commonPasswords);

        if (strength.getScore() >= 1)
        {
            System.exit(0);
        }
        System.exit(1);
    }
}