class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int index = 0; index < matrix.length; index++){
            if(matrix[index][0] <= target && target <= matrix[index][matrix[0].length-1]) {
                List<Integer> list = new ArrayList<>();
                for(int i = 0; i <= matrix[0].length-1; i++) {
                    list.add(matrix[index][i]);
                }
                return binarySearch(list, target);
            }
        }
        return false;
    }

    public static boolean binarySearch(List<Integer> list, int target){
        int left = 0, right = list.size()-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(list.get(mid) == target) {
                return true;
            } else if(list.get(mid) < target){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return false;
    }
}
