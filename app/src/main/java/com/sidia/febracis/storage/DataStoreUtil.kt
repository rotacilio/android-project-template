package com.sidia.febracis.storage

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.sidia.febracis.utils.DATA_STORE_ID
import com.sidia.febracis.utils.PREF_KEY_USERNAME
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

private val Context.dataStore by preferencesDataStore(name = DATA_STORE_ID)

class DataStoreUtil(
    private val context: Context
) {
    private fun <T> read(key: Preferences.Key<T>, default: T) = runBlocking {
        context.dataStore.data.map {
            it[key] ?: default
        }.first()
    }

    private fun <T> write(key: Preferences.Key<T>, value: T) = runBlocking {
        context.dataStore.edit {
            it[key] = value
        }
        Unit
    }

    /**
     * Example:
     * var username: String
     *      get() = read(stringPreferencesKey(PREF_KEY_USERNAME), "")
     *      set(value) = write(stringPreferencesKey(PREF_KEY_USERNAME), value)
     */
     var username: String
        get() = read(stringPreferencesKey(PREF_KEY_USERNAME), "")
        set(value) = write(stringPreferencesKey(PREF_KEY_USERNAME), value)

    suspend fun clear() {
        this.context.dataStore.edit {
            it.clear()
        }
    }
}