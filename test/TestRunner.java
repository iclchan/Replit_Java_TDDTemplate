import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);
        if (result.getFailures().isEmpty()) {
            System.out.println("All Test Passed");
            return;
        }
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}