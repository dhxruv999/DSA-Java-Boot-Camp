class Solution {
    public static void subsetFunc(int[] nums, List<List<Integer>> ans, int index, List<Integer> subList){   
        ans.add(new ArrayList<>(subList));
        for(int i=index; i<nums.length; i++){
            subList.add(nums[i]);
            subsetFunc(nums, ans, i+1, subList);
            subList.remove(subList.size()-1);
            }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetFunc(nums, ans, 0, new ArrayList<>());
        return ans; 
        }
    }
