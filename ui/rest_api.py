#rest api 

import sys
import os

from flask import Flask, render_template, request, jsonify

sys.path.append(os.path.abspath("../python-client"))

import pet_adoption_pb2
import pet_adoption_pb2_grpc

import grpc

app = Flask(__name__)


@app.route('/')
def index():
    return render_template('index.html')



# Connect to the gRPC server
channel = grpc.insecure_channel('localhost:50051')
stub = pet_adoption_pb2_grpc.PetAdoptionStub(channel)


@app.route('/register_pet', methods=['POST'])
def register_pet():
    data = request.json
    name = data.get('name')
    gender = data.get('gender')
    age = int(data.get('age'))
    breed = data.get('breed')
    
    # Register the pet using gRPC
    response = stub.RegisterPet(pet_adoption_pb2.RegisterPetRequest(
        name=name,
        gender=gender,
        age=age,
        breed=breed,
        picture=b""  # Assuming no picture for now
    ))

    return jsonify({'message': response.message}), 200


@app.route('/search_pet_name', methods=['GET'])
def search_pet_name():
    name = request.args.get('name')
    
    # Search for the pet using gRPC
    response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
        name=name
    ))

    pets = [{
        'name': pet.name,
        'gender': pet.gender,
        'age': pet.age,
        'breed': pet.breed
    } for pet in response.pets]

    return jsonify({'pets': pets}), 200
    
    
@app.route('/search_pet_gender', methods=['GET'])
def search_pet_gender():
    gender = request.args.get('gender')
    
    # Search for the pet using gRPC
    response = stub.SearchPet(pet_adoption_pb2.SearchPetRequest(
        gender=gender
    ))

    pets = [{
        'name': pet.name,
        'gender': pet.gender,
        'age': pet.age,
        'breed': pet.breed
    } for pet in response.pets]

    return jsonify({'pets': pets}), 200

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)
