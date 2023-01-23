class Solution {
    void convert(int[] arr, int n) {
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> umap = new HashMap<>();
        int val = 0;
        for (int i = 0; i < n; i++){
            umap.put(temp[i], val++);
        }
        for (int i = 0; i < n; i++){
            arr[i] = umap.get(arr[i]);
        }
        
        
    }
}