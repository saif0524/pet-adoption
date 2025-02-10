#### Pet Adoption System (UTA CSE 5306)

#### For starting the server, first go to java-server directory:
	$ cd <path/to/>java-server 
#### Run the server
##### on windows machine:
	$ mvnw.cmd exec:java -Dexec.mainClass="server.PetAdoptionServer"
	
##### on linux machine:
	$ ./mvnw exec:java -Dexec.mainClass="server.PetAdoptionServer"

#### if the previous command does not work, please try the following command:
	$ mvnw.cmd clean compile exec:java 		[on windows]
	$ ./mvnw clean compile exec:java 		[on windows]

#### For running the client, first go to python-client directory: 
	$ cd <path/to/>python-client 

#### Optional: Download the pre-requisites:
##### _This will install gRPC, gRPC tools and protobuf for python as listed in requirements.txt._
	$ pip install -r requirements.txt  

#### Run the client:
	$ python pet-adoption-client.py

 
 ```bash
pet-adoption/						#project-root
│
├── java-server/
│   ├── src/main/java/
│   │           	├── grpc/
│   │           	│   ├── PetAdoptionGrpc.java	# Generated from .proto file
│   │           	│   └── PetAdoptionProto.java	# Generated from .proto file
│   │           	├── server/
│   │           	│   └── PetAdoptionServer.java  # Java server class
│   ├── pom.xml
│
├── python-client/
│   ├── pet-adoption-client.py				# run this after running the java server
│   ├── pet_adoption_pb2.py				# Generated from .proto file
│   ├── pet_adoption_pb2_grpc.py			# Generated from .proto file
│   ├── requirements.txt				# requirements to download pre-rquisites for python 
│
├── protos/
│   ├── pet_adoption.proto				# .proto file shared with both Java and Python
```
