import grpc
import pet_adoption_pb2
import pet_adoption_pb2_grpc

def run():
    # Connect to the Java gRPC server
    channel = grpc.insecure_channel('localhost:50051')
    stub = pet_adoption_pb2_grpc.PetAdoptionStub(channel)

    print("Name: ")
    name=str(input())
    print("Gender: ")
    gender=str(input())
    print("Age: ")
    age=int(input())
    print("Breed: ")
    breed=str(input())
    print("Picture: ")


    # Register a new pet
    try:
        response = stub.RegisterPet(pet_adoption_pb2.RegisterPetRequest(
            name=name,
            gender=gender,
            age=age,
            breed=breed,
            picture=b"some  picture"
        ))

    except :
        print("Server not responding")




    print("RegisterPet Response:", response.message)

    print("How would you like to Search a pet?\n"
                    +"1. Name\t 2. gender\t 3.age\t 4.breed")
    choice = int(input())
    if choice==1:
        # Search for a pet
        print("Name to search: ")
        search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
            name=str(input())
        ))
    elif choice==2:
        # Search for a pet
        print("Search by gender: ")
        search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
            gender=str(input())
        ))
    elif choice==3:
        # Search for a pet
        print("Search by age: ")
        search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
            age=int(input())
        ))
    elif choice==4:
        # Search for a pet
        print("Search by breed: ")
        search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
            breed=str(input())
        ))

    for pet in search_response.pets:
        print(f"Found Pet: {pet.name}, {pet.gender}, {pet.age}, {pet.breed}")

if __name__ == '__main__':
    run()
