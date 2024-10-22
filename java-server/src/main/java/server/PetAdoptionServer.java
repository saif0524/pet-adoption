package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import grpc.PetAdoptionGrpc;
import grpc.PetAdoptionProto.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PetAdoptionServer {
    private Server grpcServer;

    private final List<PetInfo> pets = new ArrayList<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        final PetAdoptionServer server = new PetAdoptionServer();
        server.start();
        server.blockUntilShutdown();
    }

    private void start() throws IOException {
        // Create a thread pool for handling requests
        ExecutorService threadPool = Executors.newFixedThreadPool(10);  // Use 10 threads, can be adjusted

        grpcServer = ServerBuilder.forPort(50051)
                .addService(new PetAdoptionServiceImpl())
                .build();

        System.out.println("Starting gRPC server at port 50051...");
        grpcServer.start();
        //grpcServer.awaitTermination();
        System.out.println("Server started, listening on port 50051");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down gRPC server...");
            if (grpcServer != null) {
                grpcServer.shutdown();
            }
            System.err.println("Server shut down.");
        }));
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (grpcServer != null) {
            grpcServer.awaitTermination();
        }
    }



    private class PetAdoptionServiceImpl extends PetAdoptionGrpc.PetAdoptionImplBase {
        @Override
        public void registerPet(RegisterPetRequest request, StreamObserver<RegisterPetResponse> responseObserver) {
            // Store the pet in the in-memory list
            PetInfo pet = PetInfo.newBuilder()
                    .setName(request.getName())
                    .setGender(request.getGender())
                    .setAge(request.getAge())
                    .setBreed(request.getBreed())
                    .setPicture(request.getPicture())
                    .build();
            pets.add(pet);

            // Respond back with success message
            RegisterPetResponse response = RegisterPetResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Pet registered successfully!")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void searchPet(SearchPetRequest request, StreamObserver<SearchPetResponse> responseObserver) {
            List<PetInfo> searchResults = new ArrayList<>();
            for (PetInfo pet : pets) {
                if ((request.getName().isEmpty() || pet.getName().equals(request.getName())) &&
                        (request.getGender().isEmpty() || pet.getGender().equals(request.getGender())) &&
                        (request.getAge() == 0 || pet.getAge() == request.getAge()) &&
                        (request.getBreed().isEmpty() || pet.getBreed().equals(request.getBreed()))) {
                    searchResults.add(pet);
                }
            }

            // Respond with search results
            SearchPetResponse response = SearchPetResponse.newBuilder()
                    .addAllPets(searchResults)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}