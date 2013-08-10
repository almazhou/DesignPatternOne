
public class ModelDuckQuarkBehavior implements QuarkBehavior {
    @Override
    public String quark() {
        String message = "I can't quark";
        System.out.println(message);
        return message;
    }
}
