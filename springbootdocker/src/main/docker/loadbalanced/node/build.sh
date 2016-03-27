# Copy the fat-jar file to local folder
cp ../../../../../target/springbootdocker-0.0.1.jar .
# Build the image
docker build -t nms/springboottest .

# Remove jar file
rm springbootdocker-0.0.1.jar
