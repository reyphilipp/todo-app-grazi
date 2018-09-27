package ch.teko.olten.android.todoapp.todos.model.repository.rest

import ch.teko.olten.android.todoapp.todos.model.ToDo
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface TodoRestService {

    @GET("toDos")
    fun getAllTodos() : Observable<List<ToDo>>


    companion object {
        fun create(): TodoRestService {

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://192.168.30.100:8090/todo-api/")
                    //.baseUrl("http://10.0.2.2:8090/todo-api/")
                    .build()

            return retrofit.create(TodoRestService::class.java)
        }
    }

}