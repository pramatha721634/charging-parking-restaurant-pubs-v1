charging-stations-v1
charging-stations-v1 API give charging stations, OnStreet Parking, OffStreet Parking and nearby PUB and Restaurants details within the given city name

Please use below curl for testing the API 

curl --location --request GET 'http://localhost:9991/api_details/London' \
--header 'Content-Type: application/json'

Note : Currently we are supporting only for below mentioned cities and in future make it dynamic :
 
 Madrid,
 Budapest,
 Prague,
 Barcelona,
 Stockholm,
 Rome,
 Paris,
 London,
 Amsterdam,
 Vienna, 
 
 We need some refactor in project to make more Real time project.
