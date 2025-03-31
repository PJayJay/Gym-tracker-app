
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.User;

import java.util.ArrayList;


public class UserTests {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
        user.goals = new ArrayList<>();
        user.changeHeight(70); // Initial height
        user.changeWeight(150); // Initial Weight
    }

    @Test
    void testChangeWeight() {
        user.changeWeight(180);
        assertEquals(180, user.weight);
    }

    @Test
    void testChangeHeight() {
        user.changeHeight(75);
        assertEquals(75, user.height);
    }

    @Test
    void testUpdateAvailability() {
        user.updateAvailability(5);
        assertEquals(5, user.avail);
    }
}

