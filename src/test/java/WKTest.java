import edu.WK;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WKTest {
    private WK workout;

    @BeforeEach
    public void setUp() {
        // Initialize a default workout before each test
        workout = new WK("Weight Loss", "Running", 300, 30.5);
    }

    @Test
    public void testConstructorAndGetters() {
        // Verify constructor sets fields and getters return correct values
        assertEquals("Weight Loss", workout.getType(), "Type should match constructor input");
        assertEquals("Running", workout.getName(), "Name should match constructor input");
        assertEquals(300, workout.getCalories(), "Calories should match constructor input");
        assertEquals(30.5, workout.getTimeNeeded(), 0.001, "TimeNeeded should match constructor input");
    }

    @Test
    public void testSetters() {
        // Test setters by updating fields and checking getters
        workout.setType("Gaining Weight");
        workout.setName("Bench Press");
        workout.setCalories(150);
        workout.setTimeNeeded(45.0);

        assertEquals("Gaining Weight", workout.getType(), "Type should update after setType");
        assertEquals("Bench Press", workout.getName(), "Name should update after setName");
        assertEquals(150, workout.getCalories(), "Calories should update after setCalories");
        assertEquals(45.0, workout.getTimeNeeded(), 0.001, "TimeNeeded should update after setTimeNeeded");
    }

    @Test
    public void testToString() {
        // Test toString format
        String expected = "Workout{type='Weight Loss', name='Running', calories=300, timeNeeded=30.5 minutes}";
        assertEquals(expected, workout.toString(), "toString should match expected format");
    }

    @Test
    public void testEdgeCaseCaloriesZero() {
        // Test constructor with zero calories
        WK zeroCalWorkout = new WK("Weight Loss", "Yoga", 0, 20.0);
        assertEquals(0, zeroCalWorkout.getCalories(), "Calories should be 0");
    }

    @Test
    public void testEdgeCaseTimeNeededZero() {
        // Test constructor with zero time
        WK zeroTimeWorkout = new WK("Gaining Weight", "Stretching", 50, 0.0);
        assertEquals(0.0, zeroTimeWorkout.getTimeNeeded(), 0.001, "TimeNeeded should be 0.0");
    }
}
