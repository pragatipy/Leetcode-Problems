class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        String vowel="aioueAIOUE";
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(i<j && vowel.indexOf(arr[i])==-1){
                i++;
            }
            while(i<j && vowel.indexOf(arr[j])==-1){
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);        
    }
}