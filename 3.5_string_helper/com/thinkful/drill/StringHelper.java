package com.thinkful.drill;

public class StringHelper {

  String value;

  public StringHelper(String value) {
    this.value = value;
  }

  public boolean isNumeric() {
    for (char c : this.value.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }

  public boolean containsString(String s) {
    return this.value.contains(s);
  }

  public String toTitleCase() {
    return this.value.toUpperCase();
  }

  public void pad(int n, char c) {
    for (int i = 0; i < n; i++) {
      this.value = c + this.value + c;
    }
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}