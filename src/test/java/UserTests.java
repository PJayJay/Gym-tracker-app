
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.User;

import java.util.ArrayList;


public class UserTests {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User(70, 150);
        user.goals = new ArrayList<>();
        
    }

    @Test
    void testChangeWeight() {
        user.changeWeight(180);
        assertEquals(180, user.weight);

        user.changeWeight(200);
        assertEquals(200, user.weight);
    }

    @Test
    void testChangeHeight() {
        user.changeHeight(75);
        assertEquals(75, user.height);

        user.changeHeight(80);
        assertEquals(80, user.height);
    }

    @Test
    void testUpdateAvailability() {
        user.updateAvailability(5);
        assertEquals(5, user.avail);
    }
}

