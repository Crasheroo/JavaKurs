package Prace_Domowe.ListaMiast;

public class City {
    private String cityName;
    private int population;

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City: " + cityName + " with population of: " + population + " people";
    }
}
