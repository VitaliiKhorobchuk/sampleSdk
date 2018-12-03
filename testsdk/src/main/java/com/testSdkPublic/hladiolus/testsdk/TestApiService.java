package com.testSdkPublic.hladiolus.testsdk;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Vitalii Khorobchuk on 11/22/18
 */
public interface TestApiService {

	@GET("posts/1")
	Call<TestModel> loadChanges();
}
