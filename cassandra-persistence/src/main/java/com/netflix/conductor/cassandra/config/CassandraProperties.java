/*
 * Copyright 2020 Netflix, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netflix.conductor.cassandra.config;

import com.datastax.driver.core.ConsistencyLevel;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@Component
//@ConditionalOnProperty(name = "db", havingValue = "cassandra")
@ConfigurationProperties("conductor.cassandra")
public class CassandraProperties {

    //    @Value("${workflow.cassandra.host:127.0.0.1}")
    private String hostAddress = "127.0.0.1";

    //    @Value("${workflow.cassandra.port:9142}")
    private int port = 9142;

    //    @Value("${workflow.cassandra.cluster:}")
    private String cluster = "";

    //    @Value("${workflow.cassandra.keyspace:conductor}")
    private String keyspace = "conductor";

    //    @Value("${workflow.cassandra.shard.size:100}")
    private int shardSize = 100;

    //    @Value("${workflow.cassandra.replication.strategy:SimpleStrategy}")
    private String replicationStrategy = "SimpleStrategy";

    //    @Value("${workflow.cassandra.replication.factor.key:replication_factor}")
    private String replicationFactorKey = "replication_factor";

    //    @Value("${workflow.cassandra.replication.factor.value:3}")
    private int replicationFactorValue = 3;

    //    @Value("${workflow.cassandra.read.consistency.level:#{T(com.datastax.driver.core.ConsistencyLevel).LOCAL_QUORUM.name()}}")
    private String readConsistencyLevel = ConsistencyLevel.LOCAL_QUORUM.name();

    //    @Value("${workflow.cassandra.write.consistency.level:#{T(com.datastax.driver.core.ConsistencyLevel).LOCAL_QUORUM.name()}}")
    private String writeConsistencyLevel = ConsistencyLevel.LOCAL_QUORUM.name();

    /**
     * the refresh time for the in-memory task definition cache
     */
//    @Value("${conductor.taskdef.cache.refresh.time.seconds:60}")
    private int taskDefCacheRefreshTimeSecs = 60;

    /**
     * the refresh time for the in-memory event handler cache
     */
//    @Value("${conductor.eventhandler.cache.refresh.time.seconds:60}")
    private int eventHandlerCacheRefreshTimeSecs = 60;

    /**
     * The time to live in seconds of the event execution persisted
     */
//    @Value("${workflow.event.execution.persistence.ttl.seconds:0}")
    private int eventExecutionPersistenceTTLSecs = 0;

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getKeyspace() {
        return keyspace;
    }

    public void setKeyspace(String keyspace) {
        this.keyspace = keyspace;
    }

    public int getShardSize() {
        return shardSize;
    }

    public void setShardSize(int shardSize) {
        this.shardSize = shardSize;
    }

    public String getReplicationStrategy() {
        return replicationStrategy;
    }

    public void setReplicationStrategy(String replicationStrategy) {
        this.replicationStrategy = replicationStrategy;
    }

    public String getReplicationFactorKey() {
        return replicationFactorKey;
    }

    public void setReplicationFactorKey(String replicationFactorKey) {
        this.replicationFactorKey = replicationFactorKey;
    }

    public int getReplicationFactorValue() {
        return replicationFactorValue;
    }

    public void setReplicationFactorValue(int replicationFactorValue) {
        this.replicationFactorValue = replicationFactorValue;
    }

    public ConsistencyLevel getReadConsistencyLevel() {
        return ConsistencyLevel.valueOf(readConsistencyLevel);
    }

    public void setReadConsistencyLevel(String readConsistencyLevel) {
        this.readConsistencyLevel = readConsistencyLevel;
    }

    public ConsistencyLevel getWriteConsistencyLevel() {
        return ConsistencyLevel.valueOf(writeConsistencyLevel);
    }

    public void setWriteConsistencyLevel(String writeConsistencyLevel) {
        this.writeConsistencyLevel = writeConsistencyLevel;
    }

    public int getTaskDefCacheRefreshTimeSecs() {
        return taskDefCacheRefreshTimeSecs;
    }

    public void setTaskDefCacheRefreshTimeSecs(int taskDefCacheRefreshTimeSecs) {
        this.taskDefCacheRefreshTimeSecs = taskDefCacheRefreshTimeSecs;
    }

    public int getEventHandlerCacheRefreshTimeSecs() {
        return eventHandlerCacheRefreshTimeSecs;
    }

    public void setEventHandlerCacheRefreshTimeSecs(int eventHandlerCacheRefreshTimeSecs) {
        this.eventHandlerCacheRefreshTimeSecs = eventHandlerCacheRefreshTimeSecs;
    }

    public int getEventExecutionPersistenceTTLSecs() {
        return eventExecutionPersistenceTTLSecs;
    }

    public void setEventExecutionPersistenceTTLSecs(int eventExecutionPersistenceTTLSecs) {
        this.eventExecutionPersistenceTTLSecs = eventExecutionPersistenceTTLSecs;
    }
}
