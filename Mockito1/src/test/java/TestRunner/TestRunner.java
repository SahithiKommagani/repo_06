package TestRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result r = JUnitCore.runClasses(TestSuite.class);
        int failureCount=r.getFailureCount();
        int numCount=r.getRunCount();
        int successCount=numCount-failureCount;
        System.out.println("Passes :"+successCount +" Failed "+failureCount);
        for (Failure f : r.getFailures()) {
            System.out.println(f.toString());
        }

        System.out.println(r.wasSuccessful());
    }
    }
