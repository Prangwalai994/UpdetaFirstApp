package com.example.firstapp.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

@Dao
interface FirstappDatabaseDao {
    @Insert
    fun insert(night: FirstNight)

    @Update
    fun update(night: FirstNight)

    @Query("SELECT * from namecontact_first_quality_table WHERE nightId = :key")
    fun get(key: Long): FirstNight?

    @Query("DELETE FROM namecontact_first_quality_table")
    fun clear()

    @Query("SELECT * FROM namecontact_first_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight(): FirstNight?

    @Query("SELECT * FROM namecontact_first_quality_table ORDER BY nightId DESC")
    fun getAllNights(): LiveData<List<FirstNight>>
}