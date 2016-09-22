
package designmode.builder;

public class ConcreteBuilder implements Builder {
    Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("part1 build");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2 build");
    }

    @Override
    public Product getProduct() {
        return product;
    }

}
