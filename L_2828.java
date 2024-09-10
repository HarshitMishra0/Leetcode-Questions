public class L_2828{
     public boolean isAcronym(List<String> words, String s) {
        String answer = "";

        for(int i =0; i<words.size();i++){
            answer = answer + words.get(i).charAt(0);
        }
        return answer.equals(s);
    }
}