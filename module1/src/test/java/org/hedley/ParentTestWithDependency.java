package org.hedley;


import org.springframework.core.SpringVersion;
import org.testng.annotations.Test;

public class ParentTestWithDependency {

    @Test
    public void dummyParentTest() {
        System.out.println("In ParentTestWithDependency. Spring version: " + SpringVersion.getVersion());
    }
}
