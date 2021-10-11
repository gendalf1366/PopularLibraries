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
import ru.gendalf13666.popularlibraries.data.entity.GithubUser;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GithubUserDao_Impl implements GithubUserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GithubUser> __insertionAdapterOfGithubUser;

  public GithubUserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGithubUser = new EntityInsertionAdapter<GithubUser>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `users` (`user_id`,`login`,`avatar_url`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GithubUser value) {
        stmt.bindLong(1, value.getId());
        if (value.getLogin() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLogin());
        }
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAvatarUrl());
        }
      }
    };
  }

  @Override
  public void insert(final List<GithubUser> users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGithubUser.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<GithubUser>> getUsers() {
    final String _sql = "select * from users";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<GithubUser>>() {
      @Override
      public List<GithubUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final List<GithubUser> _result = new ArrayList<GithubUser>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GithubUser _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            final String _tmpAvatarUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatarUrl = null;
            } else {
              _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            _item = new GithubUser(_tmpId,_tmpLogin,_tmpAvatarUrl);
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
  public Single<GithubUser> getUser(final String userLogin) {
    final String _sql = "select * from users where login = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userLogin == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLogin);
    }
    return RxRoom.createSingle(new Callable<GithubUser>() {
      @Override
      public GithubUser call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_url");
          final GithubUser _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            final String _tmpAvatarUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarUrl)) {
              _tmpAvatarUrl = null;
            } else {
              _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            }
            _result = new GithubUser(_tmpId,_tmpLogin,_tmpAvatarUrl);
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
