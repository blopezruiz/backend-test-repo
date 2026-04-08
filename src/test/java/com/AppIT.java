package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppIT {

    @Test
    void integrationTest() {
        App app = new App();
        assertEquals(2, app.sum(1, 1));
    }
}
