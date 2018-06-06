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
@Repository("MinisterioPalavraDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface MinisterioPalavraDAO extends JpaRepository<MinisterioPalavra, java.lang.String> {

  /**
   * Obtém a instância de MinisterioPalavra utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.id = :id")
  public MinisterioPalavra findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de MinisterioPalavra utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM MinisterioPalavra entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<MinisterioPalavra> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<MinisterioPalavra> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key tipoMinisterio
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.tipoMinisterio.id = :id")
  public Page<MinisterioPalavra> findMinisterioPalavrasByTipoMinisterio(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key evento
   * @generated
   */
  @Query("SELECT entity FROM MinisterioPalavra entity WHERE entity.evento.id = :id")
  public Page<MinisterioPalavra> findMinisterioPalavrasByEvento(@Param(value="id") java.lang.String id, Pageable pageable);

}
