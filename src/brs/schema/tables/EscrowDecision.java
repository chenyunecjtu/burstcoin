/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.Indexes;
import brs.schema.Keys;
import brs.schema.tables.records.EscrowDecisionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EscrowDecision extends TableImpl<EscrowDecisionRecord> {

    private static final long serialVersionUID = 1747742030;

    /**
     * The reference instance of <code>DB.escrow_decision</code>
     */
    public static final EscrowDecision ESCROW_DECISION = new EscrowDecision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EscrowDecisionRecord> getRecordType() {
        return EscrowDecisionRecord.class;
    }

    /**
     * The column <code>DB.escrow_decision.db_id</code>.
     */
    public final TableField<EscrowDecisionRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>DB.escrow_decision.escrow_id</code>.
     */
    public final TableField<EscrowDecisionRecord, Long> ESCROW_ID = createField("escrow_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.escrow_decision.account_id</code>.
     */
    public final TableField<EscrowDecisionRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.escrow_decision.decision</code>.
     */
    public final TableField<EscrowDecisionRecord, Integer> DECISION = createField("decision", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.escrow_decision.height</code>.
     */
    public final TableField<EscrowDecisionRecord, Integer> HEIGHT = createField("height", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.escrow_decision.latest</code>.
     */
    public final TableField<EscrowDecisionRecord, Byte> LATEST = createField("latest", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>DB.escrow_decision</code> table reference
     */
    public EscrowDecision() {
        this(DSL.name("escrow_decision"), null);
    }

    /**
     * Create an aliased <code>DB.escrow_decision</code> table reference
     */
    public EscrowDecision(String alias) {
        this(DSL.name(alias), ESCROW_DECISION);
    }

    /**
     * Create an aliased <code>DB.escrow_decision</code> table reference
     */
    public EscrowDecision(Name alias) {
        this(alias, ESCROW_DECISION);
    }

    private EscrowDecision(Name alias, Table<EscrowDecisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private EscrowDecision(Name alias, Table<EscrowDecisionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ESCROW_DECISION_ESCROW_DECISION_ACCOUNT_ID_HEIGHT_IDX, Indexes.ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_ACCOUNT_ID_HEIGHT_IDX, Indexes.ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_HEIGHT_IDX, Indexes.ESCROW_DECISION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EscrowDecisionRecord, Long> getIdentity() {
        return Keys.IDENTITY_ESCROW_DECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EscrowDecisionRecord> getPrimaryKey() {
        return Keys.KEY_ESCROW_DECISION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EscrowDecisionRecord>> getKeys() {
        return Arrays.<UniqueKey<EscrowDecisionRecord>>asList(Keys.KEY_ESCROW_DECISION_PRIMARY, Keys.KEY_ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_ACCOUNT_ID_HEIGHT_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowDecision as(String alias) {
        return new EscrowDecision(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowDecision as(Name alias) {
        return new EscrowDecision(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EscrowDecision rename(String name) {
        return new EscrowDecision(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EscrowDecision rename(Name name) {
        return new EscrowDecision(name, null);
    }
}
