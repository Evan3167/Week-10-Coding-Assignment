package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.projectDao;
import projects.entity.Project;

public class projectService {
	private static projectDao projectDao = new projectDao();

//	public static Project addProject(Project project) {
//		
//		return null;
//	}
//	
	public static Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public static List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects(); 
	}

	public static Object fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException("Project with project ID=" + projectId + "does not exist.")); 
		
		
		
	}

}
