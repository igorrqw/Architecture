package FactoryMethod;

public class GenBikeProd implements GeneratorTransport {
    @Override
    public Transport GeneratorTransport() {
        return new Bike();
    }
}
