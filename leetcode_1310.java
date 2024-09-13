// T.C: O(n) + O(q)  -> q:no. of queries
// S.C: O(n)  -> to store cumXor[]
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] cumXor= new int[n];
        ArrayList<Integer> result= new ArrayList<>();
        cumXor[0]=arr[0];
        for(int i=1;i<n;i++){  //O(n)
            cumXor[i] = cumXor[i-1] ^ arr[i];
        }
        for(int[] query: queries){  //O(q)
            int l= query[0];
            int r= query[1];
            int xor_value= cumXor[r] ^ (l==0 ? 0 : cumXor[l-1]);
            result.add(xor_value);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
