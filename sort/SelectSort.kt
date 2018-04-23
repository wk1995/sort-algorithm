package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/21
 *      desc   : (升序)选择排序：在第一个开始，选出最小的值，然后与第一个值互换位置
 *              第二开始，选最小的值，互换位置
 *              。。
 *              时间复杂度：n*（n-1)/2
 *              空间复杂度：O（1）
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class SelectSort: Sort() {
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