import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
    City city1 = new City("Paris","France");
    City city2 = new City("Amsterdam","Netherlands");
    City city3 = new City("Zurich","Switzerland");

    @Test
    public void testcount1()
    {
        CityList list = new CityList();
        list.add(city1);
        list.add(city2);
        assertEquals(2,list.cnt());
    }

    @Test
    public void testcount2()
    {
        CityList list = new CityList();
        list.add(city1);
        list.add(city2);
        list.add(city3);
        assertEquals(3,list.cnt());
    }

    @Test
    public void testdelete1()
    {
        CityList list = new CityList();
        list.add(city1);
        list.add(city2);
        list.add(city3);
        list.delete(city1);
        list.delete(city2);
        assertEquals(1,list.cnt());
    }

    @Test
    public void testdelete2()
    {
        CityList list = new CityList();
        list.add(city1);
        list.add(city2);
        list.add(city3);
        list.delete(city1);
        list.delete(city2);
        list.delete(city3);
        assertEquals(0,list.cnt());
    }

    @Test
    public void testsort()
    {
        CityList list = new CityList();
        list.add(city1);
        list.add(city2);
        list.add(city3);

        List<City> sortedCities = list.getCities();
        int n=sortedCities.size();
        for (int i = 0; i < n-1; i++) {
            assertTrue(sortedCities.get(i).compareTo(sortedCities.get(i + 1)) <= 0);
        }
    }


}