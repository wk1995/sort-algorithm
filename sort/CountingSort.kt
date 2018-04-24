package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/24
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class CountingSort : Sort() {
    override fun sort(nums: IntArray) {
        var max = 0
        var min = -1
        nums.forEach { num ->
            if (num > max)
                max = num
            if (num < min)
                min = max
        }
        val a = IntArray(max - min + 1)
        nums.forEach { num ->
            a[num - min]++
        }
        var i = 0
        var j = 0
        while (i < nums.size && j < a.size) {
            if (a[j] != 0)
                for (y in 0 until a[j]) {
                    nums[i] = j + min
                    i++
                }
            j++
        }

    }
}