public class WeatherMachine {

    // no-arg constructor
    String city = "Your City Here";
    public WeatherMachine() {
    }

    // overloaded constructor with string arg
    public WeatherMachine(String input) {
        this.city = input;
    }

    // instance of Thermometer class
    Thermometer t = new Thermometer();

    // method of WeatherMachine creates an array of 24 random temps via Thermometer's getTemperature() method.
    private double[] getPastTemperatures() {
        int counter = 0;
        double[] result = new double[24];

        while (counter < 24) {
            result[counter] = t.getTemperature();
            counter++;
        }

        return result;
    }

    // method to return the array of temperatures at each hour of the day.
    public void getWeatherReport() {

        double[] arr = getPastTemperatures();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":00 - " + (int)arr[i] + " degrees in " + this.city);
        }
    }
}
