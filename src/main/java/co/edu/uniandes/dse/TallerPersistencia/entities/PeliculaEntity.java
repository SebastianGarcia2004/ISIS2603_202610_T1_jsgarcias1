package co.edu.uniandes.dse.TallerPersistencia.entities;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    

    
    private String titulo;
    private int anioLanzamiento;

    @OneToMany(mappedBy =  "nombre" , fetch = FetchType.LAZY)
    List<DirectorEntity> peliculasDirector = new ArrayList<>();


}
