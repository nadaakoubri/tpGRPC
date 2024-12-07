package ma.projet.grpc.controllers;

import io.grpc.stub.StreamObserver;
import ma.projet.grpc.services.CompteService;
import ma.projet.grpc.stubs.*;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class CompteServiceImpl extends CompteServiceGrpc.CompteServiceImplBase {

    private final CompteService compteService;

    public CompteServiceImpl(CompteService compteService) {
        this.compteService = compteService;
    }

    @Override
    public void allComptes(GetAllComptesRequest request, StreamObserver<GetAllComptesResponse> responseObserver) {
        var comptes = compteService.findAllComptes().stream()
                .map(compte -> Compte.newBuilder()
                        .setId(compte.getId())
                        .setSolde(compte.getSolde())
                        .setDateCreation(compte.getDateCreation())
                        .setType(TypeCompte.valueOf(compte.getType().toUpperCase())) // Ensure type matches enum values
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(
                GetAllComptesResponse.newBuilder()
                        .addAllComptes(comptes)
                        .build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void saveCompte(SaveCompteRequest request, StreamObserver<SaveCompteResponse> responseObserver) {
        var compteReq = request.getCompte();

        // Map gRPC Compte to Entity Compte
        var compte = new ma.projet.grpc.entities.Compte();
        compte.setSolde(compteReq.getSolde());
        compte.setDateCreation(compteReq.getDateCreation());
        compte.setType(compteReq.getType().name()); // Ensure conversion to string

        // Save the entity
        var savedCompte = compteService.saveCompte(compte);

        // Map saved entity back to gRPC Compte
        var grpcCompte = Compte.newBuilder()
                .setId(savedCompte.getId())
                .setSolde(savedCompte.getSolde())
                .setDateCreation(savedCompte.getDateCreation())
                .setType(TypeCompte.valueOf(savedCompte.getType().toUpperCase())) // Ensure type matches enum values
                .build();

        responseObserver.onNext(
                SaveCompteResponse.newBuilder()
                        .setCompte(grpcCompte)
                        .build()
        );
        responseObserver.onCompleted();
    }



    @Override
    public void deleteCompte(DeleteCompteRequest request, StreamObserver<DeleteCompteResponse> responseObserver) {
        compteService.deleteCompteById(request.getId());
        responseObserver.onNext(DeleteCompteResponse.newBuilder().setSuccess(true).build());
        responseObserver.onCompleted();
    }

    // New method to get comptes by type
    @Override
    public void getComptesByType(GetComptesByTypeRequest request, StreamObserver<GetComptesByTypeResponse> responseObserver) {
        List<ma.projet.grpc.entities.Compte> comptes = compteService.findComptesByType(request.getType().name());

        var grpcComptes = comptes.stream()
                .map(compte -> Compte.newBuilder()
                        .setId(compte.getId())
                        .setSolde(compte.getSolde())
                        .setDateCreation(compte.getDateCreation())
                        .setType(TypeCompte.valueOf(compte.getType().toUpperCase()))
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(GetComptesByTypeResponse.newBuilder().addAllComptes(grpcComptes).build());
        responseObserver.onCompleted();
    }
}
