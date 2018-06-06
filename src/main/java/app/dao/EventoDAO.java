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
@Repository("EventoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EventoDAO extends JpaRepository<Evento, java.lang.String> {

  /**
   * Obtém a instância de Evento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Evento entity WHERE entity.id = :id")
  public Evento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Evento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Evento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.evento.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Avaliadores> findAvaliadoresGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.evento.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Avaliadores> findAvaliadoresSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.evento.id = :id")
  public Page<Avaliadores> findAvaliadores(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.evento.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<MinisterioPalavra> findMinisterioPalavraGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.evento.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<MinisterioPalavra> findMinisterioPalavraSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.evento.id = :id")
  public Page<MinisterioPalavra> findMinisterioPalavra(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.evento.id = :id")
  public Page<Avaliacao> findAvaliacao(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.tipoMinisterio FROM Avaliadores entity WHERE entity.evento.id = :id AND (entity.tipoMinisterio.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<TipoMinisterio> listTipoMinisterioGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.tipoMinisterio FROM Avaliadores entity WHERE entity.evento.id = :id AND (:nome is null OR entity.tipoMinisterio.nome like concat('%',:nome,'%'))")
  public Page<TipoMinisterio> listTipoMinisterioSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tipoMinisterio FROM Avaliadores entity WHERE entity.evento.id = :id")
  public Page<TipoMinisterio> listTipoMinisterio(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Avaliadores entity WHERE entity.evento.id = :instanceId AND entity.tipoMinisterio.id = :relationId")
  public int deleteTipoMinisterio(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.tipoMinisterio FROM MinisterioPalavra entity WHERE entity.evento.id = :id AND (entity.tipoMinisterio.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<TipoMinisterio> listTipoMinisterio_2GeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.tipoMinisterio FROM MinisterioPalavra entity WHERE entity.evento.id = :id AND (:nome is null OR entity.tipoMinisterio.nome like concat('%',:nome,'%'))")
  public Page<TipoMinisterio> listTipoMinisterio_2SpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tipoMinisterio FROM MinisterioPalavra entity WHERE entity.evento.id = :id")
  public Page<TipoMinisterio> listTipoMinisterio_2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM MinisterioPalavra entity WHERE entity.evento.id = :instanceId AND entity.tipoMinisterio.id = :relationId")
  public int deleteTipoMinisterio_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
