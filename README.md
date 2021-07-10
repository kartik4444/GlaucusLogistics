# GlaucusLogistics
Implementation for below TASK:

1-The task is to consistently increment a number in a database when parallel threads are racing to increment the number.
2-Create a table Number in MySQL database with one integer type field.
3-Create a RESTful API using Spring MVC architecture that increments this number.
4-Use Jmeter (Do not use postman because it does not send parallel requests) to call this API with 5000 users so that a lot of parallel requests are sent to server to increment the number.
5-Now set the initial value of Number to 0.
6-After the execution of Jmeter, the value of the number in the database shall be 5000. (Try the same with a bigger number 100000)
7-The API should be scalable i.e. if deployed on multiple machines with same database, the result should be consistent.
