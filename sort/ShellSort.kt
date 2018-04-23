package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/21
 *      desc   : 希尔排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class ShellSort:Sort() {
    override fun sort(nums: IntArray) {
        val size=nums.size
        var k=size/2
        while(k>=1){
            for(i in 0 until size){
                var n=1
                while (i + k*n < size) {
                    if(nums[i+k*(n-1)]>nums[i+k*(n)]){
                        nums[i+k*(n-1)]=nums[i+k*(n-1)] xor nums[i+k*(n)]
                        nums[i+k*(n)]=nums[i+k*(n-1)] xor nums[i+k*(n)]
                        nums[i+k*(n-1)]=nums[i+k*(n-1)] xor nums[i+k*(n)]
                    }
                    n++
                }
            }

            k/=2
        }


    }


}