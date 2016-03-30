
echo "Building artifacts .... "
mvn clean package
echo "Starting app infrastructure...."
docker-compose up -d 
echo "..... logs ....."
docker-compose logs

