package ru.gendalf13666.popularlibraries.data.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.rxjava3.EmptyResultSetException;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GithubUserRepositoryDao_Impl implements GithubUserRepositoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GithubUserRepository> __insertionAdapterOfGithubUserRepository;

  public GithubUserRepositoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGithubUserRepository = new EntityInsertionAdapter<GithubUserRepository>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_repositories` (`repository_id`,`user_id`,`name`,`full_name`,`forks`,`size`,`created`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GithubUserRepository value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getUserId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFullName());
        }
        stmt.bindLong(5, value.getCountForks());
        stmt.bindLong(6, value.getSize());
        if (value.getCreated() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreated());
        }
      }
    };
  }

  @Override
  public void insert(final List<GithubUserRepository> repositories) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGithubUserRepository.insert(repositories);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<GithubUserRepository>> getRepositories(final String userLogin) {
    final String _sql = "select r.* from user_repositories r, users u where r.user_id = u.user_id and u.login = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userLogin == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLogin);
    }
    return RxRoom.createSingle(new Callable<List<GithubUserRepository>>() {
      @Override
      public List<GithubUserRepository> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "repository_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfCountForks = CursorUtil.getColumnIndexOrThrow(_cursor, "forks");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final List<GithubUserRepository> _result = new ArrayList<GithubUserRepository>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GithubUserRepository _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final int _tmpCountForks;
            _tmpCountForks = _cursor.getInt(_cursorIndexOfCountForks);
            final int _tmpSize;
            _tmpSize = _cursor.getInt(_cursorIndexOfSize);
            final String _tmpCreated;
            if (_cursor.isNull(_cursorIndexOfCreated)) {
              _tmpCreated = null;
            } else {
              _tmpCreated = _cursor.getString(_cursorIndexOfCreated);
            }
            _item = new GithubUserRepository(_tmpId,_tmpUserId,_tmpName,_tmpFullName,_tmpCountForks,_tmpSize,_tmpCreated);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<GithubUserRepository> getRepositoryOnUserLogin(final String userLogin,
      final String repositoryName) {
    final String _sql = "select r.* from user_repositories r, users u where r.name = ? and r.user_id = u.user_id and u.login = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (repositoryName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, repositoryName);
    }
    _argIndex = 2;
    if (userLogin == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLogin);
    }
    return RxRoom.createSingle(new Callable<GithubUserRepository>() {
      @Override
      public GithubUserRepository call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "repository_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfCountForks = CursorUtil.getColumnIndexOrThrow(_cursor, "forks");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "created");
          final GithubUserRepository _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final int _tmpCountForks;
            _tmpCountForks = _cursor.getInt(_cursorIndexOfCountForks);
            final int _tmpSize;
            _tmpSize = _cursor.getInt(_cursorIndexOfSize);
            final String _tmpCreated;
            if (_cursor.isNull(_cursorIndexOfCreated)) {
              _tmpCreated = null;
            } else {
              _tmpCreated = _cursor.getString(_cursorIndexOfCreated);
            }
            _result = new GithubUserRepository(_tmpId,_tmpUserId,_tmpName,_tmpFullName,_tmpCountForks,_tmpSize,_tmpCreated);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
