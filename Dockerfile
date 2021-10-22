 FROM maven:3.8-ibmjava-8

 WORKDIR /app

 COPY . .

 CMD mvn test