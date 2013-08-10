
public class ModelDuckFlyBehavior implements FlyBehavior {
    @Override
    public String fly() {
        String message = "I can't fly";
        System.out.println(message);
        return message;
    }
}
