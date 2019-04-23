# failed-test-runner-cucumber
You can use this project as template to understand how to re-run failed tests in cucumber

1. run the tests using runner file at TestRunner.java
Some tests are intentionally marked to fail.

Once the execution is complete a file rerun.txt will be generated in the target folder.

2. Now, as mentioned in step 1. run the tests again but time using FailedTestRunner.java
you will now notice that only the tests which were failed in the previous execution will be executed.

