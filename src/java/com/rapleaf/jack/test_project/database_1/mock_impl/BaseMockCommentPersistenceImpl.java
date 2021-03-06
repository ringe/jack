
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20110324000133 */
package com.rapleaf.jack.test_project.database_1.mock_impl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractMockDatabaseModel;
import com.rapleaf.jack.ModelWithId;

import com.rapleaf.jack.test_project.database_1.models.Comment;
import com.rapleaf.jack.test_project.database_1.iface.ICommentPersistence;

import com.rapleaf.jack.test_project.IDatabases;

public class BaseMockCommentPersistenceImpl extends AbstractMockDatabaseModel<Comment> implements ICommentPersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockCommentPersistenceImpl(IDatabases databases) {
    super();
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    String content = (String) fieldsMap.get(Comment._Fields.content);
    int commenter_id = (Integer) fieldsMap.get(Comment._Fields.commenter_id);
    long commented_on_id = (Long) fieldsMap.get(Comment._Fields.commented_on_id);
    Long created_at_tmp = (Long) fieldsMap.get(Comment._Fields.created_at);
    long created_at = created_at_tmp == null ? 28800000 : created_at_tmp;
    return create(content, commenter_id, commented_on_id, created_at);
  }


  public Comment create(final String content, final int commenter_id, final long commented_on_id, final long created_at) throws IOException {
    long __id = curId.getAndIncrement();
    Comment newInst = new Comment(__id, content, commenter_id, commented_on_id, created_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }



  public Comment create(final int commenter_id, final long commented_on_id, final long created_at) throws IOException {
    long __id = curId.getAndIncrement();
    Comment newInst = new Comment(__id, null, commenter_id, commented_on_id, created_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Comment> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }

  public Set<Comment> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(ids, fieldsMap);
  }

  public Set<Comment> findByContent(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Comment._Fields.content, value);}});
  }

  public Set<Comment> findByCommenterId(final int value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Comment._Fields.commenter_id, value);}});
  }

  public Set<Comment> findByCommentedOnId(final long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Comment._Fields.commented_on_id, value);}});
  }

  public Set<Comment> findByCreatedAt(final long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Comment._Fields.created_at, value);}});
  }
}
