package com.example.tasklist.data

import androidx.room.*

@Dao
interface ToDoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDoItem(item: ToDoItem)

    @Update
    suspend fun updateToDoItem(item: ToDoItem)

    @Delete
    suspend fun deleteToDoItem(item: ToDoItem)

    @Query("SELECT * FROM todo_items ORDER BY id ASC")
    fun getAllToDoItems(): kotlinx.coroutines.flow.Flow<List<ToDoItem>>

    @Query("SELECT * FROM todo_items WHERE id = :id LIMIT 1")
    suspend fun getToDoItemById(id: Int): ToDoItem?
}
