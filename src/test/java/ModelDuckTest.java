import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ModelDuckTest {
    Duck duck;

    @Before
    public void setUp() throws Exception {
        duck = new ModelDuck();
    }

    @Test
    public void should_not_be_able_to_fly() {
        duck.performFly();

        assertThat(duck.getFlyMessage(),is("I can't fly"));
    }
    @Test
    public void should_not_be_able_to_quark() {
        duck.performQuark();

        assertThat(duck.getQuarkMessage(),is("I can't quark"));
    }
    @Test
    public void should_be_able_to_swim() {
        duck.swim();

        assertThat(duck.getSwimMessage(),is("I can swim"));
    }
}
