// com.soujava.interop.JavaClass

package com.soujava.interop;

import java.time.Instant;

public class JavaClass {

    public static void main(String[] args) {
        KotlinUtil u = new KotlinUtil(); // Java calling Kotlin Code
        System.out.println("Time: " + u.getTime());
    }
}
