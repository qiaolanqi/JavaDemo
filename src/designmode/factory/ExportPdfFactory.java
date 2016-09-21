
package designmode.factory;

public class ExportPdfFactory implements IExportFactory {

    public IExportProduct factory(String type) {
        if (type.equals("standard")) {
            return new ExportStandardPdfProduct();
        } else {
            return new ExportFinancialPdfProduct();
        }
    }

}
