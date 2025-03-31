import edu.Planner;
import edu.STWK;
import edu.WK;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PlannerTests {
    private Planner planner;
    private WK workout;
    private STWK strengthWorkout;

    @BeforeEach
    public void setUp() {
        planner = new Planner("John Doe");
        workout = new WK("Weight Loss", "Running", 300, 30.5);
        strengthWorkout = new STWK("Gaining Weight", "Bench Press", 150, 45.0, 3, 10, 135);
    }

    @Test
    public void testConstructorAndGetters() {
        assertNotNull(planner.getWK(), "Workouts list should be initialized");
        assertNotNull(planner.getFoods(), "Diet list should be initialized");
        assertNotNull(planner.getHistory(), "History list should be initialized");
        assertTrue(planner.getWK().isEmpty(), "Workouts should start empty");
        assertTrue(planner.getFoods().isEmpty(), "Diet should start empty");
        assertTrue(planner.getHistory().isEmpty(), "History should start empty");
    }

    @Test
    public void testShowCalendar() {
        planner.getWK().add(workout);
        planner.getFoods().add(new Planner.Food());
        String calendar = planner.showCalendar();
        assertTrue(calendar.contains("John Doe"), "Calendar should include person name");
        assertTrue(calendar.contains("Workouts: 1"), "Calendar should reflect workout count");
        assertTrue(calendar.contains("Diet: 1"), "Calendar should reflect food count");
        assertTrue(calendar.contains("Current Week"), "Calendar should include current week");
    }

    @Test
    public void testLogState() {
        planner.getWK().add(workout);
        planner.logState();
        assertEquals(1, planner.getHistory().size(), "History should have 1 week after logging");
        assertTrue(planner.getWK().isEmpty(), "Workouts should remain empty after logging");
        assertTrue(planner.map.isEmpty(), "Map should be cleared after logging");
    }

    @Test
    public void testMakeMap() {
        planner.getWK().add(workout);
        planner.getWK().add(strengthWorkout);
        planner.makeMap();
        assertEquals(2, planner.map.size(), "Map should have entries for each workout");
        assertArrayEquals(new int[]{0, 0}, planner.map.get(0), "Map should map day 0 correctly");
        assertArrayEquals(new int[]{1, 1}, planner.map.get(1), "Map should map day 1 correctly");
    }

    @Test
    public void testEmptyMap() {
        planner.makeMap();
        assertTrue(planner.map.isEmpty(), "Map should be empty when no workouts are added");
    }
}
