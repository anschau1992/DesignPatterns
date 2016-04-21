package observer;

import subject.WeatherData;

import java.util.Observable;

public class StatisticsDisplay implements java.util.Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float newTemp = weatherData.getTemperature();
            tempSum += newTemp;
            numReadings++;

            if (newTemp > maxTemp){
                maxTemp = newTemp;
            }

            if (newTemp < minTemp) {
                minTemp = newTemp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
