package learn2.rn.xiaofan.mixreactnativeapp2;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by dazhaoyu on 2017/3/27.
 */

public class SampleModule extends ReactContextBaseJavaModule{

  public SampleModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "SampleModule";
  }

  @ReactMethod
  public void startAct(){
    Intent intent = new Intent(getReactApplicationContext(),NativeForRNActivity.class);
    getReactApplicationContext().startActivity(intent);
  }

}
