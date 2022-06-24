package com.company;

public class Main {

    public static void main(String[] args) {
	    String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        System.out.println(magazine);
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int numberOfMatches = 0;

        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < magazine.length(); j++) {
                if(ransomNote.charAt(i) == magazine.charAt(j)) {
                    numberOfMatches++;
                    magazine = magazine.substring(0, j) + magazine.substring(j+1, magazine.length());;
                    System.out.println(magazine);
                    if(numberOfMatches == ransomNote.length()) {
                        return true;
                    }
                    break;
                }
            }
        }
        System.out.println(numberOfMatches);
        if(numberOfMatches == ransomNote.length()) {
            return true;
        } else {
            return false;
        }
    }
}
