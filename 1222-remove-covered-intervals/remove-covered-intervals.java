class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) ->
            a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );
int count=0;
int yidx=-1;

for(int i=0;i<intervals.length;i++){
    if(intervals[i][1]>yidx){
        count++;
        yidx=intervals[i][1];
    }
}
return count;
    }
}