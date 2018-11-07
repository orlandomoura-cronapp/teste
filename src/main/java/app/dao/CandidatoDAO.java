package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("CandidatoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CandidatoDAO extends JpaRepository<Candidato, java.lang.Integer> {

  /**
   * Obtém a instância de Candidato utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Candidato entity WHERE entity.id = :id")
  public Candidato findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de Candidato utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Candidato entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Evento entity WHERE entity.candidato.id = :id")
  public Page<Evento> findEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ensaio entity WHERE entity.candidato.id = :id")
  public Page<ensaio> findEnsaio(@Param(value="id") java.lang.Integer id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.comum FROM Evento entity WHERE entity.candidato.id = :id AND (entity.comum.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Comum> listComumGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.comum FROM Evento entity WHERE entity.candidato.id = :id AND (:nome is null OR entity.comum.nome like concat('%',:nome,'%'))")
  public Page<Comum> listComumSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.comum FROM Evento entity WHERE entity.candidato.id = :id")
  public Page<Comum> listComum(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Evento entity WHERE entity.candidato.id = :instanceId AND entity.comum.id = :relationId")
  public int deleteComum(@Param(value="instanceId") java.lang.Integer instanceId, @Param(value="relationId") java.lang.Integer relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.sexo like concat('%',coalesce(:search,''),'%')")
  public Page<Candidato> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:dtNascimento is null OR entity.dtNascimento = :dtNascimento) AND (:sexo is null OR entity.sexo like concat('%',:sexo,'%'))")
  public Page<Candidato> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="dtNascimento") java.util.Date dtNascimento, @Param(value="sexo") java.lang.String sexo, Pageable pageable);
  
  /**
   * Foreign Key instrumento
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.instrumento.id = :id")
  public Page<Candidato> findCandidatosByInstrumento(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key comum
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.comum.id = :id")
  public Page<Candidato> findCandidatosByComum(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key situacao
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.situacao.id = :id")
  public Page<Candidato> findCandidatosBySituacao(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
