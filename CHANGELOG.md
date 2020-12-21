DynoQueueDAO - removed deprecated Constructors int getLongPollTimeoutInMS() - removed deprecated Worker method in client

workflow.sqs.event.queue.enabled workflow.amqp.event.queue.enabled workflow.nats.event.queue.enabled
workflow.nats_stream.event.queue.enabled

workflow.executor.service.max.threads=50(default)

workflow.events.default.queue.type=sqs (default)/amqp

(Fixed) workflow.listener.queue.prefix

workflow.status.listener.type=stub(default)/archive/queue_status_publisher

conductor.metrics.logger.enabled conductor.metrics.logger.reportPeriodSeconds

HTTP task - removed OAuth support (Create a task for OAuth2 support)

Removed deprecated API - /queue/requeue from /tasks

Upgraded protobuf-java to 3.13.0 Upgraded grpc-protobuf to 1.33.+ Renamed DynoProxy to JedisProxy Removed support for
EmbeddedElasticSearch

Ignored a flaky test class - LocalOnlyLockTest. Test Harness module uses TestContainers for MySql,Postgres &
Elasticsearch

Modified properties in the `azureblob-storage` module:

| Old | New |
| --- | --- |
| workflow.external.payload.storage.azure_blob.connection_string | conductor.external.payload.storage.azureblob.connectionString |
| workflow.external.payload.storage.azure_blob.container_name | conductor.external.payload.storage.azureblob.containerName |
| workflow.external.payload.storage.azure_blob.endpoint | conductor.external.payload.storage.azureblob.endpoint |
| workflow.external.payload.storage.azure_blob.sas_token | conductor.external.payload.storage.azureblob.sasToken |
| workflow.external.payload.storage.azure_blob.signedurlexpirationseconds | conductor.external.payload.storage.azureblob.signedUrlExpirationSeconds |
| workflow.external.payload.storage.azure_blob.workflow_input_path | conductor.external.payload.storage.azureblob.workflowInputPath |
| workflow.external.payload.storage.azure_blob.workflow_output_path | conductor.external.payload.storage.azureblob.workflowOutputPath |
| workflow.external.payload.storage.azure_blob.task_input_path | conductor.external.payload.storage.azureblob.taskInputPath |
| workflow.external.payload.storage.azure_blob.task_output_path | conductor.external.payload.storage.azureblob.taskOutputPath |

Modified properties in the `cassandra-persistence` module:

| Old | New |
| --- | --- |
| workflow.cassandra.host | conductor.cassandra.hostAddress |
| workflow.cassandra.port | conductor.cassandra.port |
| workflow.cassandra.cluster | conductor.cassandra.cluster |
| workflow.cassandra.keyspace | conductor.cassandra.keyspace |
| workflow.cassandra.shard.size | conductor.cassandra.shardSize |
| workflow.cassandra.replication.strategy | conductor.cassandra.replicationStrategy |
| workflow.cassandra.replication.factor.key | conductor.cassandra.replicationFactorKey |
| workflow.cassandra.replication.factor.value | conductor.cassandra.replicationFactorValue |
| workflow.cassandra.read.consistency.level | conductor.cassandra.readConsistencyLevel |
| workflow.cassandra.write.consistency.level | conductor.cassandra.writeConsistencyLevel |
| conductor.taskdef.cache.refresh.time.seconds | conductor.cassandra.taskDefCacheRefreshTimeSecs |
| conductor.eventhandler.cache.refresh.time.seconds | conductor.cassandra.eventHandlerCacheRefreshTimeSecs |
| workflow.event.execution.persistence.ttl.seconds | conductor.cassandra.eventExecutionPersistenceTTLSecs |



