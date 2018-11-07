package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BAIRRO
 * @generated
 */
@Entity
@Table(name = "\"BAIRRO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"bairro" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.bairro")
public class bairro implements Serializable {

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
  @Column(name = "bairro", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private cidade cidade;

  /**
   * Construtor
   * @generated
   */
  public bairro(){
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
  public bairro setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public bairro setBairro(java.lang.String bairro){
    this.bairro = bairro;
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
  public bairro setCidade(cidade cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    bairro object = (bairro)obj;
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
