package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao dao;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        final Timesheet timesheet = dao.getTimesheet(TIMESHEET_1.getTimesheetId());
        assertTimesheetsMatch(TIMESHEET_1,timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        final Timesheet timesheet = dao.getTimesheet(555);
        Assert.assertNull("Timesheet does not exist" ,timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        final List<Timesheet> timesheet = dao.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2,timesheet.size());
        assertTimesheetsMatch(TIMESHEET_1,timesheet.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheet.get(1));
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        final List<Timesheet> timesheet = dao.getTimesheetsByProjectId(TIMESHEET_1.getProjectId());
        Assert.assertEquals(3,timesheet.size());
        assertTimesheetsMatch(TIMESHEET_1,timesheet.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheet.get(1));
        assertTimesheetsMatch(TIMESHEET_3,timesheet.get(2));
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        final Timesheet expectedTimesheet = new Timesheet(0,1,1,LocalDate.parse("2022-10-23"),5,true,"Worked 5 hours " +
                "on Sunday");
        final Timesheet createdTimesheet = dao.createTimesheet(expectedTimesheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        expectedTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(expectedTimesheet,createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        final Timesheet expectedTimesheet = new Timesheet(0,1,1,LocalDate.parse("2022-10-23"),5,true,"Worked 5 hours " +
                "on Sunday");
        final Timesheet createdTimesheet = dao.createTimesheet(expectedTimesheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        expectedTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(expectedTimesheet,createdTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        final Timesheet updatedTimesheet = dao.getTimesheet(1);
        updatedTimesheet.setEmployeeId(1);
        updatedTimesheet.setProjectId(1);
        updatedTimesheet.setDateWorked(LocalDate.parse("2021-01-01"));
        updatedTimesheet.setHoursWorked(1.0);
        updatedTimesheet.setBillable(true);
        updatedTimesheet.setDescription("Timesheet 1");

        dao.updateTimesheet(updatedTimesheet);

        Timesheet actualTimesheet = dao.getTimesheet(updatedTimesheet.getTimesheetId());
        assertTimesheetsMatch(updatedTimesheet,actualTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        dao.deleteTimesheet(TIMESHEET_1.getTimesheetId());
        final Timesheet retrievedTimesheet = dao.getTimesheet(TIMESHEET_1.getTimesheetId());
        Assert.assertNull(retrievedTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        final Timesheet timesheet = dao.getTimesheet(TIMESHEET_1.getTimesheetId());
        Assert.assertTrue(timesheet.isBillable());
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
