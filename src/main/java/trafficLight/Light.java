package trafficLight;

public class Light {
    enum Colors {
        ЗЕЛЕНЫЙ, ЖЕЛТЫЙ, КРАСНЫЙ
    };

    public Light() {

    }

    public Colors getColor(int time) {
        time %= 10;
        if (time > 0 && time < 3) {
            return  Colors.ЗЕЛЕНЫЙ;
        } else if (time > 2 && time < 6) {
            return  Colors.ЖЕЛТЫЙ;
        } else {
            return Colors.КРАСНЫЙ;
        }
    }
}
