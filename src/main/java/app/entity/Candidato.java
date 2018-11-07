package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CANDIDATO
 * @generated
 */
@Entity
@Table(name = "\"CANDIDATO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"nome" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Candidato")
public class Candidato implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dtNascimento;

  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String sexo;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_instrumento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Instrumento instrumento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_comum", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Comum comum;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_situacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Situacao situacao;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_avaliacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Avaliacao avaliacao;

  /**
   * Construtor
   * @generated
   */
  public Candidato(){
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
  public Candidato setId(java.lang.Integer id){
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
  public Candidato setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém dtNascimento
   * return dtNascimento
   * @generated
   */
  
  public java.util.Date getDtNascimento(){
    return this.dtNascimento;
  }

  /**
   * Define dtNascimento
   * @param dtNascimento dtNascimento
   * @generated
   */
  public Candidato setDtNascimento(java.util.Date dtNascimento){
    this.dtNascimento = dtNascimento;
    return this;
  }

  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  
  public java.lang.String getSexo(){
    return this.sexo;
  }

  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public Candidato setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }

  /**
   * Obtém instrumento
   * return instrumento
   * @generated
   */
  
  public Instrumento getInstrumento(){
    return this.instrumento;
  }

  /**
   * Define instrumento
   * @param instrumento instrumento
   * @generated
   */
  public Candidato setInstrumento(Instrumento instrumento){
    this.instrumento = instrumento;
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
  public Candidato setComum(Comum comum){
    this.comum = comum;
    return this;
  }

  /**
   * Obtém situacao
   * return situacao
   * @generated
   */
  
  public Situacao getSituacao(){
    return this.situacao;
  }

  /**
   * Define situacao
   * @param situacao situacao
   * @generated
   */
  public Candidato setSituacao(Situacao situacao){
    this.situacao = situacao;
    return this;
  }

  /**
   * Obtém avaliacao
   * return avaliacao
   * @generated
   */
  
  public Avaliacao getAvaliacao(){
    return this.avaliacao;
  }

  /**
   * Define avaliacao
   * @param avaliacao avaliacao
   * @generated
   */
  public Candidato setAvaliacao(Avaliacao avaliacao){
    this.avaliacao = avaliacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Candidato object = (Candidato)obj;
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
