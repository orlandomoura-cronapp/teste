package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVALIACAO
 * @generated
 */
@Entity
@Table(name = "\"AVALIACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Avaliacao")
public class Avaliacao implements Serializable {

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
  @Column(name = "metodo1", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String metodo1;

  /**
  * @generated
  */
  @Column(name = "metodo2", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String metodo2;

  /**
  * @generated
  */
  @Column(name = "metodo3", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String metodo3;

  /**
  * @generated
  */
  @Column(name = "metodo4", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String metodo4;

  /**
  * @generated
  */
  @Column(name = "metodo5", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String metodo5;

  /**
  * @generated
  */
  @Column(name = "hinario", nullable = true, unique = false, length=150, insertable=true, updatable=true)
  
  private java.lang.String hinario;

  /**
  * @generated
  */
  @Column(name = "solfejo", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String solfejo;

  /**
  * @generated
  */
  @Column(name = "conceitoTeoria", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String conceitoTeoria;

  /**
  * @generated
  */
  @Column(name = "conceitoHino", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String conceitoHino;

  /**
  * @generated
  */
  @Column(name = "conceitoMetodo", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String conceitoMetodo;

  /**
  * @generated
  */
  @Column(name = "conceitoFinal", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String conceitoFinal;

  /**
  * @generated
  */
  @Column(name = "obs", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  
  private java.lang.String obs;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tipoAvaliacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private TipoAvaliacao tipoAvaliacao;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_avaliadores", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Avaliadores avaliadores;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_evento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Evento evento;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_status", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private status status;

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
  public Avaliacao(){
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
  public Avaliacao setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém metodo1
   * return metodo1
   * @generated
   */
  
  public java.lang.String getMetodo1(){
    return this.metodo1;
  }

  /**
   * Define metodo1
   * @param metodo1 metodo1
   * @generated
   */
  public Avaliacao setMetodo1(java.lang.String metodo1){
    this.metodo1 = metodo1;
    return this;
  }

  /**
   * Obtém metodo2
   * return metodo2
   * @generated
   */
  
  public java.lang.String getMetodo2(){
    return this.metodo2;
  }

  /**
   * Define metodo2
   * @param metodo2 metodo2
   * @generated
   */
  public Avaliacao setMetodo2(java.lang.String metodo2){
    this.metodo2 = metodo2;
    return this;
  }

  /**
   * Obtém metodo3
   * return metodo3
   * @generated
   */
  
  public java.lang.String getMetodo3(){
    return this.metodo3;
  }

  /**
   * Define metodo3
   * @param metodo3 metodo3
   * @generated
   */
  public Avaliacao setMetodo3(java.lang.String metodo3){
    this.metodo3 = metodo3;
    return this;
  }

  /**
   * Obtém metodo4
   * return metodo4
   * @generated
   */
  
  public java.lang.String getMetodo4(){
    return this.metodo4;
  }

  /**
   * Define metodo4
   * @param metodo4 metodo4
   * @generated
   */
  public Avaliacao setMetodo4(java.lang.String metodo4){
    this.metodo4 = metodo4;
    return this;
  }

  /**
   * Obtém metodo5
   * return metodo5
   * @generated
   */
  
  public java.lang.String getMetodo5(){
    return this.metodo5;
  }

  /**
   * Define metodo5
   * @param metodo5 metodo5
   * @generated
   */
  public Avaliacao setMetodo5(java.lang.String metodo5){
    this.metodo5 = metodo5;
    return this;
  }

  /**
   * Obtém hinario
   * return hinario
   * @generated
   */
  
  public java.lang.String getHinario(){
    return this.hinario;
  }

  /**
   * Define hinario
   * @param hinario hinario
   * @generated
   */
  public Avaliacao setHinario(java.lang.String hinario){
    this.hinario = hinario;
    return this;
  }

  /**
   * Obtém solfejo
   * return solfejo
   * @generated
   */
  
  public java.lang.String getSolfejo(){
    return this.solfejo;
  }

  /**
   * Define solfejo
   * @param solfejo solfejo
   * @generated
   */
  public Avaliacao setSolfejo(java.lang.String solfejo){
    this.solfejo = solfejo;
    return this;
  }

  /**
   * Obtém conceitoTeoria
   * return conceitoTeoria
   * @generated
   */
  
  public java.lang.String getConceitoTeoria(){
    return this.conceitoTeoria;
  }

  /**
   * Define conceitoTeoria
   * @param conceitoTeoria conceitoTeoria
   * @generated
   */
  public Avaliacao setConceitoTeoria(java.lang.String conceitoTeoria){
    this.conceitoTeoria = conceitoTeoria;
    return this;
  }

  /**
   * Obtém conceitoHino
   * return conceitoHino
   * @generated
   */
  
  public java.lang.String getConceitoHino(){
    return this.conceitoHino;
  }

  /**
   * Define conceitoHino
   * @param conceitoHino conceitoHino
   * @generated
   */
  public Avaliacao setConceitoHino(java.lang.String conceitoHino){
    this.conceitoHino = conceitoHino;
    return this;
  }

  /**
   * Obtém conceitoMetodo
   * return conceitoMetodo
   * @generated
   */
  
  public java.lang.String getConceitoMetodo(){
    return this.conceitoMetodo;
  }

  /**
   * Define conceitoMetodo
   * @param conceitoMetodo conceitoMetodo
   * @generated
   */
  public Avaliacao setConceitoMetodo(java.lang.String conceitoMetodo){
    this.conceitoMetodo = conceitoMetodo;
    return this;
  }

  /**
   * Obtém conceitoFinal
   * return conceitoFinal
   * @generated
   */
  
  public java.lang.String getConceitoFinal(){
    return this.conceitoFinal;
  }

  /**
   * Define conceitoFinal
   * @param conceitoFinal conceitoFinal
   * @generated
   */
  public Avaliacao setConceitoFinal(java.lang.String conceitoFinal){
    this.conceitoFinal = conceitoFinal;
    return this;
  }

  /**
   * Obtém obs
   * return obs
   * @generated
   */
  
  public java.lang.String getObs(){
    return this.obs;
  }

  /**
   * Define obs
   * @param obs obs
   * @generated
   */
  public Avaliacao setObs(java.lang.String obs){
    this.obs = obs;
    return this;
  }

  /**
   * Obtém tipoAvaliacao
   * return tipoAvaliacao
   * @generated
   */
  
  public TipoAvaliacao getTipoAvaliacao(){
    return this.tipoAvaliacao;
  }

  /**
   * Define tipoAvaliacao
   * @param tipoAvaliacao tipoAvaliacao
   * @generated
   */
  public Avaliacao setTipoAvaliacao(TipoAvaliacao tipoAvaliacao){
    this.tipoAvaliacao = tipoAvaliacao;
    return this;
  }

  /**
   * Obtém avaliadores
   * return avaliadores
   * @generated
   */
  
  public Avaliadores getAvaliadores(){
    return this.avaliadores;
  }

  /**
   * Define avaliadores
   * @param avaliadores avaliadores
   * @generated
   */
  public Avaliacao setAvaliadores(Avaliadores avaliadores){
    this.avaliadores = avaliadores;
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
  public Avaliacao setEvento(Evento evento){
    this.evento = evento;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public status getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public Avaliacao setStatus(status status){
    this.status = status;
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
  public Avaliacao setHorario(java.util.Date horario){
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
    Avaliacao object = (Avaliacao)obj;
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
