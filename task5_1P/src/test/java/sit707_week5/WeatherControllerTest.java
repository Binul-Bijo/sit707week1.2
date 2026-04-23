package sit707_week5;

import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WeatherControllerTest {

    private static WeatherController wController;
    private static double[] hourlyTemperatures;
    private static int nHours;

    @BeforeClass
    public static void setUp() {
        System.out.println("+++ setUp +++");
        wController = WeatherController.getInstance();
        nHours = wController.getTotalHours();
        hourlyTemperatures = new double[nHours];
        for (int i = 0; i < nHours; i++) {
            hourlyTemperatures[i] = wController.getTemperatureForHour(i + 1);
        }
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("+++ tearDown +++");
        wController.close();
    }

    @Test
    public void testStudentIdentity() {
        String studentId = "s224950824";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Binul Bijo";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testTemperatureMin() {
        System.out.println("+++ testTemperatureMin +++");

        double expectedMin = 1000;
        for (double temp : hourlyTemperatures) {
            if (expectedMin > temp) {
                expectedMin = temp;
            }
        }

        double actualMin = wController.getTemperatureMinFromCache();

        Assert.assertTrue(actualMin == expectedMin);
    }

    @Test
    public void testTemperatureMax() {
        System.out.println("+++ testTemperatureMax +++");

        double expectedMax = -1;
        for (double temp : hourlyTemperatures) {
            if (expectedMax < temp) {
                expectedMax = temp;
            }
        }

        double actualMax = wController.getTemperatureMaxFromCache();

        Assert.assertTrue(actualMax == expectedMax);
    }

    @Test
    public void testTemperatureAverage() {
        System.out.println("+++ testTemperatureAverage +++");

        double sumTemp = 0;
        for (double temp : hourlyTemperatures) {
            sumTemp += temp;
        }
        double expectedAverage = sumTemp / nHours;

        double actualAverage = wController.getTemperatureAverageFromCache();

        Assert.assertTrue(actualAverage == expectedAverage);
    }

    @Test
    public void testTemperaturePersist() {
    }
}