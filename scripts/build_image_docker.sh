#!/usr/bin/env bash

set -e
cd /home/ec2-user/app/
#sudo mvn -B clean package -DskipTests --file pom.xml
docker build -t jarcicd .


