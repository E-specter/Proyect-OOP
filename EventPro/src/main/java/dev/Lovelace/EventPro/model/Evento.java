package dev.Lovelace.EventPro.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "Evento")
public class Evento {
  //llave primaria de Evento
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEvento;
  
  //llave foránea de Usuario que crea el evento
  @ManyToOne
  @JoinColumn(name = "idUsuario", referencedColumnName= "idUsuario", nullable = false)
  private Usuario creador;

  @Column(name = "nombre", nullable = false)
  private String nombre;
  
  @Enumerated(EnumType.STRING)
  @Column(name = "estado", nullable = false)
  private EstadoEvento estado;

  @Column(name = "capacidad", nullable = false)
  private int capacidad;

  @Column(name = "ubicacion", length = 255, nullable = true)
  private String ubicacion;

  @Column(name = "duracion", nullable = true)
  private BigDecimal duracion; //duración en horas

  @Column(name = "fechaInicio", nullable = false)
  private LocalDateTime fechaInicio; //Esta columna debe almacenar fecha y hora del inicio del evento como tal

  @Column(name = "fechaFin", nullable = false)
  private LocalDateTime fechaFin; //Columna de fin del evento, es el mismo que fechaInico si el evento toma varios días

  @Column(name = "detalle", length = 255, nullable = true)
  private String detalle;
  
  //Referencia a la tabla Evento_Categorias, donde se almacenan 
  @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Evento_Categorias> categorias = new HashSet<>();
  
  @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Evento_Usuarios> colaboradores = new HashSet<>();
  
  @OneToMany(mappedBy = "evento",cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Evento_Proveedores> patrocinadores = new HashSet<>();
  
  public enum EstadoEvento{
    finalizado, planificado, en_curso, cancelado
  }
  // Getters y Setters
  
}