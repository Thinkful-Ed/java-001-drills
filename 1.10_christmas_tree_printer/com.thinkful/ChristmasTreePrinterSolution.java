package com.thinkful;

public class ChristmasTreePrinterSolution {

    public static void main(String[] args){

        /**
         * String Approach
         *
         * Strings are immutable
         */

        String tree = "        *        \n" +
        "       ***       \n" +
        "      *****      \n" +
        "       ***       \n" +
        "      *****      \n" +
        "       ***       \n" +
        "      *****      \n" +
        "     *******     \n" +
        "    *********    \n" +
        "     *******     \n" +
        "    *********    \n" +
        "   ***********   \n" +
        "  *************  \n" +
        "       ***       \n" +
        "       ***       \n" +
        "       ***       \n";

        System.out.println(tree);

        /**
         * StringBuffer Approach
         *
         * StringBuffer's are not immutable
         */

        final String lineBreak = System.getProperty("line.separator");
        StringBuffer sb = new StringBuffer();

        sb.append("        *        ");
        sb.append(lineBreak);
        sb.append("       ***       ");
        sb.append(lineBreak);
        sb.append("      *****      ");
        sb.append(lineBreak);
        sb.append("       ***       ");
        sb.append(lineBreak);
        sb.append("      *****      ");
        sb.append(lineBreak);
        sb.append("       ***       ");
        sb.append(lineBreak);
        sb.append("      *****      ");
        sb.append(lineBreak);
        sb.append("     *******     ");
        sb.append(lineBreak);
        sb.append("    *********    ");
        sb.append(lineBreak);
        sb.append("     *******     ");
        sb.append(lineBreak);
        sb.append("    *********    ");
        sb.append(lineBreak);
        sb.append("   ***********   ");
        sb.append(lineBreak);
        sb.append("  *************  ");
        sb.append(lineBreak);
        sb.append("       ***       ");
        sb.append(lineBreak);
        sb.append("       ***       ");
        sb.append(lineBreak);
        sb.append("       ***       ");

        System.out.println(sb.toString());

    }

}