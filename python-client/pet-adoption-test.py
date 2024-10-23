import grpc
import pet_adoption_pb2
import pet_adoption_pb2_grpc
import base64

# Convert image file to base64-encoded bytes
def image_to_base64_bytes(image_path):
    with open(image_path, "rb") as f:
        return base64.b64encode(f.read())  # This will return a bytes object

def run_tests():
    # Connect to the gRPC server
    channel = grpc.insecure_channel('localhost:50051')
    stub = pet_adoption_pb2_grpc.PetAdoptionStub(channel)

    # Test Case 1: Successful Pet Registration
    print("Running Test Case 1: Successful Pet Registration...")
    picture = image_to_base64_bytes("picture/pet1.jpg")  # Ensure the path is correct
    response = stub.RegisterPet(pet_adoption_pb2.RegisterPetRequest(
        name="Buddy",
        gender="Male",
        age=3,
        breed="Golden Retriever",
        picture=picture
    ))
    assert response.message == "Pet registered successfully!"
    print("Test Case 1 Passed!\n")

    # Test Case 2: Successful Pet Search by Name
    print("Running Test Case 2: Successful Pet Search by Name...")
    search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(name="Buddy"))
    assert len(search_response.pets) > 0  # Ensure we found the pet
    print(f"Found Pet: {search_response.pets[0].name}, {search_response.pets[0].gender}, {search_response.pets[0].age}, {search_response.pets[0].breed}")
    print("Test Case 2 Passed!\n")

    # Test Case 3: No Results Found
    print("Running Test Case 3: No Results Found...")
    search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(name="NonExistingPet"))
    assert len(search_response.pets) == 0  # Should not find any pet
    print("Found Pet: (none)")
    print("Test Case 3 Passed!\n")

    # Test Case 4: Search by Age
    print("Running Test Case 4: Search by Age...")
    search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(age=3))
    assert len(search_response.pets) > 0  # Ensure we found pets of age 3
    print("Found Pets:")
    for pet in search_response.pets:
        print(f"- {pet.name}, {pet.gender}, {pet.age}, {pet.breed}")
    print("Test Case 4 Passed!\n")

    # Test Case 5: Search by Gender
    print("Running Test Case 5: Search by Gender (Male)...")
    search_response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(gender="Male"))
    assert len(search_response.pets) > 0  # Ensure we found male pets
    print("Found Pets:")
    for pet in search_response.pets:
        print(f"- {pet.name}, {pet.gender}, {pet.age}, {pet.breed}")
    print("Test Case 5 Passed!\n")

if __name__ == '__main__':
    run_tests()
