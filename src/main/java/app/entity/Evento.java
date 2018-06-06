package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EVENTO
 * @generated
 */
@Entity
@Table(name = "\"EVENTO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"data" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Evento")
public class Evento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_comum", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Comum comum;

  /**
   * Construtor
   * @generated
   */
  public Evento(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Evento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Evento setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém comum
   * return comum
   * @generated
   */
  
  public Comum getComum(){
    return this.comum;
  }

  /**
   * Define comum
   * @param comum comum
   * @generated
   */
  public Evento setComum(Comum comum){
    this.comum = comum;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Evento object = (Evento)obj;
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
