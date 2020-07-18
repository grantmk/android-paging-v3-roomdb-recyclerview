package com.gkmicro.roomdbpaging.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.room.Room
import com.gkmicro.roomdbpaging.AppDatabase

class MainViewModel(app: Application) : AndroidViewModel(app) {

    val dao = Room.databaseBuilder(app, AppDatabase::class.java, "myDb")
        .build()
        .storedObjectDao()
    val items = Pager(
        PagingConfig(
            pageSize = 50,
            enablePlaceholders = true,
            maxSize = 200
        )
    ) {
        dao.getAllPaged()
    }.flow
}
