import FactoryMethod.GeneratorTransport;
import FactoryMethod.Transport;
import FactoryMethod.GenCarProd;
import FactoryMethod.GenBikeProd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<GeneratorTransport> fabricList = new ArrayList<>();
        fabricList.add(new GenBikeProd());
        fabricList.add(new GenCarProd());
        createAndGetCost(fabricList);
    }
    static void createAndGetCost(List<GeneratorTransport> fabricList){
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            Transport fabric = fabricList.get(Math.abs(rnd.nextInt() % fabricList.size())).GeneratorTransport();
            System.out.println(fabric);
        }
    }
}