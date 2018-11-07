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
@Repository("bairroDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface bairroDAO extends JpaRepository<bairro, java.lang.Integer> {

  /**
   * Obtém a instância de bairro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM bairro entity WHERE entity.id = :id")
  public bairro findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de bairro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM bairro entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM bairro entity WHERE entity.bairro like concat('%',coalesce(:search,''),'%')")
  public Page<bairro> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM bairro entity WHERE (:bairro is null OR entity.bairro like concat('%',:bairro,'%'))")
  public Page<bairro> specificSearch(@Param(value="bairro") java.lang.String bairro, Pageable pageable);
  
  /**
   * Foreign Key cidade
   * @generated
   */
  @Query("SELECT entity FROM bairro entity WHERE entity.cidade.id = :id")
  public Page<bairro> findbairrosByCidade(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
