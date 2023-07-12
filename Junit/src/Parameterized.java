import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Parameterized {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8})
    public void IsEven(int number)
    {
       assertTrue(number%2==0);
    }
}
