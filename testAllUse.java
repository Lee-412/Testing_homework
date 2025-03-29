import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testAllUse {

    @Test
    void testSpeed110_Weather3() {
        assertEquals("Rất cao", DrivingRiskLevel.calculateRiskLevel(110, 3));
    }

    @Test
    void testSpeed50_Weather2() {
        assertEquals("Thấp", DrivingRiskLevel.calculateRiskLevel(50, 2));
    }

    @Test
    void testSpeed150_Weather3() {
        assertEquals("Rất cao", DrivingRiskLevel.calculateRiskLevel(150, 3));
    }

    @Test
    void testSpeed110_Weather1() {
        assertEquals("Trung bình", DrivingRiskLevel.calculateRiskLevel(110, 1));
    }

    @Test
    void testSpeed110_Weather2() {
        assertEquals("Cao", DrivingRiskLevel.calculateRiskLevel(110, 2));
    }

    @Test
    void testSpeed110_Weather3_Again() {
        assertEquals("Rất cao", DrivingRiskLevel.calculateRiskLevel(110, 3));
    }

    @Test
    void testInvalidSpeedNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DrivingRiskLevel.calculateRiskLevel(-10, 1);
        });
        assertEquals("Invalid input: Speed must be 0-200 and Weather must be 1-3.", exception.getMessage());
    }

    @Test
    void testInvalidSpeedAbove200() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DrivingRiskLevel.calculateRiskLevel(210, 2);
        });
        assertEquals("Invalid input: Speed must be 0-200 and Weather must be 1-3.", exception.getMessage());
    }

    @Test
    void testInvalidWeather4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DrivingRiskLevel.calculateRiskLevel(100, 4);
        });
        assertEquals("Invalid input: Speed must be 0-200 and Weather must be 1-3.", exception.getMessage());
    }
}
