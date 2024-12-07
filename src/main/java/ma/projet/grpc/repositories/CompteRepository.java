package ma.projet.grpc.repositories;
import ma.projet.grpc.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, String> {
    void deleteById(String id);  // Delete compte by ID
    List<Compte> findByType(String type); // Find comptes by type
}
