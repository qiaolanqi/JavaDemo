
package designmode;

/**
 * 简单工厂模式
 * 
 * @author yuejiaoli
 */
public class SimpleFactory {

    public static void main(String[] args) {
        ILogin login = new SimpleFactory().factoryILogin("pwd");
        login.verify("Tom", "123");
    }

    public ILogin factoryILogin(String type) {
        ILogin login;
        if (type.equals("pwd")) {
            login = new PwdLogin();
        } else {
            login = new DomainLogin();
        }
        return login;
    }
}
