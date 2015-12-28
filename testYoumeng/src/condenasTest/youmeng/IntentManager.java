package condenasTest.youmeng;

import java.util.HashMap;

import android.content.Intent;

public class IntentManager {
	private static IntentManager intentManager;
	private static HashMap<String, Intent> intentMap;

	private IntentManager() {
	}

	public static IntentManager getIntentManager() {
		if (intentManager == null) {
			intentManager = new IntentManager();
			intentMap = new HashMap<String, Intent>();
		}

		return intentManager;
	}

	public void setIntent(String activity, Intent intent) {
		intentMap.put(activity, intent);

	}

	public HashMap<String, Intent> getIntent() {
		return intentMap;
	}
}
