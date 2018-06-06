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
@Repository("AvaliacaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AvaliacaoDAO extends JpaRepository<Avaliacao, java.lang.String> {

  /**
   * Obtém a instância de Avaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.id = :id")
  public Avaliacao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Avaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Avaliacao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key tipoAvaliacao
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.tipoAvaliacao.id = :id")
  public Page<Avaliacao> findAvaliacaosByTipoAvaliacao(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key avaliadores
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.avaliadores.id = :id")
  public Page<Avaliacao> findAvaliacaosByAvaliadores(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key evento
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.evento.id = :id")
  public Page<Avaliacao> findAvaliacaosByEvento(@Param(value="id") java.lang.String id, Pageable pageable);

}
