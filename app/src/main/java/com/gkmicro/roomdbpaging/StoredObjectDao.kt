package com.gkmicro.roomdbpaging

import androidx.paging.PagingSource
import androidx.room.*

@Dao
interface StoredObjectDao {

    @Query("SELECT * FROM StoredObject ORDER BY _id DESC")
    fun getAllPaged(): PagingSource<Int, StoredObject>

    @Update
    suspend fun update(item: StoredObject): Int

    @Insert
    suspend fun insert(item: StoredObject): Long

    @Delete
    suspend fun delete(item: StoredObject)
}