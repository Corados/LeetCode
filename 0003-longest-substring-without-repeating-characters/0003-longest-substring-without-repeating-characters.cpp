class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        string sentence = "";
        string result = "";

        for(int i = 0; i < s.length(); i++){
            if(sentence.find(s[i]) == string::npos)
            {
                sentence += s[i];
                if(sentence.length() > result.length()) {
                    result = sentence;
                }
            }
            else{
                size_t pos = sentence.find(s[i]);
                sentence.erase(0, pos + 1);
                sentence += s[i];
            }
        }
        return result.length();
    }
};