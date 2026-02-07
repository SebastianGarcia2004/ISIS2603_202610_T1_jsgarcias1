package co.edu.uniandes.dse.TallerPersistencia.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class DirectorEntity extends BaseEntity {
    
   
    private String nombre;
    private String biografia;
    @ManyToOne
    PeliculaEntity pelicula; 

}
