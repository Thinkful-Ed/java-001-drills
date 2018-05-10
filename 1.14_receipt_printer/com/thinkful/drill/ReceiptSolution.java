package com.thinkful.drill;

public class ReceiptSolution {

  public static void main(String[] args) {

    /**
     * String Approach
     *
     * Strings are immutable
     */

    String bill = "Bill\n" +
        "------------------\n" +
        "Pizza       $12.99\n" +
        "Soda         $1.25\n" +
        "Cookies      $2.50\n" +
        "SubTotal:   $16.74\n" +
        "Tax(10%):    $1.67\n" +
        "Service(15%):$2.51\n" +
        "------------------\n" +
        "Total:      $20.92\n" +
        "------------------";

    System.out.println(bill);

    /**
     * StringBuffer Approach
     *
     * StringBuffer's are not immutable
     */

    final String lineBreak = System.getProperty("line.separator");

    StringBuffer sb = new StringBuffer();

    sb.append("Bill");
    sb.append(lineBreak);
    sb.append("------------------");
    sb.append(lineBreak);
    sb.append("Pizza       $12.99");
    sb.append(lineBreak);
    sb.append("Soda         $1.25");
    sb.append(lineBreak);
    sb.append("Cookies      $2.50");
    sb.append(lineBreak);
    sb.append("SubTotal:   $16.74");
    sb.append(lineBreak);
    sb.append("Tax(10%):    $1.67");
    sb.append(lineBreak);
    sb.append("Service(15%):$2.51");
    sb.append(lineBreak);
    sb.append("------------------");
    sb.append(lineBreak);
    sb.append("Total:      $20.92");
    sb.append(lineBreak);
    sb.append("------------------");

    System.out.println(sb.toString());

  }
}