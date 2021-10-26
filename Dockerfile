FROM maven:3.8-ibmjava-8

WORKDIR /app

COPY . .

CMD chmod +x allure-2.15.0/bin/allure
CMD chmod +x cm_linux
CMD ./cm_linux selenoid start --browsers-json browsers.json
CMD ./cm_linux selenoid status
CMD mvn clean test "-Dsurefire.suiteXmlFiles=testngRemote.xml"
CMD ./allure-2.15.0/bin/allure generate "target/allure-results" -c -o "/bind"