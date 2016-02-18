package condenasTest.youmeng;

import java.util.HashMap;
import java.util.List;

import com.umeng.message.PushAgent;

import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		stratPushMesg();
		// reBroadcastRe();
	}

	public void stratPushMesg() {
		System.out
				.println("--------------------------1---------------------------");
		PushAgent mPushAgent = PushAgent.getInstance(this);
		mPushAgent.enable();
		mPushAgent.isEnabled();
		System.out.println("-----------------2-----------------------"
				+ mPushAgent.isEnabled());
		// mPushAgent.onAppStart();
		// mPushAgent.setPushIntentServiceClass(MyPushIntentService.class);
	}

	public HashMap<String, Intent> intentMap;
	
	@Override
	protected void onResume() {
		super.onResume();
		intentMap = IntentManager.getIntentManager().getIntent();
		if (intentMap != null) {
			if (intentMap.containsKey("MainActivity")) {
				Intent intent = intentMap.get("MainActivity");
				System.out.println("wo zai zhe li");
				String json = intent.getExtras().getString("json");
				System.out.println("this is activity's json, it is " + json);
				intentMap.remove("MainActivity");
			}
		}
	}
	// 注册广播
	// private MyBroadcastReceiver myBroadcastReceiver;
	//
	// public void reBroadcastRe() {
	// // == 服务启动时，注册广播接收者 ==
	// myBroadcastReceiver = new MyBroadcastReceiver();
	// // 指定意图过滤器
	// IntentFilter filter = new IntentFilter();//
	// filter.addAction("GN");
	// this.registerReceiver(myBroadcastReceiver, filter); // 绑定该广播接收者的调
	// }
    public void she(){
		System.out.println("Happy every day~");
	}
	public void skII(){
		System.out.println("Happy every day~");
	}
	public void skK(){
		System.out.println("Happy every day~");
	}
}
