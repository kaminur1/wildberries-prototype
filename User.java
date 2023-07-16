public class User {
    String Username;
    String Password;
    void;
    boolean changePassword(){
        String pass = "";
        int n = 1;
        while (n-- > 0) {
            if(pass.equals(Password)) {
                String newPass = "";
                String conNewPass = "";
                if (newPass.equals(conNewPass)) {
                    Password = newPass;
                    return true;
                } else {
                    return false;
                }
            }
            else {
                pass = ""; f
            }
        }
        return false;
    }
}
