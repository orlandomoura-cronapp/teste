package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ENSAIO
 * @generated
 */
@Entity
@Table(name = "\"ENSAIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ensaio")
public class ensaio implements Serializable {

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
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String data;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_candidato", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Candidato candidato;

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
  * @generated
  */
  @Column(name = "hinosEassuntosTratados", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  
  private java.lang.String hinosEassuntosTratados;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "horario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date horario;

  /**
   * Construtor
   * @generated
   */
  public ensaio(){
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
  public ensaio setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.lang.String getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public ensaio setData(java.lang.String data){
    this.data = data;
    return this;
  }

  /**
   * Obtém candidato
   * return candidato
   * @generated
   */
  
  public Candidato getCandidato(){
    return this.candidato;
  }

  /**
   * Define candidato
   * @param candidato candidato
   * @generated
   */
  public ensaio setCandidato(Candidato candidato){
    this.candidato = candidato;
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
  public ensaio setEstado(estado estado){
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
  public ensaio setCidade(cidade cidade){
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
  public ensaio setBairro(bairro bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém hinosEassuntosTratados
   * return hinosEassuntosTratados
   * @generated
   */
  
  public java.lang.String getHinosEassuntosTratados(){
    return this.hinosEassuntosTratados;
  }

  /**
   * Define hinosEassuntosTratados
   * @param hinosEassuntosTratados hinosEassuntosTratados
   * @generated
   */
  public ensaio setHinosEassuntosTratados(java.lang.String hinosEassuntosTratados){
    this.hinosEassuntosTratados = hinosEassuntosTratados;
    return this;
  }

  /**
   * Obtém horario
   * return horario
   * @generated
   */
  
  public java.util.Date getHorario(){
    return this.horario;
  }

  /**
   * Define horario
   * @param horario horario
   * @generated
   */
  public ensaio setHorario(java.util.Date horario){
    this.horario = horario;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ensaio object = (ensaio)obj;
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
