package org.naveenkumar.utility;

public class JaroWinkler {

    public static double jaroWinklerSimilarity(String str1, String str2) {
        int commonChars = 0;

        int matchingDistance = Math.max(str1.length(), str2.length()) / 2 - 1;

        boolean[] str1Matches = new boolean[str1.length()];
        boolean[] str2Matches = new boolean[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            int start = Math.max(0, i - matchingDistance);
            int end = Math.min(i + matchingDistance + 1, str2.length());

            for (int j = start; j < end; j++) {
                if (!str2Matches[j] && str1.charAt(i) == str2.charAt(j)) {
                    str1Matches[i] = true;
                    str2Matches[j] = true;
                    commonChars++;
                    break;
                }
            }
        }

        if (commonChars == 0) {
            return 0.0;
        }

        int transpositions = 0;
        int k = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1Matches[i]) {
                while (!str2Matches[k])
                    k++;
                if (str1.charAt(i) != str2.charAt(k))
                    transpositions++;
                k++;
            }
        }

        double jaro = (commonChars / (double) str1.length() + commonChars / (double) str2.length() + (commonChars - transpositions) / (double) commonChars) / 3.0;

        int prefixLength = 0;
        for (int i = 0; i < Math.min(4, Math.min(str1.length(), str2.length())); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefixLength++;
            } else {
                break;
            }
        }

        return jaro + prefixLength * 0.1 * (1 - jaro);
    }

    public static double calculateSimilarity(String str1, String str2){
        return jaroWinklerSimilarity(str1, str2)*100;
    }
}
