package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangedObserver changedObserver;

    public (IModelChangedObserver changedObserver)

        this.changedObserver = changedObserver;

        this.models = new PoligonalModel(new Poligone());
        this.flashes = new Flash();
        this.cameras = new Camera();

        this.scenes = new Scene(this.models, this.flashes, this.cameras);


    public Scene getScene(int n) {
                return Scenes.get(i);
            }

        }
        return null;
    }
    @Override
    public void NotifyCange(IModelChanger sender) {

    }