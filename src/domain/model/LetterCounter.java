package domain.model;

public class LetterCounter {

    public int countOccurences(String woord, String letter){
        int aantalKeer = 0;

        for (int i = 0; i < woord.length(); i++){
            char eersteLetter = woord.charAt(i);
            String stringeersteletter = String.valueOf(eersteLetter);
            if (stringeersteletter.equals(letter)){
                aantalKeer++;
            }
        }

        return aantalKeer;
    }
}
