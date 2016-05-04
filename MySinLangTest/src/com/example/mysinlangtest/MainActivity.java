package com.example.mysinlangtest;

import com.sina.weibo.sdk.auth.AuthInfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	public AuthInfo mAuthInfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int k=0;
	}
	public void creatWeoBo(){
		mAuthInfo = new AuthInfo(this, Constants.APP_KEY, 
				Constants.REDIRECT_URL, Constants.SCOPE);
        mAuthInfo.getAuthBundle();
	}
}
