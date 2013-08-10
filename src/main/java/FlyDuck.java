
public class FlyDuck extends Duck {
    public FlyDuck(){
        flyBehavior = new FlyDuckFlyBehavior();
        quarkBehavior = new FlyDuckQuarkBehavior();
    }

}
