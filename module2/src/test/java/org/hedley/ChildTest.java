package org.hedley;

import org.testng.annotations.Test;

public class ChildTest extends AbstractParentTestNoDependencies {

    @Test
    public void childTest() {
        super.usefulParentMethod();
        System.out.println("ChildTest running.");
    }
}
