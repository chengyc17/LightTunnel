@file:Suppress("unused")

package lighttunnel.server.tcp

import io.netty.channel.Channel
import io.netty.channel.ChannelFuture
import lighttunnel.server.util.SessionChannels
import java.util.*

class TcpFd internal constructor(
    val addr: String?,
    val port: Int,
    private val sessionChannels: SessionChannels,
    private val bindChannelFuture: ChannelFuture,
    val createAt: Date = Date()
) {

    val tunnelId get() = sessionChannels.tunnelId

    val tunnelRequest get() = sessionChannels.tunnelRequest

    val cachedChannelCount get() = sessionChannels.cachedChannelCount

    internal val tunnelChannel get() = sessionChannels.tunnelChannel

    internal fun close() {
        bindChannelFuture.channel().close()
        sessionChannels.depose()
    }

    internal fun forcedOffline() = sessionChannels.forcedOffline()

    internal fun putChannel(channel: Channel) = sessionChannels.putChannel(channel)

    internal fun removeChannel(sessionId: Long) = sessionChannels.removeChannel(sessionId)

    override fun toString(): String = tunnelRequest.toString()

}