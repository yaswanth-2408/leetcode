class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list=new ArrayList<>();
      int left=0;
      int right=matrix[0].length-1;
      int top=0;
      int bottom=matrix.length-1;
      while(top<=bottom && left<=right)
      {
        for(int j=left;j<=right;j++)
        list.add(matrix[top][j]);
        top++;
        for(int i=top;i<=bottom;i++)
        list.add(matrix[i][right]);
        right--;
        if(top<=bottom){
        for(int k=right;k>=left;k--)
        list.add(matrix[bottom][k]);
        bottom--;
        }
        if(left<=right){
        for(int l=bottom;l>=top;l--)
        list.add(matrix[l][left]);
        left++;
        }    
      }
      return list;  
    }
}