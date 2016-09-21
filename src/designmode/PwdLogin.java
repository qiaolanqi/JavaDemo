
package designmode;

public class PwdLogin implements ILogin {

    public boolean verify(String name, String password) {
        System.out.println("PwdLogin");
        return true;
    }

}
