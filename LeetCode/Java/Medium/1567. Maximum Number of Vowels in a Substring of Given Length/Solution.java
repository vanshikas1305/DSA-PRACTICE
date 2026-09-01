class Solution {
    public int maxVowels(String s, int k) {
      StringBuilder ans= new StringBuilder();
        int l=0;
        int max=0;
        for(int r=0; r<s.length(); r++ ){
            if(s.charAt(r)=='a'|| s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u'){
               ans.append(s.charAt(r));
            }
            if(r-l+1==k){
             max= Math.max(max,ans.length());
            if(s.charAt(l)=='a'|| s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u'){
                    ans.deleteCharAt(0);}
             l++;
            }
        }

        return max;   
    }
}