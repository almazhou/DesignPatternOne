
public class FlyDuckFlyBehavior implements FlyBehavior {
    @Override
    public String fly() {
        String message = "I can fly";
        System.out.println(message);
        return message;
    }
}
