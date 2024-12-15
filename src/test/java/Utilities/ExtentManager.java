package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {

    private static final ExtentReports extent;

    private static ThreadLocal<ExtentTest> testThreadLocal = new ThreadLocal<>();

    static {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        ExtentSparkReporter reporter = new ExtentSparkReporter("src/test/resources/reports/report_" + timestamp +".html");
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setDocumentTitle("Cohort20 Automation TestNG Report");
        reporter.config().setReportName("TestNG 51 Test Cases Results");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    public static synchronized ExtentTest getTest() {
        return testThreadLocal.get();
    }

    public static synchronized void setTest(ExtentTest test) {
        testThreadLocal.set(test);
    }

    public static void createTest(String testName, String description) {
        ExtentTest test = extent.createTest(testName, description);
        setTest(test);
    }

    public static void flushReports() {
        extent.flush();
    }

}
