package com.example.chint.dagger;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by chint on 7/30/2017.
 */

@Module
public class StorageModule {

    @Singleton
    @Provides
    String returnString(){
        return "Welcome";
    }
}
