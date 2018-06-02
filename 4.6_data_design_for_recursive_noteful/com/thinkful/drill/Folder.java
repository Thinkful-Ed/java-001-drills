package com.thinkful.drill;

public class Folder {

  private int id;
  private String name;
  private int parentFolderId;
  private int[] childFolderIds;

  public Folder(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(int parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public int[] getChildFolders() {
    return childFolderIds;
  }

  public void setChildFolders(int[] childFolderIds) {
    this.childFolderIds = childFolderIds;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
