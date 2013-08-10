
public class FlyDuckQuarkBehavior implements QuarkBehavior {
    @Override
    public String quark() {
        String message = "I can quark";
        System.out.println(message);
        return message;
    }
}
