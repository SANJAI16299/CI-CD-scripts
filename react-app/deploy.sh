#!/bin/bash
cd /var/jenkins_home/workspace/Sample-react-app/react-app/ ; sudo docker run -d -p 3004:80 --name react-con sanjai:v1
