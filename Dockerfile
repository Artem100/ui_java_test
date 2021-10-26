FROM maven:3.8-ibmjava-8

WORKDIR /app

COPY . .

CMD chmod +x allure-2.15.0/bin/allure
CMD chmod +x cm_linux
CMD mvn clean test "-Dsurefire.suiteXmlFiles=testngRemote.xml"; cd allure-2.15.0/bin; allure generate /app/target/allure-results -c -o "/bind"