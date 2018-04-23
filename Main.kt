package com.wk

import com.wk.sort.InsertSort
import com.wk.sort.MergeSort
import com.wk.sort.QuickSort
import com.wk.sort.ShellSort

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here

        val i= intArrayOf(3,65,1,5,7,2,123,543,6,324)
        val sort= QuickSort()
        sort.sort(i)
        i.forEach {
            v->
            print(" ,"+v)
        }
    }
}
