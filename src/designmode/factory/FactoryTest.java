
package designmode.factory;

public class FactoryTest {

    public static void main(String[] args) {
        IExportFactory factory = new ExportHtmlFactory();
        IExportProduct product = factory.factory("standard");
        boolean export = product.exportFile("Haha");
    }

}
