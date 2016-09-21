
package designmode.factory;

public class ExportHtmlFactory implements IExportFactory {

    public IExportProduct factory(String type) {
        if (type.equals("standard")) {
            return new ExportStandardHtmlProduct();
        } else {
            return new ExportFinancialHtmlProduct();
        }
    }

}
