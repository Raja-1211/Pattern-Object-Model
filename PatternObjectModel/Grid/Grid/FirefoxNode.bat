java -jar selenium-server-standalone-3.6.0.jar -role wd -port 5566 -hub http://192.168.1.56:4444/grid/register -browser "browserName=firefox,platform=WINDOWS,maxInstances=3" -maxSession 2