package com.example.chint.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by chint on 7/30/2017.
 */

@Singleton
@Component(modules = {StorageModule.class})
interface StorageComponent {
    void inject(MainActivity mainActivity);
}
