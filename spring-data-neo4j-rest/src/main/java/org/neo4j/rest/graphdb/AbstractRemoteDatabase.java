/**
 * Copyright (c) 2002-2013 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.rest.graphdb;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.event.KernelEventHandler;
import org.neo4j.graphdb.event.TransactionEventHandler;
import org.neo4j.rest.graphdb.transaction.NullTransaction;
import java.util.Map;


abstract class AbstractRemoteDatabase implements GraphDatabaseService {
    public Transaction beginTx() {
        return new NullTransaction();
    }

    public <T> TransactionEventHandler<T> registerTransactionEventHandler( TransactionEventHandler<T> tTransactionEventHandler ) {
        throw new UnsupportedOperationException();
    }

    public <T> TransactionEventHandler<T> unregisterTransactionEventHandler( TransactionEventHandler<T> tTransactionEventHandler ) {
        throw new UnsupportedOperationException();
    }

    public KernelEventHandler registerKernelEventHandler( KernelEventHandler kernelEventHandler ) {
        throw new UnsupportedOperationException();
    }

    public KernelEventHandler unregisterKernelEventHandler( KernelEventHandler kernelEventHandler ) {
        throw new UnsupportedOperationException();
    }

    public abstract Result execute(String s, Map<String, Object> map);
    public abstract Result execute(String s);

    @Override
    public void shutdown() {
    }
}
