package com.yongjian.aidl_example;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by YONGJIAN on 2016/3/31 0031.
 */
public class ArithmeticService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    private final IRemote.Stub mBinder = new IRemote.Stub() {

        @Override
        public int add(int a, int b) throws RemoteException {
            // TODO Auto-generated method stub
            return (a + b);
        }

    };
}
