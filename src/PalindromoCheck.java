
public class PalindromoCheck {

    private static boolean isPalindrom(String palabra) {

        String palabraAux = "";

        for(int i = palabra.length() - 1; i >= 0; i--){
            char currentChar = palabra.charAt(i);
            palabraAux += currentChar;
        }
        return palabra.equals(palabraAux);
    }

}
