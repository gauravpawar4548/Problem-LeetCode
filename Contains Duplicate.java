//Contains Duplicate

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i])){

                int index=mp.get(nums[i]);

                if((i-index)<=k)

                return true;

                else
                mp.put(nums[i],i);

            }
            else
            mp.put(nums[i],i);
        }

        return false;
     
        }
        
    }
  