class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
         ArrayList<Integer>list=new ArrayList<>();
         ArrayList<Integer>list1=new ArrayList<>();
        // ArrayList<Integer>list2=new ArrayList<>();
        // for(int i:arr2){
        //     list.add(i);
        // }
        // for(int i:list){
        //     if(list.contains(i)){
        //         list1.add(i);
        //     }
        //     else{
        //         list2.add(i);
        //     }
        // }
        // Collections.sort(list2);
        // ArrayList<Integer>list3=new ArrayList<>();
        // for(int i:list1){
        //     list3.add(i);
        // }
        // for(int i:list2){
        //     list3.add(i);
        // }
        // int[]arr=new int[list3.size()];
        // for(int i=0;i<list3.size();i++){
        //     arr[i]=list3.get(i);
        // }
        // return arr;
        for(int i=0;i<n2;i++){
            for(int j=0;j<n1;j++){
                if(arr2[i]==arr1[j]){
                    list.add(arr1[j]);
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!list.contains(arr1[i])){
                list1.add(arr1[i]);
            }
        }
        Collections.sort(list1);
        list.addAll(list1);
        int[]arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}