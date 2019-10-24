// Solution to problem Interleaving String (LeetCode)
// https://leetcode.com/problems/interleaving-string/

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
        
        char[] s3a = s3.toCharArray();
        char[] s2a = s2.toCharArray();
        char[] s1a = s1.toCharArray();
        int l1 = s1a.length;
        int l2 = s2a.length;
        int l3 = s3a.length;
        
        if(l3!=(l1+l2)) return false;
        
        
        boolean mat[][]  = new boolean[l1+1][l2+1];
        mat[0][0] = true;
        
        for(int j=1;j<=l2;j++){
            if(s2a[j-1]==s3a[j-1])
            mat[0][j] = mat[0][j-1];
        }
        for(int i=1;i<=l1;i++){
            if(s1a[i-1]==s3a[i-1])
            mat[i][0] = mat[i-1][0];
        }
        
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(s1a[i-1]==s3a[i+j-1]){
                    if(mat[i-1][j]){
                        mat[i][j] = true;
                    }
                }
                if(s2a[j-1]==s3a[i+j-1]){
                    if(mat[i][j-1]){
                        mat[i][j]=true;
                    }
                }
            }
        }
        
        // for(int i=0;i<=l1;i++){
        //     for(int j=0;j<=l2;j++){
        //     System.out.print(mat[i][j]+" ");
        //     }
        // System.out.println();}
        
        
//         aabcc dbbca
//         
        
        
        return mat[l1][l2];
    }
}
