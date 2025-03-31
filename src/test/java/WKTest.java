import edu.STWK;
import edu.WK;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WKTest {
    private WK workout;
    private STWK strengthWorkout;

    @BeforeEach
    public void setUp() {
        // Initialize default instances before each test
        workout = new WK("Weight Loss", "Running", 300, 30.5);
        strengthWorkout = new STWK("Gaining Weight", "Bench Press", 150, 45.0, 3, 10, 135);
    }

    // Tests for WK class
    @Test
    public void testWKConstructorAndGetters() {
        assertEquals("Weight Loss", workout.getType(), "Type should match constructor input");
        assertEquals("Running", workout.getName(), "Name should match constructor input");
        assertEquals(300, workout.getCalories(), "Calories should match constructor input");
        assertEquals(30.5, workout.getTimeNeeded(), 0.001, "TimeNeeded should match constructor input");
    }

    @Test
    public void testWKSetters() {
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
    public void testWKToString() {
        String expected = "Workout{type='Weight Loss', name='Running', calories=300, timeNeeded=30.5 minutes}";
        assertEquals(expected, workout.toString(), "toString should match expected format");
    }

    @Test
    public void testWKEdgeCaseCaloriesZero() {
        WK zeroCalWorkout = new WK("Weight Loss", "Yoga", 0, 20.0);
        assertEquals(0, zeroCalWorkout.getCalories(), "Calories should be 0");
    }

    @Test
    public void testWKEdgeCaseTimeNeededZero() {
        WK zeroTimeWorkout = new WK("Gaining Weight", "Stretching", 50, 0.0);
        assertEquals(0.0, zeroTimeWorkout.getTimeNeeded(), 0.001, "TimeNeeded should be 0.0");
    }

    // Tests for STWK class
    @Test
    public void testSTWKConstructorAndGetters() {
        assertEquals("Gaining Weight", strengthWorkout.getType(), "Type should match constructor input");
        assertEquals("Bench Press", strengthWorkout.getName(), "Name should match constructor input");
        assertEquals(150, strengthWorkout.getCalories(), "Calories should match constructor input");
        assertEquals(45.0, strengthWorkout.getTimeNeeded(), 0.001, "TimeNeeded should match constructor input");
        assertEquals(3, strengthWorkout.getSets(), "Sets should match constructor input");
        assertEquals(10, strengthWorkout.getReps(), "Reps should match constructor input");
        assertEquals(135, strengthWorkout.getWeight(), "Weight should match constructor input");
    }

    @Test
    public void testSTWKSetters() {
        strengthWorkout.setSets(4);
        strengthWorkout.setReps(8);
        strengthWorkout.setWeight(185);

        assertEquals(4, strengthWorkout.getSets(), "Sets should update after setSets");
        assertEquals(8, strengthWorkout.getReps(), "Reps should update after setReps");
        assertEquals(185, strengthWorkout.getWeight(), "Weight should update after setWeight");

        // Verify inherited setters still work
        strengthWorkout.setType("Weight Loss");
        assertEquals("Weight Loss", strengthWorkout.getType(), "Inherited setType should work");
    }

    @Test
    public void testSTWKToString() {
        String expected = "StrengthWorkout{type='Gaining Weight', name='Bench Press', calories=150, timeNeeded=45.0 minutes, sets=3, reps=10, weight=135 lbs}";
        assertEquals(expected, strengthWorkout.toString(), "toString should match expected format");
    }

    @Test
    public void testSTWKEdgeCaseZeroSetsRepsWeight() {
        STWK edgeCaseWorkout = new STWK("Weight Loss", "Push-ups", 100, 15.0, 0, 0, 0);
        assertEquals(0, edgeCaseWorkout.getSets(), "Sets should be 0");
        assertEquals(0, edgeCaseWorkout.getReps(), "Reps should be 0");
        assertEquals(0, edgeCaseWorkout.getWeight(), "Weight should be 0");
    }
}