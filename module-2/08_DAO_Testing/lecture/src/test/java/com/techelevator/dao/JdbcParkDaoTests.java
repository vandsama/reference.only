package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        //Arrange
        final Park actual = sut.getPark(PARK_1.getParkId());
        //Act

        //Assert
        assertParksMatch(PARK_1,actual);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        final Park park = sut.getPark(99);
        Assert.assertNull("no park should be returned", park);
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        final List<Park> all = sut.getParksByState("AA");
        Assert.assertEquals(2, all.size());
        assertParksMatch(PARK_1,all.get(0));
        assertParksMatch(PARK_3,all.get(0));
    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        final List<Park>  all = sut.getParksByState("EE");
        Assert.assertEquals(0,all.size());
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        final Park expectedPark = new Park(0,"tech elevator", LocalDate.parse("2000-06-15"),50,false);
        final Park createdPark = sut.createPark(expectedPark);
        Integer newId = createdPark.getParkId();

        Assert.assertTrue(newId > 0);
        expectedPark.setParkId(newId);
        assertParksMatch(expectedPark,createdPark);
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        final Park parkToUpdate = sut.getPark(1);
        parkToUpdate.setParkName("random-name");
        parkToUpdate.setHasCamping(!parkToUpdate.getHasCamping());
        parkToUpdate.setArea(50000);
        parkToUpdate.setDateEstablished(LocalDate.now());

        sut.updatePark(parkToUpdate);
        Park actual = sut.getPark(1);
        assertParksMatch(parkToUpdate,actual);
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        sut.deletePark(PARK_1.getParkId());
        final Park retrievedPark = sut.getPark(PARK_1.getParkId());
        Assert.assertNull(retrievedPark);
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        sut.addParkToState(PARK_1.getParkId(),"BB");
        final List<Park> parkList = sut.getParksByState("BB");
        assertParksMatch(PARK_1,parkList.get(0));
        assertParksMatch(PARK_2,parkList.get(1));
        Assert.assertEquals(2,parkList.size());
    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        sut.removeParkFromState(PARK_1.getParkId(),"AA");
        final List<Park> parks = sut.getParksByState("AA");
        assertParksMatch(PARK_3, parks.get(0));
       // assert
    }

    //helper method
    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

}
