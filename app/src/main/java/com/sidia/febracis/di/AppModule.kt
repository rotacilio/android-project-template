package com.sidia.febracis.di

import android.content.Context
import com.sidia.febracis.storage.DataStoreUtil
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideApplication(@ApplicationContext applicationContext: ApplicationContext) = applicationContext

    @Provides
    fun provideDataStore(@ApplicationContext context: Context) =
        DataStoreUtil(context)
}