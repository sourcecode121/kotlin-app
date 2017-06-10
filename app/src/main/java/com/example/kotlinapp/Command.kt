package com.example.kotlinapp

/**
 * Created by Anand on 10/06/2017.
 */
public interface Command<out T> {
    fun execute(): T
}