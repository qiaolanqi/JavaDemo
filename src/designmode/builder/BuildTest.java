package designmode.builder;

public class BuildTest {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        
        Director director = new Director(builder);
        director.constructProduct();
        
        Product product = builder.getProduct();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }

}
