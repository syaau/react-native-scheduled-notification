package com.sharingapples.react.notification;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotificationPackage implements ReactPackage{
    Activity mActivity;
    public NotificationPackage(Activity activity){
        mActivity = activity;
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext){
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new NotificationModule(reactContext,mActivity));
        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules(){
        return Arrays.asList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.asList();
    }
}
