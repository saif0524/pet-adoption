import grpc
import pet_adoption_pb2
import pet_adoption_pb2_grpc

import os

import base64

from PIL import Image

def image_to_base64(image_path):
    with open(image_path, "rb") as f:
       image = Image.open(f)  
    with open(image_path, "rb") as f:
        encoded_image = base64.b64encode(f.read())
    return encoded_image

def run():
    # Connect to the Java gRPC server
    channel = grpc.insecure_channel('localhost:50051')
    
    print("Client connected to the server..")

    stub = pet_adoption_pb2_grpc.PetAdoptionStub(channel)

    image_path = os.getcwd()

    while True:
        print("What would you like to do:?\n"+
                        "1. Register\t 2. Search\t 3.Quit")
        operation = int(input("Operation: "))
                
        if operation == 1:
            name=str(input("Name: "))
            gender=str(input("Gender: "))
            age=int(input("Age: "))
            breed=str(input("Breed: "))
            
            image_path +="/picture/" + str(input("image path: "))
            picture=image_to_base64(image_path)
            
            # Register a new pet
            try:
                response = stub.RegisterPet(pet_adoption_pb2.RegisterPetRequest(
                    name=name,
                    gender=gender,
                    age=age,
                    breed=breed,
                    picture=picture
                ))

            except :
                print("Server not responding")

            print("RegisterPet Response:", response.message)

        elif operation == 2:
            print("How would you like to Search a pet?\n"
                            +"1. Name\t 2. gender\t 3.age\t 4.breed")
            choice = int(input())
            if choice==1:
                # Search for a pet by name
                
                search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
                    name=str(input("Name to search: "))
                ))
            elif choice==2:
                # Search for a pet by gender
                search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
                    gender=str(input("Search by gender: "))
                ))
            elif choice==3:
                # Search for a pet by age
                search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
                    age=int(input("Search by age: "))
                ))
            elif choice==4:
                # Search for a pet by breed
                search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
                    breed=str(input("Search by breed: "))
                ))

            for pet in search_response.pets:
                print(f"Found Pet: {pet.name}, {pet.gender}, {pet.age}, {pet.breed}, {pet.picture} \n")
        else:
            channel.close()
            print("Client terminated")
            break

if __name__ == '__main__':
    run()
