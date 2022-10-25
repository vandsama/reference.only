package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		final List<Employee> employees = new ArrayList<>();
		final String sql = "SELECT employee_id,department_id,first_name,last_name,birth_date,hire_date FROM employee;";
		final SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		final Employee employee = new Employee();
		employee.setId(rowSet.getInt("employee_id"));
		employee.setDepartmentId(rowSet.getInt("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));

		Date birth_date = rowSet.getDate("birth_date");
		if (birth_date != null) {
			employee.setBirthDate(((java.sql.Date) birth_date).toLocalDate());
		}

		Date hire_date = rowSet.getDate("hire_date");
		if (hire_date != null) {
			employee.setHireDate(((java.sql.Date) hire_date).toLocalDate());
		}

		return employee;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id,department_id,first_name,last_name,birth_date,hire_date FROM employee WHERE " +
				"first_name ILIKE ? AND last_name ILIKE ?;";
		//firstNameSearch = "%" + firstNameSearch + "%";
		//lastNameSearch = "%" + lastNameSearch + "%";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employees = new ArrayList<>();
		final String sql = "SELECT employee.employee_id,department_id,first_name,last_name,birth_date,hire_date FROM " +
				"employee " +
				"JOIN project_employee ON project_employee.employee_id = employee.employee_id " +
				"WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,projectId);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		final String sql = "INSERT INTO project_employee(project_id,employee_id) VALUES (?,?);";
		this.jdbcTemplate.update(sql,projectId,employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?;";
		jdbcTemplate.update(sql,projectId,employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		final List<Employee> employees = new ArrayList<>();
		final String sql = "SELECT employee_id,department_id,first_name,last_name,birth_date,hire_date FROM " +
				"employee WHERE employee_id NOT IN (SELECT employee_id FROM project_employee)";
		final SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;

	}


}
