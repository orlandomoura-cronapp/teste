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
@Repository("TipoMinisterioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TipoMinisterioDAO extends JpaRepository<TipoMinisterio, java.lang.Integer> {

  /**
   * Obtém a instância de TipoMinisterio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TipoMinisterio entity WHERE entity.id = :id")
  public TipoMinisterio findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de TipoMinisterio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TipoMinisterio entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.tipoMinisterio.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Avaliadores> findAvaliadoresGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.tipoMinisterio.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Avaliadores> findAvaliadoresSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.tipoMinisterio.id = :id")
  public Page<Avaliadores> findAvaliadores(@Param(value="id") java.lang.Integer id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.tipoMinisterio.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<MinisterioPalavra> findMinisterioPalavraGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.tipoMinisterio.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<MinisterioPalavra> findMinisterioPalavraSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.tipoMinisterio.id = :id")
  public Page<MinisterioPalavra> findMinisterioPalavra(@Param(value="id") java.lang.Integer id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.evento FROM Avaliadores entity WHERE entity.tipoMinisterio.id = :id")
  public Page<Evento> listEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Avaliadores entity WHERE entity.tipoMinisterio.id = :instanceId AND entity.evento.id = :relationId")
  public int deleteEvento(@Param(value="instanceId") java.lang.Integer instanceId, @Param(value="relationId") java.lang.Integer relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.evento FROM MinisterioPalavra entity WHERE entity.tipoMinisterio.id = :id")
  public Page<Evento> listEvento_2(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM MinisterioPalavra entity WHERE entity.tipoMinisterio.id = :instanceId AND entity.evento.id = :relationId")
  public int deleteEvento_2(@Param(value="instanceId") java.lang.Integer instanceId, @Param(value="relationId") java.lang.Integer relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM TipoMinisterio entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<TipoMinisterio> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM TipoMinisterio entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<TipoMinisterio> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
