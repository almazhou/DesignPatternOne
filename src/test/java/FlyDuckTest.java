import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FlyDuckTest {
    @Test
    public void should_be_able_to_fly() {
        Duck duck = new FlyDuck();
        duck.performFly();

        assertThat(duck.getFlyMessage(),is("I can fly"));
    }
    @Test
    public void should_be_able_to_quark(){
        Duck duck = new FlyDuck();
        duck.performQuark();

        assertThat(duck.getQuarkMessage(),is("I can quark"));
    }
    @Test
    public void should_be_able_to_swim(){
        Duck duck = new FlyDuck();
        duck.swim();

        assertThat(duck.getSwimMessage(),is("I can swim"));
    }
}
