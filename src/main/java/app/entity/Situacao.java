package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SITUACAO
 * @generated
 */
@Entity
@Table(name = "\"SITUACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Situacao")
public class Situacao implements Serializable {

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
  @Column(name = "tipoSituacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipoSituacao;

  /**
   * Construtor
   * @generated
   */
  public Situacao(){
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
  public Situacao setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém tipoSituacao
   * return tipoSituacao
   * @generated
   */
  
  public java.lang.String getTipoSituacao(){
    return this.tipoSituacao;
  }

  /**
   * Define tipoSituacao
   * @param tipoSituacao tipoSituacao
   * @generated
   */
  public Situacao setTipoSituacao(java.lang.String tipoSituacao){
    this.tipoSituacao = tipoSituacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Situacao object = (Situacao)obj;
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
