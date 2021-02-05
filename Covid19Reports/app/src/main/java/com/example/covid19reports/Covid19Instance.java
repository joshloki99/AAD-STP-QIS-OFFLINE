package com.example.covid19reports;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Covid19Instance {
    static Retrofit retrofit;
    public static final String BASE_URL="https://api.covid19api.com";
    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .baseUrl(BASE_URL).build();
        }
        return retrofit;
    }


}
