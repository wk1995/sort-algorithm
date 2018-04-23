package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/21
 *      desc   : 插入排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class InsertSort: Sort() {
    override fun sort(nums: IntArray) {
        for(i in 1 until nums.size){
            var prePosition=i-1;
            val current=nums[i];
            while(prePosition>=0 && nums[prePosition]>current){
                nums[prePosition+1]=nums[prePosition]
                prePosition--
            }
            nums[prePosition+1] = current
        }
    }
}