import calc.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1, 2, "plus", 3}, {4, 2, "minus", 2}, {6, 8, "plus", 14}, {8, 3, "minus", 5}
        });
    }

    private int elem1;
    private int elem2;
    private String operation;
    private long expected;

    public CalculatorTest(int elem1, int elem2, String operation, long expected){
        this.elem1 = elem1;
        this.elem2 = elem2;
        this.operation = operation;
        this.expected = expected;
    }

    @Test
    public void test(){
        assertThat(Calculator.calculate(elem1, elem2, operation), is(equalTo(expected)));

    }
}
