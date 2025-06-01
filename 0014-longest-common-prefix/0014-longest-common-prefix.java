class Solution {
    public String longestCommonPrefix(String[] a) {
        if(a==null || a.length==0) return "";
        String prefix = a[0];
        for(int i=1;i<a.length;i++){
            while(a[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0) return "";
            }
        }
        return prefix;
    }
}