package com.example.firstapp.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [FirstNight::class], version = 1, exportSchema = false)
abstract class FirstappDatabase : RoomDatabase() {

    abstract val sleepDatabaseDao: FirstappDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: FirstappDatabase? = null

        fun getInstance(context: Context): FirstappDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FirstappDatabase::class.java,
                        "sleep_history_database")
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}