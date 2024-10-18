package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PetAdoptionServer {

    private Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        final PetAdoptionServer petAdoptionServer = new PetAdoptionServer();
        petAdoptionServer.start();
        petAdoptionServer.blockUntilShutdown();
    }

    private void start() throws IOException {
        // Create a thread pool for handling requests
        ExecutorService threadPool = Executors.newFixedThreadPool(10);  // Use 10 threads, can be adjusted

        // Start the gRPC server using the thread pool
        server = ServerBuilder.forPort(50051)
                .executor(threadPool)  // Make the server multithreaded
                .addService(new PetAdoptionServiceImpl())  // Register your service here
                .build()
                .start();

        System.out.println("Server started, listening on port 50051");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down gRPC server...");
            if (server != null) {
                server.shutdown();
            }
            System.err.println("Server shut down.");
        }));
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}