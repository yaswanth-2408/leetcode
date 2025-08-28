class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int z=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            z++;
        }
        for(int i=n-1;i>=0;i--){
            int j=i+z;
            if(j<n){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                z--;
                j=i+z;
                if(j<n){
                    arr[j]=0;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}