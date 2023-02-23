package org.example;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.isWhitespace;

public class JPStrings  {
    /**
     * Capitaliza un string. Es decir, pone la primera letra
     * en mayuscula y las restantes en minuscula.
     *
     * @param str El string a capitalizar
     * @return El texto capitalizado
     */
    public static String capitalizar(String str) {

        if (str == null) return null;
        if (str.length() == 0) return "";

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     *
     * @param text
     * @param intervalo
     * @param separador
     * @return
     */
    public static String cortarCadaX(String text, int intervalo, String separador) {
        if (text == null) return null;
        if(text.length() == 0) return "";
        String resultado = "" + text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            if (i%intervalo == 0){
                resultado += separador;
            }
            resultado += text.charAt(i);

        }
        return resultado;
    }


    public static String toCamelCase(String text) {
        if (text == null) return null;
        if(text.length() == 0) return "";
        String resultado;
        resultado = "" + text.substring(0,1).toUpperCase();
        for (int i = 1; i < text.length(); i++) {
            if (isWhitespace(text.charAt(i))) {
                resultado += Character.toUpperCase(text.charAt(i+1));
                i += 1;
            } else  {
                resultado += Character.toLowerCase(text.charAt(i));
            }
        }
        return resultado;
    }

    public static String centrar(String text, int width) {
        if (text == null) return null;
        if(text.length() == 0) return "";
        String resultado = "L";

        int inicioTexto = width/2;

        return resultado;
    }
}
