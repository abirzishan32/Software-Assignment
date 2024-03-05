import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cityList = new ArrayList<>();

    public void add(City city) {
        if (cityList.contains(city)) {
            throw new IllegalArgumentException();
        }
        cityList.add(city);
    }

    public List<City> getCities() {
        List<City> list = cityList;
        Collections.sort(list);
        return list;
    }

    /**
     * Deletes a city from the list.
     *
     * @param city The city to be deleted.
     * @return
     * @throws IllegalArgumentException If the city does not exist in the list.
     */
    public void delete(City city) {
        int flag = 0;
        for (City it : cityList) {
            if (it == city) {
                cityList.remove(city);
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            throw new IllegalArgumentException();

        }
    }
        /**
         * Returns the count of cities in the list.
         * @return The count of cities.
         */
        public int cnt(){
            int sz = cityList.size();
            return sz;
        }


    }

