package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/22
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class MergeSort :Sort(){

    override fun sort(nums: IntArray) {
        val size=nums.size
        merge(nums,0,size-1)

    }
    private fun merge(nums: IntArray,first:Int,last:Int){
        val mid=(first+last)/2

        if(first<last){

            merge(nums,first,mid)
            merge(nums,mid+1,last)
            merge1(nums,first,mid,last)
        }
    }

    private fun merge1(nums: IntArray,first:Int,mid:Int,last:Int){
        val tmp=IntArray(last-first+1)
        var i=first
        var j=mid+1
        var k=0
        while (i<=mid && j<=last){
            if(nums[i]<nums[j]){
                tmp[k++]=nums[i++]
            }else
                tmp[k++]=nums[j++]
        }
        while (i<=mid)
            tmp[k++]=nums[i++]
        while (j<=last)
            tmp[k++]=nums[j++]
       for (x in 0 until k)
           nums[x+first]=tmp[x]
    }
}