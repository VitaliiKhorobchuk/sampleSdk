package com.testSdkPublic.hladiolus.testsdk;

import androidx.annotation.RestrictTo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vitalii Khorobchuk on 11/22/18
 */
public class TestModel {

	@SerializedName("userId")
	int userId;
	@SerializedName("id")
	int id;
	@SerializedName("title")
	String title;
	@SerializedName("body")
	String body;

	public int getUserId() {
		return userId;
	}

	public void setUserId(final int userId) {
		this.userId = userId;
	}

	@RestrictTo(RestrictTo.Scope.LIBRARY)
	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(final String body) {
		this.body = body;
	}
}
