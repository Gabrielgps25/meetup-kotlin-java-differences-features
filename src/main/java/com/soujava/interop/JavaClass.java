// com.soujava.interop.JavaClass

package com.soujava.interop;

import java.time.Instant;

public class JavaClass {

    public void printTime(){
        KotlinUtil u = new KotlinUtil(); // Java calling Kotlin Code
        System.out.println("Time: " + u.getTime());
    }
}