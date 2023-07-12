package TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        Test1test.class,
        Test2test.class
})
public class TestSuite {
}
