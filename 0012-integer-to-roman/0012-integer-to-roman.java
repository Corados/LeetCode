class Solution {
    public String intToRoman(int num) {
        int length = String.valueOf(num).length();
        int[] count = new int[length];
        String result = "";

        for(int j = length - 1; j >= 0; j--){
            
            int g = (int)Math.floor(num / Math.pow(10, j));
            count[j] = g;
            num = (int)(num - (g * Math.pow(10, j)));

            if(j == 3){
                if (count[j] == 3) result = result + "MMM";
                if (count[j] == 2) result = result + "MM";
                if (count[j] == 1) result = result + "M";
            }
            else if(j == 2){
                if (count[j] == 9) result = result + "CM";
                if (count[j] == 8) result = result + "DCCC";
                if (count[j] == 7) result = result + "DCC";
                if (count[j] == 6) result = result + "DC";
                if (count[j] == 5) result = result + "D";
                if (count[j] == 4) result = result + "CD";
                if (count[j] == 3) result = result + "CCC";
                if (count[j] == 2) result = result + "CC";
                if (count[j] == 1) result = result + "C";

            }
            else if(j == 1){
                if (count[j] == 9) result = result + "XC";
                if (count[j] == 8) result = result + "LXXX";
                if (count[j] == 7) result = result + "LXX";
                if (count[j] == 6) result = result + "LX";
                if (count[j] == 5) result = result + "L";
                if (count[j] == 4) result = result + "XL";
                if (count[j] == 3) result = result + "XXX";
                if (count[j] == 2) result = result + "XX";
                if (count[j] == 1) result = result + "X";
            }
            else if(j == 0){
                if (count[j] == 9) result = result + "IX";
                if (count[j] == 8) result = result + "VIII";
                if (count[j] == 7) result = result + "VII";
                if (count[j] == 6) result = result + "VI";
                if (count[j] == 5) result = result + "V";
                if (count[j] == 4) result = result + "IV";
                if (count[j] == 3) result = result + "III";
                if (count[j] == 2) result = result + "II";
                if (count[j] == 1) result = result + "I";

            }
        }

        return result;

    }
}