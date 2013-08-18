
public class FlyDuckQuarkBehavior implements QuarkBehavior {
    @Override

    public String quark() {
        String message1 = "I can quark";
        System.out.println(message1);
        return message1;
    }
}
