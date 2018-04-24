package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/23
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class HeapSort : Sort() {
    override fun sort(nums: IntArray) {
        val size = nums.size
        for (length in size downTo 2) {
            var i = length / 2 - 1
            while (i >= 0 && i<=length) {
                var k = 2 * i + 1
                val tmp = nums[i]
                while (k < length) {
                    if (k + 1 < length && nums[k + 1] > nums[k])
                        k++
                    if (nums[k] > tmp) {
                        nums[i] = nums[k]
                        i = k
                    } else {

                        break
                    }
                    nums[i] = tmp
                    k = 2 * k + 1
                }
                i--
            }
            nums[0] = nums[0] xor nums[length - 1]
            nums[length - 1] = nums[0] xor nums[length - 1]
            nums[0] = nums[0] xor nums[length - 1]


        }

    }

}