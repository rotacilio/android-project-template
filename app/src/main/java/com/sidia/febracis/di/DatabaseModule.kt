package com.sidia.febracis.di

import android.app.Application
import com.sidia.febracis.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application) =
        AppDatabase.getInstance(application)

    @Provides
    @Singleton
    fun provideUserDao(database: AppDatabase) = database.userDao
}