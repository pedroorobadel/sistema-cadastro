package system_account;

public class LoadRegister {

    public static void main(String[] args) {

        String[] email = {"PEDRO@GMAIL.COM","MATHEUS@GMAIL.COM"};
        String[] user = {"PEDRO12","MATHEUS91"};
        String[] password = {};

        UserRegister userData = new UserRegister (email,user,password);

        userData.listEmail();
        userData.listUser();
        userData.listPassword();

    }
}
