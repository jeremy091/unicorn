package com.potato.unicornpotato.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USERS".
*/
public class UsersDao extends AbstractDao<Users, Long> {

    public static final String TABLENAME = "USERS";

    /**
     * Properties of entity Users.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Firstname = new Property(1, String.class, "Firstname", false, "FIRSTNAME");
        public final static Property Email = new Property(2, String.class, "Email", false, "EMAIL");
        public final static Property Password = new Property(3, String.class, "Password", false, "PASSWORD");
        public final static Property Lastname = new Property(4, java.util.Date.class, "Lastname", false, "LASTNAME");
    }


    public UsersDao(DaoConfig config) {
        super(config);
    }
    
    public UsersDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USERS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"FIRSTNAME\" TEXT NOT NULL ," + // 1: Firstname
                "\"EMAIL\" TEXT," + // 2: Email
                "\"PASSWORD\" TEXT," + // 3: Password
                "\"LASTNAME\" INTEGER);"); // 4: Lastname
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USERS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Users entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getFirstname());
 
        String Email = entity.getEmail();
        if (Email != null) {
            stmt.bindString(3, Email);
        }
 
        String Password = entity.getPassword();
        if (Password != null) {
            stmt.bindString(4, Password);
        }
 
        java.util.Date Lastname = entity.getLastname();
        if (Lastname != null) {
            stmt.bindLong(5, Lastname.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Users entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getFirstname());
 
        String Email = entity.getEmail();
        if (Email != null) {
            stmt.bindString(3, Email);
        }
 
        String Password = entity.getPassword();
        if (Password != null) {
            stmt.bindString(4, Password);
        }
 
        java.util.Date Lastname = entity.getLastname();
        if (Lastname != null) {
            stmt.bindLong(5, Lastname.getTime());
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Users readEntity(Cursor cursor, int offset) {
        Users entity = new Users( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // Firstname
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Email
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // Password
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)) // Lastname
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Users entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFirstname(cursor.getString(offset + 1));
        entity.setEmail(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPassword(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLastname(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Users entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Users entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Users entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}