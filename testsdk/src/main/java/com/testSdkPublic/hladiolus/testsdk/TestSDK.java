package com.testSdkPublic.hladiolus.testsdk;

import androidx.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vitalii Khorobchuk on 11/22/18
 */
public class TestSDK implements Callback<TestModel> {



	public void start() {
		Gson gson = new GsonBuilder()
				.setLenient()
				.create();

		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://jsonplaceholder.typicode.com/")
				.addConverterFactory(GsonConverterFactory.create(gson))
				.build();

		TestApiService gerritAPI = retrofit.create(TestApiService.class);

		Call<TestModel> call = gerritAPI.loadChanges();
		call.enqueue(this);

	}

	@Override
	public void onResponse(
			@NonNull final Call<TestModel> call, @NonNull final Response<TestModel> response
	) {
		Log.d("TestSDK", "onResponse:" + response.body().getBody());
	}

	@Override
	public void onFailure(@NonNull final Call<TestModel> call, @NonNull final Throwable t) {
		t.printStackTrace();
	}
}
