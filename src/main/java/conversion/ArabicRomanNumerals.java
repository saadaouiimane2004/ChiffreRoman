package conversion;

public class ArabicRomanNumerals {


/*
    public static String convert(int nbr) {
        return null; // Retour temporaire pour faire compiler
    }
*/
    /*
public static String convert(int nbr) {
    if (nbr == 1) return "I";
    return "";
}*/

    public static String convert(int nbr) {
        if (nbr <= 0 || nbr > 50) {
            throw new IllegalArgumentException("Nombre non valide, doit être entre 1 et 50.");
        }

        int[] arabicValues = {50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arabicValues.length; i++) {
            while (nbr >= arabicValues[i]) {
                result.append(romanSymbols[i]);
                nbr -= arabicValues[i];
            }
        }
        return result.toString();
    }

}