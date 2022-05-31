package com.sidia.febracis.repositories

import com.sidia.febracis.db.dao.UserDao
import com.sidia.febracis.db.model.UserEntity
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDao: UserDao,
) {
    suspend fun createUser(userEntity: UserEntity) = userDao.createUser(userEntity)

    suspend fun updateUser(userEntity: UserEntity) = userDao.updateUser(userEntity)

    suspend fun deleteUser(userEntity: UserEntity) = userDao.deleteUser(userEntity)

    suspend fun getUserById(id: Long) = userDao.getUserById(id)

    suspend fun listAll() = userDao.listAll()

}