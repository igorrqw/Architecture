package FactoryMethod;

public class GenCarProd implements GeneratorTransport {
    @Override
    public Transport GeneratorTransport() {
        return new Car();
    }
}
