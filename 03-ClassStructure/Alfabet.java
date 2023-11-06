public class Alfabet {
    static boolean isAlphabet(String t){
        int x =0;
        char litera;
        char litera2;
        for (int i = 0; i < t.length()-1; i++){
            litera = t.charAt(i); 
            litera2 = t.charAt(i + 1);
            if (litera > litera2){
                return false;
            }
        }
        return true;
        
    }
    

}
