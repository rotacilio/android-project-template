package com.sidia.febracis.db.dao

import androidx.room.*
import com.sidia.febracis.db.model.UserEntity

@Dao
interface UserDao {

    @Insert
    suspend fun createUser(user: UserEntity)

    @Update
    suspend fun updateUser(user: UserEntity)

    @Delete
    suspend fun deleteUser(user: UserEntity)

    @Query("""
        SELECT * FROM tb_users u WHERE u.id = :id
    """)
    suspend fun getUserById(id: Long): UserEntity

    @Query("""
        SELECT * FROM tb_users u
        """)
    suspend fun listAll(): List<UserEntity>
}