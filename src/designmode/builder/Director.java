
package designmode.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructProduct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
