Tests will run fine from Maven, and also individually from IntelliJ.

However, if you try to run the module2 testng.xml file from IntelliJ, it will fail.
It is putting too many tests on the classpath. In this case, it includes the module1 test with a Spring dependency which fails.
It should be putting the test jar on the classpath, not the test classes folder from module1.