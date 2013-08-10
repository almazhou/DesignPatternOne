
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuarkBehavior quarkBehavior;
    public String flyMessage;
    public String quarkMessage;
    private String swimMessage;

    public void swim() {
        swimMessage = "I can swim";
        System.out.println(swimMessage);
    }

    public void performFly() {
        flyMessage = flyBehavior.fly();
    }

    public String getFlyMessage() {
        return flyMessage;
    }

    public void performQuark() {
        quarkMessage = quarkBehavior.quark();
    }

    public String getQuarkMessage() {
        return quarkMessage;
    }

    public String getSwimMessage() {
        return swimMessage;
    }
}
