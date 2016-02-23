# spring-cloud-sidecar-test

##Instructions to run the samples:

###eureka-server
1. Run `EurekaApplication` as a Spring boot application
 
###random-number-ms (normal microservice that generates random numbers)
1. Run `RandomNameMsApplication` as a Spring boot application with spring.profiles.active=random1 -> localhost:9999/numbers
2. Run `RandomNameMsApplication` as a Spring boot application with spring.profiles.active=random2 -> localhost:9998/numbers

You should see two instances on the Eureka console localhost:8761

###random-letter-ms
1. Move to `random-letter-ms` directory and run `npm install`
2. Start an instance on the default port (3000): `node bin/www` -> localhost:3000/letters
3. Start another console
4. Move to `random-letter-ms` and set PORT=3001 as environment variable (win: SET PORT=3001)
5. Start another instance on the letter ms `node bin/www` -> localhost:3001/letters

###random-letter-sidecar
1. Run `RandomLetterMsSidecarApplication` as a Spring boot application with spring.profiles.active=random1 -> localhost:9595/letters
2. 1. Run `RandomLetterMsSidecarApplication` as a Spring boot application with spring.profiles.active=random2 -> localhost:9696/letters




 
