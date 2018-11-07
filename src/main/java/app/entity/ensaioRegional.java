package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ENSAIOREGIONAL
 * @generated
 */
@Entity
@Table(name = "\"ENSAIOREGIONAL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ensaioRegional")
public class ensaioRegional implements Serializable {

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
  
  private java.lang.Integer data;

  /**
  * @generated
  */
  @Column(name = "fundoMusical", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer fundoMusical;

  /**
  * @generated
  */
  @Column(name = "palavra", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer palavra;

  /**
  * @generated
  */
  @Column(name = "atendente", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer atendente;

  /**
  * @generated
  */
  @Column(name = "regenteUm", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer regenteUm;

  /**
  * @generated
  */
  @Column(name = "regenteDois", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer regenteDois;

  /**
  * @generated
  */
  @Column(name = "violino", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer violinos;

  /**
  * @generated
  */
  @Column(name = "viola", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer violas;

  /**
  * @generated
  */
  @Column(name = "violoncelos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer violoncelos;

  /**
  * @generated
  */
  @Column(name = "acordeons", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer acordeons;

  /**
  * @generated
  */
  @Column(name = "flautas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer flautas;

  /**
  * @generated
  */
  @Column(name = "clarinetas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer clarinetas;

  /**
  * @generated
  */
  @Column(name = "clarones", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer clarones;

  /**
  * @generated
  */
  @Column(name = "oboes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer oboes;

  /**
  * @generated
  */
  @Column(name = "fagotes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer fagotes;

  /**
  * @generated
  */
  @Column(name = "saxSoprano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxSoprano;

  /**
  * @generated
  */
  @Column(name = "saxSopranoCurvo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxSopranoCurvo;

  /**
  * @generated
  */
  @Column(name = "saxAlto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxAlto;

  /**
  * @generated
  */
  @Column(name = "saxTenor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxTenor;

  /**
  * @generated
  */
  @Column(name = "saxBaritono", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxBaritono;

  /**
  * @generated
  */
  @Column(name = "saxBaixo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxBaixo;

  /**
  * @generated
  */
  @Column(name = "saxHorns", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer saxHorns;

  /**
  * @generated
  */
  @Column(name = "trompetes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer trompetes;

  /**
  * @generated
  */
  @Column(name = "cornets", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cornets;

  /**
  * @generated
  */
  @Column(name = "pockets", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer pockets;

  /**
  * @generated
  */
  @Column(name = "flugelhorn", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer flugelhorn;

  /**
  * @generated
  */
  @Column(name = "trompas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer trompas;

  /**
  * @generated
  */
  @Column(name = "trombones", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer trombones;

  /**
  * @generated
  */
  @Column(name = "trombonitos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer trombonitos;

  /**
  * @generated
  */
  @Column(name = "baritonoVertical", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer baritonoVertical;

  /**
  * @generated
  */
  @Column(name = "bombardinos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer bombardinos;

  /**
  * @generated
  */
  @Column(name = "bombardao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer bombardao;

  /**
  * @generated
  */
  @Column(name = "tubaSinfonica", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer tubaSinfonica;

  /**
  * @generated
  */
  @Column(name = "anciaes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer anciaos;

  /**
  * @generated
  */
  @Column(name = "diaconos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer diaconos;

  /**
  * @generated
  */
  @Column(name = "coop", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer coop;

  /**
  * @generated
  */
  @Column(name = "coopJovens", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer coopJovens;

  /**
  * @generated
  */
  @Column(name = "encLocais", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String encLocais;

  /**
  * @generated
  */
  @Column(name = "encRegionais", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer encRegionais;

  /**
  * @generated
  */
  @Column(name = "examinadoras", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer examinadoras;

  /**
  * @generated
  */
  @Column(name = "instrutores", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer instrutores;

  /**
  * @generated
  */
  @Column(name = "instrutoras", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer instrutoras;

  /**
  * @generated
  */
  @Column(name = "organistas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer organistas;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_comum", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Comum comum;

  /**
  * @generated
  */
  @Column(name = "hinosEnsaiados", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  
  private java.lang.String hinosEnsaiados;

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
  public ensaioRegional(){
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
  public ensaioRegional setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.lang.Integer getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public ensaioRegional setData(java.lang.Integer data){
    this.data = data;
    return this;
  }

  /**
   * Obtém fundoMusical
   * return fundoMusical
   * @generated
   */
  
  public java.lang.Integer getFundoMusical(){
    return this.fundoMusical;
  }

  /**
   * Define fundoMusical
   * @param fundoMusical fundoMusical
   * @generated
   */
  public ensaioRegional setFundoMusical(java.lang.Integer fundoMusical){
    this.fundoMusical = fundoMusical;
    return this;
  }

  /**
   * Obtém palavra
   * return palavra
   * @generated
   */
  
  public java.lang.Integer getPalavra(){
    return this.palavra;
  }

  /**
   * Define palavra
   * @param palavra palavra
   * @generated
   */
  public ensaioRegional setPalavra(java.lang.Integer palavra){
    this.palavra = palavra;
    return this;
  }

  /**
   * Obtém atendente
   * return atendente
   * @generated
   */
  
  public java.lang.Integer getAtendente(){
    return this.atendente;
  }

  /**
   * Define atendente
   * @param atendente atendente
   * @generated
   */
  public ensaioRegional setAtendente(java.lang.Integer atendente){
    this.atendente = atendente;
    return this;
  }

  /**
   * Obtém regenteUm
   * return regenteUm
   * @generated
   */
  
  public java.lang.Integer getRegenteUm(){
    return this.regenteUm;
  }

  /**
   * Define regenteUm
   * @param regenteUm regenteUm
   * @generated
   */
  public ensaioRegional setRegenteUm(java.lang.Integer regenteUm){
    this.regenteUm = regenteUm;
    return this;
  }

  /**
   * Obtém regenteDois
   * return regenteDois
   * @generated
   */
  
  public java.lang.Integer getRegenteDois(){
    return this.regenteDois;
  }

  /**
   * Define regenteDois
   * @param regenteDois regenteDois
   * @generated
   */
  public ensaioRegional setRegenteDois(java.lang.Integer regenteDois){
    this.regenteDois = regenteDois;
    return this;
  }

  /**
   * Obtém violinos
   * return violinos
   * @generated
   */
  
  public java.lang.Integer getViolinos(){
    return this.violinos;
  }

  /**
   * Define violinos
   * @param violinos violinos
   * @generated
   */
  public ensaioRegional setViolinos(java.lang.Integer violinos){
    this.violinos = violinos;
    return this;
  }

  /**
   * Obtém violas
   * return violas
   * @generated
   */
  
  public java.lang.Integer getViolas(){
    return this.violas;
  }

  /**
   * Define violas
   * @param violas violas
   * @generated
   */
  public ensaioRegional setViolas(java.lang.Integer violas){
    this.violas = violas;
    return this;
  }

  /**
   * Obtém violoncelos
   * return violoncelos
   * @generated
   */
  
  public java.lang.Integer getVioloncelos(){
    return this.violoncelos;
  }

  /**
   * Define violoncelos
   * @param violoncelos violoncelos
   * @generated
   */
  public ensaioRegional setVioloncelos(java.lang.Integer violoncelos){
    this.violoncelos = violoncelos;
    return this;
  }

  /**
   * Obtém acordeons
   * return acordeons
   * @generated
   */
  
  public java.lang.Integer getAcordeons(){
    return this.acordeons;
  }

  /**
   * Define acordeons
   * @param acordeons acordeons
   * @generated
   */
  public ensaioRegional setAcordeons(java.lang.Integer acordeons){
    this.acordeons = acordeons;
    return this;
  }

  /**
   * Obtém flautas
   * return flautas
   * @generated
   */
  
  public java.lang.Integer getFlautas(){
    return this.flautas;
  }

  /**
   * Define flautas
   * @param flautas flautas
   * @generated
   */
  public ensaioRegional setFlautas(java.lang.Integer flautas){
    this.flautas = flautas;
    return this;
  }

  /**
   * Obtém clarinetas
   * return clarinetas
   * @generated
   */
  
  public java.lang.Integer getClarinetas(){
    return this.clarinetas;
  }

  /**
   * Define clarinetas
   * @param clarinetas clarinetas
   * @generated
   */
  public ensaioRegional setClarinetas(java.lang.Integer clarinetas){
    this.clarinetas = clarinetas;
    return this;
  }

  /**
   * Obtém clarones
   * return clarones
   * @generated
   */
  
  public java.lang.Integer getClarones(){
    return this.clarones;
  }

  /**
   * Define clarones
   * @param clarones clarones
   * @generated
   */
  public ensaioRegional setClarones(java.lang.Integer clarones){
    this.clarones = clarones;
    return this;
  }

  /**
   * Obtém oboes
   * return oboes
   * @generated
   */
  
  public java.lang.Integer getOboes(){
    return this.oboes;
  }

  /**
   * Define oboes
   * @param oboes oboes
   * @generated
   */
  public ensaioRegional setOboes(java.lang.Integer oboes){
    this.oboes = oboes;
    return this;
  }

  /**
   * Obtém fagotes
   * return fagotes
   * @generated
   */
  
  public java.lang.Integer getFagotes(){
    return this.fagotes;
  }

  /**
   * Define fagotes
   * @param fagotes fagotes
   * @generated
   */
  public ensaioRegional setFagotes(java.lang.Integer fagotes){
    this.fagotes = fagotes;
    return this;
  }

  /**
   * Obtém saxSoprano
   * return saxSoprano
   * @generated
   */
  
  public java.lang.Integer getSaxSoprano(){
    return this.saxSoprano;
  }

  /**
   * Define saxSoprano
   * @param saxSoprano saxSoprano
   * @generated
   */
  public ensaioRegional setSaxSoprano(java.lang.Integer saxSoprano){
    this.saxSoprano = saxSoprano;
    return this;
  }

  /**
   * Obtém saxSopranoCurvo
   * return saxSopranoCurvo
   * @generated
   */
  
  public java.lang.Integer getSaxSopranoCurvo(){
    return this.saxSopranoCurvo;
  }

  /**
   * Define saxSopranoCurvo
   * @param saxSopranoCurvo saxSopranoCurvo
   * @generated
   */
  public ensaioRegional setSaxSopranoCurvo(java.lang.Integer saxSopranoCurvo){
    this.saxSopranoCurvo = saxSopranoCurvo;
    return this;
  }

  /**
   * Obtém saxAlto
   * return saxAlto
   * @generated
   */
  
  public java.lang.Integer getSaxAlto(){
    return this.saxAlto;
  }

  /**
   * Define saxAlto
   * @param saxAlto saxAlto
   * @generated
   */
  public ensaioRegional setSaxAlto(java.lang.Integer saxAlto){
    this.saxAlto = saxAlto;
    return this;
  }

  /**
   * Obtém saxTenor
   * return saxTenor
   * @generated
   */
  
  public java.lang.Integer getSaxTenor(){
    return this.saxTenor;
  }

  /**
   * Define saxTenor
   * @param saxTenor saxTenor
   * @generated
   */
  public ensaioRegional setSaxTenor(java.lang.Integer saxTenor){
    this.saxTenor = saxTenor;
    return this;
  }

  /**
   * Obtém saxBaritono
   * return saxBaritono
   * @generated
   */
  
  public java.lang.Integer getSaxBaritono(){
    return this.saxBaritono;
  }

  /**
   * Define saxBaritono
   * @param saxBaritono saxBaritono
   * @generated
   */
  public ensaioRegional setSaxBaritono(java.lang.Integer saxBaritono){
    this.saxBaritono = saxBaritono;
    return this;
  }

  /**
   * Obtém saxBaixo
   * return saxBaixo
   * @generated
   */
  
  public java.lang.Integer getSaxBaixo(){
    return this.saxBaixo;
  }

  /**
   * Define saxBaixo
   * @param saxBaixo saxBaixo
   * @generated
   */
  public ensaioRegional setSaxBaixo(java.lang.Integer saxBaixo){
    this.saxBaixo = saxBaixo;
    return this;
  }

  /**
   * Obtém saxHorns
   * return saxHorns
   * @generated
   */
  
  public java.lang.Integer getSaxHorns(){
    return this.saxHorns;
  }

  /**
   * Define saxHorns
   * @param saxHorns saxHorns
   * @generated
   */
  public ensaioRegional setSaxHorns(java.lang.Integer saxHorns){
    this.saxHorns = saxHorns;
    return this;
  }

  /**
   * Obtém trompetes
   * return trompetes
   * @generated
   */
  
  public java.lang.Integer getTrompetes(){
    return this.trompetes;
  }

  /**
   * Define trompetes
   * @param trompetes trompetes
   * @generated
   */
  public ensaioRegional setTrompetes(java.lang.Integer trompetes){
    this.trompetes = trompetes;
    return this;
  }

  /**
   * Obtém cornets
   * return cornets
   * @generated
   */
  
  public java.lang.Integer getCornets(){
    return this.cornets;
  }

  /**
   * Define cornets
   * @param cornets cornets
   * @generated
   */
  public ensaioRegional setCornets(java.lang.Integer cornets){
    this.cornets = cornets;
    return this;
  }

  /**
   * Obtém pockets
   * return pockets
   * @generated
   */
  
  public java.lang.Integer getPockets(){
    return this.pockets;
  }

  /**
   * Define pockets
   * @param pockets pockets
   * @generated
   */
  public ensaioRegional setPockets(java.lang.Integer pockets){
    this.pockets = pockets;
    return this;
  }

  /**
   * Obtém flugelhorn
   * return flugelhorn
   * @generated
   */
  
  public java.lang.Integer getFlugelhorn(){
    return this.flugelhorn;
  }

  /**
   * Define flugelhorn
   * @param flugelhorn flugelhorn
   * @generated
   */
  public ensaioRegional setFlugelhorn(java.lang.Integer flugelhorn){
    this.flugelhorn = flugelhorn;
    return this;
  }

  /**
   * Obtém trompas
   * return trompas
   * @generated
   */
  
  public java.lang.Integer getTrompas(){
    return this.trompas;
  }

  /**
   * Define trompas
   * @param trompas trompas
   * @generated
   */
  public ensaioRegional setTrompas(java.lang.Integer trompas){
    this.trompas = trompas;
    return this;
  }

  /**
   * Obtém trombones
   * return trombones
   * @generated
   */
  
  public java.lang.Integer getTrombones(){
    return this.trombones;
  }

  /**
   * Define trombones
   * @param trombones trombones
   * @generated
   */
  public ensaioRegional setTrombones(java.lang.Integer trombones){
    this.trombones = trombones;
    return this;
  }

  /**
   * Obtém trombonitos
   * return trombonitos
   * @generated
   */
  
  public java.lang.Integer getTrombonitos(){
    return this.trombonitos;
  }

  /**
   * Define trombonitos
   * @param trombonitos trombonitos
   * @generated
   */
  public ensaioRegional setTrombonitos(java.lang.Integer trombonitos){
    this.trombonitos = trombonitos;
    return this;
  }

  /**
   * Obtém baritonoVertical
   * return baritonoVertical
   * @generated
   */
  
  public java.lang.Integer getBaritonoVertical(){
    return this.baritonoVertical;
  }

  /**
   * Define baritonoVertical
   * @param baritonoVertical baritonoVertical
   * @generated
   */
  public ensaioRegional setBaritonoVertical(java.lang.Integer baritonoVertical){
    this.baritonoVertical = baritonoVertical;
    return this;
  }

  /**
   * Obtém bombardinos
   * return bombardinos
   * @generated
   */
  
  public java.lang.Integer getBombardinos(){
    return this.bombardinos;
  }

  /**
   * Define bombardinos
   * @param bombardinos bombardinos
   * @generated
   */
  public ensaioRegional setBombardinos(java.lang.Integer bombardinos){
    this.bombardinos = bombardinos;
    return this;
  }

  /**
   * Obtém bombardao
   * return bombardao
   * @generated
   */
  
  public java.lang.Integer getBombardao(){
    return this.bombardao;
  }

  /**
   * Define bombardao
   * @param bombardao bombardao
   * @generated
   */
  public ensaioRegional setBombardao(java.lang.Integer bombardao){
    this.bombardao = bombardao;
    return this;
  }

  /**
   * Obtém tubaSinfonica
   * return tubaSinfonica
   * @generated
   */
  
  public java.lang.Integer getTubaSinfonica(){
    return this.tubaSinfonica;
  }

  /**
   * Define tubaSinfonica
   * @param tubaSinfonica tubaSinfonica
   * @generated
   */
  public ensaioRegional setTubaSinfonica(java.lang.Integer tubaSinfonica){
    this.tubaSinfonica = tubaSinfonica;
    return this;
  }

  /**
   * Obtém anciaos
   * return anciaos
   * @generated
   */
  
  public java.lang.Integer getAnciaos(){
    return this.anciaos;
  }

  /**
   * Define anciaos
   * @param anciaos anciaos
   * @generated
   */
  public ensaioRegional setAnciaos(java.lang.Integer anciaos){
    this.anciaos = anciaos;
    return this;
  }

  /**
   * Obtém diaconos
   * return diaconos
   * @generated
   */
  
  public java.lang.Integer getDiaconos(){
    return this.diaconos;
  }

  /**
   * Define diaconos
   * @param diaconos diaconos
   * @generated
   */
  public ensaioRegional setDiaconos(java.lang.Integer diaconos){
    this.diaconos = diaconos;
    return this;
  }

  /**
   * Obtém coop
   * return coop
   * @generated
   */
  
  public java.lang.Integer getCoop(){
    return this.coop;
  }

  /**
   * Define coop
   * @param coop coop
   * @generated
   */
  public ensaioRegional setCoop(java.lang.Integer coop){
    this.coop = coop;
    return this;
  }

  /**
   * Obtém coopJovens
   * return coopJovens
   * @generated
   */
  
  public java.lang.Integer getCoopJovens(){
    return this.coopJovens;
  }

  /**
   * Define coopJovens
   * @param coopJovens coopJovens
   * @generated
   */
  public ensaioRegional setCoopJovens(java.lang.Integer coopJovens){
    this.coopJovens = coopJovens;
    return this;
  }

  /**
   * Obtém encLocais
   * return encLocais
   * @generated
   */
  
  public java.lang.String getEncLocais(){
    return this.encLocais;
  }

  /**
   * Define encLocais
   * @param encLocais encLocais
   * @generated
   */
  public ensaioRegional setEncLocais(java.lang.String encLocais){
    this.encLocais = encLocais;
    return this;
  }

  /**
   * Obtém encRegionais
   * return encRegionais
   * @generated
   */
  
  public java.lang.Integer getEncRegionais(){
    return this.encRegionais;
  }

  /**
   * Define encRegionais
   * @param encRegionais encRegionais
   * @generated
   */
  public ensaioRegional setEncRegionais(java.lang.Integer encRegionais){
    this.encRegionais = encRegionais;
    return this;
  }

  /**
   * Obtém examinadoras
   * return examinadoras
   * @generated
   */
  
  public java.lang.Integer getExaminadoras(){
    return this.examinadoras;
  }

  /**
   * Define examinadoras
   * @param examinadoras examinadoras
   * @generated
   */
  public ensaioRegional setExaminadoras(java.lang.Integer examinadoras){
    this.examinadoras = examinadoras;
    return this;
  }

  /**
   * Obtém instrutores
   * return instrutores
   * @generated
   */
  
  public java.lang.Integer getInstrutores(){
    return this.instrutores;
  }

  /**
   * Define instrutores
   * @param instrutores instrutores
   * @generated
   */
  public ensaioRegional setInstrutores(java.lang.Integer instrutores){
    this.instrutores = instrutores;
    return this;
  }

  /**
   * Obtém instrutoras
   * return instrutoras
   * @generated
   */
  
  public java.lang.Integer getInstrutoras(){
    return this.instrutoras;
  }

  /**
   * Define instrutoras
   * @param instrutoras instrutoras
   * @generated
   */
  public ensaioRegional setInstrutoras(java.lang.Integer instrutoras){
    this.instrutoras = instrutoras;
    return this;
  }

  /**
   * Obtém organistas
   * return organistas
   * @generated
   */
  
  public java.lang.Integer getOrganistas(){
    return this.organistas;
  }

  /**
   * Define organistas
   * @param organistas organistas
   * @generated
   */
  public ensaioRegional setOrganistas(java.lang.Integer organistas){
    this.organistas = organistas;
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
  public ensaioRegional setComum(Comum comum){
    this.comum = comum;
    return this;
  }

  /**
   * Obtém hinosEnsaiados
   * return hinosEnsaiados
   * @generated
   */
  
  public java.lang.String getHinosEnsaiados(){
    return this.hinosEnsaiados;
  }

  /**
   * Define hinosEnsaiados
   * @param hinosEnsaiados hinosEnsaiados
   * @generated
   */
  public ensaioRegional setHinosEnsaiados(java.lang.String hinosEnsaiados){
    this.hinosEnsaiados = hinosEnsaiados;
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
  public ensaioRegional setHorario(java.util.Date horario){
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
    ensaioRegional object = (ensaioRegional)obj;
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
