class Solution:
    def distantSubarrays(self, nums: list[int], goal: int, k: int) -> int:
        #count the number of subarrays with disticnt sums


        #we are given goal ,  k 

        #the subarray is called distinct iff abs difference between its 

        #sum and goal is >= k 


        #(prefix[j]-prefix[i-1])>=k+goal is called distant 

        #pref-k-goal>=past 

        #so i need how many are greater than this 
        #find number of distant subarrays 
        #easyy sortedlist we need 
        sl=SortedList()
        pref=0
        if k==0:
            # abs(val)>=0
            return (len(nums)*(len(nums)+1))//2
        cnt=0
        sl.add(pref)
        for val in nums:
            pref+=val
            #now we need prefix greater 
            past=pref-k-goal
            cnt+=sl.bisect_right(past)
            # if k==0:
                # continue
            future=pref-goal+k
            cnt+=(len(sl)-sl.bisect_left(future))
            sl.add(pref)
        return cnt