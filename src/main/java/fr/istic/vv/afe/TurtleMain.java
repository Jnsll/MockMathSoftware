package fr.istic.vv.afe;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.net.URL;
import java.net.URLClassLoader;

public class TurtleMain {

    public static void main( String[] args ) throws Throwable {
        JUnitCore jUnitCore = new JUnitCore();

        URL classUrl = new URL("file:///home/aferey/Documents/VV/MockMathSoftware/target/test-classes/");
        URL[] classUrls = { classUrl };
        URLClassLoader url = new URLClassLoader(classUrls);
        Class simpleClass = url.loadClass("fr.istic.vv.AfeTest");
        Result result = jUnitCore.run(simpleClass);
        System.out.println(result.getFailureCount());


    }
}
