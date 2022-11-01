package com.techelevator.dao;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.time.LocalDate;

// "final" to prevent another class from extending this
final public class DaoHelpers {

    // "private" to prevent the class from being instantiated
    private DaoHelpers() {
    }

    public static LocalDate safeGetLocalDateFromResult(SqlRowSet results, String column) {
        LocalDate actual = null;
        if (results.getDate(column) != null) {
            actual = results.getDate(column).toLocalDate();
        }
        return actual;
    }


}
