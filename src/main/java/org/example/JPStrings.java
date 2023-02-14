package org.example;

public class JPStrings  {
    /**
     * Capitaliza un string. Es decir, pone la primera letra
     * en mayuscula y las restantes en minuscula.
     *
     * @param str El string a capitalizar
     * @return El texto capitalizado
     */
    public String capitalizar(String str) {
        char primeraletra = str.charAt(0);

        if (str == null) return null;
        if (str.length() == 0) return "";

        return (char) (primeraletra-32) + str.substring(1);
    }

    public String cortarCadaX(String text, int intervalo, String separador) {
        for (int i = 0; i < text.length(); i++) {

            System.out.println(text.charAt(i));
        }
        return null;
    }


    public String toCamelCase(String texto) {
        return null;
    }

    public String centrar(String texto, int width) {
        return null;
    }
}
