package com.example.chint.dagger;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    StorageComponent storageComponent;

    @Inject
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storageComponent = DaggerStorageComponent.builder().storageModule(new StorageModule()).build();
        getStorageComponent().inject(this);

        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }

    public StorageComponent getStorageComponent(){
        return storageComponent;
    }
}
