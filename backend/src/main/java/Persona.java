portfolio.buttices.Entity;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.GeneratedValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     /* Esto de acà arriba lo estoy compiando de MGB computaciòn pero no sé bien cómo hacerlo funcionar 
    Este Video >> https://youtu.be/IQ4opBw22o4?list=PLly5egcQSlfmDzqF4Of944eD2VPXxua42&t=494  */
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud, entre 1 y 50 caracteres")
    private String nombre;
   
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud, entre 1 y 50 caracteres")
    private String apellido;
   
   
    @Size(min = 1, max = 50, message = "No cumple con la longitud, entre 1 y 50 caracteres")
    private String img;
}

