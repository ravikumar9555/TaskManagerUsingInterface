package com.taskmanger.controller;

import java.util.List;

import com.taskmanger.entity.TaskEntity;

public interface Controller {

	public void addTask(TaskEntity task);

	public void removeTask(int index);

	public TaskEntity getTask(int index);

	public List<TaskEntity> getAllTask();

	public void updateTask(int index, String taskName, String description);
}
