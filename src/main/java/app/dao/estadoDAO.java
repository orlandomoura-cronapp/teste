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
@Repository("estadoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface estadoDAO extends JpaRepository<estado, java.lang.Integer> {

  /**
   * Obtém a instância de estado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM estado entity WHERE entity.id = :id")
  public estado findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de estado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM estado entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM cidade entity WHERE entity.estado.id = :id AND (entity.cidade like concat('%',coalesce(:search,''),'%'))")
  public Page<cidade> findCidadeGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM cidade entity WHERE entity.estado.id = :id AND (:cidade is null OR entity.cidade like concat('%',:cidade,'%'))")
  public Page<cidade> findCidadeSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="cidade") java.lang.String cidade, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM cidade entity WHERE entity.estado.id = :id")
  public Page<cidade> findCidade(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM estado entity WHERE entity.estado like concat('%',coalesce(:search,''),'%')")
  public Page<estado> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM estado entity WHERE (:estado is null OR entity.estado like concat('%',:estado,'%'))")
  public Page<estado> specificSearch(@Param(value="estado") java.lang.String estado, Pageable pageable);
  
}
