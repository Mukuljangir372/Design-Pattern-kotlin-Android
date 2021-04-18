package com.mu.jan.myapplication.creationalpattern

/**
 * DI or Dependency injection or Dependency injection framework
 * Providing dependency or object from outside the class.
 *
 * Dagger or Hilt, Basically works on Dependency injection framework.
 *
 * How dagger or Hilt works?
 * Ans - Dagger or Hilt, works using Annotations and generated factory classes.
 *
 * Annotations -
 * There are 4 main annotation in dagger or hilt:
 *
 * 1. Component - A interface annotated with @Component, that specifies where
 *                DI used.
 *
 * 2. Module - A object annotated with @Module, that provides
 *             which dependency or object you want to provide while using DI.
 *
 * 3. Provides - A function/method annotated with @Provides, that returns
 *               object or instance of class that you will use it later
 *               using @Inject.
 *
 * 4. Inject - A field annotated with @Inject, that specifies injected object
 *             or instance.
 *
 *
 * Generated classes or Factory classes -
 * Dagger or hilt, Basically generates necessary classes or factory classes
 * based on annotations. Using these generated classes, you able to get object
 * or instance of class.
 *
 * These generated classes uses Factory pattern(Part of Creational Design Pattern).
 * In Factory pattern, we create objects of classes without directly using
 * constructor.
 *
 *
 * Module is a Provider.
 * Component is a Bridge.
 * Inject is a Consumer.
 *
 */