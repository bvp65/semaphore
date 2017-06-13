package trafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        System.out.println("Укажите количество минут или 0 для выхода из программы");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int time = 1;
            do {
                try {
                    time = Integer.parseInt(in.readLine());
                    if (time < 0) {
                        System.out.println("Укажите положительное число");
                    } else if (time != 0) {
                        System.out.println("На " + time + " минуте горит " + light.getColor(time));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверное число");
                }
            } while (time != 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
