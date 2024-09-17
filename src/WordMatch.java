//I have neither given nor received unauthorized aid on this piece of work.
public class WordMatch {
    private String word = "";
    public WordMatch(String word) {
        this.word = word;
    }

    public int scoreGuess(String guess) throws IllegalArgumentException{
        if (guess.isEmpty()) {
            throw new IllegalArgumentException("Your guess cannot be an empty String!");
        }
        if (guess.length()>word.length()){
            throw new IllegalArgumentException("Your guess cannot exceed the number of characters in the Secret word");
        }
        if (guess.length() == word.length()) {
            if (guess.equals(word)) return (guess.length())*(guess.length());
            else return 0;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            System.out.println("guess:"+i);
            if (word.startsWith(guess, i)) count++;
            System.out.println(word.substring(i));
            System.out.println(count);
        }
        return count*guess.length()*guess.length();
    }
    public String findBetterGuess(String guess1, String guess2){
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1>score2) return guess1;
        if (score2>score1) return guess2;
        else if (guess1.compareTo(guess2)>0) return guess1;
        else return guess2;
    }
}
