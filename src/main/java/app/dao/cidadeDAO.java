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
@Repository("cidadeDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface cidadeDAO extends JpaRepository<cidade, java.lang.Integer> {

  /**
   * Obtém a instância de cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM cidade entity WHERE entity.id = :id")
  public cidade findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM cidade entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM bairro entity WHERE entity.cidade.id = :id AND (entity.bairro like concat('%',coalesce(:search,''),'%'))")
  public Page<bairro> findBairroGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM bairro entity WHERE entity.cidade.id = :id AND (:bairro is null OR entity.bairro like concat('%',:bairro,'%'))")
  public Page<bairro> findBairroSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="bairro") java.lang.String bairro, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM bairro entity WHERE entity.cidade.id = :id")
  public Page<bairro> findBairro(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM cidade entity WHERE entity.cidade like concat('%',coalesce(:search,''),'%')")
  public Page<cidade> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM cidade entity WHERE (:cidade is null OR entity.cidade like concat('%',:cidade,'%'))")
  public Page<cidade> specificSearch(@Param(value="cidade") java.lang.String cidade, Pageable pageable);
  
  /**
   * Foreign Key estado
   * @generated
   */
  @Query("SELECT entity FROM cidade entity WHERE entity.estado.id = :id")
  public Page<cidade> findcidadesByEstado(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
