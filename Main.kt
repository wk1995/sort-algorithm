package com.wk

import com.wk.sort.*

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here

        val i= intArrayOf(16,7,3,20,17,8)
        val sort= HeapSort()
        sort.sort(i)
        i.forEach {
            v->
            print(" ,"+v)
        }
    }
}
