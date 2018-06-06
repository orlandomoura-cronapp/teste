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
@Repository("CategoriaInstrumentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CategoriaInstrumentoDAO extends JpaRepository<CategoriaInstrumento, java.lang.String> {

  /**
   * Obtém a instância de CategoriaInstrumento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM CategoriaInstrumento entity WHERE entity.id = :id")
  public CategoriaInstrumento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de CategoriaInstrumento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM CategoriaInstrumento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Instrumento entity WHERE entity.categoriaInstrumento.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Instrumento> findInstrumentoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Instrumento entity WHERE entity.categoriaInstrumento.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Instrumento> findInstrumentoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Instrumento entity WHERE entity.categoriaInstrumento.id = :id")
  public Page<Instrumento> findInstrumento(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM CategoriaInstrumento entity WHERE entity.tipo like concat('%',coalesce(:search,''),'%')")
  public Page<CategoriaInstrumento> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM CategoriaInstrumento entity WHERE (:tipo is null OR entity.tipo like concat('%',:tipo,'%'))")
  public Page<CategoriaInstrumento> specificSearch(@Param(value="tipo") java.lang.String tipo, Pageable pageable);
  
}
