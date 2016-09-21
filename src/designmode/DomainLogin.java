
package designmode;

public class DomainLogin implements ILogin {

    public boolean verify(String name, String password) {
        System.out.println("DomainLogin");
        return true;
    }

}
