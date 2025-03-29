
public class DrivingRiskLevel {
    public static String calculateRiskLevel(int speed, int weather) {
        if (speed < 0 || speed > 200 || weather < 1 || weather > 3) {
            throw new IllegalArgumentException("Invalid input: Speed must be 0-200 and Weather must be 1-3.");
        }

        String riskLevel;

        // Lỗi 1: Dùng < 60 thay vì <= 60
        if (speed < 60) {
            riskLevel = "Thấp";
        } else if (speed <= 120) {
            switch (weather) {
                case 1:
                    riskLevel = "Trung bình";
                    break;
                case 2:
                    riskLevel = "Cao";
                    break;
                case 3:
                    riskLevel = "Rất cao";
                    break;
                default:
                    riskLevel = "Không xác định";
            }
        } else {
            riskLevel = "Rất cao";
        }

        return riskLevel;
    }

    public static void main(String[] args) {
        try {
            String risk = calculateRiskLevel(80, 2);
            System.out.println("Risk level: " + risk);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}