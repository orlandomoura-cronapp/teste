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
@Repository("AvaliadoresDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AvaliadoresDAO extends JpaRepository<Avaliadores, java.lang.Integer> {

  /**
   * Obtém a instância de Avaliadores utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.id = :id")
  public Avaliadores findOne(@Param(value="id") java.lang.Integer id);

  /**
   * Remove a instância de Avaliadores utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Avaliadores entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Integer id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.avaliadores.id = :id")
  public Page<Avaliacao> findAvaliacao(@Param(value="id") java.lang.Integer id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Avaliadores> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Avaliadores> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key tipoMinisterio
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.tipoMinisterio.id = :id")
  public Page<Avaliadores> findAvaliadoressByTipoMinisterio(@Param(value="id") java.lang.Integer id, Pageable pageable);

  /**
   * Foreign Key evento
   * @generated
   */
  @Query("SELECT entity FROM Avaliadores entity WHERE entity.evento.id = :id")
  public Page<Avaliadores> findAvaliadoressByEvento(@Param(value="id") java.lang.Integer id, Pageable pageable);

}
