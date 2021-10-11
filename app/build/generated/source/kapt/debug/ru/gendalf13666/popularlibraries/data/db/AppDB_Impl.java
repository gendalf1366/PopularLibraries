package ru.gendalf13666.popularlibraries.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.gendalf13666.popularlibraries.data.db.dao.GithubUserDao;
import ru.gendalf13666.popularlibraries.data.db.dao.GithubUserDao_Impl;
import ru.gendalf13666.popularlibraries.data.db.dao.GithubUserRepositoryDao;
import ru.gendalf13666.popularlibraries.data.db.dao.GithubUserRepositoryDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDB_Impl extends AppDB {
  private volatile GithubUserDao _githubUserDao;

  private volatile GithubUserRepositoryDao _githubUserRepositoryDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `users` (`user_id` INTEGER NOT NULL, `login` TEXT NOT NULL, `avatar_url` TEXT, PRIMARY KEY(`user_id`))");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_users_login` ON `users` (`login`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_repositories` (`repository_id` INTEGER NOT NULL, `user_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `full_name` TEXT NOT NULL, `forks` INTEGER NOT NULL, `size` INTEGER NOT NULL, `created` TEXT NOT NULL, PRIMARY KEY(`repository_id`), FOREIGN KEY(`user_id`) REFERENCES `users`(`user_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_user_repositories_user_id` ON `user_repositories` (`user_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2eb36b42f3b52c7a82424db458788fee')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `users`");
        _db.execSQL("DROP TABLE IF EXISTS `user_repositories`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUsers = new HashMap<String, TableInfo.Column>(3);
        _columnsUsers.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("login", new TableInfo.Column("login", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsers = new HashSet<TableInfo.Index>(1);
        _indicesUsers.add(new TableInfo.Index("index_users_login", false, Arrays.asList("login")));
        final TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
        final TableInfo _existingUsers = TableInfo.read(_db, "users");
        if (! _infoUsers.equals(_existingUsers)) {
          return new RoomOpenHelper.ValidationResult(false, "users(ru.gendalf13666.popularlibraries.data.entity.GithubUser).\n"
                  + " Expected:\n" + _infoUsers + "\n"
                  + " Found:\n" + _existingUsers);
        }
        final HashMap<String, TableInfo.Column> _columnsUserRepositories = new HashMap<String, TableInfo.Column>(7);
        _columnsUserRepositories.put("repository_id", new TableInfo.Column("repository_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserRepositories.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserRepositories.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserRepositories.put("full_name", new TableInfo.Column("full_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserRepositories.put("forks", new TableInfo.Column("forks", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserRepositories.put("size", new TableInfo.Column("size", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserRepositories.put("created", new TableInfo.Column("created", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserRepositories = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysUserRepositories.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION",Arrays.asList("user_id"), Arrays.asList("user_id")));
        final HashSet<TableInfo.Index> _indicesUserRepositories = new HashSet<TableInfo.Index>(1);
        _indicesUserRepositories.add(new TableInfo.Index("index_user_repositories_user_id", false, Arrays.asList("user_id")));
        final TableInfo _infoUserRepositories = new TableInfo("user_repositories", _columnsUserRepositories, _foreignKeysUserRepositories, _indicesUserRepositories);
        final TableInfo _existingUserRepositories = TableInfo.read(_db, "user_repositories");
        if (! _infoUserRepositories.equals(_existingUserRepositories)) {
          return new RoomOpenHelper.ValidationResult(false, "user_repositories(ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository).\n"
                  + " Expected:\n" + _infoUserRepositories + "\n"
                  + " Found:\n" + _existingUserRepositories);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2eb36b42f3b52c7a82424db458788fee", "3355d9e94d88624e55e9eb019363848a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "users","user_repositories");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `users`");
      _db.execSQL("DELETE FROM `user_repositories`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(GithubUserDao.class, GithubUserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GithubUserRepositoryDao.class, GithubUserRepositoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public GithubUserDao githubUserDao() {
    if (_githubUserDao != null) {
      return _githubUserDao;
    } else {
      synchronized(this) {
        if(_githubUserDao == null) {
          _githubUserDao = new GithubUserDao_Impl(this);
        }
        return _githubUserDao;
      }
    }
  }

  @Override
  public GithubUserRepositoryDao githubUserRepositoryDao() {
    if (_githubUserRepositoryDao != null) {
      return _githubUserRepositoryDao;
    } else {
      synchronized(this) {
        if(_githubUserRepositoryDao == null) {
          _githubUserRepositoryDao = new GithubUserRepositoryDao_Impl(this);
        }
        return _githubUserRepositoryDao;
      }
    }
  }
}
