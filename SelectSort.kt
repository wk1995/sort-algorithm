package com.wk

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/21
 *      desc   : 选择排序：
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class SelectSort:Sort {
    override fun sort(nums: IntArray) {
        for (i in 0 until nums.size){
            var store=i
            for (j in i+1 until nums.size){
                if(nums[j]<nums[store])
                    store=j
            }
            if(store!=i) {
                nums[i] = nums[i] xor nums[store]
                nums[store]=nums[i] xor nums[store]
                nums[i]=nums[i] xor nums[store]
            }
        }
    }
}