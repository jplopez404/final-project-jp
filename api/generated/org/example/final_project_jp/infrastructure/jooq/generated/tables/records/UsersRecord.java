/*
 * This file is generated by jOOQ.
 */
package org.example.final_project_jp.infrastructure.jooq.generated.tables.records;


import org.example.final_project_jp.infrastructure.jooq.generated.tables.Users;
import org.example.final_project_jp.infrastructure.jooq.generated.tables.pojos.UsersDto;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public UsersRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.users.name</code>.
     */
    public UsersRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.users.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.users.password</code>.
     */
    public UsersRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.users.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.session_token</code>.
     */
    public UsersRecord setSessionToken(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.users.session_token</code>.
     */
    public String getSessionToken() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.SESSION_TOKEN;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getSessionToken();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getSessionToken();
    }

    @Override
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setSessionToken(value);
        return this;
    }

    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String name, String password, String sessionToken) {
        super(Users.USERS);

        setId(id);
        setName(name);
        setPassword(password);
        setSessionToken(sessionToken);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(UsersDto value) {
        super(Users.USERS);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setPassword(value.getPassword());
            setSessionToken(value.getSessionToken());
        }
    }
}
