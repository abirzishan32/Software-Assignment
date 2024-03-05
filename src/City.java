/**
 * Reperesents a city with name and province
 * including comparable interface to compare cities based on their names
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     *
     * @param city name of the city
     * @param province name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }


}
