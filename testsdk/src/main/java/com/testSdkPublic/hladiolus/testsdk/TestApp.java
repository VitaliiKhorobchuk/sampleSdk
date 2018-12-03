package com.testSdkPublic.hladiolus.testsdk;

import android.util.Log;

import com.not.sdkinner.TestInnerSDK;


/**
 * Created by Vitalii Khorobchuk on 11/22/18
 */
public class TestApp {

	public static void init(String text) {
		Log.d("TestSDK", "init:" + text);

		final TestSDK testSDK = new TestSDK();
		testSDK.start();

		TestInnerSDK.init();

	}
}
