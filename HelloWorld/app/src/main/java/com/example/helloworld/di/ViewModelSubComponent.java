package com.example.helloworld.di;

import com.example.helloworld.viewmodel.ProjectListViewModel;
import com.example.helloworld.viewmodel.ProjectViewModel;

import dagger.Subcomponent;

/**
 * A sub component to create ViewModels. It is called by the
 * {@link com.example.test.mvvmsampleapp.viewmodel.ProjectViewModelFactory}.
 */
@Subcomponent
public interface ViewModelSubComponent {
    @Subcomponent.Builder
    interface Builder {
        ViewModelSubComponent build();
    }

    ProjectListViewModel projectListViewModel();
    ProjectViewModel projectViewModel();
}
