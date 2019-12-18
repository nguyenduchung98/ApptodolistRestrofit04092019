package com.example.apptodolistrestrofit04092019.api;

import com.example.apptodolistrestrofit04092019.model.Response;
import com.example.apptodolistrestrofit04092019.model.Sinhvien;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiResponse {

    @GET("sinhvien.php")
    Observable<Response<List<Sinhvien>>> getAllSinhvien();


}