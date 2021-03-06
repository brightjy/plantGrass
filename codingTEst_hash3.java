import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        
        for (int i=0; i<phone_book.length; i++) {
            hashMap.put(phone_book[i], "prefix");
        }
        
        for (String phone : phone_book) {
            for (int j=0; j<phone.length(); j++) {
                if (hashMap.containsKey(phone.substring(0, j))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}