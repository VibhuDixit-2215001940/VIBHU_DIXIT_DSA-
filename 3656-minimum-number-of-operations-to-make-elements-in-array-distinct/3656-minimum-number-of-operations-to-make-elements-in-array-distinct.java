class Solution {
    public int minimumOperations(int[] arr) {
        int steps = 0;
        while(true) {
            HashSet<Integer> unique = new HashSet<>();
            int repeat = 0;
            for (int val : arr) {
                if (unique.contains(val)) repeat++;
                else unique.add(val);
            }
            if(repeat == 0) break;
            arr = trimFirstThree(arr);
            steps++;
        }
        return steps;
    }
    private int[] trimFirstThree(int[] arr) {
        int len = arr.length;
        if (len <= 3) return new int[0];
        int[] reduced = new int[len - 3];
        System.arraycopy(arr, 3, reduced, 0, len - 3);
        return reduced;
    }
}
