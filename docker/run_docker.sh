mv ../target/*.jar ./
docker rm $(docker stop $(docker ps -aq --filter="ancestor=jenkins-test"))
/usr/local/bin/docker build -t jenkins-test .
/usr/local/bin/docker run -d -p 8081:8081 -t jenkins-test