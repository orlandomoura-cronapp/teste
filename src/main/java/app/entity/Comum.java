package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela COMUM
 * @generated
 */
@Entity
@Table(name = "\"COMUM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Comum")
public class Comum implements Serializable {

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
  @OneToOne
  @JoinColumn(name="fk_estado", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private estado estado;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_cidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private cidade cidade;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_bairro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private bairro bairro;

  /**
   * Construtor
   * @generated
   */
  public Comum(){
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
  public Comum setId(java.lang.Integer id){
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
  public Comum setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém estado
   * return estado
   * @generated
   */
  
  public estado getEstado(){
    return this.estado;
  }

  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public Comum setEstado(estado estado){
    this.estado = estado;
    return this;
  }

  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  
  public cidade getCidade(){
    return this.cidade;
  }

  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Comum setCidade(cidade cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public bairro getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Comum setBairro(bairro bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Comum object = (Comum)obj;
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
