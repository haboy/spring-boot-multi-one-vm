sudo su
echo "127.0.0.1 config configserver gateway discovery" >> /etc/hosts
gradle bootRun
