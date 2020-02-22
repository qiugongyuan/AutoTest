package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.InvokeMethodRunnable;

public class TestMethodDemo {
    @Test

    public void test1(){
        Assert.assertEquals(3,2);

    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);

    }


    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }


    @Test
    public void LogerTest() {
        Reporter.log("这是自己的");

    }



}
