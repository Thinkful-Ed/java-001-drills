package com.thinkful.drill;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NotefulTest {

  @Before
  public void preTest() {
  }

  @Test
  public void folderTest() {
    Folder topFolder = new Folder(1, "top");
    assertEquals(topFolder.getName(), "top");

    Folder middleFolder = new Folder(2, "middle");
    assertEquals(middleFolder.getName(), "middle");

    middleFolder.setParentFolderId(topFolder.getId());
    assertEquals(middleFolder.getParentFolderId(), topFolder.getId());
  }

  @After
  public void postTest() {
  }
}