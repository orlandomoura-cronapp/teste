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
@Repository("InstrumentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface InstrumentoDAO extends JpaRepository<Instrumento, java.lang.Integer> {

  /**
   * Obtém a instância de Instrumento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Instrumento entity WHERE entity.id = :id")
  public Instrumento findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de Instrumento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Instrumento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.instrumento.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%') OR entity.sexo like concat('%',coalesce(:search,''),'%'))")
  public Page<Candidato> findCandidatoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Integer id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.instrumento.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:dtNascimento is null OR entity.dtNascimento = :dtNascimento) AND (:sexo is null OR entity.sexo like concat('%',:sexo,'%'))")
  public Page<Candidato> findCandidatoSpecificSearch(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome, @Param(value="dtNascimento") java.util.Date dtNascimento, @Param(value="sexo") java.lang.String sexo, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Candidato entity WHERE entity.instrumento.id = :id")
  public Page<Candidato> findCandidato(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Instrumento entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Instrumento> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Instrumento entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Instrumento> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key categoriaInstrumento
   * @generated
   */
  @Query("SELECT entity FROM Instrumento entity WHERE entity.categoriaInstrumento.id = :id")
  public Page<Instrumento> findInstrumentosByCategoriaInstrumento(@Param(value="id") java.lang.String id, Pageable pageable);

}
