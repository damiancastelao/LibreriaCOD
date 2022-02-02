package LibreriaAlex;

import javax.swing.*;

public class AxAsk {

    //region Byte
    public static byte askByte() {

        return Byte.parseByte(JOptionPane.showInputDialog(""));
    }

    public static byte askByte(String mensaje) {

        return Byte.parseByte(JOptionPane.showInputDialog(mensaje));
    }
    //endregion


    //region Short
    public static short askShort() {

        return Short.parseShort(JOptionPane.showInputDialog(""));
    }

    public static short askShort(String mensaje) {

        return Short.parseShort(JOptionPane.showInputDialog(mensaje));
    }

    //endregion


    //region Int
    public static int askInt() {

        return Integer.parseInt(JOptionPane.showInputDialog(""));
    }

    public static int askInt(String mensaje) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    //endregion


    //region Long
    public static long askLong() {

        return Long.parseLong(JOptionPane.showInputDialog(""));
    }

    public static long askLong(String mensaje) {

        return Long.parseLong(JOptionPane.showInputDialog(mensaje));
    }

    //endregion


    //region Float
    public static float askFloat() {

        return Float.parseFloat(JOptionPane.showInputDialog("").replace(',', '.'));
    }

    public static float askFloat(String mensaje) {

        return Float.parseFloat(JOptionPane.showInputDialog(mensaje).replace(',', '.'));
    }

    public static float askGrades() {
        float grade = askFloat("Introduce una nota");

        while (grade < 0 || grade > 10) {

            grade = askFloat("Nota no valida, introduce una nota del 0 al 10.");

        }

        return grade;
    }

    //endregion


    //region Double
    public static double askDouble() {

        return Double.parseDouble(JOptionPane.showInputDialog("").replace(',', '.'));
    }

    public static double askDouble(String mensaje) {

        return Double.parseDouble(JOptionPane.showInputDialog(mensaje).replace(',', '.'));
    }

    //endregion


    //region Boolean

    public static boolean askBoolean() {

        return JOptionPane.showConfirmDialog(null, "True?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static boolean askBoolean(String mensaje, String titulo) {

        return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    //endregion


    //region Char

    public static char askChar() {

        String string = JOptionPane.showInputDialog("(Solo se recojera el primer caracter escrito)");

        return string.charAt(0);
    }

    public static char askChar(String mensaje) {

        String string = JOptionPane.showInputDialog(mensaje + "\n\n(Solo se recojera el primer caracter escrito)");

        return string.charAt(0);


    }

    //endregion


    //region String

    public static String askString() {

        return JOptionPane.showInputDialog("");
    }

    public static String askString(String mensaje) {

        return JOptionPane.showInputDialog(mensaje);
    }

    //endregion
}
