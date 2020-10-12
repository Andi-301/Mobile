package com.example.helloworld.di;

import com.example.helloworld.view.ui.ProjectFragment;
import com.example.helloworld.view.ui.ProjectListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract ProjectFragment contributeProjectFragment();

    @ContributesAndroidInjector
    abstract ProjectListFragment contributeProjectListFragment();
}
