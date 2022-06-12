mv ../target/*.jar ./
/usr/local/bin/docker build -t jenkens-test .
/usr/local/bin/docker run -d -p 8081:8081 -t jenkens-test