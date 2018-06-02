package com.thinkful.drill;

import java.util.Date;
import java.util.List;

public class Note {

  private int id;
  private String message;
  private Date created;
  private Date updated;
  private int userId;
  private List<Tag> tags;
  private int folderId;

  public Note(int id, String message, int userId) {
    this.id = id;
    this.message = message;
    this.created = new Date();
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public int getFolderId() {
    return folderId;
  }

  public void setFolderId(int folderId) {
    this.folderId = folderId;
  }

}
