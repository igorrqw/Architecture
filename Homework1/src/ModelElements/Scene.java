package ModelElements;

public class Scene {
    int id;
    PoligonalModel models;
    Flash flashes;
    Camera camera;

    public Scene(PoligonalModel models, Flash flashes, Camera camera) {
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public <T> T method1(T param){
        return param;
    }
    public <T, E> T method2(T param1, E param2){
        return param1;
    }

}