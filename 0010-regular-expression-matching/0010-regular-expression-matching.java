class Solution {
        public boolean isMatch(String s, String p) {

            // prevent error
            if (s.length() != p.length()) return false;

            // check p have * or .
            char[] sl = s.toCharArray();
            char[] pl = p.toCharArray();

            int ps = 100;
            int pd = 100;

            for (int i = 0; i < s.length(); i++){
                if(pl[i] == '*') ps = i;
                if(pl[i] == '.') pd = i;
            }

            // if it doesnt have it check s is equal to p
            if (ps == 100 && pd == 100){
                if (s.equals(p)) return true;
                return false;
            }

            // if it only have . check without that position
            if(pd != 100 && ps == 100){
                for (int i = 0; i < s.length(); i++){
                    if (i == pd) continue;
                    if (sl[i] != pl[i]) return false;
                }
            }
            // if it only have * check front letter repeat in the back
            char save = ' ';
            if(pd == 100 && ps != 100){
                for (int i = 0; i < s.length() - 1; i++){
                    if(i == ps){
                        save = sl[i - 1];
                        while(i < s.length() && sl[i] == save) i++;
                    }
                    if (i >= s.length()) break;
                    if (i >= p.length()) break;
                    if (sl[i] != pl[i]) return false;
                }
            }

            // if it have .* pass everything
            return true;
        }
    }
