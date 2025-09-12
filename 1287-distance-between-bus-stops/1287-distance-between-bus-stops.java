class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=distance[i];
        }
        int dis=0;
        if(start>destination){
            int tem=start;
            start=destination;
            destination=tem;
        }
        for(int i=start;i<destination;i++){
            dis+=distance[i];
        }
        int fin=sum-dis;
        int ans=Math.min(fin,dis);
        return ans;
    }
}