public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String test = "    Intro to  coMPUter   sCIEncE        ";
        System.out.println(camelCase(test));
        
    }

    public static String capVowelsLowRest (String string) {
        String ans = "";
        int character = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ) {
               character = ((int) string.charAt(i)) - 32;
                char current = 0;
               current += character;
               ans += current;
               current = 0;

            } else {  
                ans += string.charAt(i);   
            }

        }
        return ans;
    } 

    public static String camelCase (String string) { 
        String ans = "";
         ans += (string.charAt(0) == 32) ? "" : string.charAt(0);
        for(int i = 1; i < string.length(); i++) {
            char curr = string.charAt(i);
            if (curr != ' ') {
                if (string.charAt(i - 1) == ' ') {
                    ans += (curr >= 'a' && curr <= 'z') ? (char) (curr - 32) : curr; 
                } else {
                   ans += (curr >= 'A' && curr <= 'Z') ? (char) (curr + 32) : curr;
                }

            }
            
        }
        char firstChar = (ans.charAt(0) >= 'A' && ans.charAt(0) <= 'Z') ? (char)(ans.charAt(0) + 32) : ans.charAt(0);
        if (ans.length() >= 2) {
            return firstChar + ans.substring(1);  
        }
        ans += "" + firstChar;
        return ans;
    }

    public static int[] allIndexOf (String string, char chr) {
        int size = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                size += 1;
            }
        }
        int[] indexes = new int[size];
        int position = 0;
        
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == chr) {
              indexes[position] = j;
               position += 1; 
            }
           }
        return indexes;
    }
}
