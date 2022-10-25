package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;
		final String sql = "SELECT project_id,name,from_date,to_date FROM project WHERE project_id = ?;";
		SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, projectId);
		if (results.next()) {
			project = mapRowToProject(results);
		}
		return project;
	}

	private Project mapRowToProject(SqlRowSet rowSet) {
		final Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));

		Date from_date = rowSet.getDate("from_date");
		if (from_date != null) {
			project.setFromDate(((java.sql.Date) from_date).toLocalDate());
		}

		Date to_date = rowSet.getDate("to_date");
		if (to_date != null) {
			project.setToDate(((java.sql.Date) to_date).toLocalDate());
		}

		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		final List<Project> projects = new ArrayList<>();
		final String sql = "SELECT project_id,name,from_date,to_date FROM project";
		final SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			projects.add(mapRowToProject(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		final String sql = "INSERT INTO project (project_id,name,from_date,to_date) VALUES (?,?,?,?) RETURNING " +
				"project_id;";

		Integer newId = this.jdbcTemplate.queryForObject(sql, Integer.class,
				newProject.getId(),
				newProject.getName(),
				newProject.getFromDate(),
				newProject.getToDate());

		return this.getProject(newId);
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ?;";
		jdbcTemplate.update(sql,projectId);

		sql = "DELETE FROM project WHERE project_id = ?;";
		jdbcTemplate.update(sql,projectId);
	}
	

}
