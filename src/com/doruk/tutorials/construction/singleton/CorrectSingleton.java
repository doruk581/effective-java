package com.doruk.tutorials.construction.singleton;

import java.util.Objects;

/*
* Pass the resource into the constructor when creating a new instance
* */
public class CorrectSingleton {

    // Dependency injection provides flexibility and testability

    private final SomeDependency dependency;

    public CorrectSingleton(SomeDependency dependency) {
        this.dependency = Objects.requireNonNull(dependency);
    }

}
