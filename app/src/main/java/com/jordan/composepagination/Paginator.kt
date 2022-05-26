package com.jordan.composepagination

interface Paginator<Key, Item> {
    suspend fun loadNextItem()
    fun reset()
}