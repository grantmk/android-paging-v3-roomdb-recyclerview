package com.gkmicro.roomdbpaging

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(StoredObject::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun storedObjectDao(): StoredObjectDao
}