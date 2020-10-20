package lighttunnel.internal.base.proto.message

import lighttunnel.RemoteConnection
import lighttunnel.internal.base.proto.ProtoMessage
import lighttunnel.internal.base.util.LongUtil

class RemoteDisconnectMessage(
    val tunnelId: Long,
    val sessionId: Long,
    val conn: RemoteConnection
) : ProtoMessage(Type.REMOTE_DISCONNECT, LongUtil.toBytes(tunnelId, sessionId), conn.toBytes()) {

    constructor(head: ByteArray, data: ByteArray) : this(LongUtil.fromBytes(head, 0), LongUtil.fromBytes(head, 8), RemoteConnection.fromBytes(data))

}