package com.example.cpen321_wedo.models;

import java.util.Date;

// TODO: need to modified the Tasklist class if we change backend as well
public class TaskList {

    private String taskListName;
    private String taskListDescription;
    private int Thumbnail;
    private String userID;
    private Date modifiedTime;
    private Date createdTime;
    private String taskListID;

    public String getTaskListDescription() {
        return taskListDescription;
    }

    public void setTaskListDescription(String taskListDescription) {
        this.taskListDescription = taskListDescription;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public TaskList(){

    }

    public TaskList(String taskListName, String taskListDescription, int thumbnail, String userID, Date modifiedTime, Date createdTime, String taskListID) {
        this.taskListName = taskListName;
        this.taskListDescription = taskListDescription;
        Thumbnail = thumbnail;
        this.userID = userID;
        this.modifiedTime = modifiedTime;
        this.createdTime = createdTime;
        this.taskListID = taskListID;
    }

    public TaskList(String taskListName, String taskListDescription, String userID, String taskListID) {
        this.taskListName = taskListName;
        this.taskListDescription = taskListDescription;
        this.userID = userID;
        this.taskListID = taskListID;
    }

    public TaskList(String taskListName, String description, String taskListID) {
        this.taskListName = taskListName;
        this.taskListDescription = description;
        this.taskListID = taskListID;
    }

    public TaskList(String taskListName, String description, String taskListID, int thumbnail) {
        this.taskListName = taskListName;
        this.taskListDescription = description;
        Thumbnail = thumbnail;
        this.taskListID = taskListID;
    }

    public String getTaskListID() {
        return taskListID;
    }

    public void setTaskListID(String taskListID) {
        this.taskListID = taskListID;
    }

    public String getTaskListName() {
        return taskListName;
    }


    public String getDescription() {
        return taskListDescription;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTaskListName(String taskListName) {
        this.taskListName = taskListName;
    }


    public void setDescription(String description) {
        this.taskListDescription = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
