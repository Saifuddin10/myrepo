package myprogs.Collections.maps;

public class City {
    private String cityName;
    private long population;
    private String famousFood;
    private FamousPlaces famousPlaces;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getFamousFood() {
        return famousFood;
    }

    public void setFamousFood(String famousFood) {
        this.famousFood = famousFood;
    }

    public City(String cityName, long population, String famousFood, FamousPlaces famousPlaces) {
        this.cityName = cityName;
        this.population = population;
        this.famousFood = famousFood;
        this.famousPlaces = famousPlaces;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "cityName='" + cityName + '\'' +
                " : population=" + population +
                " : famousFood='" + famousFood + '\'' + "\n" +
                "*********Famous Places************" + "\n" +
                famousPlaces.toString();
    }
}
