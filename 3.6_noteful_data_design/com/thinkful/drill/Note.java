package com.thinkful.drill;

public class Note {

  private int id;
  private String message;
  private Date created;
  private Date updated;
  private int userId;
  private List<Tage> tags;
  private int folderId;

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

  public List<Tage> getTags() {
    return tags;
  }

  public void setTags(List<Tage> tags) {
    this.tags = tags;
  }

  public int getFolderId() {
    return folderId;
  }

  public void setFolderId(int folderId) {
    this.folderId = folderId;
  }

}
