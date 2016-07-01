package com.example.mnahm5.task_manager;

public class ProjectCard {
    public String projectName, description, dateCreated;
    public int projectId;

    public ProjectCard(int projectId, String projectName, String description, String dateCreated) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.dateCreated = dateCreated;
    }
}
