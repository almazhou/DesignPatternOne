
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new ModelDuckFlyBehavior();
        quarkBehavior = new ModelDuckQuarkBehavior();
    }
}
