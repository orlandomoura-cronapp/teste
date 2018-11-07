package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVALIADORES
 * @generated
 */
@Entity
@Table(name = "\"AVALIADORES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Avaliadores")
public class Avaliadores implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tipoMinisterio", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private TipoMinisterio tipoMinisterio;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_evento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Evento evento;

  /**
   * Construtor
   * @generated
   */
  public Avaliadores(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Avaliadores setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Avaliadores setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém tipoMinisterio
   * return tipoMinisterio
   * @generated
   */
  
  public TipoMinisterio getTipoMinisterio(){
    return this.tipoMinisterio;
  }

  /**
   * Define tipoMinisterio
   * @param tipoMinisterio tipoMinisterio
   * @generated
   */
  public Avaliadores setTipoMinisterio(TipoMinisterio tipoMinisterio){
    this.tipoMinisterio = tipoMinisterio;
    return this;
  }

  /**
   * Obtém evento
   * return evento
   * @generated
   */
  
  public Evento getEvento(){
    return this.evento;
  }

  /**
   * Define evento
   * @param evento evento
   * @generated
   */
  public Avaliadores setEvento(Evento evento){
    this.evento = evento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Avaliadores object = (Avaliadores)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
