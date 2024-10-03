package com.example.appbeacons;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

// Define la interfaz de la API
public interface ApiService {

    @GET("/medicion")  // Asegúrate de que esta ruta sea válida en tu API
    Call<ResponseBody> checkServerStatus();

    // Define el endpoint para enviar datos
    @POST("/medicion")  // Cambiar a la ruta correcta
    Call<Dato> subirDato(@Body Dato dato);
}
